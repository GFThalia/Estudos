package conditionalsAndControl;

/* Conditional-And: &&
 * Conditional-Or: ||
 * Logical NOT: !
 * 
 * The console should print out:
 * Reservation confirmed
 * Please enjoy your meal!
 * Reservation denied
 * Unable to confirm reservation, please contact restaurant.
 *
 */

public class Reservation {
	  int guestCount;
	  int restaurantCapacity;
	  boolean isRestaurantOpen;
	  boolean isConfirmed;
	  
	  public Reservation(int count, int capacity, boolean open) {
	    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
		if (count>8 || count<1){
		 System.out.println("Invalid reservation!");
		}
	  }  
	    
	  
	 public void confirmReservation() {
	  if (restaurantCapacity >= guestCount &&isRestaurantOpen){
	    System.out.println("Reservation confirmed");
	    isConfirmed = true;
	   }else{
	    System.out.println("Reservation denied");
	    }
	  }
	  
	  public void informUser() {
	    if (!isConfirmed){
	    System.out.println("Unable to confirm reservation, please contact restaurant.");
	    }else{ 
	    System.out.println("Please enjoy your meal!");
	    }
	  }
	  
	  public static void main(String[] args) {
	    Reservation partyOfThree = new Reservation(3, 12, true);
	    Reservation partyOfFour = new Reservation(4, 3, true);
	    partyOfThree.confirmReservation();
	    partyOfThree.informUser();
	    partyOfFour.confirmReservation();
	    partyOfFour.informUser();
	  }
	}