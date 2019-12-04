
package svømmeklub.delfinen.DataMappers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import svømmeklub.delfinen.Model.Restance;
import svømmeklub.delfinen.Util.DBConnector;

public class RestanceMapper {
    
        
    public List<Restance> resListe() throws SQLException, ClassNotFoundException{
        List<Restance> returnList = new ArrayList<Restance>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM restance";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            int mobilNr = resultSet.getInt("MobilNr");
            int beløb = resultSet.getInt("Beløb");
            Restance tmpRes = new Restance(navn, mobilNr, beløb);
            returnList.add(tmpRes);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }
    
    
}
