public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Categorys category1 = new Categorys("house team");
        Categorys category2 = new Categorys("garden team");
        Categorys[] categorys={category1,category2};
        for (Categorys category:categorys){
            System.out.println(category);

        }







        Product product1 = new Product(13,"ahmet","adam değil",34);
        Product product2 = new Product(31, "mehmet","adam" , 31);
        Product product3 = new Product(61,"ali","hamsi",1467);
        Product[] products={product1,product2,product3};

        for(Product product :products){
            System.out.println(product.getName());


        }
        ProductManager productManager=new ProductManager();
        productManager.addToCart(product3);


    }



}