public class TestProduct2 {
     private String productcode;
     private String productname;
     private double price;

    public TestProduct2(){
        productcode = "P101";
        productname = "Laptop";
        price = 45.00;
    }

    public TestProduct2(String productcode, String productname, double price) {
        this.productcode=productcode;
        this.productname=productname;
        this.price=price;
    }

        // setters
        public void setProductcode(String productcode){
            this.productcode = productcode;
        }
        public void setProductname (String productname){
            this.productname = productname;
        }
        public void setprice ( double price){
            this.price = price;
        }
        // getters
        public String getProductcode() {
            return productcode;
        }
        public String getProductname() {
            return productname;
        }
        public double getPrice () {
            return price;
        }

    }


    class Test2 {
        public static void main(String[] args) {
            TestProduct2 obj1 = new TestProduct2();
            TestProduct2 obj2=new TestProduct2("code hai ye","name hai ye",100000.00);
            //obj1.setProductname("harsh");
            //obj1.setProductcode("harsh");
            //obj1.setprice(45.00);
            System.out.println("code=" + obj1.getProductcode() + "\nname=" + obj1.getProductname() + "\nprice=" + obj1.getPrice());
            System.out.println("---------------------");
            System.out.println("code=" + obj2.getProductcode() + "\nname=" + obj2.getProductname() + "\nprice=" + obj2.getPrice());
        }
    }
