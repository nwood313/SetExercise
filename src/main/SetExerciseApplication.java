package main;

import java.io.IOException;
import java.util.Set;


public class SetExerciseApplication {


    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService();

		// extract the data from the CSV
		Set<String> winningHands = fileService.readPokerHands("PokerHands.csv");
        System.out.println("The World Poker Tour Presents: ");
        displaySet(winningHands);


        // remove ACE HIGH and QUEEN HIGH

        removeHands(winningHands, "ACE HIGH");
        removeHands(winningHands, "QUEEN HIGH");
		System.out.println("-------");
		System.out.println("After the quick commercial break: NO ACES OR QUEENS");
        displaySet(winningHands);

        // Update PAIR to DEUCES

        changeHands(winningHands,"PAIR","DEUCES");
		System.out.println("-------");
		System.out.println("YOU AIN'T GOT NO PAIRS; THEY'RE DEUCES NOW");
		displaySet(winningHands);
    }


    private static void displaySet(Set<String> set) {
        for (String item : set) {
            System.out.println(item);
        }
    }

    public static void removeHands(Set<String> set, String... items) {
        for (String item : items)
            set.remove(item);
    }

    public static void changeHands(Set<String> set, String oldHand, String newHand) {
        if (set.remove(oldHand)){
			set.add(newHand);
    }
}

}

//		public static void printToConsole() {
//
//	}
//	public static Set<String> extractDataFromCSV(String fileName) {
//
//		return null;
//	}