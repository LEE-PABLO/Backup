package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
	public void filewriter() {
		try (FileWriter fw= new FileWriter("output.txt")){
			fw.write("Hello World!\n Hi Java");}
		catch(IOException e) {e.printStackTrace();}
	}
	public void filereader() {
		try (FileReader fr= new FileReader("output.txt")){
			int ch;
			while((ch=fr.read())!=-1){System.out.print((char)ch);};}
		catch(IOException e) {e.printStackTrace();}
	}
	public void bufferedreader() {
		try (FileReader fr= new FileReader("output.txt");
			 BufferedReader br = new BufferedReader(fr))
		{String line; int linenumber=1;
		while((line=br.readLine()) !=null)
				{System.out.printf("$3d: %s%n", linenumber++,line);}}
		catch(IOException e) {e.printStackTrace();}
	}
	public void copyBinaryFile(String sourceFile, String destFile) {
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(sourceFile),8192);
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile),8192))
		{byte[] buffer =new byte[8192];
		 int bytesread;
		 while((bytesread=bis.read(buffer))!=-1){
			 bos.write(buffer, 0, bytesread);}}
		catch(IOException e) {e.printStackTrace();}
	}
	public void path() {
		Path p=Paths.get("C:/git/Backup/260114/output.txt");
		System.out.println(p.getFileName().toString());
		System.out.println(p.getRoot().toString());
	}
	public void files() {
		try{Path file=Paths.get("C:/git/Backup/a");
		Files.createDirectories(file);}
		catch(IOException e) {e.printStackTrace();}
	}
}