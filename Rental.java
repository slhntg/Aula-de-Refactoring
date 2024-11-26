public class Rental {

   public double getCharge(Rental each) {
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

   public int getFrequentRenterPoints() { 
      int frequentRenterPoints = 0;
      // add frequent renter points
      frequentRenterPoints ++;
      if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
         this.getDaysRented() > 1) frequentRenterPoints ++;
      return frequentRenterPoints;
   }

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
   
}