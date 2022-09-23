

public class Mars {
    String colonyName = "Moon";
   static int shipPopulation = 300;
   static double shipFood = 4000.00;
    static boolean landing = true;

    public static void main (String[] args) {
        foodRemain(2);
         System.out.println(shipFood);
         shipFood = shipFood*1.5;
         shipPopulation+=5;
         String landingLocation = "The Ocean";
         if(landingLocation.equalsIgnoreCase("The Plain")){
             System.out.println("Bbzzz Landing on the Plain");
         } else {
             System.out.println("ERROR! Flight plan already set. Landing on the Plain");
         }

         landing = landingCheck(10);
         new GuessingGame();
        new MarsExpedition();
    }
    public static double foodRemain(int days){
        for(int i = 0; i < days; i ++){
            shipFood = shipFood - (shipPopulation*0.75);
        }
        return shipFood;
    }

    public static boolean landingCheck (int loops){
        for (int i = 0; i <= loops; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("keep Center");
            } else if (i % 5 == 0){
                System.out.println("Right");
            } else if (i%3 == 0){
                System.out.println("left");
            } else{
                System.out.println("Calculating");
            };
            try {
                Thread.sleep(1);
            } catch (InterruptedException ignored) {

            }
        };
        System.out.println("landed");
        return false;
    }
   
}
