
package svømmeklub.delfinen.Model;

import java.util.ArrayList;
import java.util.List;
import svømmeklub.delfinen.DataMappers.RestanceMapper;

public class RestanceList {

    public List<Restance> restanceList;
    
    public RestanceList() {
        restanceList = new ArrayList<>();
    }

    public List<Restance> getRestanceList() {
        return restanceList;
    }
  
    public void addMedlemTilRestance(Restance restance) {
        restanceList.add(restance);
    }
    
    public void betalt(Restance restance) {
        restanceList.remove(restance);
    }
    
    public void seRestance(){
        System.out.println(restanceList.size());
    }
    
@Override
    public String toString() {
        return "Restance: " + restanceList;
    }
    
}
