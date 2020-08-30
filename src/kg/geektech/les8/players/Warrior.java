package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero {
    // Warrior каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

     //  for (int i = 0; i < heroes.length; i++) {
            Random r = new Random();
            int nKol = r.nextInt(3) + 2; //2,3.4
            if (this.getHealth() > 0) {
               // this.setDamage(this.getDamage() * nKol);
               boss.setHealth(boss.getHealth() - (this.getDamage()*nKol));
            //}
            System.out.println(nKol + " Warrior"); //для себя


        }
    }


}
