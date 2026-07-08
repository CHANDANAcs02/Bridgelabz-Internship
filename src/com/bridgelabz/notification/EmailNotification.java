package com.bridgelabz.notification;

/*
 * Email Notification implementation.
 */

public class EmailNotification implements Notification {

	@Override
	public void sendNotification(String message) {

		System.out.println("Email Notification : " + message);
	}
}