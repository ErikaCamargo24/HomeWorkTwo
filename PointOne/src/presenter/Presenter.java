package presenter;

import fileOperations.FileOperations;
import view.View;

public class Presenter {
	private FileOperations fileOperations;
	private View view;
	
	public Presenter() {
	     fileOperations = new FileOperations();
	     view = new View();
	}
       
   
   public void run() {
       fileOperations.readFile("./data/input.txt", "./data/output.txt");
   }
	 public static void main(String[] args) {
	        Presenter presenter = new Presenter();
	        presenter.run();
	 }
}
