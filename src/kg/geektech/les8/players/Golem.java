package kg.geektech.les8.players;

public class Golem extends Hero {

    public Golem(int health, int damage) {

        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        int partOfBossDamage = boss.getDamage()/5;

            boss.setHealth(boss.getHealth() - partOfBossDamage);

        System.out.println("Golems damage = " + partOfBossDamage );

    }
}
