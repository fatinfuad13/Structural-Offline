public interface Content {
  void setName(String name);
  String getName();
  //void setDuration(double duration);
  double getDuration();
  //void setPrice(Double price);
  double calculatePrice();
  void showDetails();

   default boolean isFromDevelopingCountry() {
        return false;
    }
}
