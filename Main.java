public class Main {
    public static void main(String[] args) {
        Feeder feeder = new Feeder(500);
        System.out.println(feeder.simulateOneDay(12));
        feeder = new Feeder(1000);
        System.out.println(feeder.simulateOneDay(22));
        feeder = new Feeder(100);
        System.out.println(feeder.simulateOneDay(5));
        
        feeder = new Feeder(2400);
        System.out.println(feeder.simulateManyDays(10, 4));
        feeder = new Feeder(250);
        System.out.println(feeder.simulateManyDays(10, 5));
        feeder = new Feeder(0);
        System.out.println(feeder.simulateManyDays(5, 10));
   }
}