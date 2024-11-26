public abstract class Price {
   public abstract int getPriceCode();

public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented, Rental each) {
    int frequentRenterPoints = 0;
    // add frequent renter points
    frequentRenterPoints ++;
    if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
       each.getDaysRented() > 1) frequentRenterPoints ++;
    return frequentRenterPoints;
   }
}