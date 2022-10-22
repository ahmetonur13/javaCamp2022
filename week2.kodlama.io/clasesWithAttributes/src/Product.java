public class Product {
    public Product(int pieces,String name,String details ){
        System.out.println("yapıcı blok çalıştı");
        this.name=name;
        this.details=details;

    }
    private String newOzellik;
    private String name;
    private String id;
    private String details;
    private int price;
    private int stockAmount;

    public Product() {

    }

    public String getNewOzellik() {
        return newOzellik;
    }

    public void setNewOzellik(String newOzellik) {
        this.newOzellik = newOzellik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
