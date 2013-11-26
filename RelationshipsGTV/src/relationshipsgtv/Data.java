/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;

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
    
    public ArrayList<Person> getPeople(int givenPersonID)
    {
        return null;
        
    }
    
    public RelationshipType getRelationshipTypes(int givenRelationshipTypeID)
    {
        return null;
    }
}
