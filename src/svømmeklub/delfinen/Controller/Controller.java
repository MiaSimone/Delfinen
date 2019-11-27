
package svømmeklub.delfinen.Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import svømmeklub.delfinen.DataMappers.MedlemsMapper;
import svømmeklub.delfinen.Model.AlleMedlemmer;
import svømmeklub.delfinen.Util.DBConnector;
import svømmeklub.delfinen.View.DelfinUI;

public class Controller {
    
    // Laver scanner:
    Scanner input = new Scanner(System.in);  
    // Laver alle medlemmer objekt:
    public AlleMedlemmer medlemmer;

    public void runProgram() throws SQLException, ClassNotFoundException{
        int choice = 0;
        int exitValue = 9;
        
        while (choice != exitValue){
            switch(choice) {
                case 1:
                    int medlemChoice = 0;
                    int tilbage = 9;
                    
                    while (medlemChoice != tilbage){
                        switch(medlemChoice){
                            case 1:
                             // Oprette medlem:       
                                opretMedlem();
                                break;
                            case 2:
                             // Medlemsliste:
                                MedlemsMapper mm = new MedlemsMapper(); 
                                System.out.println(mm.medlemsListe());
                            default:
                                System.out.println("");
                                medlemChoice = 9;
                        }
                        DelfinUI medlemRunMenu = new DelfinUI();
                        medlemRunMenu.showMedlemmmerMenu();
                        System.out.println("Vælg en mulighed");
                        medlemChoice = input.nextInt();
                    }

                default:
                    System.out.println("");
                    choice = 9;
            }
        // Initialiser hovedmenu
           DelfinUI mainRunMenu = new DelfinUI();
           mainRunMenu.showMainMenu();
           System.out.println("Vælg en mulighed");
           choice = input.nextInt();
        }
        
        //Betaling b = new Betaling();
        //b.betaling();

    }
    
    public AlleMedlemmer opretMedlem() throws SQLException, ClassNotFoundException{
        medlemmer = new AlleMedlemmer();
        String lavMedlem;       
        
        DBConnector myConnector = new DBConnector();  
        PreparedStatement pstmt = null;
        
        String sql = "insert into medlemmer"
                + "(Navn, Alder, År, Adresse, postNr_By, MobilNr, Junior_eller_seniorsvømmer, Aktivt_eller_Passivt, Beskæftigelse) "
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pstmt = myConnector.getConnector().prepareStatement(sql);
        //input.nextLine();
     // Vi har et loop så vi kan lave flere medlemmer af gangen
        System.out.println("Vil du oprette medlem? (Y/N)");
        lavMedlem = input.next();
            while ("Y".equals(lavMedlem)){ 
                System.out.println("Navn: ");
                    input.nextLine();
                    String navn = input.nextLine();
                    pstmt.setString(1, navn);
                System.out.println("Alder: ");
                    int alder = input.nextInt();
                    pstmt.setInt(2, alder);
                System.out.println("År: ");
                    int år = input.nextInt();
                    pstmt.setInt(3, år);
                System.out.println("Adresse: ");
                    input.nextLine();
                    String adresse = input.nextLine();
                    pstmt.setString(4, adresse);
                System.out.println("Postnummer og By: ");
                    String postNr_By = input.nextLine();
                    pstmt.setString(5, postNr_By);
                System.out.println("Mobilnummer: ");
                    int mobilNr = input.nextInt();
                    pstmt.setInt(6, mobilNr);
                System.out.println("Junior- eller seniorsvømmer: ");
                    input.nextLine();
                    String J_eller_S = input.nextLine();
                    pstmt.setString(7, J_eller_S);
                System.out.println("Aktivt eller passivt medlemskab: ");
                    String A_eller_P = input.nextLine();
                    pstmt.setString(8, A_eller_P);
                System.out.println("Beskæftigelse: ");
                    String beskæftigelse = input.nextLine();
                    pstmt.setString(9, beskæftigelse);  

                    pstmt.executeUpdate();
                    pstmt.close();
                    break;
            }
        return medlemmer;
    } 
    
    public void seMedlemmer() throws SQLException, ClassNotFoundException{
        medlemmer = new AlleMedlemmer();
        medlemmer.getMedlemFromAlleMedlemmer();
    }
    
}
    
    
