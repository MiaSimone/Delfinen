
package svømmeklub.delfinen.Util;

import java.sql.SQLException;
import java.util.ArrayList;
import svømmeklub.delfinen.DataMappers.StævneMapper;
import svømmeklub.delfinen.Model.Medlem;
import svømmeklub.delfinen.Model.Stævne;

public class StævnerFromDB {
        ArrayList<Stævne> stævne;
        ArrayList<Stævne> vinterstævne;
        StævneMapper sm = new StævneMapper();
    
    public StævnerFromDB() throws SQLException, ClassNotFoundException{
        stævne = new ArrayList<>();
        //fillListFromDB();
        vinterstævneList();
    }
    
    public ArrayList<Stævne> getStævne() throws SQLException, ClassNotFoundException{
        vinterstævneList();
        return stævne;
    }
    /*
    public void fillListFromDB() throws SQLException, ClassNotFoundException{
        stævne = sm.stævner();
    }
    */
    
    public void vinterstævneList() throws SQLException, ClassNotFoundException{
        vinterstævne = sm.vinterstævne();
    }
    
    public Stævne getStævneFromDBByName() throws ClassNotFoundException, SQLException{
        Stævne stævne = null;
        stævne = sm.getVinterstævneFromDB();
        return stævne;
    }
    
    public void fillListFromFile(){
        stævne = null;
    }    
    
    
}
