package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.apiresponse.ApiResponse;
import com.hotel.details.HotelDetails;
import com.hotel.repository.HotelRepository;
import com.hotel.servicevlass.ServiceClass;

@RestController
public class HotelController {

	ServiceClass serviceClass = new ServiceClass();
	@Autowired
	HotelRepository hotelRepository;

	@GetMapping("/dummy")
	public ApiResponse dummyapi() {

		ApiResponse apiResponse = new ApiResponse();

		apiResponse.setMessage("hello");
		return apiResponse;
	}

//		Data Save
	@PostMapping("/booking")
	public ApiResponse bookingone(@RequestBody HotelDetails hotelDetails) {

		return serviceClass.bookingtwo(hotelDetails);

	}

}
