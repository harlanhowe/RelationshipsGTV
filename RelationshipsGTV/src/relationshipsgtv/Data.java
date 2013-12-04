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
    public HashMap<Integer, Person> people;
    public HashMap<Integer, RelationshipType> relationshipTypes;
    public HashMap<Integer, ArrayList<Integer>> relationships;
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
     * Returns an ArrayList of the names (from toString()) of all of the people in the People HashMap, in the order of entry.
     * @return 
     */
    public ArrayList<String> getPeopleNames()
    {
        ArrayList<String> peopleNames = new ArrayList<String>();
        for (Integer id: people.keySet())
        {
            peopleNames.add(people.get(id).toString());
        }
        return peopleNames;
    }
    
    /**
     * Returns an ArrayList of the NeutralVersions of all of the RelationshipTypes in the RelationshipTypes HashMap, in the order of entry.
     * @return 
     */
    public ArrayList<String> getNeutralRelationshipTypes()
    {
        ArrayList<String> neutrals = new ArrayList<String>();
        for (Integer id: relationshipTypes.keySet())
        {
            neutrals.add(relationshipTypes.get(id).getNeutral());
        }
        return neutrals;
    }
    
    
    //--------------
    //Saving!
    //--------------
    /**
     * Saves the data in the "people" HashMap to project/saves/peopleSave.txt.
     * @return 
     */
    public void savePeople()
    {
        try
        {
            PrintWriter output = new PrintWriter(new File ("saves/peopleSave.txt"));
            
            for (Integer id: people.keySet())
            {
                String firstName = people.get(id).getFirstName();
                String lastName = people.get(id).getLastName();
                Boolean male = people.get(id).getMale();

                output.println(id+"\t"+firstName+"\t"+lastName+"\t"+male);
            }



            output.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Something went wrong.");
            throw new RuntimeException("people cannot be saved.");
        }
    }
    /**
     * Saves the data in the "relationshipTypes" HashMap to project/saves/relTypesSave.txt.
     * @return 
     */
    public void saveRelationshipTypes()
    {
        try
        {
            PrintWriter output = new PrintWriter(new File ("saves/relTypesSave.txt"));
            
            for (Integer id: relationshipTypes.keySet())
            {
                String primaryMale = relationshipTypes.get(id).getPrimaryMale();
                String primaryFemale = relationshipTypes.get(id).getPrimaryFemale();
                String neutral = relationshipTypes.get(id).getNeutral();
                String inverseMale = relationshipTypes.get(id).getInverseMale();
                String inverseFemale = relationshipTypes.get(id).getInverseFemale();

                output.println(id+"\t"+primaryMale+"\t"+primaryFemale+"\t"+neutral+"\t"+inverseMale+"\t"+inverseFemale);
            }



            output.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Something went wrong.");
            throw new RuntimeException("relationshipTypes cannot be saved.");
        }
    }
    /**
     * Saves the data in the "relationships" HashMap to project/saves/relationshipsSave.txt.
     * @return
     */
    public void saveRelationships()
    {
        try
        {
            PrintWriter output = new PrintWriter(new File ("saves/relationshipsSave.txt"));
            
            for (Integer id: relationships.keySet())
            {
                int person1ID = relationships.get(id).get(0);
                int relationshipTypeID = relationships.get(id).get(1);
                int person2ID = relationships.get(id).get(2);

                output.println(id+"\t"+person1ID+"\t"+relationshipTypeID+"\t"+person2ID);
            }



            output.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Something went wrong.");
            throw new RuntimeException("relationships cannot be saved.");
        }
    }
    
    
    //--------------
    //Loading!
    //--------------
    public void loadPeople()
    {}
    public void loadRelationshipTypes()
    {}
    public void loadRelationships()
    {}
}
