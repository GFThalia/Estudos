package loops;

/* Incrementing While Loops:
 * "Create a while loop that will continue to loop while dieRoll is NOT 5."
 * 
 * Using For Loops:
 * "We’ve provided a while loop that loops from 1 to 5 outputting a 
 * string on each iteration. Refactor (rewrite) this code as a for loop."
 * 
 */

class Coffee {
	  
  public static void main(String[] args) {
	  
/*  int cupsOfCoffee = 1;

	while (cupsOfCoffee <= 5){
	  System.out.println("Lia drinks cup of coffee #"+cupsOfCoffee);
	  cupsOfCoffee++;
	 }

  }
  
}*/	  
	for (int cupsOfCoffee = 1; cupsOfCoffee <= 5; cupsOfCoffee++) {

	System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
    }
  }
}
