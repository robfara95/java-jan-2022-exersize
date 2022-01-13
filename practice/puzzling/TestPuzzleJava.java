import java.util.ArrayList;

public class TestPuzzleJava {
  public static void main(String[] args) {
    PuzzleJava puzzle = new PuzzleJava();
   
    // puzzle.test();
    ArrayList <Integer> randomRolls = puzzle.getTenRolls();
    System.out.println(randomRolls);
    
    System.out.println("Generating a password: " + puzzle.generatePassword());
    System.out.println("Generating a password: " + puzzle.generatePassword());
    System.out.println("Generating a password: " + puzzle.generatePassword());
    //
    System.out.println("------------Generate Password set-------------");
    ArrayList<String> passwordSet = puzzle.getNewPasswordSet(5);
    System.out.println(passwordSet);

    passwordSet = puzzle.shuffleArray(passwordSet);
    System.out.println("ArrayList after: " + passwordSet); 
  }
}
