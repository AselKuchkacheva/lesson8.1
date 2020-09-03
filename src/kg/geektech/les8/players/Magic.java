package kg.geektech.les8.players;

import java.util.Random;

//Magic должен увеличивать атаку каждого героя после каждого раунда
//на n-ное количество Magic должен увеличивать атаку каждого героя

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            Random r = new Random();
            int nKol = r.nextInt(6) + 5; //5,6,7,8,9,10
            if (heroes[i].getHealth() > 0){
                heroes[i].setDamage(heroes[i].getDamage() + nKol);
            }
            System.out.println(nKol); //для себя

        }


    }


}
