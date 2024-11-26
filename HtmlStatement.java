public class HtmlStatement extends Statement {
  @Override
  protected String generateHeader(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }

  @Override
  protected String generateFooter(Customer aCustomer) {
    return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
        "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
  }

  @Override
  protected String formatRentalDetails(String details) {
    return details + "<BR>\n";
  }
}