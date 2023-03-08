package JavaDay4.Bai15;

public class Main {
    public static void main(String[] args) {
        InvoiceItem iv = new InvoiceItem();
        iv.setInvoiceItem("1","Sơ líp",2,20000);
        iv.getInvoiceItem();
        System.out.println("ID Item:"+iv.getId());
        System.out.println("Description:"+iv.getDesc());
        System.out.println("Quantity:"+iv.getQty());
        System.out.println("Unit Price:"+iv.getUnitPrice());
        System.out.println("Total:"+iv.getTotal());
    }
}
