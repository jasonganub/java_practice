/**
 * Created by jasonganub on 10/19/16.
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // Constructor with one parameter, name
        System.out.println("Passed Name is: " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is : " + puppyAge);
        return puppyAge;
    }

    public static void main(String []args) {
        // Creating the myPuppy object
        Puppy myPuppy = new Puppy("Jason");

        // Call class method to set puppy's age
        myPuppy.setAge(24);

        // Call another class method to get puppy's age
        myPuppy.getAge();

        // You can access instance variable as follows as well
        System.out.println("Variable value : " + myPuppy.puppyAge);
    }
}
