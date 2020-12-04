package Chapter3;

public class Invoice {

    private int quantity;
    private double pricePerItem;
    private double invoiceAmount;
    private String partNumber;
    private String partDescription;

    public Invoice(int quantity, double pricePerItem, String partNumber, String partDescription) {
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
    }

    public  Invoice (){

    }

    public int getQuantity() {
        if (quantity < 0){
            quantity =0;
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            quantity = 0;
        }else
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0){
            pricePerItem = 0.0;
        }else
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        invoiceAmount = pricePerItem * quantity;
        return invoiceAmount;
    }

   public void setInvoiceAmount (double invoiceAmount){
        this.invoiceAmount = invoiceAmount;
   }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
}















