/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;
 import java.util.ArrayList;
import relationshipsgtv.UserInterface;
import relationshipsgtv.Data;
import relationshipsgtv.RelationshipType;

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
        UserInterface UI=new UserInterface();
        Data myData=new Data();
        
        ArrayList<String>options=new ArrayList<String>();
        options.add("Add Person"+"Remove Person"+"Add Relationship Type"+"Remove Relationship Type"+"Create Relationship"+"Remove Relationship");
        // TODO code application logic here
        //thing    
        int a=UI.displayMenuAndGetResponse("Menu", options, "Pick an action", true);
        String prompt=UI.choosePrompt(a);
        String[]option;
        for(int i=0;i<myData.people.size();i++)
                {
                    
                    
                }
        UI.displayStringChoiceAndGetResponse(prompt, args)
    }
}
