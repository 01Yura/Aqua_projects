package practice11.abstractfactory.graphicelements;

public class CommonGUIFactory {
    private static IGUIFactory createFactory(String string) {
        return switch (string.toLowerCase()) {
            case "windows" -> new WindowsFactory();
            case "macos" -> new MacOSFactory();
            default -> throw new IllegalStateException("Unexpected value: " + string);
        };
    }

    public static IButton createButton(String string) {
        return createFactory(string).createButton();
    }

    public static IMenu createMenu(String string) {
        return createFactory(string).createMenu();
    }
}
