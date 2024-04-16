import java.util.*;
public class Visual_Effects 
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Adapted Screenplay Of All Time:-");
    System.out.println("1.The War Of The Worlds");
    System.out.println("2.Ben-Hur");
    System.out.println("3.Fantastic Voyage");
    System.out.println("4.2001:A Space Odyssey");
    System.out.println("5.The Poseidon Adventure");
    System.out.println("6.Star Wars");
    System.out.println("7.Terminator 2:Judgment Day");
    System.out.println("8.The Matrix");
    System.out.println("9.Avatar");
    System.out.println("10.Interstellar");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("The War Of The Worlds",0);
    movie.put("Ben-Hur",0);
    movie.put("Fantastic Voyage",0);
    movie.put("The Matrix",0);
    movie.put("2001:A Space Odyssey",0);
    movie.put("The Poseidon Adventure",0);
    movie.put("Star Wars",0);
    movie.put("Terminator 2:Judgment Day",0);
    movie.put("Avatar",0);
    movie.put("Interstellar",0);
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