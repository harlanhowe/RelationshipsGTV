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
    private String name;
    private boolean male;
    private int iD;
    
    public Person(String firstName,String lastName, boolean isMale)
    {
        name = firstName+lastName;
        male = isMale;
    }
    
    public String getName()
    {
        return name;
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
