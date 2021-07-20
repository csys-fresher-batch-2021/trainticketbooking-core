package com.sakil.connection;

import java.util.List;

import com.sakil.model.BookingDetails;

public class Logger {

	public void debug (BookingDetails trainDetail)
	{
		System.out.println(trainDetail);
	}

	public  void debug(List<BookingDetails> findStatus) {
		System.out.println(findStatus);
		
	}

	public void debug(String string) {
		
		System.out.println(string);
	}
}
