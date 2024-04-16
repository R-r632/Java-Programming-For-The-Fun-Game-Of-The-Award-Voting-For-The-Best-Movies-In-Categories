import java.util.*;
public class Original_Screenplay 
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Original Screenplay Of All Time:-");
    System.out.println("1.Network");
    System.out.println("2.Citizen Kane");
    System.out.println("3.Inception");
    System.out.println("4.Eternal Sunshine Of The Spotless Mind");
    System.out.println("5.2001:A Space Odyssey");
    System.out.println("6.Parasite");
    System.out.println("7.Annie Hall");
    System.out.println("8.Pulp Fiction");
    System.out.println("9.Get Out");
    System.out.println("10.Django Unchained");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Network",0);
    movie.put("Citizen Kane",0);
    movie.put("Inception",0);
    movie.put("Eternal Sunshine Of The Spotless Mind",0);
    movie.put("2001:A Space Odyssey",0);
    movie.put("Parasite",0);
    movie.put("Annie Hall",0);
    movie.put("Pulp Fiction",0);
    movie.put("Get Out",0);
    movie.put("Django Unchained",0);
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