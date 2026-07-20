public class BuildTime {

    public static void main(String[] args) {

               long numberOfStones = 2_300_000_000l;      
        double weightPerStone = 2.5;           
        double tonsBuiltPerYear = 287_500;     


      
        double totalWeight = numberOfStones * weightPerStone;  
        double yearsTaken = totalWeight / tonsBuiltPerYear;     

        double tonsPerHour = tonsBuiltPerYear / (365 * 24);
        double tonsPerMinute = tonsPerHour / 60;

             
        System.out.printf("Total weight of pyramid: %,.0f tons%n", totalWeight);
        
   
        System.out.printf("Years taken to build: %.2f years%n", yearsTaken);
        
        
        System.out.printf("Equivalent building rate: %.4f tons per hour%n", tonsPerHour);
        System.out.printf("                        %.4f tons per minute%n", tonsPerMinute);
    }
}