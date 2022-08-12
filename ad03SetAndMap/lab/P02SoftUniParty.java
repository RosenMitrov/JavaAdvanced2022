package JavaAdvanced.ad03SetAndMap.lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//created by R.M.
public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> VIP = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String invited = scanner.nextLine();

        while (!invited.equals("PARTY")) {
            int length = invited.length();
            char firstLetter = invited.charAt(0);

            if (!VIP.contains(invited) && Character.isDigit(firstLetter) && length == 8) {
                //VIP guests
                VIP.add(invited);
            } else if (!regular.contains(invited) && !Character.isDigit(firstLetter) && length == 8) {
                //Regular guests
                regular.add(invited);
            }
            invited = scanner.nextLine();
        }

        String comingGuest = scanner.nextLine();


        while (!comingGuest.equals("END")) {
            int length = comingGuest.length();
            char firstLetter = comingGuest.charAt(0);
            if (VIP.contains(comingGuest) && Character.isDigit(firstLetter) && length == 8) {
                //VIP guests
                VIP.remove(comingGuest);
            } else if (regular.contains(comingGuest) && !Character.isDigit(firstLetter) && length == 8) {
                //Regular guests
                regular.remove(comingGuest);
            }
            comingGuest = scanner.nextLine();
        }
        System.out.println(VIP.size() + regular.size());
        if (!VIP.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), VIP));
        }
        if (!regular.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), regular));
        }
//        for (String VIPGuest : VIP) {
//            System.out.println(VIPGuest);
//        }
//        for (String regularGuest : regular) {
//            System.out.println(regularGuest);
//        }
    }
}
/*
2.	SoftUni Party
There is a party in SoftUni. Many guests are invited, and they are two types: VIP and regular.
When a guest comes, you have to check if he/she exists on any of the two reservation lists.
All reservation numbers will be with 8 chars. All VIP numbers start with a digit.
There will be 2 command lines:
•	First is "PARTY" - the party is on and guests start coming.
•	The second is "END" - then the party is over, and no more guests will come.
The output shows all guests, who didn't come to the party (VIP must be first).

 */