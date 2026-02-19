public abstract class DiscountDecorator implements Content {

    protected Content wrappedContent;

    public DiscountDecorator(Content content) {
        this.wrappedContent = content;
    }

    @Override
    public double getDuration() {
        return wrappedContent.getDuration();
    }

    @Override
    public double calculatePrice() {
        double base = wrappedContent.calculatePrice();
        double discount = calculateDiscount(base);
        return Math.max(0, base - discount);
    }

    @Override
    public void showDetails() {
        wrappedContent.showDetails();
        String desc = getDescription();
        if (desc != null && !desc.isEmpty()) {
            System.out.println("Applied Discount: " + desc);
        }
    }

    @Override
public boolean isFromDevelopingCountry() {
    return wrappedContent.isFromDevelopingCountry();
}


    protected abstract double calculateDiscount(double basePrice);
    protected abstract String getDescription();
}
