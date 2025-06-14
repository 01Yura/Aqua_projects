package no_bugs.practice11.abstractfactory.graphicelements;

public interface IGUIFactory {
    IButton createButton();

    IMenu createMenu();
}
