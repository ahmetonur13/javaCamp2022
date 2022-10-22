public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Product product1 = new Product();
        product1.setId(2);
        product1.setName("computer");
        product1.setUnitPrice(880);
        product1.detail.set("16 GB RAM");

        Product[] products ={product1};
        System.out.println(products.length);
        System.out.println(products.length);
    }
}