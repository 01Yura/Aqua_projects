package no_bugs.practice11.abstractfactory.graphicelements;

public class WindowsFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public IMenu createMenu() {
        return new WindowsMenu();
    }
}
