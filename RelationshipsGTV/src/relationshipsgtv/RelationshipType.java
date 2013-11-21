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
    private String primaryVersion, inverseVersion;
    private int iD;
    
    public RelationshipType(String newPrimaryVersion, String newInverseVersion)
    {
        primaryVersion = newPrimaryVersion;
        inverseVersion = newInverseVersion;
    }
    
    public String getPrimaryVersion()
    {
        return primaryVersion;
    }
    public String getInverseVersion()
    {
        return inverseVersion;
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
