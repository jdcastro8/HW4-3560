import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {

        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("John", "Smith", 30, 35));
        payables.add(new Freelancer("Sarah", "Jones", 40, 45));

        payables.add(new VendorInvoice(
                "Office Depot", "INV1001", 750));

        payables.add(new VendorInvoice(
                "Tech Supply", "INV1002", 1250));

        double totalPayout = 0;

        for (Payable payable : payables) {
            payable.print();
            totalPayout += payable.calculatePayment();
            System.out.println();
        }

        System.out.printf("Total Payout: $%.2f%n", totalPayout);
    }
}
