package com.example.maintenancemonitor;

import com.example.maintenancemonitor.MaintenanceMonitorController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaintenanceMonitorApplicationTests {
	private MaintenanceMonitorController maintenanceMonitor=new MaintenanceMonitorController();
	String defaultMessage = "Everything operates as expected";

	@Test
	void contextLoads() {
	}

	@Test
	public void testSetMessage() {
		String message = "New message";
		maintenanceMonitor.setMessage(message);

		assertEquals(maintenanceMonitor.getMessage(),message);
	}

	@Test
	public void testReset() {
		String randomMessage="Some message";
		maintenanceMonitor.setMessage(randomMessage);
		maintenanceMonitor.reset();

		assertEquals(defaultMessage, maintenanceMonitor.getMessage());
	}

	@Test
	public void testNullMessage() {
		String nullMessage = null;
		maintenanceMonitor.setMessage(nullMessage);

		assertEquals(defaultMessage, maintenanceMonitor.getMessage());
	}

	@Test
	public void testUpdateMessage() {
		String initialMessage = "Initial message";
		maintenanceMonitor.setMessage(initialMessage);
		String updatedMessage = "Updated message";
		maintenanceMonitor.setMessage(updatedMessage);

		assertEquals(updatedMessage, maintenanceMonitor.getMessage());
	}

	@Test
	public void testResetWithNoMessageSet() {
		maintenanceMonitor.reset();

		assertEquals(defaultMessage, maintenanceMonitor.getMessage());
	}

	@Test
	public void testResetWithDefaultMessageSet() {
		maintenanceMonitor.setMessage(defaultMessage);
		maintenanceMonitor.reset();

		assertEquals(defaultMessage, maintenanceMonitor.getMessage());
	}
	@Test
	public void testDefault() {

		assertEquals(defaultMessage, maintenanceMonitor.getMessage());
	}



}
