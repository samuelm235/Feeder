public class Main
{
    public static void main(String[] args)
    {
        Feeder a = new Feeder(2400);
        System.out.println("number of days birds/bears found food: " + a.simulateManyDays(10, 4));
        Feeder b = new Feeder(250);
        System.out.println("number of days birds/bears found food: " + b.simulateManyDays(10, 5));
        Feeder c = new Feeder(0);
        System.out.println("number of days birds/bears found food: " + c.simulateManyDays(5, 10));
        Feeder d = new Feeder(500);
        d.simulateOneDay(12);
        System.out.println("Food left: " + d.getCurrentFood());
        Feeder e = new Feeder(1000);
        e.simulateOneDay(22);
        System.out.println("Food left: " + e.getCurrentFood());
        Feeder f = new Feeder(100);
        f.simulateOneDay(5);
        System.out.println("Food left: " + f.getCurrentFood());

    }
}