public class MultiModuleDiscount extends DiscountDecorator {

    private double discountAmount = 15.0;
    private int requiredModules = 2;

    public MultiModuleDiscount(Content content) {
        super(content);
    }

    @Override
    protected double calculateDiscount(double basePrice) {

        int moduleCount = 0;

        // Only applies if wrapped content is a cart
        if (wrappedContent instanceof ContentCart) {
            ContentCart cart = (ContentCart) wrappedContent;

            for (Content c : cart.getItems()) {

                // Count real modules OR decorated modules
                if (c instanceof Module || c instanceof ModuleDecorator) {
                    moduleCount++;
                }
            }
        }

        if (moduleCount >= requiredModules) {
            return discountAmount;
        }

        return 0.0;
    }

    @Override
    protected String getDescription() {
        return "Multi-module discount: -$" 
                + (int) discountAmount 
                + " (" + requiredModules + "+ modules)";
    }

    public void setDiscountAmount(double discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    public void setRequiredModules(int requiredModules)
    {
        this.requiredModules = requiredModules;
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
