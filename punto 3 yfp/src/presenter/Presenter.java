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
		 
	 }
	 public static void main(String[] args) throws ClassNotFoundException, IOException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	 public void Run() throws IOException, ClassNotFoundException {
		 manager = new ManagerVehicle();
		 view = new View();
		 int option;
		 while(	 (option=view.menu()) != 4) {
			 switch (option) {
			case 1:
				vehicle = new Vehicle(view.readData("Ingrese la rama:"),view.readData("ingrese el modelo:"),view.readGraphicInt("ingrese el año:"),view.readData("ingrese la licencia:"),view.readData("ingrese color:"));
				manager.createVehicle(vehicle);
				break;
			case 2:
				view.showGraphicMessage(manager.showAllVehicles());
				break;
			case 3:
				view.showGraphicMessage(manager.foundVehicle(view.readGraphicInt("ingrese el id del vehiculo:")));
				break;
			case 4:
				option =4;
				break;
			default:
				break;
			 }
			 
		 }
		}
	 }


