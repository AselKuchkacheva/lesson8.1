package kg.geektech.les8.players;

public class Golem extends Hero {

    //Golem должен получать от босса урон, и потом наносить ему свой урон + часть урона полученного от босса

    public Golem(int health, int damage) {

        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        int partOfBossDamage = (boss.getDamage()*2)/5;

        boss.setHealth(boss.getHealth() - partOfBossDamage);

        System.out.println("Golems damage = " + partOfBossDamage );

    }
}
