import java.util.Objects; // imports equals tester
import java.util.Scanner; // imports scanner

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("D = Democrat\nR = Republican\nI = Independent\n(other) = Other\nWhat is your party affiliation? ");
        String affiliation = in.nextLine();
        affiliation = affiliation.toUpperCase();
            if (Objects.equals(affiliation, "D"))
            {
                System.out.println("You get a Democratic Donkey.");
            }
            else if (Objects.equals(affiliation, "R"))
            {
                System.out.println("You get a Republican Elephant.");
            }
            else if (Objects.equals(affiliation, "I"))
            {
                System.out.println("You get an independent man.");
            }
            else
            {
                System.out.println("You are not democratic, republican, or independent!");
            }
    }
}
