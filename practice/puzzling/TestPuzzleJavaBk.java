import java.util.Arrays;

public class TestPuzzleJavaBk {
  public static void main(String[] args) {
    PuzzleJava puzzle = new PuzzleJava();
   
    int [] num = new int[21];
    Arrays.fill(num, -1);
    for (int i = 0; i < 2000; i++) {
      int entry = puzzle.getIntRandomNumber(5, 2);
      num[entry] = entry;
    }
    System.out.println("---------------------");
    for (int i = 0; i < num.length; i++) {
      if (num[i] > -1) {
        System.out.printf("num[%d]= %s\n", i, num[i]);
      }
    }
  
  }
}
