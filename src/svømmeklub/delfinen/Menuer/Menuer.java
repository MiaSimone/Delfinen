
package svømmeklub.delfinen.Menuer;

import java.sql.SQLException;
import java.util.Scanner;
import svømmeklub.delfinen.Controller.OpretMedlem;
import svømmeklub.delfinen.DataMappers.HoldMapper;
import svømmeklub.delfinen.DataMappers.MedlemsMapper;
import svømmeklub.delfinen.DataMappers.RestanceMapper;
import svømmeklub.delfinen.DataMappers.StævneMapper;
import svømmeklub.delfinen.Util.StævnerFromDB;
import svømmeklub.delfinen.View.DelfinUI;

public class Menuer {
    DelfinUI menuer = new DelfinUI() {};
    Scanner input = new Scanner(System.in);  
    public int exitValue = 9;
    public int choice = 0;
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
                    seHold1();
                    break;
                case 2:
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
                                
                            default:
                                System.out.println("");
                                choice = 9; 
                        }
                        menuer.showTop5();
                        System.out.println("Vælg en mulighed");
                        J_eller_S = input.nextInt();
                    }
                    
                    
             // Hvis man vælger træningsresultater     
                case 2:
                    
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
    
}
