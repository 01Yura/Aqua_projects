package no_bugs.practice11.proxy;

public class ImageProxy implements Showable {
    private HighResolutionImage image;
    private String pathToImage;

    public ImageProxy(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    // делегируем загрузку в момент вызова show()
    @Override
    public void show() {
        if (this.image == null) {
            this.image = new HighResolutionImage(pathToImage);
        }
        image.showImage();
    }
}
