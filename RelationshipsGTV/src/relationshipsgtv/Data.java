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
    private HashMap people, relationshipTypes, relationships;
    private int peopleID, relationshipTypesID;
    
    public Data()
    {
        people = new HashMap<Integer, Person>();
        relationshipTypes = new HashMap<Integer, RelationshipType>();
        relationships = new HashMap<Person, ArrayList<Integer>>();
        peopleID = 1;
        relationshipTypesID = 1;
    }
    
    
    // Adding things to the maps
    public void addToPeople(Person newPerson)
    {
        people.put(peopleID, newPerson);
        newPerson.setID(peopleID);
        peopleID ++;
    }
    
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
        
    }
}
