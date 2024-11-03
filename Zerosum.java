public class Zerosum
{
    private int balance = 0;
    private final int Calories_throughout_the_Day = 1000;

    public synchronized void gainCalories()
    {
        for (int i = 0; i < Calories_throughout_the_Day; i++)
        {
            balance++;
        }
    }

    public synchronized void burnCalories()
    {
        for (int i = 0; i < Calories_throughout_the_Day; i++)
        {
            balance--;
        }
    }

    public static void main(String[] args)
    {
        Zerosum zeroSum = new Zerosum();

        Thread gainThread = new Thread(zeroSum::gainCalories);
        Thread burnThread = new Thread(zeroSum::burnCalories);

        gainThread.start();
        burnThread.start();

        try
        {
            gainThread.join();
            burnThread.join();
        }
        
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Final calories balance at the end of the day is: " + zeroSum.balance);
    }
}
