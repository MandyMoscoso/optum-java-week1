import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FindingLists {
    public FindingLists(){
        try {            
            Thread.sleep(500);
        } catch (InterruptedException ignored) {

        }
        System.out.println("Welcome back from your expedition. Time to catalog everything you found,");

        ArrayList <String> rockList = new ArrayList <String>();

        System.out.println("Rock data downloaded.");
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");
        System.out.println(rockList);

        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list.");
        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("Perfect");

        try {            
            Thread.sleep(500);
        } catch (InterruptedException ignored) {

        }

        HashMap<String, String> fossilDirectory = new HashMap<String, String>();
        System.out.println("Fossil data downloaded");
        fossilDirectory.put("Bird Fossil","The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil","The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth  Fossil","The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if(fossilChoice == "Bird Fossil"){
            System.out.println("Fossil: "+ fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice=="Fish Fossil"){
            System.out.println("Fossil: "+ fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if( fossilChoice == "Tooth Fossil"){
            System.out.println("Fossil: "+ fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        try {            
            Thread.sleep(500);
        } catch (InterruptedException ignored) {

        }
        HashSet<String> suppliesBrought = new HashSet<String>();
        HashSet<String> suppliesUsed = new HashSet<String>();
        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");
        System.out.println("Medicine");

    }
}
