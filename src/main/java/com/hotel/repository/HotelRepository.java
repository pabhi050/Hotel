package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.details.HotelDetails;

public interface HotelRepository extends JpaRepository<HotelDetails, Integer> {

}
