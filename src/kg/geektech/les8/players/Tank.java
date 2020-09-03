package kg.geektech.les8.players;

public class Tank extends Hero {

//Добавить еще игрока, Tank, который имеет увеличенную жизнь но слабый удар.
//Может принимать на себя 1/5 часть урона исходящего от босса по другим игрокам.

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.TAKE_HIT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (!Thor.bossBlock) {
        this.setHealth(this.getHealth() - ((boss.getDamage()/5)*heroes.length));
               for (int i = 0; i < heroes.length; i++) {
               heroes[i].setHealth(heroes[i].getHealth() + (boss.getDamage() / 5));
           }
       }

    }
}
