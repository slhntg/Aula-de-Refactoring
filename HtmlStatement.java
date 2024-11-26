import java.util.Enumeration;

public class HtmlStatement extends Statement {
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += generateRentalDetails(each) + "<BR>\n";
    }
    // add footer lines
    result += "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
        + "</EM> frequent renter points<P>";
    return result;
  }

  private String generateRentalDetails(Rental each) {
    return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge());
  }
}