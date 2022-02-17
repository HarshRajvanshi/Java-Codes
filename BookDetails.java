public class BookDetails {

    //instance variables
    int bookId;
    String title;
    String author;
    float price;

    //default constructor
    public BookDetails() {
        bookId = 101;
        title = "Machine Learning";
        author = "Dutta";
        price = 399.50f;
    }

    //parameterized constructor
    public BookDetails(int bookId, String title, String author, float price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
   //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public String getauthor() {
        return author;
    }

    public String gettitle(){
                return title;
}

        public static void main(String[] args) {
            BookDetails bookInfo = new BookDetails();
            System.out.println(bookInfo.bookId + "\t" + bookInfo.title +"\t"+ bookInfo.author+"\t"+bookInfo.price);
            bookInfo.setTitle("Artificial Intelligence");
//bookInfo.setPrice(499.90f);
            System.out.println(bookInfo.bookId + "\t" + bookInfo.title +"\t"+ bookInfo.author+"\t"+bookInfo.price);
            System.out.println(bookInfo.getTitle() + "\t" + bookInfo.getPrice());
        }
    }


