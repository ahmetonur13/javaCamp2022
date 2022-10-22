public class Product {


    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }


    private int unitPrice;
    private int id;
    private String name;
    private String details;

    public Product(int unitPrice, int id, String name, String details) {
        this.unitPrice = unitPrice;
        this.name = name;
        this.details = details;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}