public class App {
    public static void main(String[] args) {

        // Character Class
        //(str,agi,int,name)
        
        // "Knight Character Class"
        Character knight = new Character(10, 5, 0, "Abaddon");
        knight.sayMyName();

        // "Mage Character Class"
        Character mage = new Character(0, 5, 10, "Akasha");
        mage.sayMyName();

        // "Thief Character Class"
        Character thief = new Character(5, 10, 0, "Gondar");
        thief.sayMyName();

        // "Archer Character Class"
        Character archer = new Character (5,5,5, "Mirana");
        archer.sayMyName();


        // Enemy Class
        // (damage,health,armor,immunity,name)
         
        // "Boss Enemy Class"
        Enemy boss = new Enemy (50,500,100,true,"Roshan");
        boss.sayMyName();

        // "Skelton Enemy Class"
        Enemy skeleton = new Enemy (5,10,5,false,"Common Skeleton Warrior");
        skeleton.sayMyName();

        // "Dragon Enemy Class"
        Enemy dragon = new Enemy (40,400,75,false,"Ancient Wyvern");
        dragon.sayMyName();

        // Weapon Class
        // (damage,weight,elementalDMG,name,desc,rarity)

        // "Sword Weapon Class"
        Weapon sword = new Weapon (999,5.5f,true,"Excalibur","The Legendary Sword of King Arthur", "Legendary");
        sword.sayWeaponDescription();

        // Gear Class
        // (defense,weight,elementalDEF,name,desc,rarity)

        // "Helmet Weapon Class"
        Gear helmet = new Gear (20, 2.5f, true, "Railey's Helmet", "A helmet owned by Railey", "Epic");
        helmet.sayGearDescription();

    }
}