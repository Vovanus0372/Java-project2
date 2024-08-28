package abstractFactory;

public class Main {
    public static void clientCode(GUIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        System.out.println(button.render());
        System.out.println(checkbox.render());
    }

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory(); // Или new MacOSFactory();
        clientCode(factory);
    }
}
