
package svømmeklub.delfinen.Model;

public class Træning {
    int tResID;
    String navn;
    String dato;
    String disciplin;
    double tid;
    
    public Træning(int tResID, String navn, String dato, String disciplin, double tid) {
        this.tResID = tResID;
        this.navn = navn;
        this.dato = dato;
        this.disciplin = disciplin;
        this.tid = tid;
    }

    @Override
    public String toString() {
        return String.format("%-7d%-25s%-20s%-20s%-15.2f\n", tResID, navn, dato, disciplin, tid);
    } 
    
}
