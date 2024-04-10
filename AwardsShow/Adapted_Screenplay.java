import java.util.*;
public class Adapted_Screenplay 
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Adapted Screenplay Of All Time:-");
    System.out.println("1.Gone With The Wind");
    System.out.println("2.The Godfather");
    System.out.println("3.Lawrence Of Arabia");
    System.out.println("4.Casablanca");
    System.out.println("5.A Clockwork Orange");
    System.out.println("6.No Country For Old Men");
    System.out.println("7.The Shawshank Redemption");
    System.out.println("8.The Silence Of The Lambs");
    System.out.println("9.Dr. Strangelove Or How I Stop Worrying And Love The Bomb");
    System.out.println("10.12 Angry Men");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Gone With The Wind",0);
    movie.put("The Godfather",0);
    movie.put("Lawrence Of Arabia",0);
    movie.put("Casablanca",0);
    movie.put("A Clockwork Orange",0);
    movie.put("No Country For Old Men",0);
    movie.put("The Shawshank Redemption",0);
    movie.put("The Silence Of The Lambs",0);
    movie.put("Dr. Strangelove Or How I Stop Worrying And Love The Bomb",0);
    movie.put("12 Angry Men",0);
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