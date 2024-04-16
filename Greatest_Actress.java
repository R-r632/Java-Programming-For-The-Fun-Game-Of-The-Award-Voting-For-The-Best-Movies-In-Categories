import java.util.*;
public class Greatest_Actress 
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Actress Of All Time With Their Film:-");
    System.out.println("1.Katherine Hepburn:The Lion In Winter");
    System.out.println("2.Vivien Leigh:Gone With The Wind");
    System.out.println("3.Ingrid Bergman:Casablanca");
    System.out.println("4.Sophia Loren:Two Women");
    System.out.println("5.Meryl Streep:Kramer V/s Kramer");
    System.out.println("6.Cate Blanchett:The Blue Jasmine");
    System.out.println("7.Audrey Hepburn:My Fair Lady");
    System.out.println("8.Jodie Foster:The Silence Of the Lambs");
    System.out.println("9.Elizabeth Taylor:Cleopatra");
    System.out.println("10.Marylyn Monroe:All About Eve");
    System.out.println("11.Bette Davis:All About Eve");
    System.out.println("12.Julianne Moore:Still Alice");
    System.out.println("13.Madhabi Mukherjee:Charulata");
    System.out.println("14.Sigourney Weaver:Alien");
    System.out.println("15.Julie Andrews:Mary Poppins");
    System.out.println("16.Anne Hathaway:Les Miserables");
    System.out.println("17.Kate Winslet:Eternal Sunshine Of The Spotless Mind");
    System.out.println("18.Natalie Portman:Black Swan");
    System.out.println("19.Jennifer Lawrence:Silver Lining Playbook");
    System.out.println("20.Amy Adams:American Hustle");
    System.out.println("21.Shirley MacLaine:Terms Of Endurement");
    System.out.println("22.Hilary Swank:Million Dollar Baby");
    System.out.println("23.Frances McDormand:Fargo");
    System.out.println("24.Marion Cotillard:La Vi'en Rose");
    System.out.println("25.Julia Roberts:Erin Brokovich");
    System.out.println("26.Saoirse Ronan:Lady Bird");
    System.out.println("27.Sally Field:Norma Rae");
    System.out.println("28.Grace Kelly:High Noon");
    System.out.println("29.Helen Mirren: The Queen");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Katherine Hepburn:The Lion In Winter",0);
    movie.put("Vivien Leigh:Gone With The Wind",0);
    movie.put("Ingrid Bergman:Casablanca",0);
    movie.put("Sophia Loren:Two Women",0);
    movie.put("Meryl Streep:Kramer V/s Kramer",0);
    movie.put("Cate Blanchett:The Blue Jasmine",0);
    movie.put("Audrey Hepburn:My Fair Lady",0);
    movie.put("Jodie Foster:The Silence Of the Lambs",0);
    movie.put("Elizabeth Taylor:Cleopatra",0);
    movie.put("Marylyn Monroe:All About Eve",0);
    movie.put("Bette Davis:All About Eve",0);
    movie.put("Julianne Moore:Still Alice",0);
    movie.put("Madhabi Mukherjee:Charulata",0);
    movie.put("Sigourney Weaver:Alien",0);
    movie.put("Julie Andrews:Mary Poppins",0);
    movie.put("Anne Hathaway:Les Miserables",0);
    movie.put("Kate Winslet:Eternal Sunshine Of The Spotless Mind",0);
    movie.put("Natalie Portman:Black Swan",0);
    movie.put("Jennifer Lawrence:Silver Lining Playbook",0);
    movie.put("Amy Adams:American Hustle",0);
    movie.put("Shirley MacLaine:Terms Of Endurement",0);
    movie.put("Hilary Swank:Million Dollar Baby",0);
    movie.put("Frances McDormand:Fargo",0);
    movie.put("Marion Cotillard:La Vi'en Rose",0);
    movie.put("Julia Roberts:Erin Brokovich",0);
    movie.put("Saoirse Ronan:Lady Bird",0);
    movie.put("Sally Field:Norma Rae",0);
    movie.put("Grace Kelly:High Noon",0);
    movie.put("Helen Mirren: The Queen",0);
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