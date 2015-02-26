package com.tutorial.spring.annotation.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tutorial.spring.annotation.vehicle.fourwheel.Car;
import com.tutorial.spring.annotation.vehicle.twowheel.Bike;
/**
 * @author Jayram
 *
 */
@Component
public class Vehicle {
	private Car car;
	private Bike bike;
	public Vehicle() {
		//System.out.println("Vehile.enclosing_method() "+ this);
	}
	public Car getCar() {
		return car;
	}
	/**
	 * @param car
	 */
	@Autowired
	public void setCar(Car car) {
		System.out.println("Vehicle.setCar()");
		this.car = car;
	}
	public Bike getBike() {
		return bike;
	}
	@Autowired
	public void setBike(Bike bike) {
		System.out.println("Vehicle.setBike()");
		this.bike = bike;
	}
}
