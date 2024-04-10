import java.util.*;
public class Greatest_Director
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Director Of All Time With Their Film:-");
    System.out.println("1.Martin Scorsese:Goodfellas");
    System.out.println("2.Alfred Hitchcock:Vertigo");
    System.out.println("3.Stanley Kubrick: 2001:A Space Odyssey");
    System.out.println("4.Francis Ford Coppola:The Godfather");
    System.out.println("5.Satyajit Ray:Pather Panchali");
    System.out.println("6.Steven Spielberg:Schindler's List");
    System.out.println("7.Ingmar Bergman:Persona");
    System.out.println("8.Quentin Tarantino:Pulp Fiction");
    System.out.println("9.Akira Korusawa:Seven Samurai");
    System.out.println("10.David Lean:Lawrence Of Arabia");
    System.out.println("11.Orson Welles:Citizen Kane");
    System.out.println("12.Federico Fellini:8(1/2)");
    System.out.println("13.Christopher Nolan:Oppenheimer");
    System.out.println("14.Ridley Scott:Alien");
    System.out.println("15.John Ford:The Searchers");
    System.out.println("16.Roman Polanski:Chinatown");
    System.out.println("17.Jean-Luc Goddard:Breathless");
    System.out.println("18.Andrei Tarkovsky:Solaris");
    System.out.println("19.Charlie Chaplin:The Great Dictator");
    System.out.println("20.George Lucas:Star Wars");
    System.out.println("21.James Cameron:Avatar");
    System.out.println("22.Woody Allen:Annie Hall");
    System.out.println("23.Fritz Lang:Metropolis");
    System.out.println("24.Paul Thomas Anderson:There Will Be Blood");
    System.out.println("25.Sergio Leone:The Good,The Bad And The Ugly");
    System.out.println("26.Alejandro G.Inarritu:Birdman");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Martin Scorsese:Goodfellas",0);
    movie.put("Alfred Hitchcock:Vertigo",0);
    movie.put("Stanley Kubrick: 2001:A Space Odyssey",0);
    movie.put("Francis Ford Coppola:The Godfather",0);
    movie.put("Satyajit Ray:Pather Panchali",0);
    movie.put("Steven Spielberg:Schindler's List",0);
    movie.put("Ingmar Bergman:Persona",0);
    movie.put("Quentin Tarantino:Pulp Fiction",0);
    movie.put("Akira Korusawa:Seven Samurai",0);
    movie.put("David Lean:Lawrence Of Arabia",0);
    movie.put("Orson Welles:Citizen Kane",0);
    movie.put("Federico Fellini:8(1/2)",0);
    movie.put("Christopher Nolan:Oppenheimer",0);
    movie.put("Ridley Scott:Alien",0);
    movie.put("John Ford:The Searchers",0);
    movie.put("Roman Polanski:Chinatown",0);
    movie.put("Jean-Luc Goddard:Breathless",0);
    movie.put("Andrei Tarkovsky:Solaris",0);
    movie.put("Charlie Chaplin:The Great Dictator",0);
    movie.put("George Lucas:Star Wars",0);
    movie.put("James Cameron:Avatar",0);
    movie.put("Woody Allen:Annie Hall",0);
    movie.put("Fritz Lang:Metropolis",0);
    movie.put("Paul Thomas Anderson:There Will Be Blood",0);
    movie.put("Sergio Leone:The Good,The Bad And The Ugly",0);
    movie.put("Alejandro G.Inarritu:Birdman",0);
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