public class Lesson implements Content {

    private String name;
    private double duration;
    private double price;

    public Lesson(String name, double duration, double price) {
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return this.duration;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice() {
        return this.price;
    }

    public void showDetails() {
        System.out.println("  Lesson: " + name);
        System.out.println("    Duration: " + duration + " hours");
        System.out.println("    Price: $" + price);
    }
}
