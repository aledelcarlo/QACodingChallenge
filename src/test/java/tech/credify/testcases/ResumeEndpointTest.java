package tech.credify.testcases;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reactor.core.publisher.Mono;
import tech.credify.model.requests.ResumeRequest;
import tech.credify.model.responses.ProductType;
import tech.credify.model.responses.ResumeResponse;

import static org.testng.Assert.assertEquals;
import static tech.credify.TestBundle.getProperty;

public class ResumeEndpointTest {
    private static final String BASE_URL = getProperty("api.base.url");
    private static final String RESOURCE_URI = getProperty("resume.resource.uri");
    private static final String HEADER_SOURCE_ID = "x-cf-source-id";
    private static final String HEADER_CORR_ID = "x-cf-corr-id";

    private WebTestClient client;

    @BeforeClass
    public void setup() {
        client = WebTestClient.bindToServer()
                .baseUrl(BASE_URL)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HEADER_SOURCE_ID, "coding-challenge")
                .defaultHeader(HEADER_CORR_ID, "fcb24980-be6c-11eb-8529-0242ac130003")
                .build();
    }

    @Test
    public void shouldProvideOkResponseIfLoanApplicationExists() {
        var request = new ResumeRequest("b8096ec7-2150-405f-84f5-ae99864b3e96", true);
        client.post().uri(RESOURCE_URI).body(Mono.just(request), ResumeRequest.class)
                .exchange()
                .expectStatus().isOk()
                .expectBody(ResumeResponse.class)
                .consumeWith(result -> {
                    var loanAppResumptionInfo = result.getResponseBody().getLoanAppResumptionInfo();
                    assertEquals(loanAppResumptionInfo.getProductType(), ProductType.PERSONAL_LOAN, "ProductType is not correct.");
                });
    }

    @Test
    public void shouldProvideNotFoundResponseIfLoanApplicationDoesNotExist() {
        var request = new ResumeRequest("b8096ec7-2150-405f-84f5-ae99864b3e00", true);
        client.post().uri(RESOURCE_URI).body(Mono.just(request), ResumeRequest.class)
                .exchange().expectStatus().isNotFound();
    }

    @Test
    public void shouldProvideInternalServerErrorWhenThereIsNoPayload() {
        client.post().uri(RESOURCE_URI).exchange().expectStatus().is5xxServerError();
    }
}
