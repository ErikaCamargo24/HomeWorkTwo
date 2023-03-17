package fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class FileOperations {
	
	public static void write(String path, String cadena) {
		File file = new File(path);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			printWriter.append(cadena).append("\n");
			printWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	 public static void readFile(String pathInput,String pathOutput) {
		 FileReader reader;
		 BufferedReader bufeBufferedReader;
		try {
			reader = new FileReader(pathInput);
			if (reader.ready()) {
				bufeBufferedReader = new BufferedReader(reader);
				String cadena;
				while ((cadena = bufeBufferedReader.readLine()) != null) {
					String noSpaces = cadena.replace(" ", "");
					write(pathOutput, noSpaces);
					System.out.println(noSpaces);
				}
			}else {
				System.out.println("El archivo no esta listo para ser leido...");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	 }
}
