// ****************************************************************
// CopyingAFile.java
//
// A program that prompts the user for a filename, 
// opens a Scanner to the file and copies it, to standard output.
// If the user enters the name of a file that does not exist,
// ask for another name until get one that refers to a valid file.
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