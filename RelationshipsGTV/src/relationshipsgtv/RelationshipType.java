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
    private String primaryVersion, inverseVersion, neutralVersion;
    private int iD;
    
    public RelationshipType(String newPrimaryVersion, String newNeutralVersion, String newInverseVersion)
    {
        primaryVersion = newPrimaryVersion;
        inverseVersion = newInverseVersion;
        neutralVersion = newNeutralVersion;
    }
    
    public String getPrimaryVersion()
    {
        return primaryVersion;
    }
    public String getInverseVersion()
    {
        return inverseVersion;
    }
    public String getNeutralVersion()
    {
        return neutralVersion;
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
