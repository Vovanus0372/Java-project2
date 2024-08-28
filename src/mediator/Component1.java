package mediator;

public class Component1 {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doA() {
        System.out.println("Component1 does A.");
        mediator.notify("Component1", "A");
    }
}
