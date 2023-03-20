package tools;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReader {
	File file;
	FileInputStream read;
	DataInputStream input;
	public FileReader(String path) throws IOException {
		file = new File(path);
		read = new FileInputStream(file);
		input = new DataInputStream (read);
	}
	public int readInt() throws ClassNotFoundException, IOException {
		return input.read();
		
	}
	public String readString() throws IOException {
		return input.readUTF();
	}
	public void close() throws IOException {
		input.close();
	}
	public boolean exist(String path) {
		return file.exists();
	}
}
