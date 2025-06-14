package no_bugs.practice11.proxy;

public class HighResolutionImage {
    public HighResolutionImage(String pathToImage) {
        System.out.println("The image is downloading from " + pathToImage);
    }

    public void showImage() {
        System.out.println("Image is being showed");
    }
}
