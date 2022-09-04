public class Weapon {

    int damage;
    float weight;
    boolean hasElementalDamage;
    String name;
    String description;
    String rarity;

    //Method
    public void sayWeaponDescription(){
        System.out.println("Description: " + description);
    }
    
    //Constructor
    public Weapon(int weaponDamage, float weaponWeight, boolean weaponElementalDMG, String weaponName, String weaponDescription, String weaponRarity){
        damage = weaponDamage;
        weight = weaponWeight;
        hasElementalDamage = weaponElementalDMG;
        name = weaponName;
        description = weaponDescription;
        rarity = weaponRarity;
    }
        

    
}
