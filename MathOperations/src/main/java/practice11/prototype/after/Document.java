package practice11.prototype.after;

public class Document implements Prototype {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images;
    }

    @Override
    public Document clone() {
        String[] copyImages = new String[images.length];
        System.arraycopy(images, 0, copyImages, 0, copyImages.length);
        return new Document(text, copyImages);
    }
}
