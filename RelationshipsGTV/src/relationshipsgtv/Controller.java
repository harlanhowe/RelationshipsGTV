/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vincent.liu
 */
public class Controller {
    private Data theData;
    private UserInterface theUserInterface;
    
    public Controller(Data theData,UserInterface theUserInterface)
    {
        this.theData = theData;
        this.theUserInterface = theUserInterface;
    }
    
    class Action {
        
        Person person = new Person(null,null,true);
        RelationshipType relType = new RelationshipType(null,null,null,null,null);
        
        public void newPerson()
        {
            String inputName = theUserInterface.addPerson();
            boolean sex = theUserInterface.male();
//            inputName = person.getName();
            sex = person.getMale();
            theData.addToPeople(person);
            
        }
        
        public void newRelType(Object primaryMale, Object primaryFemale, Object neutral, Object inverseMale, Object inverseFemale)
        {
            
            ArrayList relationshipType = new ArrayList<String>();
            relationshipType = theUserInterface.addRelationshipType();
            primaryMale = relationshipType.get(0);
            primaryFemale = relationshipType.get(1);
            neutral = relationshipType.get(2);
            inverseMale = relationshipType.get(3);
            inverseFemale = relationshipType.get(4);
            
            primaryMale = relType.getPrimaryMale();
            primaryFemale = relType.getPrimaryFemale();
            neutral = relType.getNeutral();
            inverseMale = relType.getInverseMale();
            inverseFemale = relType.getInverseFemale();
    
            theData.addToRelationshipTypes(relType);
        }
        
        public void newRel()
        {
            ArrayList relationship = new ArrayList<Integer>();
            relationship = theUserInterface.addRelationship(relationship, relationship);
            
        }
            
            
        
    }
    
}
