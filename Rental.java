public class Rental {

   public double getCharge() {
      return _movie.getCharge(_daysRented, this);
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