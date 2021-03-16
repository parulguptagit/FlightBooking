package com.travel.flightbookingservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.flightbookingservice.model.Booking;


@RestController
@RequestMapping("/bookings")
public class FlightBookingResource {
	
	

	@RequestMapping("/{userId}")
	public List<Booking> getBookings(@PathVariable("userId") String userId){
		
		return Collections.singletonList(
				new Booking("1234", "parul" , "AI123" , "12-12-2020")
				);
	}
}
