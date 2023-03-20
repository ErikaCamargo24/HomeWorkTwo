package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class View {
    Scanner console;
    public View(){
        console = new Scanner(System.in);
    }
    public int readInt(String message) {
        System.out.println(message);
        return console.nextInt();
    }
    public String readString(String message) {
        System.out.println(message);
        return console.next();
    }
    public int menu(){
    	int value;
        String str= "1)Create a new vehicle \n"
                +"2)Find all vehicles\n"
                +"3)Find a vehicle by id.\n"
                +"4)Exit.";
        value = Integer.parseInt(JOptionPane.showInputDialog(null, str));
        return value;
    }
    public String readData(String message) {
		String data = JOptionPane.showInputDialog(null, message);
		return data;
	}
    public  void showMessageInt(int x){
        System.out.println(x);
    }
    public int readGraphicInt(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }
    public void showGraphicMessage(String str){
        JOptionPane.showMessageDialog(null, str);
    }
    public long readLong(String message) {
    	System.out.println(message);
    	return console.nextLong();
    }
}
