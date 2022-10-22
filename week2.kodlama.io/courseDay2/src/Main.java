public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Product product1 = new Product(13000, 18, "macbook", "8 GB RAM");
        Product product2 = new Product(17000, 19, "lenova", "16 GB RAM");
        Product product3 = new Product(25000, 20, "Casper Nirvana", "32 GB RAM");

        Product[] products = {product1, product2, product3};
        for (Product product : products) {
            System.out.println(product.getUnitPrice());
        }
        İndividualCustomer i̇ndividualCustomer=new İndividualCustomer();
        i̇ndividualCustomer.setId(1);
        i̇ndividualCustomer.setPhone("05378785813");
        i̇ndividualCustomer.setCostumerNumber("1313");
        i̇ndividualCustomer.setFirstname("ahmet");
        i̇ndividualCustomer.setSurname("onur");
        CoperateCostumer coperateCostumer=new CoperateCostumer();
        coperateCostumer.setId(1334);
        coperateCostumer.setPhone("05378785834");
        coperateCostumer.setCooperativeName("Onurlar Holding");
        coperateCostumer.setCooperativeworkernumber("999");

        Costumer[] costumers={i̇ndividualCustomer,coperateCostumer};
        System.out.println(costumers.length);


    }




}