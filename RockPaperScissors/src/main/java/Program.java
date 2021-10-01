
/**
 * @author Ignotas Burba
 * @version 01.10.2021
 */

//A program which runs the game
public class Program {
    public static void main(String[] args) throws Exception {
        IGame _game = new RockPaperScissors();
        _game.start();
    }
}