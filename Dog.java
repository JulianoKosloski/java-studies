public class Dog {
    String size = "Medium";
    String color = "brown";
    int legs = 4;
    boolean barks = true;

    public Dog(String size, String color, int legs, boolean barks) {
        this.size = size;
        this.color = color;
        this.legs = legs;
        this.barks = barks;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean getBarks() {
        return this.barks;
    }

    public void setLegs(boolean barks) {
        this.barks = barks;
    }

    static void testObjectBehavior(Dog dog) {
        dog.setLegs(12);
        System.out.println("Current dog has " + dog.legs + " legs!");
        System.out.println(dog.size);
        dog = new Dog("GIGANTIC", "RED", 6, true);
        System.out.println("Current dog has " + dog.legs + " legs!");
        System.out.println("Now it is " + dog.size);
    }
    public static void main (String[] args) {

        Dog hyoga = new Dog("Small", "Black and White", 4, true);

        System.out.println("Hyoga is " + hyoga.size);
        testObjectBehavior(hyoga);
        System.out.println("Hyoga is " + hyoga.size);
        System.out.println("hyoga has " + hyoga.legs + " legs!");
    }
}