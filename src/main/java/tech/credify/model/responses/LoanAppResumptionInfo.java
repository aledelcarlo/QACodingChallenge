package tech.credify.model.responses;

import java.util.List;

public class LoanAppResumptionInfo {
    public enum Status {
        EXPIRED, REJECTED
    }

    private long loanAppId;
    private String loanAppUuid;
    private Referrer referrer;
    private Status status;
    private ProductType productType;
    private SourceSystem sourceSystem;
    private double desiredAmount;
    private BorrowerResumptionInfo borrowerResumptionInfo;
    private BorrowerResumptionInfo coBorrowerResumptionInfo;
    private boolean turnDown;
    private boolean hasLogin;
    private List availableAppImprovements;
    private String cashOutAmount;
    private boolean canAddCollateral;
    private String rewardProgramId;
    private String rewardProgramCode;
    private String addon;
    private String isMobileDiscountApplied;
    private boolean checkingDiscountAvailable;

    public long getLoanAppId() {
        return loanAppId;
    }

    public void setLoanAppId(long loanAppId) {
        this.loanAppId = loanAppId;
    }

    public String getLoanAppUuid() {
        return loanAppUuid;
    }

    public void setLoanAppUuid(String loanAppUuid) {
        this.loanAppUuid = loanAppUuid;
    }

    public Referrer getReferrer() {
        return referrer;
    }

    public void setReferrer(Referrer referrer) {
        this.referrer = referrer;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public SourceSystem getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(SourceSystem sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public double getDesiredAmount() {
        return desiredAmount;
    }

    public void setDesiredAmount(double desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    public BorrowerResumptionInfo getBorrowerResumptionInfo() {
        return borrowerResumptionInfo;
    }

    public void setBorrowerResumptionInfo(BorrowerResumptionInfo borrowerResumptionInfo) {
        this.borrowerResumptionInfo = borrowerResumptionInfo;
    }

    public BorrowerResumptionInfo getCoBorrowerResumptionInfo() {
        return coBorrowerResumptionInfo;
    }

    public void setCoBorrowerResumptionInfo(BorrowerResumptionInfo coBorrowerResumptionInfo) {
        this.coBorrowerResumptionInfo = coBorrowerResumptionInfo;
    }

    public boolean isTurnDown() {
        return turnDown;
    }

    public void setTurnDown(boolean turnDown) {
        this.turnDown = turnDown;
    }

    public boolean isHasLogin() {
        return hasLogin;
    }

    public void setHasLogin(boolean hasLogin) {
        this.hasLogin = hasLogin;
    }

    public List getAvailableAppImprovements() {
        return availableAppImprovements;
    }

    public void setAvailableAppImprovements(List availableAppImprovements) {
        this.availableAppImprovements = availableAppImprovements;
    }

    public String getCashOutAmount() {
        return cashOutAmount;
    }

    public void setCashOutAmount(String cashOutAmount) {
        this.cashOutAmount = cashOutAmount;
    }

    public boolean isCanAddCollateral() {
        return canAddCollateral;
    }

    public void setCanAddCollateral(boolean canAddCollateral) {
        this.canAddCollateral = canAddCollateral;
    }

    public String getRewardProgramId() {
        return rewardProgramId;
    }

    public void setRewardProgramId(String rewardProgramId) {
        this.rewardProgramId = rewardProgramId;
    }

    public String getRewardProgramCode() {
        return rewardProgramCode;
    }

    public void setRewardProgramCode(String rewardProgramCode) {
        this.rewardProgramCode = rewardProgramCode;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    public String getIsMobileDiscountApplied() {
        return isMobileDiscountApplied;
    }

    public void setIsMobileDiscountApplied(String isMobileDiscountApplied) {
        this.isMobileDiscountApplied = isMobileDiscountApplied;
    }

    public boolean isCheckingDiscountAvailable() {
        return checkingDiscountAvailable;
    }

    public void setCheckingDiscountAvailable(boolean checkingDiscountAvailable) {
        this.checkingDiscountAvailable = checkingDiscountAvailable;
    }
}
