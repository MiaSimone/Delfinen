
package svømmeklub.delfinen.Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import svømmeklub.delfinen.Menuer.Menuer;
import svømmeklub.delfinen.Util.DBConnector;

public class Rediger_træningsresultater {
    // Skal have lavet noget således at man kan opdaterer dato og tid
    // Skal kunne ændre efter Træningsresultat id
    
    Scanner input = new Scanner(System.in);
    
    public void rediger() throws ClassNotFoundException, SQLException{
        DBConnector myConnector = new DBConnector(); 
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        
        Menuer m = new Menuer();
        m.seTræning();
      
        System.out.println("Redigerer...");
        System.out.println("Skriv ID: ");
        int TræningsResultatID = input.nextInt();
        System.out.println("Dato (Format: dd/mm yyyy): ");
        input.nextLine();
        String dato = input.nextLine();
        System.out.println("Tid (Format 00,00): ");
        double tid = input.nextDouble();
    
        String sql = "update trænings_resultater set dato = ?, tid = ? where TræningsResultatID = ?";
        pstmt = myConnector.getConnector().prepareStatement(sql);
        
        pstmt.setString(1, dato);
        pstmt.setDouble(2, tid);
        pstmt.setInt(3, TræningsResultatID);
        pstmt.executeUpdate();
      
        pstmt.executeUpdate();
        pstmt.close();
// Skal have sat ID på her:        
        String sql2 = "update samlede_tider set Trænings_Tid = ? where TræningsResultatID = ?";
        pstmt2 = myConnector.getConnector().prepareStatement(sql2);
        pstmt2.setDouble(1, tid);
        pstmt2.setInt(2, TræningsResultatID);
        
        pstmt2.executeUpdate();
        pstmt2.close();
    }
    
}
