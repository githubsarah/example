package würfelspiel;

/*
    @author sarahschwaiger
*/

public class Summe {
    //1.Gewinnsumme berechnen
    public static int gewinnsumme(int serie){
        int sum = 0;
        for(int i = 0; i< serie; i++){
            int zahl = 1 + (int)((Math.random())*6);
            if(zahl != 1){
                sum = sum + zahl;
            }      
        }
        return sum;
        
    }
    
    
    //2. 1000 Würfe mit Durchschnittssumme  
    public static double durchschnittssumme(int durchgänge, int serie){
        int summe = 0;
        for(int i = 0; i < durchgänge; i++){
            summe = summe + gewinnsumme(serie);
        }
        
        return summe/durchgänge; 
    }
    
}
