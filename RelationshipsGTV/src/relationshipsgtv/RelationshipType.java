/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationshipsgtv;

/**
 *
 * @author george.barrow
 */
public class RelationshipType 
{
    private String primaryMale, primaryFemale, neutral, inverseMale, inverseFemale;
    private int iD;
    
    public RelationshipType(String newPrimaryMale, String newPrimaryFemale, String newNeutral, String newInverseMale, String newInverseFemale)
    {
        primaryMale = newPrimaryMale;
        primaryFemale = newPrimaryFemale;
        neutral = newNeutral;
        inverseMale = newInverseMale;
        inverseFemale = newInverseFemale;
    }
    
    public String getPrimaryMale()
    {
        return primaryMale;
    }
    public String getPrimaryFemale()
    {
        return primaryFemale;
    }
    public String getNeutral()
    {
        return neutral;
    }
    public String getInverseMale()
    {
        return inverseMale;
    }
    public String getInverseFemale()
    {
        return inverseFemale;
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
