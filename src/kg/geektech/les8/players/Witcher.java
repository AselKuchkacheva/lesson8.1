package kg.geektech.les8.players;

public class Witcher extends Hero {

   // Добавить еще игрока Witcher, не наносит урон боссу, но получает урон от босса.
   // Имеет 1 шанс оживить первого погибшего героя, отдав ему свою жизнь, при этом погибает сам.

    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.CAN_GIVE_LIVE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0) {
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
            }
        }
    }
}
