package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        ArrayList tester = new ArrayList();
        ArrayList<String> standardDeck = new ArrayList<>(Arrays.asList(
                "Spade Two", "Spade Three", "Spade Four", "Spade Five", "Spade Six", "Spade Seven", "Spade Eight", "Spade Nine", "Spade Ten", "Spade Jack", "Spade Queen", "Spade King", "Spade Ace" +
                        "Club Two", "Club Three", "Club Four", "Club Five", "Club Six", "Club Seven", "Club Eight", "Club Nine", "Club Ten", "Club Jack", "Club Queen", "Club King", "Club Ace" +
                        "Heart Two", "Heart Three", "Heart Four", "Heart Five", "Heart Six", "Heart Seven", "Heart Eight", "Heart Nine", "Heart Ten", "Heart Jack", "Heart Queen", "Heart King", "Heart Ace" +
                        "Diamond Two", "Diamond Three", "Diamond Four", "Diamond Five", "Diamond Six", "Diamond Seven", "Diamond Eight", "Diamond Nine", "Diamond Ten", "Diamond Jack", "Diamond Queen", "Diamond King", "Diamond Ace"));
        int i = 0;
        System.out.println("How many of each suit (would you like to double the deck)");
        int totAmount = sc1.nextInt();
        if(totAmount <= 3){
            while(standardDeck.contains("Diamond")){
                if(standardDeck.contains("Diamond"))
                    standardDeck.remove(i);
                    i++;
            }
            i = 0;
            if(totAmount <= 2){
                while(standardDeck.contains("Heart")){
                    if(standardDeck.contains("Heart"))
                        standardDeck.remove(i);
                    i++;
                }
                i = 0;
                if(totAmount <= 1){
                    while(standardDeck.contains("Club")){
                        if(standardDeck.contains("Club"))
                            standardDeck.remove(i);
                        i++;
                    }
                }
            }
        }
        i = 0;
        System.out.println("How manny different suits?");
        int Suitamout = sc2.nextInt();
        System.out.println("Please center lowest and highest values (lowest 2 highest 10)");
        System.out.println("Lowest");
        int lowest = sc3.nextInt();
        System.out.println("Highest");
        int higest = sc4.nextInt();
        System.out.println("Would you like standard face cards in the deck?");
        System.out.println("Yes or no?");
        String faceQ = sc5.nextLine().toLowerCase();
        System.out.println("Would you like 1 joker card in the deck?");
        System.out.println("Yes or no?");
        String joker = sc5.nextLine().toLowerCase();
        if(faceQ.equals("yes")){
            tester.add("Joker");
        }
    }
}
