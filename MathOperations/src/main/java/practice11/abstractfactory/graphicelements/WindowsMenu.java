package practice11.abstractfactory.graphicelements;

public class WindowsMenu implements IMenu {
    @Override
    public void render() {
        System.out.println("Looks like windows menu");
    }
}
