public abstract class Price {
   public abstract int getPriceCode();

public double getCharge(int daysRented, Rental each) {
  double thisAmount = 0;

     switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
           thisAmount += 2;
           if (each.getDaysRented() > 2) {
              thisAmount += (each.getDaysRented() - 2) * 1.5;
           }
           break;
        case Movie.NEW_RELEASE:
           thisAmount += each.getDaysRented() * 3;
           break;
        case Movie.CHILDRENS:
           thisAmount += 1.5;
           if (each.getDaysRented() > 3) {
              thisAmount += (each.getDaysRented() - 3) * 1.5;
           }
           break;
     }
  return thisAmount;
}
}