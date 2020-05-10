package com.designpattern.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin extends INotificationObserver 
{
	private static final Logger LOGGER = LogManager.getLogger(Admin.class);

	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() 
	{
		LOGGER.info("Start Notification");
		LOGGER.debug("Hello " + name + " Your Event will start shortly"+ " Notification will be send through Email/SMS/Whatsapp ");
		LOGGER.info("End Notification");
	}

}