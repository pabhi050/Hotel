package com.hotel.servicevlass;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.apiresponse.ApiResponse;
import com.hotel.details.HotelDetails;
import com.hotel.repository.HotelRepository;

public class ServiceClass {

	@Autowired
	HotelRepository hotelRepository;

	public ApiResponse bookingtwo(HotelDetails hotelDetails) {
//		ApiResponse apiResponse = new ApiResponse();
		HotelDetails hotelDetails2 = new HotelDetails();
		hotelDetails2.setHotelname(hotelDetails.getHotelname());
		hotelDetails2.setName(hotelDetails.getName());
		hotelRepository.save(hotelDetails2);

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage("Api working");
		return apiResponse;
	}

}
