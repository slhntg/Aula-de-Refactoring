public class TextStatement extends Statement {
  @Override
  protected String generateHeader(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  @Override
  protected String generateFooter(Customer aCustomer) {
    return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
        "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
  }

  @Override
  protected String formatRentalDetails(String details) {
    return details + "\n";
  }
}