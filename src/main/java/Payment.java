
public class Payment {
    private String paymentId;
    private String weddingId;
    private double totalBudget;
    private double amountPaid;
    private double remainingBalance;

    // Constructor
    public Payment(String paymentId, String weddingId, double totalBudget, double amountPaid) {
        this.paymentId = paymentId;
        this.weddingId = weddingId;
        this.totalBudget = totalBudget;
        this.amountPaid = amountPaid;
        this.remainingBalance = totalBudget - amountPaid;
    }

    // Getters and Setters
    public String getPaymentId() { return paymentId; }
    public String getWeddingId() { return weddingId; }
    public double getTotalBudget() { return totalBudget; }
    public double getAmountPaid() { return amountPaid; }
    public double getRemainingBalance() { return remainingBalance; }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
        this.remainingBalance = this.totalBudget - amountPaid;
    }
}
