public class OteShop1 {
    public static void main(String[] args) {
        System.out.println("Hello");

        Customer customer = new Customer();
        customer.setAddress("Athens");
        customer.setSurname("Irac");

        Product product = new Product();
        product.setPrice(20.00);
        product.setName("chips");

        double fpa = 0.24;
        Payment payment = new Payment();
        payment.setCustomer(customer);
        payment.setAmount(product.getPrice()*(1+fpa));

        System.out.println(payment.getAmount());


        Customer customer2 = new Customer();
        customer2.setAddress("Berlin");
        System.out.println(customer2.getAddress());




    }
}
