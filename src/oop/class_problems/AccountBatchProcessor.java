package oop.class_problems;

class FeeAccount {
    String id;

    public FeeAccount(String id) {
        this.id = id;
    }
}

class HostelFeeAccount extends FeeAccount {
    public HostelFeeAccount(String id) {
        super(id);
    }
}

public class AccountBatchProcessor {
    int hostelCount = 0;
    int dayScholarCount = 0;

    public void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
            hostelCount++;
        } else if (account instanceof FeeAccount) {
            System.out.println("Paid in one go (day-scholar account)");
            dayScholarCount++;
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount("H101"),
            new HostelFeeAccount("H102"),
            new FeeAccount("F101"),
            new FeeAccount("F102")
        };

        AccountBatchProcessor processor = new AccountBatchProcessor();

        for (FeeAccount acc : accounts) {
            processor.processPayment(acc, 60000);
        }

        System.out.println("Hostel accounts processed: " + processor.hostelCount +
                           " | Day-scholar accounts processed: " + processor.dayScholarCount);
    }
}