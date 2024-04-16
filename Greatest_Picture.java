import java.util.*;
public class Greatest_Picture
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t\t\t\t\t\tEvery Best Picture Of All Time With Release Year:-");
    System.out.println("1.Battleship Potemkin:1925");
    System.out.println("2.Metropolis:1927");
    System.out.println("3.All Quiet On The Western Front:1930");
    System.out.println("4.La Grande Illusion:1937");
    System.out.println("5.Gone With The Wind:1939");
    System.out.println("6.The Wizard Of Oz:1939");
    System.out.println("7.The Stagecoach:1939");
    System.out.println("8.Citizen Kane:1941");
    System.out.println("9.Casablanca:1942");
    System.out.println("10.Bicycle Thieves:1948");
    System.out.println("11.Singin' In The Rain:1952");
    System.out.println("12.Seven Samurai:1954");
    System.out.println("13.On the Waterfront:1954");
    System.out.println("14.Rear Window:1954");
    System.out.println("15.Pather Panchali:1955");
    System.out.println("16.The Searchers:1956");
    System.out.println("17.Vertigo:1958");
    System.out.println("18.The Bridge On The River Kwai:1957");
    System.out.println("19.Ben-Hur:1959");
    System.out.println("20.Psycho:1960");
    System.out.println("21.La Dolce Vita:1960");
    System.out.println("22.West Side Story:1961");
    System.out.println("23.Lawrence Of Arabia:1962");
    System.out.println("24.8(1/2):1963");
    System.out.println("25.Dr. Strangelove Or How I Stop Worrying And Love The Bomb:1964");
    System.out.println("26.The Sound Of Music:1965");
    System.out.println("27.Persona:1966");
    System.out.println("28.The Battle Of Algiers:1967");
    System.out.println("29.2001: A Space Odyssey:1968");
    System.out.println("30.The French Connection:1971");
    System.out.println("31.The Godfather:1972");
    System.out.println("32.The Exorcist:1973");
    System.out.println("33.Enter The Dragon:1973");
    System.out.println("34.The Godfather:Part 2:1974");
    System.out.println("35.Chinatown:1974");
    System.out.println("36.Taxi Driver:1976");
    System.out.println("37.Star Wars Episode 4: A New Hope:1977");
    System.out.println("38.Apocalypse Now:1979");
    System.out.println("39.Alien:1979");
    System.out.println("40.The Shinning:1980");
    System.out.println("41.Raging Bull:1980");
    System.out.println("42.Star Wars Episode 5:The Empire Strikes Back :1980");
    System.out.println("43.The Raiders Of The Lost Ark:1981");
    System.out.println("44.E.T. The Extra Terrestrial:1982");
    System.out.println("45.Blade Runner:1982");
    System.out.println("46.Goodfellas:1990");
    System.out.println("47.The Silence Of The Lambs:1991");
    System.out.println("48.Terminator 2:Judgment Day:1991");
    System.out.println("49.Schindler's List:1993");
    System.out.println("50.Pulp Fiction:1994");
    System.out.println("51.The Shawshank Redemption:1994");
    System.out.println("52.Titanic:1997");
    System.out.println("53.Saving Private Ryan:1998");
    System.out.println("54.The Gladiator:2000");
    System.out.println("55.Crouching Tiger Hidden Dragon:2000");
    System.out.println("56.Mulholland Drive:2001");
    System.out.println("57.The Lord Of The Rings:The Return Of The King:2003");
    System.out.println("58.The Departed:2006");
    System.out.println("59.There Will Be Blood:2007");
    System.out.println("60.No Country For Old Men:2007");
    System.out.println("61.The Dark Knight:2008");
    System.out.println("62.Les Miserables:2012");
    System.out.println("63.Mad Max:Fury Road:2016");
    System.out.println("65.Parasite:2020");
    System.out.println("66.Everything Everywhere All At Once:2022");
    System.out.println("67.Oppenheimer:2023");
    System.out.println("\n");
    System.out.println("\n");
    Map<String, Integer> movie = new HashMap<>();
    movie.put("Battleship Potemkin:1925",0);
    movie.put("Metropolis:1927",0);
    movie.put("All Quiet On The Western Front:1930",0);
    movie.put("La Grande Illusion:1937",0);
    movie.put("Gone With The Wind:1939",0);
    movie.put("The Wizard Of Oz:1939",0);
    movie.put("The Stagecoach:1939",0);
    movie.put("Citizen Kane:1941",0);
    movie.put("Casablanca:1942",0);
    movie.put("Bicycle Thieves:1948",0);
    movie.put("Singin' In The Rain:1952",0);
    movie.put("Seven Samurai:1954",0);
    movie.put("On the Waterfront:1954",0);
    movie.put("Rear Window:1954",0);
    movie.put("Pather Panchali:1955",0);
    movie.put("The Searchers:1956",0);
    movie.put("Vertigo:1958",0);
    movie.put("The Bridge On The River Kwai:1957",0);
    movie.put("Ben-Hur:1959",0);
    movie.put("Psycho:1960",0);
    movie.put("La Dolce Vita:1960",0);
    movie.put("West Side Story:1961",0);
    movie.put("Lawrence Of Arabia:1962",0);
    movie.put("8(1/2):1963",0);
    movie.put("Dr. Strangelove Or How I Stop Worrying And Love The Bomb:1964",0);
    movie.put("The Sound Of Music:1965",0);
    movie.put(".Persona:1966",0);
    movie.put("The Battle Of Algiers:1967",0);
    movie.put("2001: A Space Odyssey:1968",0);
    movie.put("The French Connection:1971",0);
    movie.put("The Godfather:1972",0);
    movie.put("The Exorcist:1973",0);
    movie.put("Enter The Dragon:1973",0);
    movie.put("The Godfather:Part 2:1974",0);
    movie.put("Chinatown:1974",0);
    movie.put("Taxi Driver:1976",0);
    movie.put("Star Wars Episode 4: A New Hope:1977",0);
    movie.put("Apocalypse Now:1979",0);
    movie.put("Alien:1979",0);
    movie.put("The Shinning:1980",0);
    movie.put("Raging Bull:1980",0);
    movie.put("Star Wars Episode 5:The Empire Strikes Back :1980",0);
    movie.put("The Raiders Of The Lost Ark:1981",0);
    movie.put("E.T. The Extra Terrestrial:1982",0);
    movie.put("Blade Runner:1982",0);
    movie.put("Goodfellas:1990",0);
    movie.put("The Silence Of The Lambs:1991",0);
    movie.put("Terminator 2:Judgment Day:1991",0);
    movie.put("Schindler's List:1993",0);
    movie.put("Pulp Fiction:1994",0);
    movie.put("The Shawshank Redemption:1994",0);
    movie.put("Titanic:1997",0);
    movie.put("Saving Private Ryan:1998",0);
    movie.put("The Gladiator:2000",0);
    movie.put("Crouching Tiger Hidden Dragon:2000",0);
    movie.put("Mulholland Drive:2001",0);
    movie.put("The Lord Of The Rings:The Return Of The King:2003",0);
    movie.put("The Departed:2006",0);
    movie.put("There Will Be Blood:2007",0);
    movie.put("No Country For Old Men:2007",0);
    movie.put("The Dark Knight:2008",0);
    movie.put("Les Miserables:2012",0);
    movie.put("Mad Max:Fury Road:2016",0);
    movie.put("Parasite:2020",0);
    movie.put("Everything Everywhere All At Once:2022",0);
    movie.put("Oppenheimer:2023",0);
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