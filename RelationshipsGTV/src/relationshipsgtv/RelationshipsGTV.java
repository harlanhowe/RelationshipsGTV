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
    private File preferredFile;
    
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //thing    
        
    }
    
    
    public void save()
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setSelectedFile(preferredFile);
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) // if the user clicked "save"
        {
            preferredFile = chooser.getSelectedFile();
            try
            {
                PrintWriter output = new PrintWriter(preferredFile);
                // you can now write to the file by saying
                // output.println("Here is example stuff to save....");
                // put your output code here!
                
                
                
                
                output.close();
            }
            catch (FileNotFoundException fnfe)
            {
                throw new RuntimeException("File "+preferredFile+" cannot be saved.");
            }
        }
    }
}
