package src.main.java.org.week4.day5.regex.ReplaceAndModifyStrings;
import java.util.Scanner;

public class MultipleSpacesWithSingleSpace {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a text");
        String input = cs.nextLine();
        String replacedText = input.replaceAll("\\s+"," ");
        System.out.println(replacedText);
    }
}
