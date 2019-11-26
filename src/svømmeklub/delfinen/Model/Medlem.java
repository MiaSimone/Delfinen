
package svømmeklub.delfinen.Model;

public class Medlem {
    
    String navn;
 // junior- eller seniorsvømmer
    int alder;
    // aktivt eller inaktivt:
    boolean medlemskabsStatus;
    // Konkurence eller motionist:
    String beskæftigelse;
    //String svømmeDisciplin;

    /*
    public Medlem(String navn, int alder, boolean medlemskabsStatus, String beskæftigelse) {
        this.navn = navn;
        this.alder = alder;
        this.medlemskabsStatus = medlemskabsStatus;
        this.beskæftigelse = beskæftigelse;
    }
    */
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
// Med. Status:
    public boolean isMedlemskabsStatus() {
        return medlemskabsStatus;
    }

    public void setMedlemskabsStatus(boolean medlemskabsStatus) {
        this.medlemskabsStatus = medlemskabsStatus;
    }
// Beskæftigelse:
    public String getBeskæftigelse() {
        return beskæftigelse;
    }

    public void setBeskæftigelse(String beskæftigelse) {
        this.beskæftigelse = beskæftigelse;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + "/n" +
               "Alder: " + alder + "/n" +
               "Medlemskabs status: " + medlemskabsStatus + "/n" +
               "Beskæftigelse: " + beskæftigelse;
    }
    
    
    
    
}
