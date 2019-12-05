
package svømmeklub.delfinen.Controller;

import java.sql.SQLException;
import java.util.Scanner;
import svømmeklub.delfinen.Menuer.Menuer;
import svømmeklub.delfinen.Model.AlleMedlemmer;
import svømmeklub.delfinen.View.DelfinUI;

// public abstract class Controller implements Tilbage 
public class Controller {
    
    // Laver scanner:
    Scanner input = new Scanner(System.in);  
    // Laver alle medlemmer objekt:
    public AlleMedlemmer medlemmer;
    DelfinUI menuer = new DelfinUI() {};
    Menuer m = new Menuer();

    public void runProgram() throws SQLException, ClassNotFoundException{
        int choice = 0;
        int exitValue = 9;
        boolean quit = false;
        
        while (choice != exitValue){
            switch(choice) {
        // Medlemmer:        
                case 1:
                    m.valg1();
                    
                    break;
        // Hold:            
                case 2:
                    m.valg2();
                    break;
        // Restance:            
                case 3:
                    m.valg3();
                    break;
                    
        // Resultater:            
                case 4:
                    m.valg4();
                    break;
                    
                default:
                    System.out.println("");
                    choice = 9;
                    break;
            }
        // Initialiser hovedmenu
           menuer.showMainMenu();
           System.out.println("Vælg en mulighed");
           choice = input.nextInt();
        }
        
        //Betaling b = new Betaling();
        //b.betaling();

    } 
}
    
    
