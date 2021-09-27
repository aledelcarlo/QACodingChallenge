package tech.credify.model.responses;

import java.util.List;

public class ResumeResponse {
    private LoanAppResumptionInfo loanAppResumptionInfo;
    private List offers;
    private String selectedOffer;
    private List requiredAgreements;
    private List<ResetOption> resetOptions;
    private String originalLoanApp;

    public LoanAppResumptionInfo getLoanAppResumptionInfo() {
        return loanAppResumptionInfo;
    }

    public void setLoanAppResumptionInfo(LoanAppResumptionInfo loanAppResumptionInfo) {
        this.loanAppResumptionInfo = loanAppResumptionInfo;
    }

    public List getOffers() {
        return offers;
    }

    public void setOffers(List offers) {
        this.offers = offers;
    }

    public String getSelectedOffer() {
        return selectedOffer;
    }

    public void setSelectedOffer(String selectedOffer) {
        this.selectedOffer = selectedOffer;
    }

    public List getRequiredAgreements() {
        return requiredAgreements;
    }

    public void setRequiredAgreements(List requiredAgreements) {
        this.requiredAgreements = requiredAgreements;
    }

    public List<ResetOption> getResetOptions() {
        return resetOptions;
    }

    public void setResetOptions(List<ResetOption> resetOptions) {
        this.resetOptions = resetOptions;
    }

    public String getOriginalLoanApp() {
        return originalLoanApp;
    }

    public void setOriginalLoanApp(String originalLoanApp) {
        this.originalLoanApp = originalLoanApp;
    }
}
