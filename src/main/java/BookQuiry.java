public class BookQuiry {
private String author;
    private String likes;
    private String text;

    public BookQuiry(String author, String likes, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "BookQuiry{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
