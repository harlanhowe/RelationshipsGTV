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
    private int peopleID, relationshipTypesID;
    
    public Data()
    {
        people = new HashMap<Integer, Person>();
        relationshipTypes = new HashMap<Integer, RelationshipType>();
        relationships = new HashMap<Person, ArrayList<Integer>>();
        peopleID = 1;
        relationshipTypesID = 1;
    }
    
    
    
    
    // --------
    // Adding things to the maps
    // --------
    
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
        int relTypeID = relationshipTypeToAdd.getID();
        int secondID = secondPerson.getID();
        
        if (relationships.containsKey(firstPerson))
        {
            ArrayList existingList = (ArrayList)(relationships.get(firstPerson));
            existingList.add(relTypeID);
            existingList.add(secondPerson);
        }
        else
        {
            ArrayList relAndPerson2 = new ArrayList<Integer>();
            relAndPerson2.add(relTypeID);
            relAndPerson2.add(secondID);
            relationships.put(firstPerson, relAndPerson2);
        }
    }
    
    
    
    
    // ---------------
    // Returning data from maps
    // ---------------
    
//    public Person getPerson(int givenPersonID)
//    {
//        Person desiredPerson = (Person)(people.get(givenPersonID));
//        return desiredPerson;
//    }
//    
//    public RelationshipType getRelationshipType(int givenRelationshipTypeID)
//    {
//        RelationshipType desiredRelationshipType = (RelationshipType)(relationshipTypes.get(givenRelationshipTypeID));
//        return desiredRelationshipType;
//    }
}
