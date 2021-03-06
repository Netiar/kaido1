public class Monster {


        private String name;
        private int personId;
        private int id;
        private int foodLevel;
        private int sleepLevel;
        private int playLevel;

        public static final int MAX_FOOD_LEVEL = 3;
        public static final int MAX_SLEEP_LEVEL = 8;
        public static final int MAX_PLAY_LEVEL = 12;
        public static final int MIN_ALL_LEVELS = 0;




        public Monster(String name, int personId) {
                this.name = name;
                this.personId = personId;
                this.playLevel = MAX_PLAY_LEVEL / 2;
                this.sleepLevel = MAX_SLEEP_LEVEL / 2;
                this.foodLevel = MAX_FOOD_LEVEL / 2;
        }



        public int getPlayLevel(){
                return playLevel;
        }
        public int getSleepLevel(){
                return sleepLevel;
        }
        public int getFoodLevel(){
                return foodLevel;
        }

        public boolean isAlive() {
                if (foodLevel <= MIN_ALL_LEVELS ||
                        playLevel <= MIN_ALL_LEVELS ||
                        sleepLevel <= MIN_ALL_LEVELS) {
                        return false;
                }
                return true;
        }

        public void depleteLevels(){
                playLevel--;
                foodLevel--;
                sleepLevel--;
        }

        public void play(){
                playLevel++;
        }

        public void sleep(){
                sleepLevel++;
        }

        public void feed(){
                foodLevel++;
        }


}
