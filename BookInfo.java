
public class BookInfo {
    //instance variables
    int bookId;
    String title;
    String author;
    float price;
    //default constructor
    public BookInfo() {
        bookId = 101;
        title = "Machine Learning";
        author = "Dutta";
        price = 399.50f;
    }
    public void Update(int bookId, String title,String author,float price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;


    }
    //parameterized constructor
    public BookInfo(int bookId, String title,String author,float price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBookDetails() {
        System.out.println("Book Details :-\n"+bookId + "\t" + title +"\t"+ author+"\t"+price);
    }
    public static void main(String[] args) {
        BookInfo bookInfo = new BookInfo();
        BookInfo bookInfo1 = new BookInfo();
        bookInfo1.Update(1,"asd","zxc",11.1f);
        BookInfo bookInfo2 = new BookInfo(222, "Core Java", "Games Gosling", 450.00f);
        bookInfo1.displayBookDetails();
        bookInfo2.displayBookDetails();
//System.out.println(bookInfo2.bookId + "\t" + bookInfo2.title +"\t"+ bookInfo2.author+"\t"+bookInfo2.price);
/*bookInfo.bookId = 101;
bookInfo.title = "Machine Learning";
bookInfo.author = "Dutta";
bookInfo.price = 399.50f; */
/*
System.out.println(bookInfo.bookId + "\t" + bookInfo.title +"\t"+ bookInfo.author+"\t"+bookInfo.price);
System.out.println(bookInfo1.bookId + "\t" + bookInfo1.title +"\t"+ bookInfo1.author+"\t"+bookInfo1.price);
bookInfo1.bookId = 111;
bookInfo1.title = "Core Python Programming";
bookInfo1.author = "Dr. R. Nageswara Rao";
bookInfo1.price= 699.00f;
System.out.println(bookInfo1.bookId + "\t" + bookInfo1.title +"\t"+ bookInfo1.author+"\t"+bookInfo1.price);
*/
    }

}
