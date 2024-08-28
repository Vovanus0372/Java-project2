package mediator;

public class Component2 {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doB() {
        System.out.println("Component2 does B.");
        mediator.notify("Component2", "B");
    }
}
