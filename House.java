
import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building implements HouseRequirements {

  // Establishes the perameters needed for the house class in particular // 
  private ArrayList<Student> residents; 
  private boolean hasDiningRoom;

  /**
   * Constoctor 
   * @param name The name of the building / house 
   * @param address The address of the building / house 
   * @param nfloors The number of floors inside the building / house 
   * This constuctor also takes the rolls of addressing the new atributes that house has that the parent building does not 
   */
  public House(String name, String address, int nfloors){
    super(name, address, nfloors);
    this.hasDiningRoom = true;
    this.residents = new ArrayList<Student>();  
    System.out.println("You have built a house: 🏠");
  }

  public String toString(){
    return(super.toString() + System.lineSeparator() + "The resident(s) of this house is/are:" + this.residents + System.lineSeparator() + "Does it have a dinning hall?:" + this.hasDiningRoom);
  }

  /**
   * Accessor for hasDiningRoom
   * @return : True or false dependent on if the house has a dining room. 
   * Currently set to true 
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  /**
   * Accessor for number of residents 
   * @return the size/number of residents within the residents list 
   */
  public int nResidents(){
    return this.residents.size();

  }

  /**
   * Updates the residents list with a student who will be moving in 
   * @param s name of the student who will be moving into the house 
   */
  public void moveIn(Student s){
    this.residents.add(s);
  }

  /**
   * Updates the residents array list to remove a student who will be moving out 
   * @param s student who will be moving out 
   * @return The name of the student that has/will be moving out
   */
  public Student moveOut(Student s){
    this.residents.remove(s);
    return s;
  }

  /**
   * A boolean method that will tell us if a student is a resident 
   * @param s student you want to check to see if they live there or not 
   * @return True or false. True being that the student in the peram is a resident, false if not 
   */
  public boolean isResident(Student s){
    return this.residents.contains(s);
  }

  



  public static void main(String[] args) {
    Student jode = new Student("Jode", "50193739", 2029);
    Student Liz = new Student("Elizabeth", "50193737", 2029);
    House gardiner = new House("Gardiner", "1 paradise road", 4 );
    gardiner.moveIn(jode);
    gardiner.moveIn(Liz);
    gardiner.isResident(jode);
    gardiner.moveOut(Liz);
    System.out.println(gardiner.isResident(Liz));
    System.out.println(gardiner.isResident(jode));
  }


}