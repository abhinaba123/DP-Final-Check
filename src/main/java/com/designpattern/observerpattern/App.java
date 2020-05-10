package com.designpattern.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) 
	{
		LOGGER.info("start");

		INotificationService service = new NotificationService();
		
		INotificationObserver admin1 = new Admin(service, "ABC", 87);
		INotificationObserver admin2 = new Admin(service, "MN0", 110);
		INotificationObserver admin3 = new Admin(service, "XYZ", 125);
		
		
		service.addObserver(admin1);
		service.addObserver(admin2);
		service.addObserver(admin3);
		
		service.notifyObserver();
		
		
		service.removeObserver(admin2);
		
		
		service.notifyObserver();
		
		LOGGER.info("end");
	}
}