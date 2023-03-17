package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Persistence {
    public static final String NAME_FILE1 = "./data/Info1.bin";
    public static final String NAME_FILE2 = "./data/Info2.txt";
    public static final String NAME_FILE_BIN = "./data/Infotxt.bin";
    public static final String NAME_FILE_TXT = "./data/Infobin.txt";
    
    private final Scanner scanner;

    public Persistence() {
        this.scanner = new Scanner(System.in);
    }

    public String read(String path) {
        StringBuilder text = new StringBuilder();

        try (FileReader fileReader = new FileReader(new File(path))) {
            String auxText;
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((auxText = bufferedReader.readLine()) != null) {
                text.append(auxText);
            }
        } catch (IOException ex) {
            System.err.println("¡Errror al leer!");
        }
        return "" + text;
    }

    public void write(String text, String path) {
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(text);
            }
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println("¡Error al escribir!" + ex);
        }
    }
    
    public void writeFile() {
        System.out.println("Ingrese info1: ");
        write(this.scanner.nextLine(), NAME_FILE1);
        System.out.println("Ingrese info2: ");
        write(this.scanner.nextLine(), NAME_FILE2);
    }
    
    public void readFile() {
        System.out.println("1. Escribir en .txt\n2. Para escribir en .bin");
        int optionPath = this.scanner.nextInt();
        String path = "";
        String text = read(NAME_FILE1);
        text += read(NAME_FILE2);
        switch (optionPath) {
            case 1 -> path = NAME_FILE_TXT;
            case 2 -> path = NAME_FILE_BIN;
            default -> System.out.println("Opcion no valida");
        }
        write(text, path);
    }
    
    public static void main(String[] args) {
        Persistence p = new Persistence();
        p.writeFile();
        p.readFile();
    }
}
