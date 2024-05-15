package codecademy.IntermediateJava.serialization;
import java.io.Serializable;

public class Helmet extends Armour implements Serializable{

  /* Class Variables */
  private final static long serialVersionUID = 1L;

  /* Constructors */
  public Helmet(String name, int durability, int defenseRating) {
    super(name, durability, defenseRating);
  }
}