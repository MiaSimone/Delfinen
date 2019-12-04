
package svømmeklub.delfinen.View;

import java.sql.SQLException;
import svømmeklub.delfinen.Interfaces.Tilbage;
import svømmeklub.delfinen.Model.AlleMedlemmer;
import svømmeklub.delfinen.Model.Medlem;
import svømmeklub.delfinen.Model.Stævne;
import svømmeklub.delfinen.Util.StævnerFromDB;

public abstract class DelfinUI implements Tilbage{
    // Main Menu:
        public void showMainMenu(){
            System.out.println("************************************************");
            System.out.println("Velkommen til Svømmeklubben Delfinen!");
            System.out.println("1. Medlemmer");
            System.out.println("2. Hold");
            System.out.println("3. Transaktioner");
            System.out.println("4. Resultater");
            System.out.println("9. Afslut");
            System.out.println("************************************************");
        }    

    // 1. Medlemmer:
        public void showMedlemmmerMenu(){
            System.out.println("************************************************");
            System.out.println("Medlemmer");
            System.out.println("  1. Opret medlem");
            System.out.println("  2. Se medlemmer");
            tilbage();
            System.out.println("************************************************");
        }
    // 2. Hold:
        public void showHold(){
            System.out.println("************************************************");
            System.out.println("Hold");
            System.out.println("  1. Ungdomsholdet (Hold 1)");
            System.out.println("  2. Seniorholdet (Hold 2)");
            tilbage();
            System.out.println("************************************************");
        }
    // 3. Resultater:
        public void showResultatMenu(){
            System.out.println("************************************************");
            System.out.println("Resultater");
            System.out.println("  1. Top 5");
            System.out.println("  2. Stævner");
            System.out.println("  3. Træningsresultater");
            tilbage();
            System.out.println("************************************************");
        }
        
        public void showTop5(){
            System.out.println("************************************************");
            System.out.println("Top 5");
            System.out.println("  1. Junior");
            System.out.println("  2. Senior");
            System.out.println("************************************************");
        }
        /* Måske kan man lave et while loop istedet?
            public void junior(){
                System.out.println("************************************************");
                discipliner();
                tilbage();
                System.out.println("************************************************");
            }
            public void senior(){
                System.out.println("************************************************");
                discipliner();
                tilbage();
                System.out.println("************************************************");
            }
        */
        public void showStævner(){
            System.out.println("************************************************");
            System.out.println("Stævner");
            // Hvad her?
            tilbage();
            System.out.println("************************************************");
        }
            
        public void showTræningsResultater(){
            System.out.println("************************************************");
            System.out.println("Træningsresultater");
            System.out.println("  1. Se træningsresultater");
            System.out.println("  2. Rediger træningsresultater");
            tilbage();
            System.out.println("************************************************");
        }
        
        
        
            public void discipliner(){
                System.out.println("  1. Resultater for Crawl");
                System.out.println("  2. Resultater for Ryg");
                System.out.println("  3. Resultater for Butterfly");
                System.out.println("  4. Resultater for Bryst");
            }
            public void tilbage(){
                System.out.println("  9. Gå tilbage");
            }
        
// Medlem:    
    public void viewMedlemsList(AlleMedlemmer medlemmer){
        for (Medlem m: medlemmer.getMedlemsListe()){
            System.out.println(m.getNavn() + ". " + m.getAlder() + ": " + m.getÅr() + ". " + m.getAdresse() + ". " +
                    m.getPostNr_By() + ". " + m.getMobilNr() + ". " + m.getJunior_eller_seniorsvømmer() + ". " +
                    m.getMedlemskabsStatus() + ". " + m.getBeskæftigelse());
        }
    }
    public void viewMedlemById(int id) throws ClassNotFoundException, SQLException {
        Medlem medlem = null;
        AlleMedlemmer medlemmer = new AlleMedlemmer();
        medlem = medlemmer.getMedlemFromDBById(id);
        System.out.println("Medlem: " + medlem);
    }  
    
    public void viewVinterstævneList(StævnerFromDB v) throws SQLException, ClassNotFoundException{
        for (Stævne s: v.getStævne()){
            System.out.println("Test: " + s.toString());
            
        }
    }    
    
    public void viewStævneByName() throws ClassNotFoundException, SQLException {
        Stævne stævne = null;
        StævnerFromDB sm = new StævnerFromDB();
        stævne = sm.getStævneFromDBByName();
        System.out.println(stævne);
    }    
    
}
