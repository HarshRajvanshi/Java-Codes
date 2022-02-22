public class TestCustomer {
    //instantiated address class and customer class
    public static void main(String[] args) {
        Address obj = new Address("delhi", "delhi");
        Customer abc = new Customer("harsh", obj);
        System.out.println(abc.getCustomerDetails());

    }
}
