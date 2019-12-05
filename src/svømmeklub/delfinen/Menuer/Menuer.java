
package svømmeklub.delfinen.Menuer;

import java.sql.SQLException;
import java.util.Scanner;
import svømmeklub.delfinen.Controller.OpretMedlem;
import svømmeklub.delfinen.Controller.Rediger_træningsresultater;
import svømmeklub.delfinen.DataMappers.HoldMapper;
import svømmeklub.delfinen.DataMappers.MedlemsMapper;
import svømmeklub.delfinen.DataMappers.RestanceMapper;
import svømmeklub.delfinen.DataMappers.ResultatMapper;
import svømmeklub.delfinen.View.DelfinUI;

public class Menuer {
    DelfinUI menuer = new DelfinUI() {};
    Scanner input = new Scanner(System.in);  
    public int exitValue = 9;
    public int choice = 0;
    
    String navn = "Navn:";
    String alder = "Alder:";
    String medlem = "Medlemskabsstatus:";
    String beskæftigelse = "Beskæftigelse:";
    String disciplin = "Disciplin:";
    String JellerS = "Junior/Senior:";
    String tid = "Tid:";
    String stævne = "Stævne:";
    String placering = "Placering";
    String tResID = "ID:";
    String dato = "Dato:";
    String mobilNr = "Mobil nummer:";
    String beløb = "Beløb";
    
// Valg 1 i hovedmenu:
    public void valg1() throws SQLException, ClassNotFoundException{
        while (choice != exitValue){
        // Søg efter medlemmer?
            switch(choice){
                case 1:
                    OpretMedlem oM = new OpretMedlem();
                    oM.opretMedlem();
                    break;
                case 2:
                    System.out.printf("%-25s%-10s%-23s%-20s\n", navn, alder, medlem, beskæftigelse);
                    seMedlemmer();
                    break;
                default:
                    System.out.println("");
                    choice = 9;
            }
            menuer.showMedlemmmerMenu();
            System.out.println("Vælg en mulighed");
            choice = input.nextInt();
        }
    }
    
// Valg 2 i hovedmenu:
    public void valg2() throws SQLException, ClassNotFoundException{ 
            
        while (choice != exitValue){

            switch(choice){
                case 1:
                    System.out.printf("%-25s%-10s%-20s%-20s\n", navn, alder, JellerS, disciplin);
                    seHold1();
                    break;
                case 2:
                    System.out.printf("%-25s%-10s%-20s%-20s\n", navn, alder, JellerS, disciplin);
                    seHold2();
                    break;
                default:
                    System.out.println("");
                    choice = 9;    
            }
            menuer.showHold();
            System.out.println("Vælg en mulighed");
            choice = input.nextInt();
        }
    }
    
// Valg 3 i hovedmenu:
    public void valg3() throws SQLException, ClassNotFoundException{
        System.out.printf("%-25s%-20s%-10s\n", navn, mobilNr, beløb);
        seRestance();
    }
   
// Valg 4 i hovedmenu:    
    public void valg4() throws ClassNotFoundException, SQLException{
        while (choice != exitValue){

            switch(choice){
             // Hvis man vælger Top 5
                case 1:
                    int J_eller_S = 0;
                    while (J_eller_S != exitValue){
                        switch (J_eller_S){
                            case 1:
                                System.out.printf("%-20s%-10s%15s\n", navn, disciplin, tid);
                                
                                seJuniorResultater();
                                break;
                            case 2:
                                seSeniorResultater();
                                break;
                            default:
                                System.out.println("");
                                choice = 9; 
                        }
                        menuer.showTop5();
                        System.out.println("Vælg en mulighed");
                        J_eller_S = input.nextInt();
                    }
                    
                    
             // Hvis man vælger stævnerresultater     
                case 2:
                    System.out.printf("%-25s%-25s%-20s%-20s%-15s\n", navn, stævne, placering, disciplin, tid);        
                    seStævner();
                    break;
             // Hvis man vælger træningsresultater        
                case 3:
                    int valg = 0;
                    while (valg != exitValue){
                        switch (valg){
                            case 1:
                                System.out.printf("%-7s%-25s%-20s%-20s%-15s\n", tResID, navn, dato, disciplin, tid);
                                seTræning();
                                break;
                            case 2:
                                System.out.printf("%-7s%-25s%-20s%-20s%-15s\n", tResID, navn, dato, disciplin, tid);
                                Rediger_træningsresultater rt = new Rediger_træningsresultater();
                                rt.rediger();
                                break;
                        }
                        menuer.showTræningsResultater();
                        System.out.println("Vælg en mulighed");
                        valg = input.nextInt();
                    }
                    
                default:
                    System.out.println("");
                    choice = 9;    
            }
            menuer.showResultatMenu();
            System.out.println("Vælg en mulighed");
            choice = input.nextInt();
        }
    }

// Andre metoder:
        public void seMedlemmer() throws SQLException, ClassNotFoundException{
     // Medlemsliste:
        MedlemsMapper mm = new MedlemsMapper(); 
        System.out.println(mm.medlemsListe());
    }
    
    public void seHold1() throws SQLException, ClassNotFoundException{
     // Hold1:
        HoldMapper h1m = new HoldMapper();
        System.out.println(h1m.hold1Liste());
    }   
    
    public void seHold2() throws SQLException, ClassNotFoundException{
     // Hold1:
        HoldMapper h2m = new HoldMapper();
        System.out.println(h2m.hold2Liste());
    }     
        
    public void seRestance() throws SQLException, ClassNotFoundException{
        RestanceMapper res = new RestanceMapper();
        System.out.println(res.resListe());
        //Restance res = new Restance();
        //res.seRestance();
    }
    
    public void seJuniorResultater() throws SQLException, ClassNotFoundException{
        ResultatMapper r = new ResultatMapper();
        System.out.println(r.juniorResListe());
    }
    
    public void seSeniorResultater() throws SQLException, ClassNotFoundException{
        ResultatMapper r = new ResultatMapper();
        System.out.println(r.seniorResListe());
    }
    
    public void seStævner() throws SQLException, ClassNotFoundException{
        ResultatMapper s = new ResultatMapper();
        System.out.println(s.stævner());
    }
    
    public void seTræning() throws SQLException, ClassNotFoundException{
        ResultatMapper s = new ResultatMapper();
        System.out.println(s.træning());
    }
    
}
