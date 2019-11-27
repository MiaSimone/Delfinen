
package svømmeklub.delfinen;

import java.sql.SQLException;
import svømmeklub.delfinen.Controller.Controller;
import svømmeklub.delfinen.DataMappers.MedlemsMapper;
import svømmeklub.delfinen.Model.AlleMedlemmer;
import svømmeklub.delfinen.View.DelfinUI;

public class SvømmeklubDelfinen {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Controller con = new Controller();
        con.runProgram();
        /*

        MedlemsMapper mm = new MedlemsMapper(); 
        System.out.println(mm.medlemsListe());
        
        
        
        Controller con = new Controller();
        con.runProgram();
*/
        
    }
    
}
