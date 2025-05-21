package practice11.abstractfactory.graphicelements;

public class Main {
    public static void main(String[] args) {
        CommonGUIFactory.createButton("windows").clickOn();
        CommonGUIFactory.createMenu("macOS").render();
    }
}
