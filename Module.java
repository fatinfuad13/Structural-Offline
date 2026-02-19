import java.util.ArrayList;

public class Module implements Content {

    private ArrayList<Content> items = new ArrayList<>();
    private String name;

    public Module(String name) {
        this.name = name;
    }

    public void addItem(Content item) {
        if (!(item instanceof Course)) {
            throw new IllegalArgumentException("Module can only hold Course objects.");
        }
        items.add(item);
    }

    public void removeItem(Content item) {
        items.remove(item);
    }

    @Override
    public double getDuration() {
        double total = 0;
        for (Content c : items) {
            total += c.getDuration();
        }
        return total;
    }

    @Override
    public double calculatePrice() {
        double total = 0;
        for (Content c : items) {
            total += c.calculatePrice();
        }
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Module: " + name);
        for (Content c : items) {
            c.showDetails();
        }
        System.out.println("Total Duration: " + getDuration() + " hours");
        System.out.println("Total Price: $" + calculatePrice());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
