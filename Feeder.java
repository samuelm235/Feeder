
public class Feeder {
    public int currentFood;
    public Feeder(int c)
    {
        currentFood = c;
    }

    public int getCurrentFood()
    {
        return currentFood;
    }



    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        if(Math.random() < 0.05) 
        {
            currentFood = 0; 
            System.out.println("BEAR BEAR BEAR BEAR BEAR");
        }
        else
        {
            int eaten = (int)((Math.random() * 41) + 10);
            currentFood -= eaten * numBirds;
            if(currentFood < 0) currentFood = 0;
        }

    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
        int days = 0;
        while (numDays > 0 )
        {
            simulateOneDay(numBirds);
            numDays --;
            if (currentFood == 0) return days;
            days ++;
        }
        return days;
    }
    public String toString()
    {
        return "Current Food: " + currentFood;
    }


}
