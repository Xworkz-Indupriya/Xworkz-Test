package com.xworkz.xworkzapp.hotel;

public class HotelDTO {
	
	private String name;
	private String location;
	private String ownerName;
	private String type;
	private String service;
	private String foodItems;
	
	public HotelDTO(String name, String location, String ownerName, String type, String service, String foodItems) 
	{
		this.name = name;
		this.location = location;
		this.ownerName = ownerName;
		this.type = type;
		this.service = service;
		this.foodItems = foodItems;
	}

	public String getName() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getService() {
		return service;
	}
	
	public void setService(String service) {
		this.service=service;
	}
	
	public String getFoodItems() {
		return foodItems;
	}
	
	public void setFoodItems(String foodItems) {
		this.foodItems=foodItems;
	}

	
}
