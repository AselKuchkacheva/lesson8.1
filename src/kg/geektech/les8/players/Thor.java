package kg.geektech.les8.players;


import kg.geektech.les8.game.RPG_Game;

import java.util.Random;

public class Thor extends Hero {

    public static boolean bossBlock = false;

   // Добавить еще игрока, Thor, удар по боссу имеет шанс оглушить босса на 1 раунд,
   // вследствие чего босс пропускает 1 раунд и не наносит урон героям.

    public Thor(int health, int damage) {

        super(health, damage, SuperAbility.BLOCK_BOSS);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

      Random r = new Random();
        int shans = r.nextInt(2) + 1; //0, 1, 2
        if (shans == 1) {
            System.out.println("Boss blocked. ");
            bossBlock = true;
        } else {
            System.out.println("Boss not blocked. ");
            bossBlock = false;
        }


    }
}
