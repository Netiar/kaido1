import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Monstertest {

//Instantiating with Constants

    @Test
    public void monster_instantiatesWithHalfFullPlayLevel(){
        Monster testMonster = new Monster("Bubbles", 1);
        assertEquals(testMonster.getPlayLevel(), (Monster.MAX_PLAY_LEVEL / 2));
    }

    @Test
    public void monster_instantiatesWithHalfFullSleepLevel(){
        Monster testMonster = new Monster("Bubbles", 1);
        assertEquals(testMonster.getSleepLevel(), (Monster.MAX_SLEEP_LEVEL / 2));
    }

    @Test
    public void monster_instantiatesWithHalfFullFoodLevel(){
        Monster testMonster = new Monster("Bubbles", 1);
        assertEquals(testMonster.getFoodLevel(), (Monster.MAX_FOOD_LEVEL / 2));
    }

    @Test
    public void isAlive_confirmsMonsterIsAliveIfAllLevelsAboveMinimum_true(){
        Monster testMonster = new Monster("Bubbles", 1);
        assertEquals(testMonster.isAlive(), true);
    }

    @Test
    public void isAlive_recognizesMonsterIsDeadWhenLevelsReachMinimum_false(){
        Monster testMonster = new Monster("Bubbles", 1);
        for(int i = Monster.MIN_ALL_LEVELS; i <= Monster.MAX_FOOD_LEVEL; i++){
            testMonster.depleteLevels();
        }
        assertEquals(testMonster.isAlive(), false);
    }

    //Interacting with Constants
    @Test
    public void play_increasesMonsterPlayLevel(){
        Monster testMonster = new Monster("Bubbles", 1);
        testMonster.play();
        assertTrue(testMonster.getPlayLevel() > (Monster.MAX_PLAY_LEVEL / 2));
    }

    @Test
    public void sleep_increasesMonsterSleepLevel(){
        Monster testMonster = new Monster("Bubbles", 1);
        testMonster.sleep();
        assertTrue(testMonster.getSleepLevel() > (Monster.MAX_SLEEP_LEVEL / 2));
    }

    @Test
    public void feed_increasesMonsterFoodLevel(){
        Monster testMonster = new Monster("Bubbles", 1);
        testMonster.feed();
        assertTrue(testMonster.getFoodLevel() > (Monster.MAX_FOOD_LEVEL / 2));
    }

    //Anticipating Errors
    @Test
    public void monster_foodLevelCannotGoBeyondMaxValue(){
        Monster testMonster = new Monster("Bubbles", 1);
        for(int i = Monster.MIN_ALL_LEVELS; i <= (Monster.MAX_FOOD_LEVEL + 2); i++){
            testMonster.feed();
        }
        assertTrue(testMonster.getFoodLevel() <= Monster.MAX_FOOD_LEVEL);
    }
}
