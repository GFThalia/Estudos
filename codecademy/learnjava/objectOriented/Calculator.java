package objectOriented;

/* A Basic Calculator
 *  
 * The calculator will be able to:
 * Add two integers
 * Subtract two integers
 * Multiply two integers
 * Divide two integers
 * 
 * 
 * The console should print out:
 * 10
 * 10
 * 10
 * 10
 * 
 */

public class Calculator{

public Calculator(){}


public int add(int a, int b){
return a + b;
}
public int subtract(int a, int b){
return a - b;
}
public int multiply(int c, int d){
return c * d;
}
public int divide(int e, int f){
return e / f;
}



public static void main(String[] args){
Calculator myCalculator = new Calculator();
System.out.println(myCalculator.add(2, 8));
System.out.println(myCalculator.subtract(45, 35));
System.out.println(myCalculator.multiply(2, 5));
System.out.println(myCalculator.divide(100, 10));

}
}