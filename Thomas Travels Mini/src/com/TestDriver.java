package com;
import java.util.ArrayList;
public class TestDriver {
public static void main(String[] args) {
	  Driver d1 = new Driver(1, "Sudhagar", "Car", 400);
      Driver d2 = new Driver(2, "anji", "Auto", 180);
      Driver d3 = new Driver(3, "abhi", "Car", 320);
      Driver d4 = new Driver(4, "laxman", "Lorry", 450);



      ArrayList<Driver> driverList = new ArrayList<>();
      driverList.add(d1);
      driverList.add(d2);
      driverList.add(d3);
      driverList.add(d4);


      Travel travel = new Travel();
  
      System.out.println("Is Car Driver: " + travel.isCarDriver(d1));
      System.out.println(travel.retrivebyDriverId(driverList, 1));
      System.out.println("Car Drivers Count: " + travel.retriveCountOfDriver(driverList, "Car"));
      ArrayList<Driver> carDrivers= travel.retriveDriver(driverList, "Car");
      System.out.println("Car Drivers:");
      for (Driver d : carDrivers) {
      System.out.println(d.getDriverName());
      }


      Driver maxDriver = travel.retriveMaximumDistanceTravelledDriver(driverList);
      System.out.println("Maximum Distance Travelled By: "
              + maxDriver.getDriverName());
}
}












