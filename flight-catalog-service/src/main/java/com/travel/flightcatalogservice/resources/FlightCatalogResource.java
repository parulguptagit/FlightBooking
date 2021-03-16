package com.travel.flightcatalogservice.resources;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.flightcatalogservice.model.Flight;

@RestController
@RequestMapping("/flights")
public class FlightCatalogResource {
	
	@RequestMapping("/{flightNo}")
	public Flight getFlightCatalog(@PathVariable("flightNo") String flightNo){
		
		return new Flight(flightNo, "EWR", "IGI");
		
	}

}
