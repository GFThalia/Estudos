package conditionalsAndControl;

/*  A Simple Car Loan Payment Calculator
 *  The program will include the following:
 *  Car loan amount
 *  Interest rate of the loan
 *  Length of the loan (in years)
 *  Down payment
 *  
 *  The console should print out 233 as the monthly payment.
 *  
 */

public class CarLoan {
	 int carLoan = 10000;
	 int loanLength = 3;
	 int interestRate = 5;
	 int downPayment = 2000;

	 public void carloan(){
	    if(loanLength <= 0 || interestRate <= 0){
	    System.out.println("Error! You must take out a valid car loan.");
	    }else if(downPayment >= carLoan){
	    System.out.println("The car can be paid in full.");
	    }else{ 
	    int remainingBalance = carLoan - downPayment;
	    int months = loanLength * 12;
	    int monthlyBalance = remainingBalance / months;
	    int interest = monthlyBalance * interestRate / 100;
	    int monthlyPayment = monthlyBalance + interest;
	    System.out.println(monthlyPayment);
	    }
	  }

	 public static void main(String[] args) {
	  CarLoan book = new CarLoan();
	  book.carloan();
		}
	}