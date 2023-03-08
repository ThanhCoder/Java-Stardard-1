package Bai16;

public class Account {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public void setInvoiceItem(String id, String desc, int qty, double unitPrice){
        this.desc = desc;
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getInvoiceItem(){
        System.out.println("Thông tin item:");
        System.out.println("ID:"+id);
        System.out.println("Desc:"+desc);
        System.out.println("Qty:"+qty);
        System.out.println("UnitPrice:"+unitPrice);
        return id+" "+desc+" "+qty+" "+unitPrice;
    }

    public String getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public int setQty(int qty){
        this.qty = qty;
        return qty;
    }

    public int getQty(){
        return qty;
    }

    public double setUnitPrice(int unitPrice){
        this.unitPrice = unitPrice;
        return unitPrice;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public double getTotal(){
        double total = qty*unitPrice;
        return total;
    }
}
