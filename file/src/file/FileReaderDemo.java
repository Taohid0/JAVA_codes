package file;

import java.io.*;
class FileReaderDemo {
public static void main(String args[]) {
FileReader fr = null;
try {
	fr = new FileReader("FileReaderDemo.java");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
BufferedReader br = new BufferedReader(fr);
String s;
try {
	while((s = br.readLine()) != null) {
	System.out.println(s);
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	fr.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

