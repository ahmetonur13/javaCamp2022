public class Product {
    private int unitPrice;
    private int id;
    private String details;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails() {
        this.details = details;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int unitPrice, int id, String name, String details) {
        this.unitPrice = unitPrice;
        this.name = name;
        this.details = details;
        this.id = id;




    }
}