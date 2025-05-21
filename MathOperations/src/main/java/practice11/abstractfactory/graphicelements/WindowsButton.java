package practice11.abstractfactory.graphicelements;

public class WindowsButton implements IButton {
    @Override
    public void clickOn() {
        System.out.println("Double click on windows button");
    }
}
