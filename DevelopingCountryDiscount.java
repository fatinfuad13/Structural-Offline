public class DevelopingCountryDiscount extends DiscountDecorator {

    private double discountAmount = 10.0;

    public DevelopingCountryDiscount(Content content) {
        super(content);
    }

    @Override
    protected double calculateDiscount(double basePrice) {
        // Use the isFromDevelopingCountry() method which delegates through the decorator chain
        if (isFromDevelopingCountry()) {
            return discountAmount;
        }
        return 0.0;
    }

    @Override
    protected String getDescription() {
        return "Developing country student discount: -$"
                + (int) discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public boolean isFromDevelopingCountry() {
        return wrappedContent.isFromDevelopingCountry(); // forward
    }

}
