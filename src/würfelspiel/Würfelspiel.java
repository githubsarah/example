package würfelspiel;

import java.util.Scanner;

/*
    @author sarahschwaiger
*/

public class Würfelspiel {

    public static void main(String[] args) {
        //3.Durchgänge und Serie abfragen
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Durchgänge insgesamt: ");
        int durchgänge = sc.nextInt();
        
        System.out.println("Würfe pro Serie: ");
        int serie = sc.nextInt();
        
        //4. Alles aufrufen
        System.out.println("Durchschnittssumme: " +Summe.durchschnittssumme(durchgänge, serie));
    }
    
}
