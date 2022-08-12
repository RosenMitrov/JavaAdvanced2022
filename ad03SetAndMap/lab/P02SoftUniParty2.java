package JavaAdvanced.ad03SetAndMap.lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//created by R.M.
public class P02SoftUniParty2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> allGuests = new TreeSet<>();

        String invited = scanner.nextLine();

        while (!invited.equals("PARTY")) {
            int length = invited.length();

            if (!allGuests.contains(invited) && length == 8) {
                //invited guests
                allGuests.add(invited);
            }
            invited = scanner.nextLine();
        }

        String comingGuest = scanner.nextLine();

        while (!comingGuest.equals("END")) {
            int length = comingGuest.length();
            char firstLetter = comingGuest.charAt(0);
            if (allGuests.contains(comingGuest) && length == 8) {
                //Guests who come will be removed from the list
                allGuests.remove(comingGuest);
            }
            comingGuest = scanner.nextLine();
        }

        // Count of guests who did not come to the party
        System.out.println(allGuests.size());
        //all guests who did not come to the party
        if (!allGuests.isEmpty()) {
            //VIP guests will be printed first, as names start with a number that is before all letters in the ASCII table
            System.out.println(String.join(System.lineSeparator(), allGuests));
        }
//        for (String guest : allGuests) {
//            System.out.println(VIPGuest);
//        }
    }
}
