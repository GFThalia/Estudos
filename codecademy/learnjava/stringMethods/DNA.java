package stringMethods;

/*Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.

These should be the results:
dna1: Contains a protein.
dna2: Does not contain a protein.
dna3: Contains a protein.
*/


public class DNA {

	  public static void main (String[] args) {
	    // DNA Sequencing
	    String dna1 = "ATGCGATACGCTTGA";
	    String dna2 = "ATGCGATACGTGA";
	    String dna3 = "ATTAATATGTACTGA";

	    // DNA array
	    String[] dnaArray = {dna1, dna2, dna3};
	    
	    //checks if the DNA strings contain valid proteins
	    for (int i = 0; i < dnaArray.length; i++) {
	    	
	    	if (dnaArray[i].contains("ATG") && dnaArray[i].contains("TGA") && dnaArray[i].length() % 3 == 0) {
	    		System.out.println("Contains a protein.");
	    	}
	    	else {
	    		System.out.println("Does not contain a protein.");
	      } 
	    }
	  }
}


