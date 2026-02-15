class Book {
    int id;
    String title;
    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
    Book(Book b) {
        this.id = b.id;
        this.title = b.title;
    }
     void display() {
        System.out.println(id + " " + title);
    }
public static void main(String[] args) {
        Book b1 = new Book(1, "Java Basics");
        Book b2 = new Book(b1);   

        b1.display();
        b2.display();
    }
}
