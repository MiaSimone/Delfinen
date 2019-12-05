
package svømmeklub.delfinen.DataMappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import svømmeklub.delfinen.Model.Resultater;
import svømmeklub.delfinen.Model.Stævne;
import svømmeklub.delfinen.Model.Træning;
import svømmeklub.delfinen.Util.DBConnector;

public class ResultatMapper {
    
    public List<Resultater> juniorResListe() throws SQLException, ClassNotFoundException{
        List<Resultater> returnList = new ArrayList<Resultater>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM junior";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            String disciplin = resultSet.getString("Disciplin");
            double sum  = resultSet.getDouble("sum");
            Resultater tmpRes = new Resultater(navn, disciplin, sum);
            returnList.add(tmpRes);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }    
    
    public List<Resultater> seniorResListe() throws SQLException, ClassNotFoundException{
        List<Resultater> returnList = new ArrayList<Resultater>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM senior";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            String disciplin = resultSet.getString("Disciplin");
            double sum  = resultSet.getDouble("sum");
            Resultater tmpRes = new Resultater(navn, disciplin, sum);
            returnList.add(tmpRes);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }   
    
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
    
    public ArrayList<Træning> træning() throws SQLException, ClassNotFoundException{
        ArrayList<Træning> returnList = new ArrayList<Træning>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM trænings_resultater";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            int træningsResultatID = resultSet.getInt("TræningsResultatID");
            String navn = resultSet.getString("Navn");
            String dato = resultSet.getString("Dato");
            String disciplin = resultSet.getString("Disciplin");
            double tid = resultSet.getDouble("Tid");
            Træning tmpTræning = new Træning(træningsResultatID, navn, dato, disciplin, tid);
            returnList.add(tmpTræning);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }
    
    
}
