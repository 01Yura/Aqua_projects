package practice11.proxy;

public class Main {
    public static void main(String[] args) {
//        HighResolutionImage highResolutionImage = new HighResolutionImage("https://images.pngs.highresolution.tiff");

        ImageProxy proxy = new ImageProxy("https://images.pngs.highresolution.tiff");
        proxy.show();
    }
}
