
package svømmeklub.delfinen.Model;

public class Hold{
    
    String navn;
    int alder;
    String JellerS;
    String disciplin;

    public Hold(String navn, int alder, String JellerS, String disciplin) {
        this.navn = navn;
        this.alder = alder;
        this.JellerS = JellerS;
        this.disciplin = disciplin;
    }

    @Override
    public String toString() {
        String mellemrum = "\n";
        return "Navn: " + navn + "\n" +
               "Alder: " + alder + "\n" +
               "Junior eller seniorsvømmer: " + JellerS + "\n" +
               "Disciplin: " + disciplin + mellemrum + mellemrum;
    }

    
    
    
}
