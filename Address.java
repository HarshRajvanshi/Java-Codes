public class Address {
    private String address;
    private String city;

    public Address(){

    }

    public Address(String address, String city){
        this.address=address;
        this.city=city;
    }
    public String getAddress(){
        return (this.address+", "+this.city);
    }
    public String toString(){
        return this.getAddress();
    }
    //toString method module 5

    public static void main(String[] args) {
        Address add=new Address("noida","Greater Noida");
        System.out.println(add.getAddress());

    }
}


