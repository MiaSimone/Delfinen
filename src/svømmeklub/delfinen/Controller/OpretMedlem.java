
package svømmeklub.delfinen.Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import svømmeklub.delfinen.Model.AlleMedlemmer;
import svømmeklub.delfinen.Model.Medlem;
import svømmeklub.delfinen.Model.Restance;
import svømmeklub.delfinen.Util.DBConnector;

public class OpretMedlem {

    // Laver scanner:
    Scanner input = new Scanner(System.in);  
    // Laver alle medlemmer objekt:
    public AlleMedlemmer medlemmer;
    
    public AlleMedlemmer opretMedlem() throws SQLException, ClassNotFoundException{
        medlemmer = new AlleMedlemmer();
        String lavMedlem;       
        
        DBConnector myConnector = new DBConnector();  
        PreparedStatement pstmt = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        
        String sql = "insert into medlemmer"
                + "(Navn, Alder, År, Adresse, postNr_By, MobilNr, Junior_eller_seniorsvømmer, Aktivt_eller_Passivt, Beskæftigelse) "
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pstmt = myConnector.getConnector().prepareStatement(sql);
        
        String sql1 = "insert into hold1"
                + "(Navn, Alder, Junior_eller_seniorsvømmer, Disciplin) "
                + "values(?, ?, ?, ?) ";
        pstmt1 = myConnector.getConnector().prepareStatement(sql1);
        
        String sql2 = "insert into hold2"
                + "(Navn, Alder, Junior_eller_seniorsvømmer, Disciplin) "
                + "values(?, ?, ?, ?)";
        
        pstmt2 = myConnector.getConnector().prepareStatement(sql2);
        
        //input.nextLine();
     // Vi har et loop så vi kan lave flere medlemmer af gangen
        System.out.println("Vil du oprette medlem? (Y/N)");
        lavMedlem = input.next();
            while ("Y".equals(lavMedlem)){ 
            try {       
                System.out.println("Navn: ");
                    input.nextLine();
                    String navn = input.nextLine();
                    pstmt.setString(1, navn);
                    
                System.out.println("Alder: ");
                    int alder = input.nextInt();
                    if (alder<0 && alder>100){
                        System.out.println("Indtast din rigtige alder eller ring til kundesupporten: 40431078");
                    } else{
                    pstmt.setInt(2, alder);
                    }
                    
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
                    
                System.out.println("Beskæftigelse: ");
                    String beskæftigelse = input.nextLine();
                        if ("Konkurrence".equals(beskæftigelse) && alder<=18){
                            System.out.println("Hvilken disciplin svømmer du: \n   (Crawl, Ryg, Butterfly eller Bryst)");
                            String disciplin = input.nextLine();
                            pstmt1.setString(1, navn);
                            pstmt1.setInt(2, alder);
                            pstmt1.setString(3, J_eller_S);
                            pstmt1.setString(4, disciplin);

                            pstmt1.executeUpdate();
                            pstmt1.close();
                            
                        } else if ("Konkurrence".equals(beskæftigelse) && alder>18){
                            System.out.println("Hvilken disciplin svømmer du: \n   (Crawl, Ryg, Butterfly eller Bryst)");
                            String disciplin = input.nextLine();
                            pstmt2.setString(1, navn);
                            pstmt2.setInt(2, alder);
                            pstmt2.setString(3, J_eller_S);
                            pstmt2.setString(4, disciplin);

                            pstmt2.executeUpdate();
                            pstmt2.close();
                        } 
                    pstmt.setString(9, beskæftigelse);
                    
                System.out.println("Aktivt eller passivt medlemskab: ");
                    String A_eller_P = input.nextLine();
                    int beløb;
                    if ("Aktivt".equals(A_eller_P)){
                        if (alder>=0 && alder<18){
                            System.out.println("Det koster 1000 kr.");
                            beløb = 1000;
                        } else if (alder>=18 && alder<60){
                            System.out.println("Det koster 1600 kr.");
                            beløb = 1600;
                        } else if (alder>=60 && alder<100){
                            System.out.println("Du får 25 % rabat, altså koster det 1200 kr");
                            beløb = 1200;
                        } else {
                            throw new IllegalArgumentException();  
                        }
                    } else if ("Passivt".equals(A_eller_P)) {
                        System.out.println("Medlemskabet er passivt, det koster 500 kr");
                        beløb = 500;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    pstmt.setString(8, A_eller_P);  
                    
                System.out.println("Vil du betale nu eller senere? (N/S)");
                    String betal = input.nextLine();
                    if ("N".equals(betal)){
                        if (alder>=0 && alder<18){
                           System.out.println("Du har nu betalt 1000 kr."); 
                        } else if (alder>=18 && alder<60){
                           System.out.println("Du har nu betalt 1600 kr.");  
                        } else if (alder>=60 && alder<100){
                           System.out.println("Du har nu betalt 1200 kr.");  
                        } else {
                            throw new IllegalArgumentException();  
                        }
                    } else {
                        Medlem medlem = new Medlem(navn, alder, år, adresse, postNr_By, mobilNr, J_eller_S, A_eller_P, beskæftigelse);
                        Restance res = new Restance(navn, mobilNr,beløb);
                        res.addMedlemTilRestance(medlem);
                    }   
                    
                    pstmt.executeUpdate();
                    pstmt.close();
                    break;
            } catch (Exception e) {
                    System.out.println("Noget gik galt.");
            }
            } 
        return medlemmer;
    }
}
