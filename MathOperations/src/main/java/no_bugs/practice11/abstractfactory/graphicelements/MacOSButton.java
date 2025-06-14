package no_bugs.practice11.abstractfactory.graphicelements;

public class MacOSButton implements IButton{
    @Override
    public void clickOn() {
        System.out.println("Click on MacOS button");
    }
}
