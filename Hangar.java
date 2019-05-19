import java.util.ArrayList;

public class Hangar {

	public static void main(String[] args) {

		//la référence alpine reçoit une nouvelle instance de la class Car
		Car alpine = new Car("Alpine");
		//utilisation d'un setter
		alpine.setKilometers(17000);
		//la référence titanic reçoit une nouvelle instance de la class Boat
		Boat titanic = new Boat("Titanic");
		//utilisation d'un setter
		titanic.setKilometers(1500);
		//stock des references dans une ArrayList
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(alpine);
		vehicles.add(titanic);

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.doStuff());
		}
	}
}
