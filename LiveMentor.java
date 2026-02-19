public class LiveMentor extends ModuleDecorator {

    private double liveMentorPrice = 20.0;

    public LiveMentor(Content content) {
        super(content);
    }

    @Override
    public double calculatePrice() {
        return wrappedContent.calculatePrice() + liveMentorPrice;
    }

    @Override
    public void showDetails() {
        wrappedContent.showDetails();
        System.out.println("  + Added: Live Mentor (+$" + (int) liveMentorPrice + ")");
    }

    public void setLiveMentorPrice(double price) {
        this.liveMentorPrice = price;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}
