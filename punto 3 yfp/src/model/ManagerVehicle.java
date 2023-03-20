package model;

import java.io.File;
import java.io.FileNotFoundException;


import java.io.IOException;
import java.util.ArrayList;

import tools.FileReader;
import tools.FileWriter;

public class ManagerVehicle {
	File file;
	private final String FIRST_PATH="Resources\\vehicle_1.veh";
	private FileWriter writer;
	private ArrayList<Vehicle> vehicles;
	private FileReader reader;
		
		public ManagerVehicle() throws IOException {
			vehicles = new ArrayList<Vehicle>();
		}
	public void createVehicle(Vehicle vehicle) throws IOException, ClassNotFoundException{
		int i;
		if((i = this.validate())!=0) {
			reader = new FileReader("Resources\\vehicle_"+i+".veh");
			i =reader.readInt();
			vehicle.setId(++i);
			vehicles.add(vehicle);
			writer = new FileWriter("Resources\\vehicle_"+i+".veh");
			writer.writeInt(i);
		}else {
			this.createFirstFile(vehicle);;
		}
		
	}
	public void createFirstFile(Vehicle vehicle) throws IOException {
		writer = new FileWriter(this.FIRST_PATH);
		writer.writeInt(1);
		vehicle.setId(1);
		vehicles.add(vehicle);
	}
	public int  validate() {
		int i =0;
		boolean value = true;
		while (value) {
			i++;
			file = new File("Resources\\vehicle_"+i+".veh");
			value = file.exists();
		}
		i--;
		return i;
	}
	public String showAllVehicles() {
		String aux="";
		for (int i = 0; i < vehicles.size(); i++) {
			aux +=vehicles.get(i).toString()+"\n";
		}
		return aux;
	}
	public String foundVehicle(int id) {
		String aux = "";
		for (int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getId()==id) {
				aux = vehicles.get(i).toString();
			}
		}
		return aux;
	}
	public void writerVehicle(FileWriter writer,Vehicle vehicle) throws IOException {
		writer.writeString(vehicle.getBrand());
		writer.writeString(vehicle.getColor());
		writer.writeString(vehicle.getLicense());
		writer.writeString(vehicle.getModel());
		writer.writeInt(0);
	}
}
