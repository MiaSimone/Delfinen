
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
        String mellemrum = "\n";
        return "Navn: " + navn + "\n" +
               "Stævne: " + stævne + "\n" +
               "Placering: " + placering + "\n" +
               "Disciplin: " + disciplin + "\n"+
                "Tid: " + tid + mellemrum + mellemrum;
    }
}
