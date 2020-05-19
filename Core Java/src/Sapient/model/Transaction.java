package Sapient.model;

import java.util.Date;

public class Transaction implements Comparable {

  private String externalTransactionalId;
  private String clientId;
  private String securityId;
  private String transactionType;
  private Date transactionDate;
  private Float marketValue;
  private Character flag;

  @Override
  public String toString() {
    return "Transaction [clientId=" + clientId + ", securityId=" + securityId + ", transactionType="
        + transactionType + ", transactionDate=" + transactionDate + ", marketValue=" + marketValue
        + ", flag=" + flag + "]";
  }

  public String getExternalTransactionalId() {
    return externalTransactionalId;
  }

  public void setExternalTransactionalId(String externalTransactionalId) {
    this.externalTransactionalId = externalTransactionalId;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getSecurityId() {
    return securityId;
  }

  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Float getMarketValue() {
    return marketValue;
  }

  public void setMarketValue(Float marketValue) {
    this.marketValue = marketValue;
  }

  public Character getFlag() {
    return flag;
  }

  public void setFlag(Character flag) {
    this.flag = flag;
  }

  @Override
  public int compareTo(Object input) {

    Transaction trans = (Transaction) input;
    if (clientId.compareTo(trans.getClientId()) != 0) {
      return clientId.compareTo(trans.getClientId());
    } else if (securityId.compareTo(trans.getSecurityId()) != 0) {
      return securityId.compareTo(trans.getSecurityId());
    } else if (transactionDate.compareTo(trans.getTransactionDate()) != 0) {
      return transactionDate.compareTo(trans.getTransactionDate());
    } else if (transactionType.compareTo(trans.getTransactionType()) != 0) {
      return transactionType.compareTo(trans.getTransactionType());
    }
    return 0;
  }



}
