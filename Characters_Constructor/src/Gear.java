public class Gear {

    int defense;
    float weight;
    boolean hasElementalDefense;
    String name;
    String description;
    String rarity;

    //Method
    public void sayGearDescription(){
        System.out.println("Description: " + description);
    }

    //Constructor
    public Gear(int gearDefense, float gearWeight, boolean gearElementalDEF, String gearName, String gearDescription, String gearRarity){
        defense = gearDefense;
        weight = gearWeight;
        hasElementalDefense = gearElementalDEF;
        name = gearName;
        description = gearDescription;
        rarity = gearRarity;
    }
}