public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product=new Product(16000,"Lenovo","16GB RAM");

        ProductManager productManager=new ProductManager();
        productManager.Add(product.getName());


    }
}