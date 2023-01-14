import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("============ This code makes DuisheevArtur =========== \n");
        for (int i = 0; i < createHeroes().length; i++) {
            Hero hero = createHeroes()[i];
            System.out.println("Health: " + hero.getHealth() + " Damage: " + hero.getDamage());
        }
        System.out.println("\n ============ Dont copy pls, otherwise I'll be offended =========== \n");
        Boss boss = new Boss("Thor", 93, 30);
        System.out.println("Health: " + boss.getHealth() + " Damage: " + boss.getDamage() + " TypeDefence: " + boss.getTypeDefence());
    }
    public static Hero[] createHeroes(){
        Hero firstHero = new Hero(310,14);
        Hero secondHero = new Hero(150,10);
        Hero thirdHero = new Hero(200,20);
        Hero[] heroes = new Hero[]{firstHero, secondHero, thirdHero};
        return heroes;
    }
}