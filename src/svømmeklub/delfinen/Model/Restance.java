
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
        return String.format("%-25s%-20d%-10d\n", navn, mobilNr, beløb);
    }
        
    
}
