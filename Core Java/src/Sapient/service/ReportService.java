package Sapient.service;

import java.io.File;
import java.util.Collections;
import java.util.List;
import Sapient.ReportsUtil;
import Sapient.model.Transaction;

public class ReportService {

  List<Transaction> transactions;

  public void setReportSource(File reportFile, String format) {
    if (format.equals(".csv")) {
      System.out.println("=========Reading CSV file with name: " + reportFile.getName());
      transactions = ReportsUtil.getTransactionsForCSV(reportFile);
      System.out.println("==============Found Transactions: " + transactions.size());

    }

  }

  public Object generateReport() {
    Collections.sort(transactions);
    printTransactions();


    return null;
  }

  void printTransactions() {
    for (Transaction trans : transactions) {
      System.out.println(trans);
    }
  }
}
