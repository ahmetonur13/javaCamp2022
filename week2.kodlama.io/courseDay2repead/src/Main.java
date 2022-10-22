public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product1 =new Product(13,1334,"Lenova","16 GB RAM");
        Product product2 =new Product(14,1332,"Macbook", "8GB RAM");
        Product product3 =new Product(15,1333,"Asus","32 GB RAM");
        Product[] products= new Product[]{product1, product2, product3};
        for (Product product:products){
            System.out.println(product.getDetails());
        }İnvidualCostumer i̇nvidualCostumer= new İnvidualCostumer();
        i̇nvidualCostumer.setBirthDay("01.01.2003");
        i̇nvidualCostumer.setFirstName("Ahmet");
        i̇nvidualCostumer.setSurName("ONUR");
        i̇nvidualCostumer.setPhoneNumber("05374373737");
        i̇nvidualCostumer.setCostumerNumber("1334");
        CompanyCostumer companyCostumer=new CompanyCostumer();
        companyCostumer.setNameOfCompany("ONURLAR HOLDİNG");
        companyCostumer.setCostumerNumber("1335");
        companyCostumer.setId(1992);
        companyCostumer.setPhoneNumber("05323323232");
        companyCostumer.setDateOfPublic("2003");
        companyCostumer.setNumberOfStaff("6");
        Costumer[] costumers={companyCostumer,i̇nvidualCostumer};
        for(Costumer costumer:costumers){
            System.out.println(costumer.getPhoneNumber());
        }


    }
}