import java.util.Scanner;

public class FactureLibraire{
  public static void main(String args[]){
  
  Scanner in= new Scanner(System.in);
  String   Vn = "";
  int         Vl= 0,Ve=0,R=0;
  
  System.out.println("");  
  System.out.println("**********LIBRAIRE_FACTURE*****************");
  System.out.println("***Bon jourd c`est le asistent de facturation***");
  System.out.println("****************************************************"); 
  
  System.out.println("");
  System.out.println("");
  System.out.println("Poudriez vous donner moi son nom s`il vous plait");
  Vn=in.nextLine();

  System.out.println(" ");
  System.out.println(Vn+ "  Çest le carre de livres bets celer du mois");
  
  System.out.println("");
  System.out.println("************************************");
  System.out.println("***1.Pogramation..................30$******");
  System.out.println("***2.Histoire de la france......35$****");
  System.out.println("***3.Tige des arbre...............40$***");
  System.out.println("************************************"); 
  System.out.println("");
  System.out.println(Vn+"  Choasir vous une option de Livre pour acheter, en premant la touch respectif, s`il vous plais");
  Vl=in.nextInt();
  
  System.out.println("");
  System.out.println(" Ce sont les clas de edition");
  System.out.println("************************************");
  System.out.println("***1.Lux..................10$******");
  System.out.println("***2.milieu............7$****");
  System.out.println("***3.Ordinaire................5$***");
  System.out.println("************************************"); 
  System.out.println("************************************");
  System.out.println(""); 
  
  System.out.println(Vn+" Choisiriez vous la edition que aimez, en premant la touch respectif, s`il vous plais");
  Ve=in.nextInt();
  System.out.println(""); 

  if (Vl==1&&Ve==1){
     R=30+10+2;
     System.out.println(Vn+" Le valoir de ton livre de Programmation edition de Lux est:.. "+R+"Specifications:**Libre de Pogramation.....30$**Lux....10$**Tassa de IVA...2 ");
  } else if (Vl==1&&Ve==2){
     R=30+7+2;
     System.out.println(Vn+" Le valoir de ton livre de Programmation edition Milieu est:.. "+R+"Specifications:**Libre de Pogramation.....30$**Milieu....7$**Tasso de IVA...2 ");
  } else if (Vl==1&&Ve==3){
     R=30+5-5;
     System.out.println(Vn+" Le valoir de ton livre de Programmation edition Ordinaire est:.."+R+"Specifications:**Livre de Programmation...30$**Ordinaire...5**Impot de IVA...-5");
  } else if (Vl==2&&Ve==1){
     R=35+10+2;
     System.out.println(Vn+" Le valoir de ton livre de Histoire de la france, edition de Lux est:.. "+R+"Specifications:**Livre Histoire de france.....35$**Lux....10$**Tassa de IVA...2");
  } else if (Vl==2&&Ve==2){
     R=35+7+2;
     System.out.println(Vn+" Le valoir de ton livre de Histoire de la france, edition Milieu est:.. "+R+"Specifications:**Livre Histoire de france.....35$**Milieu....7$**Tasso de IVA...2");
  } else if (Vl==2&&Ve==3){
     R=35+5-5;
     System.out.println(Vn+" Le valoir de ton livre de Histoire de la france, edition Ordinaire est:.."+R+"Specifications:**Livre Histoire de france...35$**Ordinaire...5**Impot de IVA...-5");
  } else if (Vl==3&&Ve==1){
     R=40+10+2;
     System.out.println(Vn+" Le valoir de ton livre de Tige des Arbre, edition de Lux est:.. "+R+"Specifications:**Livre Tige des arbre.....40$**Lux....10$**Tassa de IVA...2");
  } else if (Vl==3&&Ve==2){
     R=40+7+2;
     System.out.println(Vn+" Le valoir de ton livre de Tige des Arbre, edition Milieu est:.. "+R+"Specifications:**Livre Tige des arbre.....40$**Milieu....7$**Tasso de IVA...2");
  } else if (Vl==3&&Ve==3){
     R=40+5-5;
     System.out.println(Vn+" Le valoir de ton livre de Tige des Arbre, edition Ordinaire est:.."+R+"Specifications:**Livre Tige des arbre...40$**Ordinaire...5**Impot de IVA...-5");
  } else{
    System.out.println(" Ç`options n`existe pas"); 
  }
 }
}
