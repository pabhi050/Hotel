package com.hotel.apiresponse;

import com.hotel.details.HotelDetails;

public class ApiResponse {

	private String message;
	private HotelDetails hotelDetails;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HotelDetails getHotelDetails() {
		return hotelDetails;
	}

	public void setHotelDetails(HotelDetails hotelDetails) {
		this.hotelDetails = hotelDetails;
	}

}
