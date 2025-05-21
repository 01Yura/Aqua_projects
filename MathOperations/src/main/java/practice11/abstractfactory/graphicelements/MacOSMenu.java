package practice11.abstractfactory.graphicelements;

public class MacOSMenu implements IMenu {
    @Override
    public void render() {
        System.out.println("Looks like MacOS menu");
    }
}
