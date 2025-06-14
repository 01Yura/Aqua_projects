package no_bugs.practice11.abstractfactory.graphicelements;

public class MacOSFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public IMenu createMenu() {
        return new MacOSMenu();
    }
}
