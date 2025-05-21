package practice11.prototype.before;

public class Main {
    public static void main(String[] args) {
        String[] images = {"image1.png", "image2.png"};
        Document original = new Document("Original", images);
        Document copy = original.clone();

        copy.text = "Copy";
        System.out.println(original.text);
        System.out.println(copy.text);

        copy.images[0] = "update.png";

        System.out.println(original.images[0]);
        System.out.println(copy.images[0]);
    }
}
