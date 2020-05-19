package Sapient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Sapient.model.Transaction;

public class ReportsUtil {

  public static List<Transaction> getTransactionsForCSV(File transactionFile) {

    List<Transaction> transactions = new ArrayList<>();
    try {
      FileReader reader = new FileReader(transactionFile);
      BufferedReader bfr = new BufferedReader(reader);
      String line;
      try {
        bfr.readLine();
        while ((line = bfr.readLine()) != null) {
          String[] transactionItemArr = line.split(",");

          Transaction transaction = new Transaction();

          transaction.setExternalTransactionalId(transactionItemArr[0]);
          transaction.setClientId(transactionItemArr[1]);
          transaction.setSecurityId(transactionItemArr[2]);
          transaction.setTransactionType(transactionItemArr[3]);
          transaction.setTransactionDate(new Date(transactionItemArr[4]));
          transaction.setMarketValue(Float.parseFloat(transactionItemArr[5]));
          transaction.setFlag(transactionItemArr[6].charAt(0));

          transactions.add(transaction);
        }

        bfr.close();

      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      return transactions;
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;
  }

}
