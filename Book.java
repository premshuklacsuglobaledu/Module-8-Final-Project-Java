public class Book {
    private int Id;
    private String title;
    private String author;
    private String isbn;
    private int pages;


// Default Constructor
   public Book() {
       this.Id = 0;
       this.title = "";
       this.author = "";
       this.isbn = "";
       this.pages = 0;
   }


 // Parametrized Constructor
    public Book(int Id, String title, String author, String isbn, int pages) {
        this.Id = Id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;

    }

// Getters

    public int getId() {
        return Id;
        }

    public String getTitle() {
        return title;
        }

    public String getAuthor() {
        return author;
        }

    public String getIsbn() {
        return isbn;
        }

// Setters

    public void setId(int id) {
        this.Id = Id;
        }

    public void setTitle(String title) {
        this.title = title;
        }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
        }
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }



    }

    public void printBookINfo() {
        System.out.println("Book ID: " + Id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN " + isbn);
        System.out.println("Pages:" + pages);
    }



}
