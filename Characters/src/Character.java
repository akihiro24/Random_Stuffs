public class Character {

    //Property/Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    //Character Method
    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStrength() {
        System.out.println("My Strength is " + strength);
    }

    public void sayMyAgility() {
        System.out.println("My Agility is " + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("My Intelligence is " + intelligence);
    }

    // Constructor
    // public Character(int str, int agi, int intel, String characterName) {
    //     strength = str;
    //     agility = agi;
    //     intelligence = intel;
    //     name = characterName;
    // }
}