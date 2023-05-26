package br.com.icev.estruturadedados.trucklosgistics;

import br.com.icev.estruturadedados.stack.StackGeneric;

public class TruckLogistics {
	public static void main(String[] args) throws Exception {
		// creating the stack
		StackGeneric<Truck> trucks = new StackGeneric<>();

		// creating the objects to put on the stack
		Truck truck1 = new Truck("OEG4981", "Arroz", "Tiangu-CE", "vermelho", "baixo");
		Truck truck2 = new Truck("NKG0147", "Soja", "Uruçui-PI", "azul", "baixo");

		// putting the objects on the stack
		trucks.push(truck1);
		trucks.push(truck2);

		// loop that prints elements of the stack while that is not empty
		if (!trucks.isEmpty()) {
			for (int i = 0; i < trucks.size(); i++) {

				System.out.println(trucks.get(i).toString());
			}

		}
	}
}