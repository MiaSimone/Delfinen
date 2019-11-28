
package svømmeklub.delfinen.View;

import java.sql.SQLException;
import svømmeklub.delfinen.Model.AlleMedlemmer;
import svømmeklub.delfinen.Model.Medlem;

public class DelfinUI {
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
            System.out.println("  9. Tilbage til start menuen");
            System.out.println("************************************************");
        }
    // 2. Hold:
        public void showHold(){
            System.out.println("************************************************");
            System.out.println("Hold");
            System.out.println("  1. Ungdomsholdet (Hold 1)");
            System.out.println("  2. Seniorholdet (Hold 2)");
            System.out.println("  9. Tilbage til start menuen");
            System.out.println("************************************************");
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
       
    
    
}
