
package svømmeklub.delfinen.Menuer;

import java.sql.SQLException;
import java.util.Scanner;
import svømmeklub.delfinen.Controller.OpretMedlem;
import svømmeklub.delfinen.DataMappers.HoldMapper;
import svømmeklub.delfinen.DataMappers.MedlemsMapper;
import svømmeklub.delfinen.DataMappers.RestanceMapper;
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
                case 2:
                    seHold2();
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
    public void valg4(){
        while (choice != exitValue){

            switch(choice){
             // Hvis man vælger stævner
                case 1:
                    int stævneChoice = 0;
                    
                    while (stævneChoice!= exitValue){
                        switch (stævneChoice){
                            case 1:
                                int vinterChoice = 0;
                         // Hvis man vælger vinter:
                                while (vinterChoice!=exitValue){
                                    switch(vinterChoice){
                                        case 1:
                                            System.out.println("Liste over crawlsvømmerer.");
                                            break;
                                        case 2:
                                            System.out.println("Liste over rygsvømmerer.");
                                            break;
                                        case 3:
                                            System.out.println("Liste over butterflysvømmerer.");
                                            break;
                                        case 4:
                                            System.out.println("Liste over brystsvømmerer.");
                                            break;
                                        default:
                                            System.out.println("");
                                            vinterChoice = 9;
                                            break;
                                    }
                                  menuer.vinter(); 
                                  System.out.println("Vælg en mulighed");
                                  vinterChoice = input.nextInt();
                                }
                                break;
                            case 2:  
                                int LCChoice = 0;
                         // Hvis man vælger Lyngby cup:
                                while (LCChoice!=exitValue){
                                    switch(LCChoice){
                                        case 1:
                                            System.out.println("Liste over crawlsvømmerer.");
                                            break;
                                        case 2:
                                            System.out.println("Liste over rygsvømmerer.");
                                            break;
                                        case 3:
                                            System.out.println("Liste over butterflysvømmerer.");
                                            break;
                                        case 4:
                                            System.out.println("Liste over brystsvømmerer.");
                                            break;
                                        default:
                                            System.out.println("");
                                            LCChoice = 9;
                                            break;
                                    }
                                  menuer.LC(); 
                                  System.out.println("Vælg en mulighed");
                                  LCChoice = input.nextInt();
                                }
                                break;
                            case 3:  
                                int sommerChoice = 0;
                         // Hvis man vælger sommer:
                                while (sommerChoice!=exitValue){
                                    switch(sommerChoice){
                                        case 1:
                                            System.out.println("Liste over crawlsvømmerer.");
                                            break;
                                        case 2:
                                            System.out.println("Liste over rygsvømmerer.");
                                            break;
                                        case 3:
                                            System.out.println("Liste over butterflysvømmerer.");
                                            break;
                                        case 4:
                                            System.out.println("Liste over brystsvømmerer.");
                                            break;
                                        default:
                                            System.out.println("");
                                            sommerChoice = 9;
                                            break;
                                    }
                                  menuer.sommer(); 
                                  System.out.println("Vælg en mulighed");
                                  sommerChoice = input.nextInt();
                                }
                                break;
                            case 4:  
                                int efterårChoice = 0;
                         // Hvis man vælger efterår:
                                while (efterårChoice!=exitValue){
                                    switch(efterårChoice){
                                        case 1:
                                            System.out.println("Liste over crawlsvømmerer.");
                                            break;
                                        case 2:
                                            System.out.println("Liste over rygsvømmerer.");
                                            break;
                                        case 3:
                                            System.out.println("Liste over butterflysvømmerer.");
                                            break;
                                        case 4:
                                            System.out.println("Liste over brystsvømmerer.");
                                            break;
                                        default:
                                            System.out.println("");
                                            efterårChoice = 9;
                                            break;
                                    }
                                  menuer.efterår(); 
                                  System.out.println("Vælg en mulighed");
                                  efterårChoice = input.nextInt();
                                }
                                break;
                        }
                        menuer.showStævner();
                        System.out.println("Vælg en mulighed");
                        stævneChoice = input.nextInt();
                    }
             // Hvis man vælger træningsresultater     
                case 2:
                    int træningsChoice = 0;
                    
                    while(træningsChoice!=exitValue){
                        switch(træningsChoice){
                            case 1:
                                System.out.println("Liste over crawlsvømmerer.");
                                break;
                            case 2:
                                System.out.println("Liste over rygsvømmerer.");
                                break;
                            case 3:
                                System.out.println("Liste over butterflysvømmerer.");
                                break;
                            case 4:
                                System.out.println("Liste over brystsvømmerer.");
                                break;
                            case 5:
                                System.out.println("Her skal man kunne indtaste resultater");
                            default:
                                System.out.println("");
                                træningsChoice = 9;
                                break;
                                
                        }
                        menuer.showTræningsResultater();
                        System.out.println("Vælg en mulighed");
                        træningsChoice = input.nextInt();
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
    
}
