package com;

import java.util.ArrayList;

public class Travel {

	public boolean isCarDriver(Driver driver) {
		        return "Car".equalsIgnoreCase(driver.getCategory());
		    }
			
	public String retrivebyDriverId(ArrayList<Driver> driverList, int driverId) {
        for (Driver d : driverList) {
            if (d.getDriverId() == driverId) {
                return "Driver name is " + d.getDriverName()
                        + " Belongs to the category " + d.getCategory()
                        + " travelled " + d.getTotalDistance() + " KM so far";
            }
        }
        return "Driver is not found";
        
	}
            public int retriveCountOfDriver (ArrayList<Driver> driverList,String category)  {
            	int count =0;
            	for(Driver d: driverList) {
            		if (d.getCategory().equalsIgnoreCase(category)) {
                        count++;
                    }
                }
                return count;
            }
            public ArrayList<Driver> retriveDriver(ArrayList<Driver> driverList, String category) {
                ArrayList<Driver> result = new ArrayList<>();
                for (Driver d : driverList) {
                    if (d.getCategory().equalsIgnoreCase(category)) {
                        result.add(d);
                    }
            }
	return result;

	}
            public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverList) {
                Driver maxDriver = driverList.get(0);
            for (Driver d : driverList) {
                if (d.getTotalDistance() > maxDriver.getTotalDistance()) {
                    maxDriver = d;
                }
            }
            return maxDriver;
        }
}