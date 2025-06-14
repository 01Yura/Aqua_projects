package no_bugs.practice11.prototype.before;

public class Document {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images;
    }

    @Override
    public Document clone() {
        return new Document(text, images);
    }
}
