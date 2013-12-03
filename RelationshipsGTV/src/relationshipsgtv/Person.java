/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;

/**
 *
 * @author george.barrow
 */
public class Person 
{
    private String firstName,lastName;
    private boolean male;
    private int iD;
    
    public Person(String newFirstName,String newLastName, boolean isMale)
    {
        firstName=newFirstName;
        lastName=newLastName;
        male = isMale;
    }
    public String toString()
    {   
    return firstName+" "+lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public boolean getMale()
    {
        return male;
    }
    
    public void setID(int newID)
    {
        iD = newID;
    }
    
    public int getID()
    {
        return iD;
    }
}
