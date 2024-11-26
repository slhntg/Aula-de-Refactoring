import java.util.Enumeration;

public class TextStatement extends Statement {

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = "Rental Record for " + aCustomer.getName() + "\n";
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += generateRentalDetails(each) + "\n";
    }
    // add footer lines
    result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    return result;
  }
  private String generateRentalDetails(Rental each) {
    return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge());
  }
}