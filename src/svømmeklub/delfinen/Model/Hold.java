
package svømmeklub.delfinen.Model;

public class Hold{
    
    String navn;
    int alder;
    String JellerS;
    String disciplin;

    public Hold(String navn, int alder, String JellerS, String disciplin) {
        this.navn = navn;
        this.alder = alder;
        this.JellerS = JellerS;
        this.disciplin = disciplin;
    }

    @Override
    public String toString() {
        return String.format("%-25s%-10d%-20s%-20s\n", navn, alder, JellerS, disciplin);
    }

    
    
    
}
