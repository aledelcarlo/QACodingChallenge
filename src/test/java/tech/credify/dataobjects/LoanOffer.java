package tech.credify.dataobjects;

public class LoanOffer {
    private String loanAmount;
    private String monthlyPayment;
    private String term;
    private String interestRate;
    private String apr;

    public LoanOffer(String loanAmount, String monthlyPayment, String term, String interestRate, String apr) {
        this.loanAmount = loanAmount;
        this.monthlyPayment = monthlyPayment;
        this.term = term;
        this.interestRate = interestRate;
        this.apr = apr;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public String getTerm() {
        return term;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public String getApr() {
        return apr;
    }
}
