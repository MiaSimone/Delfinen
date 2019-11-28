
package svømmeklub.delfinen.Model;

import java.util.ArrayList;
import java.util.List;

public class Restance {

    public List<Medlem> restance;

// Konstruktor:
    public Restance() {
        restance = new ArrayList<>();
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
        System.out.println(restance);
    }
        
    
}
