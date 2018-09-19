package entities;

import interfaces.Flyer;

public class Plane extends Vehicle implements Flyer{
	int maxAltitude;

	public int getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	public void fly() {
		System.out.println("Piloto automático y listo...");
	}

	public void takeoff() {
		System.out.println("Motores al 100% y despego");
	}

	public void land() {
		System.out.println("Le apunto a la pista y bajo");
	}
}
