public class Main{
    public static void main(String[] args){
int random_birds = (int)(Math.random() * 40 + 10);
Feeder i = new Feeder(10000);
System.out.println("number of days birds/bears found food: " + i.simulateManyDays(random_birds, 100));

System.out.println("Amount of birds: " + random_birds);
}
}