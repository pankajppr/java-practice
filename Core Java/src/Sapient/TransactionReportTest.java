package Sapient;

import java.io.File;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Sapient.service.ReportService;

public class TransactionReportTest {

  private ReportService reportService;

  @Before
  public void initialize() {
    this.reportService = new ReportService();
  }

  @Test
  public void testForReportGeneration() {

    reportService.setReportSource(new File("SampleData.csv"), ".csv");

    Assert.assertNotNull(reportService.generateReport());
  }

}
