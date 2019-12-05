
package svømmeklub.delfinen.Model;

public class Resultater {
    
    String navn;
    String disciplin;
    double sum;
    //int msg = navn.length();

    public Resultater(String navn, String disciplin, double sum) {
        this.navn = navn;
        this.disciplin = disciplin;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-10s%15.2f\n", navn, disciplin, sum);
    }
    
    
    
}
