public class Product{
    String productcode;
    String productname;
    double price;
    public Product(){
        productname="Laptop";
        productcode="p101";
        price=555.55;
    }

    public Product(String productcode,String productname,double price){
        this.productcode = productcode;
        this.productname = productname;
        this.price = price;

    }

//    // setters
//    public void setProductcode(String productcode){
//        this.productcode=productcode;
//    }
//    public void setProductname(String productname){
//        this.productname=productname;
//    }
//    public void setprice(double price){
//        this.price=price;
//    }
//     // getters
//    public String getProductcode(){
//        return productcode;
//    }
//    public String getProductname(){
//        return productname;
//    }
//    public double getPrice(){
//        return price;
//    }


}
class TestProduct{
    public static void main(String[] args) {
        Product obj=new Product("P101","Laptop",25.00);
        System.out.println("name="+obj.productname+"\tcode="+obj.productcode+"\tprice="+obj.price);
    }


}