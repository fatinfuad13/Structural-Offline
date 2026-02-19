import java.util.ArrayList;

public class ContentCart implements Content {

    private ArrayList<Content> items = new ArrayList<>();
    private String name;
    private boolean isFromDevelopingCountry;

    public ContentCart(String name, boolean isFromDevelopingCountry) {
        this.name = name;
        this.isFromDevelopingCountry = isFromDevelopingCountry;
    }

    public void addItem(Content item) {
        items.add(item);
    }

    public void removeItem(Content item) {
        items.remove(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getDuration() {
        double total = 0;
        for (Content item : items) {
            total += item.getDuration();
        }
        return total;
    }

    public double calculatePrice() {
        double total = 0;
        for (Content item : items) {
            total += item.calculatePrice();
        }
        return total;
    }

    public boolean isFromDevelopingCountry() {
        return this.isFromDevelopingCountry;
    }

    public java.util.List<Content> getItems() {
        return new ArrayList<>(items);
    }

    public void showDetails() {
        System.out.println("ContentCart: " + name);
        for (Content item : items) {
            item.showDetails();
        }
        System.out.println("Total Duration: " + getDuration() + " hours");
        System.out.println("Total Price: $" + calculatePrice());
    }
}
