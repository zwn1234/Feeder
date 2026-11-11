public class Feeder {
   private int currentFood;

    public Feeder(int Food) {
        currentFood = Food;
    }

    public int simulateOneDay(int numBirds) {
        double condition = Math.random();
        if (condition < 0.05) {
            currentFood = 0;
        } else {
            int eachBirdEats = (int) (Math.random() * 41) + 10;
            int totalEaten = numBirds * eachBirdEats;
            if (totalEaten > currentFood) {
                currentFood = 0;
            } else {
                currentFood -= totalEaten;
            }
        }
        return currentFood;
    }

    public int simulateManyDays(int numBirds, int numDays) {
        for (int daysSoFar = 0; daysSoFar < numDays; daysSoFar++) {
            if (currentFood == 0) {
                return daysSoFar;
            }
            simulateOneDay(numBirds);
        }
        return numDays;
    }    
}