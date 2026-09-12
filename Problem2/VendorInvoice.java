public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName,
                         String invoiceNumber,
                         double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue >= 0) {
            this.amountDue = amountDue;
        } else {
            this.amountDue = 0;
        }
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public void print() {
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.printf("Payment: $%.2f%n", calculatePayment());
    }
}
