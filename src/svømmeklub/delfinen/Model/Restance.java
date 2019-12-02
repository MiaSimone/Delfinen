
package svømmeklub.delfinen.Model;

import java.util.ArrayList;
import java.util.List;

public class Restance {

    public List<Medlem> restance;
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
        
    
}
