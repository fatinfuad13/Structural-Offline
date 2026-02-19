public abstract class ModuleDecorator implements Content {

    protected Content wrappedContent;

    public ModuleDecorator(Content content) {
        // No more instanceof check — allows chaining add-ons
        this.wrappedContent = content;
    }

    @Override
    public double getDuration() {
        return wrappedContent.getDuration();
    }

    @Override
    public double calculatePrice() {
        return wrappedContent.calculatePrice();
    }

    @Override
    public void showDetails() {
        wrappedContent.showDetails();
    }

    @Override
    public String getName() {
        return wrappedContent.getName();
    }
}
