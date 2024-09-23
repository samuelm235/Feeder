public class Main{
    public static void main(String[] args){
    Feeder g = new Feeder(1000);
int random = (int)(Math.random() * 40 + 10);
Feeder i = new Feeder(100);
i.simulateOneDay(5);
System.out.println(i);

//System.out.println(random);
}
}