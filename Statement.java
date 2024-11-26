import java.util.Enumeration;

public abstract class Statement {
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = generateHeader(aCustomer);
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += formatRentalDetails(generateRentalDetails(each));
    }
    result += generateFooter(aCustomer);
    return result;
  }

  protected String generateRentalDetails(Rental each) {
    return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge());
  }

  protected abstract String generateHeader(Customer aCustomer);
  protected abstract String generateFooter(Customer aCustomer);
  protected abstract String formatRentalDetails(String details);
}