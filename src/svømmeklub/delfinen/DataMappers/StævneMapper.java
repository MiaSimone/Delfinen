
package svømmeklub.delfinen.DataMappers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import svømmeklub.delfinen.Model.Restance;
import svømmeklub.delfinen.Model.Stævne;
import svømmeklub.delfinen.Util.DBConnector;

public class StævneMapper {
    
    public ArrayList<Stævne> stævner() throws SQLException, ClassNotFoundException{
        ArrayList<Stævne> returnList = new ArrayList<Stævne>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM stævne_resultater";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            String stævne = resultSet.getString("Stævne");
            int placering = resultSet.getInt("Placering");
            String disciplin = resultSet.getString("Disciplin");
            double tid = resultSet.getDouble("Tid");
            Stævne tmpStævne = new Stævne(navn, stævne, placering, disciplin, tid);
            returnList.add(tmpStævne);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }
    
    
    public Stævne getVinterstævneFromDB() throws ClassNotFoundException, SQLException {
        Stævne retValStævne = null;
     // TODO: Get stævne from DB
        String query = "Select * from stævne_resultater where Stævne = 'Vinterstævne 2019'";
        DBConnector myConnector = new DBConnector();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        
        connection = myConnector.getConnector();
        pstmt = connection.prepareStatement(query);
        //pstmt.setString(1, vinter);
     // Så burde der være kommet et resultSet tilbage:
        resultSet = pstmt.executeQuery();
        while(resultSet.next()){
            String navn = resultSet.getString("Navn");
            String stævne = resultSet.getString("Stævne");
            int placering = resultSet.getInt("Placering");
            String disciplin = resultSet.getString("Disciplin");
            double tid = resultSet.getDouble("Tid");
            retValStævne = new Stævne(navn, stævne, placering, disciplin, tid);
        }
     // Google: jdbc mysql update
     
     // Lukker efter mig:
        resultSet.close();
        pstmt.close();
        connection.close();
        
        return retValStævne;
    }    
 
    public ArrayList<Stævne> vinterstævne() throws SQLException, ClassNotFoundException{
        ArrayList<Stævne> returnList = new ArrayList<Stævne>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM stævne_resultater where Stævne = 'Vinterstævne 2019'";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            String stævne = resultSet.getString("Stævne");
            int placering = resultSet.getInt("Placering");
            String disciplin = resultSet.getString("Disciplin");
            double tid = resultSet.getDouble("Tid");
            Stævne tmpStævne = new Stævne(navn, stævne, placering, disciplin, tid);
            returnList.add(tmpStævne);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }
    
    
}
