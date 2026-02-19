public class SpecialDiscount extends DiscountDecorator {

    private double discountAmount = 12.0;
    private double requiredDuration = 5.0;

    public SpecialDiscount(Content content) {
        super(content);
    }

    @Override
    protected double calculateDiscount(double basePrice) {

        if (wrappedContent.getDuration() >= requiredDuration) {
            return discountAmount;
        }

        return 0.0;
    }

    @Override
    protected String getDescription() {
        return "Duration discount: -$"
                + (int) discountAmount
                + " (for 5+ hours)";
    }



     public void setDiscountAmount(double discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    public void setRequiredDuration(double requiredDuration)
    {
        this.requiredDuration = requiredDuration;
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
