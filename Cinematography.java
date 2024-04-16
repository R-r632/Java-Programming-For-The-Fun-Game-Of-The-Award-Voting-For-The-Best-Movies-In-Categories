import java.util.*;
public class Cinematography 
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Cinematography Of All Time:-");
    System.out.println("1.Ben-Hur");
    System.out.println("2.West Side Story");
    System.out.println("3.Lawrence Of Arabia");
    System.out.println("4.Doctor Zhivago");
    System.out.println("5.Close Encounters Of The Third Kind");
    System.out.println("6.Apocalypse Now");
    System.out.println("7.Titanic");
    System.out.println("8.Crouching Tiger Hidden Dragon");
    System.out.println("9.The Aviator");
    System.out.println("10.All Quiet On The Western Front");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Ben-Hur",0);
    movie.put("West Side Story",0);
    movie.put("Lawrence Of Arabia",0);
    movie.put("Doctor Zhivago",0);
    movie.put("Close Encounters Of The Third Kind",0);
    movie.put("Apocalypse Now",0);
    movie.put("Titanic",0);
    movie.put("Crouching Tiger Hidden Dragon",0);
    movie.put("The Aviator",0);
    movie.put("All Quiet On The Western Front",0);
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