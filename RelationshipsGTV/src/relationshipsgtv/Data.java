/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author george.barrow
 */
public class Data 
{
    public HashMap people, relationshipTypes, relationships;
    private int peopleID, relationshipTypesID, relationshipsID;
    
    public Data()
    {
        people = new HashMap<Integer, Person>();
        relationshipTypes = new HashMap<Integer, RelationshipType>();
        relationships = new HashMap<Integer, ArrayList<Integer>>();
        peopleID = 1;
        relationshipTypesID = 1;
    }
    
    
    
    
    // --------
    // Adding things to the maps
    // --------
    
    /**
     * This adds a new Person to the People HashMap.
     * @param newPerson 
     */
    public void addToPeople(Person newPerson)
    {
        people.put(peopleID, newPerson);
        newPerson.setID(peopleID);
        peopleID ++;
    }
    
    /**
     * This adds a new RelationshipType to the RelationshipTypes HashMap.
     * @param newRelationshipType 
     */
    public void addToRelationshipTypes(RelationshipType newRelationshipType)
    {
        relationshipTypes.put(relationshipTypesID, newRelationshipType);
        newRelationshipType.setID(relationshipTypesID);
        relationshipTypesID ++;
    }
    
    /**
     * This adds a new relationship to the relationships HashMap.
     * @param firstPerson X has a brother Y, with this person being X. This will be the key in the relationships HashMap.
     * @param relationshipTypeToAdd This is the desired relationshipType.
     * @param secondPerson X has a brother Y, with this person being Y.
     */
    public void addRelationship(Person firstPerson, RelationshipType relationshipTypeToAdd, Person secondPerson)
    {
        int firstID = firstPerson.getID();
        int relTypeID = relationshipTypeToAdd.getID();
        int secondID = secondPerson.getID();
        
        ArrayList entry = new ArrayList<Integer>();
        entry.add(firstID);
        entry.add(relTypeID);
        entry.add(secondID);
        
        relationships.put(relationshipsID, entry);
        relationshipsID ++;
    }
    
    
    
    
    // ---------------
    // Returning data from maps
    // ---------------
    
    /**
     * Returns an ArrayList of the names of all of the people in the People HashMap, in the order of entry.
     * @return 
     */
    public ArrayList<String> getPeopleNames()
    {
        return null;
        
    }
    
    /**
     * Returns an ArrayList of the NeutralVersions of all of the RelationshipTypes in the RelationshipTypes HashMap, in the order of entry.
     * @return 
     */
    public ArrayList<String> getNeutralRelationshipTypes()
    {
        return null;
    }
    
    
    //--------------
    //Saving!
    //--------------
    public void savePeople()
    {
        
            try
            {
                PrintWriter output = new PrintWriter(new File ("Saves/PeopleSave.txt"));
                // you can now write to the file by saying
                // output.println("Here is example stuff to save....");
                // put your output code here!
                for (Object o: people.entrySet())
                {
                    Person p = (Person)o;
                    int id = p.getID();
                    String firstName = p.getFirstName();
                    String lastName = p.getLastName();
                    
                    output.println(id+"\t"+firstName+"\t"+lastName);
                }
                
                
                
                output.close();
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("Something went wrong.");
                throw new RuntimeException("People cannot be saved.");
            }
    }
}
