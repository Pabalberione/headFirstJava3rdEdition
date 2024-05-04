package Chapter5.realStartupGame;

import Chapter5.realStartupGame.GameHelper;//Cambiar este import ya que el metodo se va a encontrar en otra carpeta

import java.util.ArrayList;

public class StartupBust {
    //Declare and initialize the variables we'll need
    private GameHelper helper = new GameHelper();//Cambiar los metodos ya que están siendo llamados desde otra carpeta
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        Startup one = new Startup();//Make three Startup objects, give'em names, and stick'em in the ArrayList
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three Startups.");//Print brief instructions for user
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(Startup startup: startups){//Repeat with each startup in the list
            ArrayList<String> newLocation = helper.placeStartup(3);//Ask the helper for a Startup location
            startup.setLocationCells(newLocation);//Call the setter method on this Startup to givve it the location you just got from the helper
        }
    }

    private void startPlaying(){
        while (!startups.isEmpty()){//As long as the Startup list is NOT empty
            String userGuess = helper.getUserInput("Enter a guess");//Get user input
            checkUserGuess(userGuess);//Call our own checkUserGuess method
        }
        finishGame();//Call our own finishGame method
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;//Increment the number of guesses the user has made
        String result = "miss";//Assume it's a "miss" unless told otherwise

        for(Startup startupToTest:startups){//Repeat with all Startups in the list
            result = startupToTest.checkYourself(userGuess);//Ask the Startup to check the user guess, looking for a hit(or kill)
            if(result.equals("hit")){
                break;//Get out of the loop early, no point in testing the others
            }
            if(result.equals("kill")){
                startups.remove(startupToTest);//This one's dead, so take it out of the Startups list then get out of the loop
                break;
            }
        }
        System.out.println(result);//Print the result for user
    }

    private void finishGame(){
        System.out.println("All Startups are dead! Your stock is now worthless");//Print a message telling the user how they did in the game.
        if(numOfGuesses < 18){
            System.out.println("It only took you " + numOfGuesses + "guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        StartupBust game = new StartupBust();//Create the game object
        game.setUpGame();//Tell the game object to set up the game
        game.startPlaying();//Tell the game object to start the main game play loop(keeps asking for user input and checking the guess)
    }
}
