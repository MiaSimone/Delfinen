
package svømmeklub.delfinen.Model;

import java.util.ArrayList;
import java.util.List;
import svømmeklub.delfinen.DataMappers.RestanceMapper;

public class Restance {
    RestanceMapper res = new RestanceMapper();
    public List<Medlem> restance;
    public List<Medlem> samletRes;
    String navn;
    int mobilNr;
    int beløb;

    public Restance(String navn, int mobilNr, int beløb) {
        restance = new ArrayList<>();
        this.navn = navn;
        this.mobilNr = mobilNr;
        this.beløb = beløb;
    }
    
// Gettere:
    public List<Medlem> getRestance() {
        return restance;
    }
    
// Når der skal oprettes medlemmer og de vælger betal senere ligges de på restance
    public void addMedlemTilRestance(Medlem medlem) {
        restance.add(medlem);
    }
// Når de har betalt fjernes de fra restance 
    public void betalt(Medlem medlem) {
        restance.remove(medlem);
    }
    
    public void seRestance(){
        System.out.println(restance.size());
    }
    
    @Override
    public String toString() {
        String mellemrum = "\n";
        return "Navn: " + navn + "\n" +
               "MobilNr: " + mobilNr + "\n" + 
               "Restance: " + beløb + "\n" + mellemrum + mellemrum;
    }
        
    
}
