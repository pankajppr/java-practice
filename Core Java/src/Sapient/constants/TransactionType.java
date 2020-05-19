package Sapient.constants;

public enum TransactionType {
  BUY("BUY"), SELL("SELL"), DEPOSIT("DEPOSIT"), WITHDRAW("WITHDRAW");

  private String type;

  TransactionType(String type) {
    this.type = type;
  }
}
