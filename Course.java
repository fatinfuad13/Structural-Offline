import java.util.ArrayList;

public class Course implements Content {

    private ArrayList<Content> items = new ArrayList<>();
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public void addItem(Content item) {
        if (!(item instanceof Lesson)) {
            throw new IllegalArgumentException("Course can only hold Lesson objects.");
        }
        items.add(item);
    }

    public void removeItem(Content item) {
        items.remove(item);
    }

    @Override
    public double getDuration() {
        double total = 0;
        for (Content c : items)
            total += c.getDuration();
        return total;
    }

    @Override
    public double calculatePrice() {
        double total = 0;
        for (Content c : items)
            total += c.calculatePrice();
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Course: " + name);
        for (Content c : items)
            c.showDetails();
        System.out.println("Total Duration: " + getDuration());
        System.out.println("Total Price: $" + calculatePrice());
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
