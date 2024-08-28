package mediator;

public class Main {
    public static void main(String[] args) {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();

        ConcreteMediator mediator = new ConcreteMediator(component1, component2);

        component1.doA();  // Запуск взаимодействия через медиатор
    }
}

