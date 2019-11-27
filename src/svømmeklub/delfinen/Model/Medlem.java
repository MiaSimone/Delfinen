
package svømmeklub.delfinen.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medlem {
    
    String navn;
 // junior- eller seniorsvømmer
    int alder;
    int år;
    String adresse;
    String postNr_By;
    int mobilNr;
    String Junior_eller_seniorsvømmer;
    // aktivt eller inaktivt:
    String medlemskabsStatus;
    // Konkurence eller motionist:
    String beskæftigelse;
    //String svømmeDisciplin;

    public Medlem(String navn, int alder, int år, String adresse, String postNr_By, 
            int mobilNr, String Junior_eller_seniorsvømmer, String medlemskabsStatus, String beskæftigelse) {
        this.navn = navn;
        this.alder = alder;
        this.år = år;
        this.adresse = adresse;
        this.postNr_By = postNr_By;
        this.mobilNr = mobilNr;
        this.Junior_eller_seniorsvømmer = Junior_eller_seniorsvømmer;
        this.medlemskabsStatus = medlemskabsStatus;
        this.beskæftigelse = beskæftigelse;
    }

// Navn:    
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
// Alder:
    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
// År:
    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
        this.år = år;
    }
// Adresse:
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
// PostNr og By:
    public String getPostNr_By() {
        return postNr_By;
    }

    public void setPostNr_By(String postNr_By) {
        this.postNr_By = postNr_By;
    }
// Mobil Nr:
    public int getMobilNr() {
        return mobilNr;
    }

    public void setMobilNr(int mobilNr) {
        this.mobilNr = mobilNr;
    }
// J eller S:
    public String getJunior_eller_seniorsvømmer() {
        return Junior_eller_seniorsvømmer;
    }

    public void setJunior_eller_seniorsvømmer(String Junior_eller_seniorsvømmer) {
        this.Junior_eller_seniorsvømmer = Junior_eller_seniorsvømmer;
    }
// Medlemsstatus:
    public String getMedlemskabsStatus() {
        return medlemskabsStatus;
    }

    public void setMedlemskabsStatus(String medlemskabsStatus) {
        this.medlemskabsStatus = medlemskabsStatus;
    }
// BEskæftigelse:
    public String getBeskæftigelse() {
        return beskæftigelse;
    }

    public void setBeskæftigelse(String beskæftigelse) {
        this.beskæftigelse = beskæftigelse;
    }

    @Override
    public String toString() {
        String mellemrum = "\n";
        return "Navn: " + navn + "\n" +
               "Alder: " + alder + "\n" +
               "Medlemskabs status: " + medlemskabsStatus + "\n" +
               "Beskæftigelse: " + beskæftigelse + mellemrum + mellemrum;
    }
    
    
    
    
}
