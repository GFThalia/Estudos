package conditionalsAndControl;

/* "Write a Continents.java program that will print out a continent and 
 * the largest city in that continent, based on the value of an integer."
 * 
 * The console should print out:
 * Africa: Lagos, Nigeria
 * 
 */

 public class Continents {
  int continent = 4;

 public void continents(){
    switch (continent){
    case 1: //continent = 1;
     System.out.println("North America: Mexico City, Mexico");
     break;

    case 2: //continent = 2;
      System.out.println("South America: Sao Paulo, Brazil");
     break;

    case 3: //int continent = 3;
     System.out.println("Europe: Moscow, Russia");
     break;

    case 4: //int continent = 4;
     System.out.println("Africa: Lagos, Nigeria");
     break;

    case 5: //int continent = 5;
     System.out.println("Asia: Shanghai, China");
     break; 

    case 6: //int continent = 6;
     System.out.println("Australia: Sydney, Australia");
     break; 

    case 7: //int continent = 7;
     System.out.println("Antarctica: McMurdo Station, US");
     break; 

    default:      
     System.out.println("Undefined continent!");

    
    }
  }


 public static void main(String[] args){
   Continents continents = new Continents();
   continents.continents();
  }
}