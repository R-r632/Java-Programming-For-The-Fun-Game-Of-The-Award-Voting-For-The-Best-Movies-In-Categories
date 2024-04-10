import java.util.*;
public class Awards_Shows_Func
{
    private int numVoters;
    private String vote;
    Awards_Shows_Func()
    {
        numVoters=0;
        vote=" ";
    }
    public void Picture()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void Actor()
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
    Map<String, Integer> actor = new HashMap<>();
    actor.put("Al Pacino:Scent Of A Women",0);
    actor.put("Clark Gable:Gone With The Wind",0);
    actor.put("All Quiet On The Western Front:1930",0);
    actor.put("Humphrey Bogart:Casablanca",0);
    actor.put("Orson Welles:Citizen Kane",0);
    actor.put("John Wayne:True Grit",0);
    actor.put("Charlie Chaplin:The Great Dictator",0);
    actor.put("Robert DeNiro:Taxi Driver",0);
    actor.put("Joe Pesci:Goodfellas",0);
    actor.put("Marlon Brando:The Godfather",0);
    actor.put("Daniel-Day Lewis:Lincolnn",0);
    actor.put("Leonardo DiCaprio:The Aviator",0);
    actor.put("Christian Bale:The Dark Knight",0);
    actor.put("Heath Ledger:The Dark Knight",0);
    actor.put("Henry Fonda:12 Angry Men",0);
    actor.put("Cillian Murphy:Oppenheimer",0);
    actor.put("Robert Downey Jr.:Oppenheimer",0);
    actor.put("Tom Cruise:Jerry Maguire",0);
    actor.put("Clint Eastwood:Unforgiven",0);
    actor.put("Russell Crowe:The Gladiator",0);
    actor.put("Dustin Hoffmann:The Graduate",0);
    actor.put("Marcello Mastroianni:La Dolce Vita",0);
    actor.put("Jack Nicholson:One Flew Over The Cuckoo's Nest",0);
    actor.put("Samuel L Jackson:Pulp Fiction",0);
    actor.put("Joaquin Phoenix:Joker",0);
    actor.put("Robin Williams:Good Will Hunting",0);
    actor.put("Tom Hanks:Forest Gump",0);
    actor.put("Denzel Washington:Malcolm X",0);
    actor.put("Gene Hackmann:The French Connection",0);
    actor.put("Malcolm McDowell:A Clockwork Orange",0);
    actor.put("Alec Guiness:The Bridge On The River Kwai",0);
    actor.put("Peter O'Toole:Lawrence Of Arabia",0);
    actor.put("Anthony Hopkins:The Silence Of the Lambs",0);
    System.out.println("\n\n");
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a actor above mentioned:");
        vote = in.nextLine();
        if (actor.containsKey(vote))
        {
            actor.put(vote, actor.get(vote) + 1);
            System.out.println("Thank you for your vote!");
        } 
        else
        {
            System.out.println("Invalid vote! Please vote for actor Mentioned In List");
            i--; 
        }
    }
    System.out.println("\nVoting Results:");
    for (Map.Entry<String, Integer> entry : actor.entrySet()) 
    {
        System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
    }
    int maxVotess = 0;
    String winners = "";
    for (Map.Entry<String, Integer> entry : actor.entrySet()) 
    {
        if (entry.getValue() > maxVotess) 
        {
            maxVotess = entry.getValue();
            winners = entry.getKey();
        }
    }
    System.out.println("\nThe winner is: " + winners);
    in.close();
    }
    public void Actress()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void Director()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void OScreenplay()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void AScreenplay()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void Vfx()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void Cinematographys()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void Editing()
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
    numVoters = 3;
    for (int i = 0; i < numVoters; i++)
    {
        System.out.println("Voter " + (i+1) + ", please vote for a movie above mentioned:");
        vote = in.nextLine();
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
    public void awards()
    {
        System.out.println("\n\n");
        System.out.println("Above Best Categories In The Above Movies Mention In The List");
    }
    public static void main(String[] args) 
    {   
        try
        {
            Awards_Shows_Func aw=new Awards_Shows_Func();
            /*Greatest_Actor ac=new Greatest_Actor();
            Greatest_Actress act=new Greatest_Actress();
            Greatest_Director dir=new Greatest_Director();
            Original_Screenplay os=new Original_Screenplay();
            Adapted_Screenplay as=new Adapted_Screenplay();
            Cinematography ci=new Cinematography();
            Visual_Effects vf=new Visual_Effects();
            Film_Editing fe=new Film_Editing();*/
            aw.Picture();
            aw.Actor();
            aw.Actress();
            aw.Director();
            aw.OScreenplay();
            aw.AScreenplay();
            aw.Cinematographys();
            aw.Vfx();
            aw.Editing();
            aw.awards();
        }
        catch(Exception e)
        {
            System.out.println("Another thread is not supported");
        }
    }
}