
package svømmeklub.delfinen.Model;

import java.util.ArrayList;
import java.util.List;
import svømmeklub.delfinen.DataMappers.RestanceMapper;

public class Restance {
    RestanceMapper res = new RestanceMapper();
    String navn;
    int mobilNr;
    int beløb;

    public Restance(String navn, int mobilNr, int beløb) {
        this.navn = navn;
        this.mobilNr = mobilNr;
        this.beløb = beløb;
    }

    @Override
    public String toString() {
        String mellemrum = "\n";
        return "Navn: " + navn + "\n" +
               "MobilNr: " + mobilNr + "\n" + 
               "Restance: " + beløb + "\n" + mellemrum + mellemrum;
    }
        
    
}
