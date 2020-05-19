import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.simpleprogrammer.proteintracker.TrackingService;

public class TrackingServiceTest {
	private TrackingService service;
	@Before
	public void setUp(){
		System.out.println("Before");
		service = new TrackingService();
	}
	@Test
	public void NewTrackingServiceTotalIsZero(){
				assertEquals("Tracking service total was not zero", service.getTotal(), 0);
	}
	
	@Test
	public void WhenAddingProteinTotalIncreasesByThatAmount(){
		service.addProtein(10);
		assertEquals("Total was not Incremented correctly",10,service.getTotal());
	}
	
	@Test
	public void WhenRemovingProteinTotalRemainsZero(){
		service.removeProtein(5);
		assertEquals(0,service.getTotal());
	}
}
