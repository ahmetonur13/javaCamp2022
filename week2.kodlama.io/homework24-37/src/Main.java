public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CustomerManager customerManager = new CustomerManager();
        customerManager.setMessage("Müsteri Kaydedildi.");
        CustomerManager[] customerManagers={customerManager};
        for (CustomerManager customerManagerss:customerManagers){
            System.out.println(customerManagerss.getMessage());
        }



    }
}