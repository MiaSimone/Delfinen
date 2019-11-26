
package svømmeklub.delfinen.Controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import svømmeklub.delfinen.Model.Medlem;

public class Betaling{

    public void betaling() throws IllegalArgumentException{
        Scanner userInput = new Scanner(System.in);
        Medlem m = new Medlem();

    while(true) {    
    try {
        System.out.println("Er medlemsskabet aktivt eller passivt");
        boolean status = m.isMedlemskabsStatus();
        //status = userInput.nextBoolean();
        String input = userInput.nextLine().toLowerCase();
        
    if (input.equals("aktivt")){  
        status = true;
        System.out.println("Hvad er din alder?");
        int svømmerAlder = m.getAlder();
        svømmerAlder = userInput.nextInt();
        userInput.nextLine();
        if (svømmerAlder<18){
            System.out.println("Det koster 1000 kr.");
        } else if (svømmerAlder >= 18 && svømmerAlder < 60){
            System.out.println("Det koster 1600 kr.");
        } else if (svømmerAlder >= 60 && svømmerAlder < 99){
            System.out.println("Du får 25 % rabat, altså koster det 1200 kr");
        } else {
        throw new IllegalArgumentException();  
        }

//else if (svømmerAlder <= 0 || svømmerAlder > 110){
            //System.out.println("Dette er ikke muligt.");
        //}
    } else if (input.equals("passivt")) {
        status = false;
        System.out.println("Medlemskabet er passivt, det koster 500 kr");
    } else {
        throw new IllegalArgumentException();
    }         
    } catch (Exception e) {
        System.out.println("Noget gik galt.");
    }    
                
    }
    } 
    
    
}
