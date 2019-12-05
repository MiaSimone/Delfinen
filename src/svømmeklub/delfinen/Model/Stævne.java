
package svømmeklub.delfinen.Model;

public class Stævne {

    String navn;
    String stævne;
    int placering;
    String disciplin;
    double tid;

    public Stævne(String navn, String stævne, int placering, String disciplin, double tid) {
        this.navn = navn;
        this.stævne = stævne;
        this.placering = placering;
        this.disciplin = disciplin;
        this.tid = tid;
    }

    @Override
    public String toString() {
        return String.format("%-25s%-25s%-20d%-20s%-15.2f\n", navn, stævne, placering, disciplin, tid);
    }
}
