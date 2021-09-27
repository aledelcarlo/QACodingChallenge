package tech.credify.model.requests;

public class ResumeRequest {
    private final String loanAppUuid;
    private final boolean skipSideEffects;

    public ResumeRequest(String loanAppUuid, boolean skipSideEffects) {
        this.loanAppUuid = loanAppUuid;
        this.skipSideEffects = skipSideEffects;
    }

    public String getLoanAppUuid() {
        return loanAppUuid;
    }

    public boolean isSkipSideEffects() {
        return skipSideEffects;
    }
}
