
package svømmeklub.delfinen.Model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import svømmeklub.delfinen.DataMappers.MedlemsMapper;

public class AlleMedlemmer {
    public List<Medlem> medlemsListe;    
    MedlemsMapper mapper = new MedlemsMapper();
    
    public AlleMedlemmer() throws SQLException, ClassNotFoundException {
        medlemsListe = new ArrayList<>(); 
        //fillListFromDB();
    }

    public List<Medlem> getMedlemsListe(){
        return medlemsListe;
    }
/*    
    public void fillListFromDB() throws SQLException, ClassNotFoundException{
        medlemsListe = mapper.medlemsListe();
    }
*/    
    public Medlem getMedlemFromDBById(int id) throws ClassNotFoundException, SQLException{
        Medlem medlem = null;
        medlem = mapper.getMedlemFromDBById(id);
        return medlem;
    }
    
    public List<Medlem> getMedlemFromAlleMedlemmer(){
        return medlemsListe;
    }
    
    public void opretMedlem(Medlem medlem){
        medlemsListe.add(medlem);
    } 

@Override
    public String toString() {
        return "Alle medlemmer: " + medlemsListe;
    }
    
}
