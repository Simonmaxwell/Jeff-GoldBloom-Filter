import java.util.Scanner;

public class TheAction {


    public static void main(String[] args){

        TheDirector oldJeff = new TheDirector();

        Scanner maxEatsBees = new Scanner(System.in);
        System.out.println("Movie:");

        marathon(oldJeff);

        String movie = maxEatsBees.nextLine();
        String myMovie = spaghettiStrainer(movie);

        if (oldJeff.wasItWorthIt(myMovie)) {
            System.out.println("Jeff Goldblum might have been in that movie. ");
        }
        else {
            System.out.println("Jeff Goldblum was not in that movie");
        }

    }

    private static void marathon(TheDirector director) {
        for (String movie : moviesWithGoldblum ) {
            String sanitizedMovieName = spaghettiStrainer(movie);
            director.watchMyMovie(sanitizedMovieName);
        }
    }

    private static String spaghettiStrainer(String movie) {
        return movie.replaceAll("[^\\w]", "").toLowerCase();
    }

    private static String[] moviesWithGoldblum = {
        "Thor: Ragnarok",
        "Untitled Wes Anderson Project",
        "Conan",
        "The Cast of 'Suicide Squad'",
        "Independence Day: Resurgence",
        "Unbreakable Kimmy Schmidt",
        "Kimmy Meets a Celebrity!",
        "Call of Duty: Black Ops III",
        "Inside Amy Schumer",
        "12 Angry Men Inside Amy Schumer",
        "Portlandia",
        "You Can Call Me Al",
        "Seaworld",
        "Late in Life Drug Use",
        "Pull-Out King",
        "Celery",
        "Mortdecai",
        "Last Week Tonight with John Oliver",
        "Civil Forfeiture",
        "The Grand Budapest Hotel",
        "Le Week-End",
        "The League",
        "A Krampus Carol",
        "Thanksgiving",
        "Zambezia",
        "Glee",
        "On My Way",
        "Heart",
        "Tim and Eric's Billion Dollar Movie",
        "Susan 313",
        "Allen Gregory",
        "Van Moon Rising",
        "NTSF:SD:SUV",
        "Full Hauser",
        "Morning Glory",
        "The Switch",
        "Law &amp; Order: Criminal Intent",
        "Three-in-One",
        "Inhumane Society",
        "Palimpsest",
        "The Mobster Will See You Now",
        "True Legacy",
        "Adam Resurrected",
        "Raines",
        "Closure",
        "Inner Child",
        "5th Step",
        "Stone Dead",
        "Reconstructing Alice",
        "Man of the Year",
        "Fay Grim",
        "Mini's First Time",
        "Will &amp; Grace",
        "Dance Cards &amp; Greeting Cards",
        "Bully Woolley",
        "Board Games",
        "Crank Yankers",
        "Episode #3.15",
        "Episode #2.1",
        "Tom Goes to the Mayor",
        "Toodle Day",
        "The Life Aquatic with Steve Zissou",
        "Spinning Boris",
        "Dallas 362",
        "Friends",
        "The One with the Mugging",
        "War Stories",
        "Robbie the Reindeer in Legend of the Lost Tribe",
        "Igby Goes Down",
        "King of the Hill",
        "The Substitute Spanish Prisoner",
        "Run Ronnie Run",
        "Cats &amp; Dogs",
        "Perfume",
        "One of the Hollywood Ten",
        "Chain of Fools",
        "Auggie Rose",
        "The Prince of Egypt",
        "Mr. Show with Bob and David",
        "Like Chickens... Delicious Chickens",
        "Holy Man",
        "The Larry Sanders Show",
        "Just the Perfect Blendship",
        "Nothing Personal",
        "The Lost World: Jurassic Park",
        "Jurassic Park: Chaos Island",
        "Independence Day",
        "Goosebumps: Escape from Horrorland",
        "Mad Dog Time",
        "Independence Day",
        "The Great White Hype",
        "The Simpsons",
        "A Fish Called Selma",
        "Powder",
        "Nine Months",
        "Hideaway",
        "The Stand",
        "The Plague",
        "Lush Life",
        "Jurassic Park",
        "Shooting Elizabeth",
        "Deep Cover",
        "Fathers &amp; Sons",
        "Captain Planet and the Planeteers",
        "Mission to Save Earth: Part 2",
        "Mission to Save Earth: Part 1",
        "Don't Drink the Water",
        "Skumm Lord",
        "Rain of Terror",
        "The Favour, the Watch and the Very Big Fish",
        "Framed",
        "Mister Frost",
        "Sesame Street",
        "Episode #21.72",
        "Twisted Obsession",
        "The Tall Guy",
        "Earth Girls Are Easy",
        "Vibes",
        "Horizon",
        "The Race for the Double Helix",
        "Beyond Therapy",
        "The Fly",
        "The Ray Bradbury Theatre",
        "The Town Where No One Got Off",
        "Transylvania 6-5000",
        "Silverado",
        "Into the Night",
        "Faerie Tale Theatre",
        "The Three Little Pigs",
        "The Adventures of Buckaroo Banzai Across the 8th Dimension",
        "Ernie Kovacs: Between the Laughter",
        "American Playhouse",
        "Popular Neurotics",
        "The New Show",
        "Episode #1.1",
        "The Right Stuff",
        "The Big Chill",
        "The Devlin Connection",
        "The Absolute Monarch of Ward C",
        "Rehearsal for Murder",
        "Laverne &amp; Shirley",
        "Watch the Fur Fly",
        "Threshold",
        "The Legend of Sleepy Hollow",
        "Tenspeed and Brown Shoe",
        "Diamonds Aren't Forever",
        "The Treasure of Sierra Madre Street",
        "Untitled",
        "This One's Gonna Kill Ya",
        "Loose Larry's List of Losers",
        "Invasion of the Body Snatchers",
        "Thank God It's Friday",
        "Remember My Name",
        "Between the Lines",
        "Annie Hall",
        "Starsky and Hutch",
        "Murder on Stage 17",
        "The Sentinel",
        "The Blue Knight",
        "Upward Mobility",
        "St. Ives",
        "Special Delivery",
        "Next Stop, Greenwich Village",
        "Columbo",
        "A Case of Immunity",
        "Nashville",
        "California Split",
        "Death Wish"
    };


}
