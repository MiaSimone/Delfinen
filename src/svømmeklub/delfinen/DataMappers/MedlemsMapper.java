
package svømmeklub.delfinen.DataMappers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import svømmeklub.delfinen.Model.Hold;
import svømmeklub.delfinen.Model.Medlem;
import svømmeklub.delfinen.Util.DBConnector;

public class MedlemsMapper {
    public ArrayList<Medlem> medlemsListe() throws SQLException, ClassNotFoundException{
        ArrayList<Medlem> returnList = new ArrayList<Medlem>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM medlemmer";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            int alder = resultSet.getInt("Alder");
            int år = resultSet.getInt("År");
            String adresse = resultSet.getString("Adresse");
            String postNr_By = resultSet.getString("postNr_By");
            int mobilNr = resultSet.getInt("MobilNr");
            String j_eller_s = resultSet.getString("Junior_eller_seniorsvømmer");
            String a_eller_p = resultSet.getString("Aktivt_eller_Passivt");
            String beskæftigelse = resultSet.getString("Beskæftigelse");
            Medlem tmpMedlem = new Medlem(navn, alder, år, adresse, postNr_By, mobilNr, j_eller_s, a_eller_p, beskæftigelse);
            returnList.add(tmpMedlem);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }
    
    public Medlem getMedlemFromDBById(int id) throws ClassNotFoundException, SQLException {
        Medlem retValMedlem = null;
     // TODO: Get movie from DB
        String query = "Select * from medlemmer where Id = ?";
        DBConnector myConnector = new DBConnector();  
        myConnector = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        pstmt = myConnector.getConnector().prepareStatement(query);
        pstmt.setInt(1, id);
     // Så burde der være kommet et resultSet tilbage:
        resultSet = pstmt.executeQuery();
        while(resultSet.next()){
            String navn = resultSet.getString("Navn");
            int alder = resultSet.getInt("Alder");
            int år = resultSet.getInt("År");
            String adresse = resultSet.getString("Adresse");
            String postNr_By = resultSet.getString("postNr_By");
            int mobilNr = resultSet.getInt("MobilNr");
            String j_eller_s = resultSet.getString("Junior_eller_seniorsvømmer");
            String a_eller_p = resultSet.getString("Aktivt_eller_Passivt");
            String beskæftigelse = resultSet.getString("Beskræftigelse");
            retValMedlem = new Medlem(navn, alder, år, adresse, postNr_By, mobilNr, j_eller_s, a_eller_p, beskæftigelse);
        }
     
     // Lukker efter mig:
        resultSet.close();
        pstmt.close();
        myConnector.getConnector().close();
        
        return retValMedlem;
    }    
}
