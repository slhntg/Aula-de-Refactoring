public class Movie {

    public double getCharge(int daysRented, Rental each){
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

    public int getFrequentRenterPoints(int daysRented, Rental each){
        int frequentRenterPoints = 0;
          // add frequent renter points
          frequentRenterPoints ++;
          if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
             each.getDaysRented() > 1) frequentRenterPoints ++;
          return frequentRenterPoints;
    }

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
 private Price _price;

   public Movie(String name, int priceCode) {
      _title = name;
      setPriceCode(priceCode);
   }

   public int getPriceCode() {
      return _price.getPriceCode();
   }

   public void setPriceCode(int arg) {
      switch (arg) {
         case REGULAR:
            _price = new RegularPrice();
            break;
         case CHILDRENS:
            _price = new ChildrensPrice();
            break;
         case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
         default:
            throw new IllegalArgumentException("Incorrect Price Code");
      }
   }
}