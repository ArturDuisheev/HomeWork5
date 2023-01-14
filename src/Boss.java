public class Boss {
    private String typeDefence;
    private int health;
    private int damage;

    // getters and setters for typeDefence:
    public Boss(String typeDefence, int health, int damage){
        this.typeDefence = typeDefence;
        this.health = health;
        this.damage = damage;
    }

    // getters and setters for typeDefence:
    public String getTypeDefence() {
        return typeDefence;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }

    // getters and setters for health:


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // getters and setters for damage:


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}




