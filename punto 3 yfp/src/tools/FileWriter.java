package tools;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileWriter {
	File file;
	FileOutputStream write;
	DataOutputStream outPut;
	public FileWriter(String path) throws IOException {
		file = new File(path);
		write = new FileOutputStream(path);
		outPut = new DataOutputStream (write);
	}
	public void writeInt(int i) throws IOException {
		outPut.write(i);
		outPut.close();
	}
	public void writeString(String value) throws IOException {
		outPut.writeUTF(value);
	}
	public void closeAll() throws IOException {
		outPut.close();
	}
	public boolean exist() {
		return file.exists();
	}
}
