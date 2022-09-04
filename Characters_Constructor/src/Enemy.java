public class Enemy {
    // Attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;

    // Method
    public void sayMyName() {
        System.out.println("Fear me for my name is " + name + " and I deal " + damage + " damage! ");
    }

    // Constructor
    public Enemy(int enemyDamage, int enemyHealth, int enemyArmor, boolean enemyImmunity, String EnemyName) {
        damage = enemyDamage;
        health = enemyHealth;
        armor = enemyArmor;
        hasMagicImmunity = enemyImmunity;
        name = EnemyName;
    }
}