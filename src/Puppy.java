/**
 * Created by jasonganub on 10/19/16.
 */
public class Puppy {
    public Puppy(String name) {
        // Constructor with one parameter, name
        System.out.println("Passed Name is: " + name);
    }

    public static void main(String []args) {
        // Creating the myPuppy object
        Puppy myPuppy = new Puppy("Jason");
    }
}
