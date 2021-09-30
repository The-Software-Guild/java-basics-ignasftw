import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements IGame
{
    //Variables
    //Declare random to generate random integers
    private Random random = new Random();
    //Declare a Scanner which will be used for console input
    private Scanner myObj = new Scanner(System.in);

    //Declare a String array to know what number represent
    String[] _names = {"Rock", "Paper", "Scissors"};

    //Declare int to keep track current round
    private int _currentRound;
    //Declare int to keep track of how many rounds will be played
    private int _maximumRounds;
    //Declare int to keep track of which choice computer has made
    private int _computerChoice;
    //Declare int to keep track of which choice player has made
    private int _playerChoice;

    //Declare int to keep track how many wins the player has
    private int _playerWins;
    //Declare int to keep track how many times the player has lost
    private int _computerWins;
    //Declare int to keep track how many times ties occurred
    private int _ties;

    /**
     * METHOD: Starts a game
     */
    public void Start() throws Exception {
        //Greet the player
        System.out.print("Hello, and welcome to the Rock Paper Scissors");
        //Play the game at least once
        do {
            //Reset the current round count
            _currentRound = 0;
            //Reset the results from previous game
            _playerWins = 0;
            _computerWins = 0;
            _ties = 0;
            System.out.println("\nYou have started a new game.");
            //Get amount of rounds that will be played
            _maximumRounds = NumberInput("Choose round count between 1 and 10:", 1, 10);

            //Engage rounds while the maximum round count is not reached by current rounds
            while(_currentRound!=_maximumRounds)
            {
                EngageRound();
                _currentRound++;
            }

            //Print the overall announcement about the scores
            OverallAnnouncement();

            //Print a question if the player would like to play another game
            System.out.println("Type \"y\" if you would like to play another game. If not enter anything else.");
        }
        while(myObj.next().equals("y"));

        System.out.println("Thank you for playing!");
    }

    /**
     * METHOD: Performs a single round of the game
     */
    private void EngageRound() throws Exception {
        //Request an input from the player
        _playerChoice = ChoiceInput();

        //Generate a computer choice
        _computerChoice = random.nextInt(3)+1;

        //Check if the ties have occurred
        if(_playerChoice == _computerChoice)
        {
            System.out.println("Ties. You both chose " + _names[_playerChoice-1] +".");
            _ties++;
        }
        //Check if the player has lost
        else if(_playerChoice == 3 && _computerChoice == 1 ||
                _playerChoice == 2 && _computerChoice == 3 ||
                _playerChoice == 1 && _computerChoice == 2)
        {
            //Computer wins
            System.out.println("Round lost. " + _names[_playerChoice-1] + " was beaten by " + _names[_computerChoice-1] + ".");
            _computerWins++;
        }
        //The remaining possibility is the player has won
        else
        {
            //Player wins
            System.out.println("Round win. " + _names[_playerChoice-1] + " has beaten " + _names[_computerChoice-1] + ".");
            _playerWins++;
        }
        System.out.println("[A round has finished. Wins: " + _playerWins + " Loses: " + _computerWins + " Ties: " + _ties + "]");
    }

    /**
     * METHOD: Asks the person to input a number within a range with included message
     * @param  message , a question which will be asked before the input
     * @param  minRange , a minimum possible value (included)
     * @param  maxRange , a maximum possible value (included)
     * @return      returns a number within the range, if not exception will be raised
     */
    private int NumberInput(String message, int minRange, int maxRange) throws Exception
    {
        int inputNumber;
        System.out.println(message);
        try{
            inputNumber = myObj.nextInt();
            if( inputNumber < minRange || maxRange < inputNumber){
                throw new Exception("The number is out of range.");
            }
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return inputNumber;
    }

    /**
     * METHOD: Ask the player about input and receive an input
     * @return      int - 1 rock, 2 paper, 3 scissors, other values are invalid
     */
    private int ChoiceInput() throws Exception
    {
        System.out.println("Please enter only one number: 1, 2 or 3:");
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");
        return NumberInput("3 for Scissors", 1, 3);
    }

    /**
     * METHOD: Checks who won and prints overall winning message
     */
    private void OverallAnnouncement()
    {
        if(_playerWins<_computerWins){
            System.out.println("This time the computer is the overall winner.");
        }
        else if(_playerWins>_computerWins)
        {
            System.out.println("You are the overall winner.");
        }
        else{
            System.out.println("The overall result of the game is ties.");
        }
    }
}
