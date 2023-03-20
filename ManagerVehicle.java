package model;

import java.io.File;
import java.io.FileNotFoundException;


import java.io.IOException;
import java.util.ArrayList;

import tools.FileReader;
import tools.FileWriter;

public class ManagerVehicle {
	File file;
	String path;
	private int count=0;
	private FileWriter writer;
	private ArrayList<Vehicle> vehicles;
	private FileReader reader;
		
		public ManagerVehicle(String path) throws IOException {
			file = new File(path);
			this.path = path;
			vehicles = new ArrayList<Vehicle>();
			//reader = new FileReader(path);
		}
		
	public void createVehicle(Vehicle vehicle) throws IOException, ClassNotFoundException{
		int i = 0;
		if(file.exists()) {
			System.out.println(count);
			reader = new FileReader("Resources\\vehicle_"+count+".veh");
			i =reader.readInt();
			vehicle.setId(i++);
			vehicles.add(vehicle);
			writer = new FileWriter("Resources\\vehicle_"+i+".veh");
			writer.writeInt(i);
		}else {
			count++;
			System.out.println(count);
			writer = new FileWriter(path);
			writer.writeInt(1);
			vehicle.setId(1);
			vehicles.add(vehicle);
		}
	}
}
