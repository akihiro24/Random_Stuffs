public class App {
    //START
    public static void main(String[] args) {
        //START OF MAIN METHOD

        //Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Abaddon";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();
        
        Character archer = new Character();
        archer.strength = 5;
        archer.agility = 5;
        archer.intelligence = 5;
        archer.name = "Mirana";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

         // Enemy Class
         Enemy boss = new Enemy();

         boss.damage = 50;
         boss.health = 500;
         boss.armor = 100;
         boss.hasMagicImmunity = true;
         boss.name = "Roshan";
         boss.enemyDialogue();
 
         Enemy skeleton = new Enemy();
 
         skeleton.damage = 5;
         skeleton.health = 10;
         skeleton.armor = 5;
         skeleton.hasMagicImmunity = false;
         skeleton.name = "Common Skeleton Warrior";
         skeleton.enemyDialogue();
 
         Enemy dragon = new Enemy();
 
         dragon.damage = 40;
         dragon.health = 400;
         dragon.armor = 75;
         dragon.hasMagicImmunity = false;
         dragon.name = "Ancient Wyvern";
         dragon.enemyDialogue();

         //Weapon Class
         Weapon sword = new Weapon();

         sword.damage = 999;
         sword.name = "Excalibur";
         sword.weight = 5.5f;
         sword.rarity = "Legendary";
         sword.description = "The Legendary Sword of King Arthur";
         sword.hasElementalDamage = true;

         sword.showWeaponDescription();

         //Gear Class
         Gear helmet = new Gear();

         helmet.defense = 10;
         helmet.weight = 8.5f;
         helmet.hasElementalResistance = true;
         helmet.description = "A helmet owned by Railey";
         helmet.rarity = "Epic";
         helmet.name = "Railey's Helmet";

         helmet.showGearDescription();

        //  //Built-in Method
        //  System.out.println("Hello, I am Railey");


         //END OF MAIN METHOD
     }

    //END
 }
