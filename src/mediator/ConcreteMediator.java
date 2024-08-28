package mediator;

public class ConcreteMediator implements Mediator{
    private Component1 component1;
    private Component2 component2;
    private boolean isActive = true;
    private int quantity=0;

    public ConcreteMediator(Component1 component1, Component2 component2) {
        this.component1 = component1;
        this.component1.setMediator(this);
        this.component2 = component2;
        this.component2.setMediator(this);
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    @Override
    public void notify(String sender, String event) {
        quantity+=1;
        if(quantity==2) isActive=false;

        if (!isActive) return;

        if (sender.equals("Component1") && event.equals("A")) {
            System.out.println("Mediator reacts on A and triggers B.");
            component2.doB();
        } else if (sender.equals("Component2") && event.equals("B")) {
            System.out.println("Mediator reacts on B and triggers A.");
            component1.doA();
        }
    }

}
