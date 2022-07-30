import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileproject {

	public static void main(String[] args) throws IOException {
		
		String path="F:\\Training\\";
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String filename = sc.next();
        String finalpath = path + filename;
        File f = new File(finalpath);
        
        boolean b= f.createNewFile();
        if(b!=true) {
        	System.out.println("File not created");
        }
        else {
        	System.out.println("File created");
        }
        

        System.out.println("\nOpened in write mode");
        FileOutputStream fo = new FileOutputStream(finalpath);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\nEnter input to the file:");
		String fileinput = sc1.nextLine();
		
		byte by[] = fileinput.getBytes();
		fo.write(by);
		System.out.println("Write operation completed into the file");
		fo.close();		
		
		
		FileInputStream fi = new FileInputStream(finalpath);
		System.out.println("\nRead operation for the file");
		int i=0;
		while((i=fi.read())!=-1) {
			System.out.print((char)i);
		}
		fi.close();
		
		System.out.println("\n");
		String appendtext;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("\nEnter text to append to a file:");
		appendtext = sc3.nextLine();
		
		FileWriter fw = new FileWriter(finalpath,true);
		fw.write(appendtext);
		
		System.out.println("Text appended to file");
		fw.close();
	}

}
