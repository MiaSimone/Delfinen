
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
        String mellemrum = "\n";
        return "ID: " + tResID + "\n"+
               "Navn: " + navn + "\n" +
               "Dato: " + dato + "\n" +
               "Disciplin: " + disciplin + "\n"+
               "Tid: " + tid + mellemrum + mellemrum;
    } 
    
}
