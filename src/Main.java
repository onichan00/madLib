import java.util.Scanner;

public class Main {
    /*
    This program generates a mad libbed story.
    Author: Maajid
    Date: 10/6/2021
    */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("write a name: ");
        String name1 = input.next();

        System.out.println("write an adjective: ");
        String adjective1 = input.next();

        System.out.println("write an adjective: ");
        String adjective2 = input.next();

        System.out.println("write an adjective: ");
        String adjective3 = input.next();

        System.out.println("write a noun: ");
        String noun1 = input.next();

        System.out.println("write a noun: ");
        String noun2 = input.next();

        System.out.println("write a noun: ");
        String noun3 = input.next();

        System.out.println("write a noun: ");
        String noun4 = input.next();

        System.out.println("write a noun: ");
        String noun5 = input.next();

        System.out.println("write a noun: ");
        String noun6 = input.next();

        System.out.println("write a name: ");
        String name2 = input.next();

        System.out.println("wite a place");
        String place1 = input.next();

        System.out.println("write a number");
        int number = input.nextInt();

        System.out.println("write a verb");
        String verb1 = input.next();

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
