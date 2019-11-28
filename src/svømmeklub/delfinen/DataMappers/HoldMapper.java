
package svømmeklub.delfinen.DataMappers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import svømmeklub.delfinen.Model.Hold;
import svømmeklub.delfinen.Model.Medlem;
import svømmeklub.delfinen.Util.DBConnector;

public class HoldMapper {
    
    public ArrayList<Hold> hold1Liste() throws SQLException, ClassNotFoundException{
        ArrayList<Hold> returnList = new ArrayList<Hold>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM hold1";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            int alder = resultSet.getInt("Alder");
            String j_eller_s = resultSet.getString("Junior_eller_seniorsvømmer");
            String disciplin = resultSet.getString("Disciplin");
            Hold tmpHold = new Hold(navn, alder, j_eller_s, disciplin);
            returnList.add(tmpHold);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }
    
        public ArrayList<Hold> hold2Liste() throws SQLException, ClassNotFoundException{
        ArrayList<Hold> returnList = new ArrayList<Hold>();
        DBConnector myConnector = new DBConnector();

     // TODO: hent fra databasen
        Statement statement = null;
        ResultSet resultSet = null;
        
        myConnector.getConnector();
        String query = "SELECT * FROM hold2";
            statement = myConnector.getConnector().createStatement();
         // ResultSet sender dataen over i programmet
            resultSet = statement.executeQuery(query);
            
            //executeUpdate
        while (resultSet.next()){
            String navn = resultSet.getString("Navn");
            int alder = resultSet.getInt("Alder");
            String j_eller_s = resultSet.getString("Junior_eller_seniorsvømmer");
            String disciplin = resultSet.getString("Disciplin");
            Hold tmpHold = new Hold(navn, alder, j_eller_s, disciplin);
            returnList.add(tmpHold);
        }
            
     // Lukker efter mig:
        resultSet.close();
        statement.close();
        myConnector.getConnector().close();
        
        return returnList; 
    }
    
        
        
    // Behøves de?:
            public Hold getHold1FromDBById(int id) throws ClassNotFoundException, SQLException {
                Hold retValHold = null;
             // TODO: Get movie from DB
                String query = "Select * from hold1 where Id = ?";
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
                    String j_eller_s = resultSet.getString("Junior_eller_seniorsvømmer");
                    String disciplin = resultSet.getString("Disciplin");
                    retValHold = new Hold(navn, alder, j_eller_s, disciplin);
                }

             // Lukker efter mig:
                resultSet.close();
                pstmt.close();
                myConnector.getConnector().close();

                return retValHold;
            }    
            public Hold getHold2FromDBById(int id) throws ClassNotFoundException, SQLException {
                Hold retValHold = null;
             // TODO: Get movie from DB
                String query = "Select * from hold2 where Id = ?";
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
                    String j_eller_s = resultSet.getString("Junior_eller_seniorsvømmer");
                    String disciplin = resultSet.getString("Disciplin");
                    retValHold = new Hold(navn, alder, j_eller_s, disciplin);
                }

             // Lukker efter mig:
                resultSet.close();
                pstmt.close();
                myConnector.getConnector().close();

                return retValHold;
            }    
}
