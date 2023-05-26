package br.com.icev.estruturadedados.trucklosgistics;

public class Truck {

	/* truck attributes */

	String plate;
	String truckload;
	String destiny;
	String color;
	String truckloadCriticaly;

	/* constructor method */

	public Truck(String plate, String truckload, String destiny, String color, String truckloadCriticaly) {
		super();
		this.plate = plate;
		this.truckload = truckload;
		this.destiny = destiny;
		this.color = color;
		this.truckloadCriticaly = truckloadCriticaly;
	}

	/* getters and setters */

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getTruckload() {
		return truckload;
	}

	public void setTruckload(String truckload) {
		this.truckload = truckload;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTruckloadCriticaly() {
		return truckloadCriticaly;
	}

	public void setTruckloadCriticaly(String truckloadCriticaly) {
		this.truckloadCriticaly = truckloadCriticaly;
	}

	@Override
	public String toString() {
		return "Truck [plate=" + plate + ", truckload=" + truckload + ", destiny=" + destiny + ", color=" + color
				+ ", truckloadCriticaly=" + truckloadCriticaly + "]";
	}

}
