import java.util.*;
public class Vehicle {
	String name;
	String number;
	String model;
	double cost;
	double road_tax;
	Vehicle(String name, String number, String model, double cost, double road_tax)
	{
		this.name = name;
		this.number = number;
		this.model = model;
		this.cost = cost;
		this.road_tax = road_tax;
				
	}
	double calc(double road_tax)
	{
		return road_tax/100 * cost;
	}
	void display()
	{
		System.out.println("Displaying details of the car: \nName: "+name+"\nNumber: "+number+"\nModel: "+model+"\nCost: "+cost+"\nRoad Tax: "+calc(road_tax));;
	}
}

class Truck extends Vehicle
{
	Truck(String name, String number, String model, double cost, double road_tax)
	{
		super(name, number, model , cost, road_tax);
	}
	
}

class Bike extends Vehicle
{
	Bike(String name, String number, String model, double cost, double road_tax)
	{
		super(name, number, model , cost, road_tax);
	}
}

class Car extends Vehicle
{
	Car(String name, String number, String model, double cost, double road_tax)
	{
		super(name, number, model , cost, road_tax);
	}
	
}

class Bus extends Vehicle
{
	Bus(String name, String number, String model, double cost, double road_tax)
	{
		super(name, number, model , cost, road_tax);
	}
	
}

