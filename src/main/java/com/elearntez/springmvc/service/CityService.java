package com.elearntez.springmvc.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.elearntez.springmvc.bean.City;

@Service
public class CityService {

	public City getCityById(int cityId){
		return mockCityMap().get(cityId);
	}
	
	
	private Map<Integer,City> mockCityMap(){
		Map<Integer,City> map = new HashMap<>();
		
		City city = new City();
		city.setId(1);
		city.setName("Kabul");
		city.setDistrict("Kabol");
		city.setCountryCode("AFG");
		city.setPopulation(10000l);
		map.put(1, city);
		
		
		city = new City();
		city.setId(2);
		city.setName("Qandahar");
		city.setDistrict("Qandahar");
		city.setCountryCode("AFG");
		city.setPopulation(10000l);
		map.put(2, city);
		
		return map;
	}
	
}
