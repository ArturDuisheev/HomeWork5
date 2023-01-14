public class Hero {
    private String superpower;
    private int health;
    private int damage;

    public Hero(String superpower, int health, int damage){
        this.superpower = superpower;
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    // getters
    public String getSuperpower() {
        return superpower;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }
}

