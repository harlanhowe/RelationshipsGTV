/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;
 import java.util.ArrayList;
import relationshipsgtv.UserInterface;
import relationshipsgtv.Data;
import relationshipsgtv.RelationshipType;
import relationshipsgtv.Person;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

/**
 *
 * @author kadmin
 */
public class RelationshipsGTV {
    
    /**
     
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //thing    
        
    }
    
    
    public void savePeople()
    {
        
            try
            {
                PrintWriter output = new PrintWriter(new File ("Saves/PeopleSave.txt"));
                // you can now write to the file by saying
                // output.println("Here is example stuff to save....");
                // put your output code here!
                
                
                
                
                output.close();
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("Something went wrong.");
                throw new RuntimeException("People cannot be saved.");
            }
        
    }
}
