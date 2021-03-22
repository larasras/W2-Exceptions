// ****************************************************************
// CopyingAFile.java
//
// A program that prompts the user for a filename, 
// opens a Scanner to the file and copies it, to standard output.
// ****************************************************************
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CopyingAFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exist = false;
        String fileName;
        File file;

        //if the file does not exist, ask for another file name
        while (!exist){
            System.out.println("Input the file name with directory: ");
            fileName = scan.nextLine();
            file = new File(fileName);
            try {
                scan = new Scanner(file);
                while (scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }
                break;
            } catch (FileNotFoundException ex) {
                System.out.println("File not found :(");
                continue;
            }
        }
    }
}