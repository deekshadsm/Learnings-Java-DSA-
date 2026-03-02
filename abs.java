
abstract class Content {

    protected String title;

    public Content(String title) {
        this.title = title;
    }

    void play() {
        System.out.println(title + " is now playing...");
    }

    abstract void getContentType(); 
}

class Movie extends Content {

    public Movie(String title) {
        super(title);
    }

    @Override
    void getContentType() {
        System.out.println("This is a Movie 🎬");
    }
}

class WebSeries extends Content {

    public WebSeries(String title) {
        super(title);
    }

    @Override
    void getContentType() {
        System.out.println("This is a Web Series 📺");
    }
}

public class StreamingTest {

    public static void main(String[] args) {

        Content c1 = new Movie("Inception");
        Content c2 = new WebSeries("Stranger Things");

        c1.play();
        c1.getContentType();

        System.out.println("------");

        c2.play();
        c2.getContentType();
    }
}