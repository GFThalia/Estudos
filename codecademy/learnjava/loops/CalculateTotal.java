package loops;

/* Iterating Over Arrays and ArrayLists
 * "Let’s use a for loop to iterate over expenses and sum up the total of all items."
 */

import java.util.ArrayList;

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double total = 0;
    
    // Iterate over expenses
    
    for (int i = 0; i < expenses.size(); i++){
      total = total + expenses.get(i);
    }
    
    System.out.println(total);
    
  }
  
}
