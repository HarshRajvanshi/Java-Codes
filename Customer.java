public class Customer {
    private String name;
    private Address address;
    public Customer(){

    }
    public Customer (String name,Address address){
        this.name=name;
        this.address=address;
    }
    public String getCustomerDetails(){
        return("Customer: "+name+"\n"+"Residential Address: "+address);
    }


    public static void main(String[] args) {
        Address obj=new Address("delhi","delhi");
        Customer abc=new Customer("harsh",obj);
        System.out.println(abc.getCustomerDetails());


    }
}
