import java.util.Scanner;                 

public class MathOperation{
  public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);
    String Vn =" " ;
    int Op =0,V1 =0,V2=0,R=0;
    
  System.out.println("");  
  System.out.println("**********PROCEDURE_ARITHMETIQUE*****************");
  System.out.println("*************************Bon jourd***********************");
  System.out.println("****************************************************"); 
  
  System.out.println("");
  System.out.println("");


    System.out.println("S`il vous plait me peux donner son nom.");
    Vn = in.nextLine( );
  System.out.println("");      
    System.out.println(" 1Pour povoir sommer scelgere.  2Pour cociente scelgere , 3Pour promediar scelgere , 4Pour produtto scelgere ,  5Pour reciduo scelgere ");
    Op =in.nextInt( );
  System.out.println("");  
    System.out.println("Donne moi s`il vout plais la cifre premier. ");
    V1=in.nextInt( );
  System.out.println("");  
    System.out.println("Donne mois s`il vout plais la cifre deuxième.");
    V2=in.nextInt( );

    if (Op==1){
      R=V1+V2;
      System.out.println(Vn+"La repond a votre somme est:  "+R);
    }else if (Op==2){
      R=V1/V2;
      System.out.println(Vn+"The Answer a yours cocient is:   "+R);
    }else if (Op==3){
       R=(V1+V2)/2;
       System.out.println(Vn+"la risposta di votre promedio è:   "+R);
    }else if (Op==4){
       R=V1*V2;   
       System.out.println(Vn+"La respuesta a tu produtto es:   "+R);
    }else if (Op==5){
      R=V1-V2;
      System.out.println(Vn+" The answer of yours residuo is:   "+R);
    }else{
      System.out.println(Vn+" La choisit n`existe pas. grace.");
   }
 }
}