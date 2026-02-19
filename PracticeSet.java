public class PracticeSet extends ModuleDecorator {

    private double practiceSetPrice = 10.0;

    public PracticeSet(Content content) {
        super(content);
    }

    @Override
    public double calculatePrice() {
        return wrappedContent.calculatePrice() + practiceSetPrice;
    }

    @Override
    public void showDetails() {
        wrappedContent.showDetails();
        System.out.println("  + Added: Practice Set (+$" + (int) practiceSetPrice + ")");
    }

    public void setPracticeSetPrice(double price) {
        this.practiceSetPrice = price;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}
