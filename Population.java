public class Population {
    public static void main(String[] args) {
        long population1 = 8_000_000_000L;      
        double growthrate = 0.008;             

        
        long population2 = (long)(population1 * (1 + growthrate));
        long population3 = (long)(population1 * (2 + growthrate));
        long population4 = (long)(population1 * (3 + growthrate));
        long population5 = (long)(population1 * (4 + growthrate));

        System.out.printf("Population after 1 year: %d%n", population2);
        System.out.printf("Population after 2 years: %d%n", population3);
        System.out.printf("Population after 3 years: %d%n", population4);
        System.out.printf("Population after 4 years: %d%n", population5);
    }
}