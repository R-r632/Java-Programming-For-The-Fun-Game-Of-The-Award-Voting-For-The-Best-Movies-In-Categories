import java.util.*;
public class Film_Editing 
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Cinematography Of All Time:-");
    System.out.println("1.Ben-Hur");
    System.out.println("2.West Side Story");
    System.out.println("3.Lawrence Of Arabia");
    System.out.println("4.Raging Bull");
    System.out.println("5.The French Connection");
    System.out.println("6.Apocalypse Now");
    System.out.println("7.Jaws");
    System.out.println("8.Crouching Tiger Hidden Dragon");
    System.out.println("9.The Aviator");
    System.out.println("10.Everything Everywhere All At Once");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Ben-Hur",0);
    movie.put("West Side Story",0);
    movie.put("Lawrence Of Arabia",0);
    movie.put("Raging Bull",0);
    movie.put("The French Connection",0);
    movie.put("Apocalypse Now",0);
    movie.put("Jaws",0);
    movie.put("Crouching Tiger Hidden Dragon",0);
    movie.put("The Aviator",0);
    movie.put("Everything Everywhere All At Once",0);
    System.out.println("\n\n");
    int numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        String vote = in.nextLine();
        if (movie.containsKey(vote))
        {
            movie.put(vote, movie.get(vote) + 1);
            System.out.println("Thank you for your vote!");
        } 
        else
        {
            System.out.println("Invalid vote! Please vote for Movie Mentioned In List");
            i--; 
        }
    }
    System.out.println("\nVoting Results:");
    for (Map.Entry<String, Integer> entry : movie.entrySet()) 
    {
        System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
    }
    int maxVotes = 0;
    String winner = "";
    for (Map.Entry<String, Integer> entry : movie.entrySet()) 
    {
        if (entry.getValue() > maxVotes) 
        {
            maxVotes = entry.getValue();
            winner = entry.getKey();
        }
    }
    System.out.println("\nThe winner is: " + winner);
    in.close();
    }
}