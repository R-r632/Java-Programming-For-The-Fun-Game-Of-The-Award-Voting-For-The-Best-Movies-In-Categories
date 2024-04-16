import java.util.*;
public class Greatest_Actor
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Actor Of All Time With Their Film:-");
    System.out.println("1.Al Pacino:Scent Of A Women");
    System.out.println("2.Clark Gable:Gone With The Wind");
    System.out.println("3.Humphrey Bogart:Casablanca");
    System.out.println("4.Orson Welles:Citizen Kane");
    System.out.println("5.John Wayne:True Grit");
    System.out.println("6.Charlie Chaplin:The Great Dictator");
    System.out.println("7.Robert DeNiro:Taxi Driver");
    System.out.println("8.Joe Pesci:Goodfellas");
    System.out.println("9.Marlon Brando:The Godfather");
    System.out.println("10.Daniel-Day Lewis:Lincolnn");
    System.out.println("11.Leonardo DiCaprio:The Aviator");
    System.out.println("12.Christian Bale:The Dark Knight");
    System.out.println("13.Heath Ledger:The Dark Knight");
    System.out.println("14.Henry Fonda:12 Angry Men");
    System.out.println("15.Cillian Murphy:Oppenheimer");
    System.out.println("16.Robert Downey Jr.:Oppenheimer");
    System.out.println("17.Tom Cruise:Jerry Maguire");
    System.out.println("18.Clint Eastwood:Unforgiven");
    System.out.println("19.Russell Crowe:The Gladiator");
    System.out.println("20.Dustin Hoffmann:The Graduate");
    System.out.println("21.Marcello Mastroianni:La Dolce Vita");
    System.out.println("22.Jack Nicholson:One Flew Over The Cuckoo's Nest");
    System.out.println("23.Samuel L Jackson:Pulp Fiction");
    System.out.println("24.Joaquin Phoenix:Joker");
    System.out.println("25.Robin Williams:Good Will Hunting");
    System.out.println("26.Tom Hanks:Forest Gump");
    System.out.println("27.Denzel Washington:Malcolm X");
    System.out.println("28.Gene Hackmann:The French Connection");
    System.out.println("29.Malcolm McDowell:A Clockwork Orange");
    System.out.println("30.Alec Guiness:The Bridge On The River Kwai");
    System.out.println("31.Peter O'Toole:Lawrence Of Arabia");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Al Pacino:Scent Of A Women",0);
    movie.put("Clark Gable:Gone With The Wind",0);
    movie.put("All Quiet On The Western Front:1930",0);
    movie.put("Humphrey Bogart:Casablanca",0);
    movie.put("Orson Welles:Citizen Kane",0);
    movie.put("John Wayne:True Grit",0);
    movie.put("Charlie Chaplin:The Great Dictator",0);
    movie.put("Robert DeNiro:Taxi Driver",0);
    movie.put("Joe Pesci:Goodfellas",0);
    movie.put("Marlon Brando:The Godfather",0);
    movie.put("Daniel-Day Lewis:Lincolnn",0);
    movie.put("Leonardo DiCaprio:The Aviator",0);
    movie.put("Christian Bale:The Dark Knight",0);
    movie.put("Heath Ledger:The Dark Knight",0);
    movie.put("Henry Fonda:12 Angry Men",0);
    movie.put("Cillian Murphy:Oppenheimer",0);
    movie.put("Robert Downey Jr.:Oppenheimer",0);
    movie.put("Tom Cruise:Jerry Maguire",0);
    movie.put("Clint Eastwood:Unforgiven",0);
    movie.put("Russell Crowe:The Gladiator",0);
    movie.put("Dustin Hoffmann:The Graduate",0);
    movie.put("Marcello Mastroianni:La Dolce Vita",0);
    movie.put("Jack Nicholson:One Flew Over The Cuckoo's Nest",0);
    movie.put("Samuel L Jackson:Pulp Fiction",0);
    movie.put("Joaquin Phoenix:Joker",0);
    movie.put("Robin Williams:Good Will Hunting",0);
    movie.put("Tom Hanks:Forest Gump",0);
    movie.put("Denzel Washington:Malcolm X",0);
    movie.put("Gene Hackmann:The French Connection",0);
    movie.put("Malcolm McDowell:A Clockwork Orange",0);
    movie.put("Alec Guiness:The Bridge On The River Kwai",0);
    movie.put("Peter O'Toole:Lawrence Of Arabia",0);
    movie.put("Anthony Hopkins:The Silence Of the Lambs",0);
    System.out.println("\n\n");
    System.out.print("Enter The Total Number Of Voters: ");
    int numVoters=in.nextInt();
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