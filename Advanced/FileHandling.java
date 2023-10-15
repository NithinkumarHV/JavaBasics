/*
    In Java input and output takes place in terms of streams

    Byte stream
        Data is read or written byte by byte - 1 byte
        FileInputStream
        FileOutputStream
    
    Character stream
        Character by character - 2 bytes at a time
        FileReader
        FileWriter
    
    METHODS: in File class

    canRead()
    canWrite()
    createNewFile()
    delete()
    Exists()
    getName()
    getAbsolutePath()
    Length() - in bytes

*/

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
 
public class FileHandling {
 
    public static void main(String[] args) {        
         
            // Creating file object and specifying path
            // File file = new File("input.txt");
 
            try {
                FileInputStream input= new FileInputStream("input.txt");
                FileOutputStream output = new FileOutputStream("output.txt");
                int character;
                // read character by character by default
                // read() function return int between 0 and 255.
 
                while ((character = input.read()) != -1) {
                    System.out.print((char)character);
                    output.write(character);
                }

                if(input != null) { 
                    input.close();
                }
                if(output != null) {
                    output.close();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
    }
}

