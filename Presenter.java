package presenter;

import java.io.IOException;

import model.ManagerVehicle;
import model.Vehicle;
import view.View;

public class Presenter {
	 private Vehicle vehicle;
	 private ManagerVehicle manager;
	 private View view;
	 public Presenter() throws IOException {
		 manager = new ManagerVehicle("Resources\\vehicle_1.veh");
	 }
	 public static void main(String[] args) throws ClassNotFoundException, IOException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	 public void Run() throws IOException, ClassNotFoundException {
		 
		 view = new View();
		 
		 view.menu();
		 int option;
		 while(	 ( option = view.readInt("ingrese una opcion")) != 2) {

			 switch (option) {
			case 1:
				//String brand, String model, int year, String license, String color
				vehicle = new Vehicle(view.readString("ingrese una marca"),view.readString("ingrese el modelo"),view.readInt("ingrese el año"),view.readString("ingrese la licencia"),view.readString("ingrese color"));
				manager.createVehicle(vehicle);
				
				break;
			default:
				break;
			 }
			 
		 }
		}
	 }


