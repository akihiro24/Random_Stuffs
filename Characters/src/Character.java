public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStrength() {
        System.out.println("My Strength is " + strength);
    }

    public void sayMyAgility() {
        System.out.println("My agility is " + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("My intelligence is " + intelligence);
    }
}