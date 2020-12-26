package com.xworkz.xworkzapp.hotel;

public class HotelInformation {
	
	public HotelDTO[] hoteldto= new HotelDTO[4];
	public int i;
	
	public void addHotelInfo(HotelDTO hotel) {
		hoteldto[i++]=hotel;
	}
	
	public void searchHotelsByName(String name) {
		for (int i = 0; i < hoteldto.length; i++) {
			if(hoteldto!=null) {
				if(hoteldto[i].getName().equals(name)) {
					System.out.println(hoteldto[i].getLocation()+" "+hoteldto[i].getService()+" "+hoteldto[i].getType());
				}else 
				{
					System.out.println("No hotel is present by that name");
				}
			}
		}
	}
	
	public void searchHotelsByLocation(String location) {
		for (int i = 0; i < hoteldto.length; i++) {
			if(hoteldto!=null) {
				if(hoteldto[i].getName().equals(location)) {
					System.out.println(hoteldto[i].getName()+" "+hoteldto[i].getService()+" "+hoteldto[i].getType());
				}else
				{
					System.out.println("No Hotel is present in that location");
				}
			}
		}
	}
	
	
	public void displayHotelDetails() {
		for (HotelDTO hotelDTO2 : hoteldto) {
			if(hoteldto!=null) {
				System.out.println(hotelDTO2.getName()+" "+ hotelDTO2.getLocation()+" "+hotelDTO2.getOwnerName()+" "+hotelDTO2.getType()+" "+hotelDTO2.getService()+" "+hotelDTO2.getFoodItems());
		    }else 
		    {
		    	System.out.println("add hotel information");
		    }
		}
	}
	
	public void displayOwnerNameByHotelName(String name) {
		for (HotelDTO hotelDTO2 : hoteldto) {
			if(hoteldto[i].getName().equals(name)) {
				System.out.println(hotelDTO2.getOwnerName());
			}
		}
	}
	
}
