import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {  
    private Random rnd = new Random();

    public int getIntRandomNumber (int lower, int upper) {
      if (lower < 0) {
          lower = 0;
      } else if (lower > upper) {
          lower = upper;
      } else if (lower == 0 ) {
          rnd.nextInt(upper);
      }

      return rnd.nextInt(upper + 1 - lower) + lower;
    }

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            tenRolls.add(getIntRandomNumber(1, 20));
        }

        return tenRolls;
    }

    public char generateRandomLetter() {
      char [] alphabet = new char[26];
      for (int i = 0, j = 65; i < alphabet.length; i++, j++) {
          alphabet [i] = (char) j;
      }

      return alphabet [getIntRandomNumber(0, 25) ];
    }

    public String generatePassword() {
      char [] password = new char[8];

      for (int i = 0; i < password.length; i++) {
          password[i] = generateRandomLetter();
      }

      return String.valueOf(password);
    }

    public ArrayList<String> getNewPasswordSet(int nbrOfWords) {
        ArrayList<String> passwordSet = new ArrayList<> ();
        for (int i = 0; i < nbrOfWords; i++) {
            passwordSet.add(generatePassword());
        }

        return passwordSet;
    }

    public ArrayList<String>  shuffleArray(ArrayList<String> list) {
      System.out.println("---------------Shuffling ArrayList--------------");
      System.out.println("ArrayList before: " + list);
      if (list.size() < 2) {
          return list;
      }
      for (int i  = 0; i < list.size(); i++) {
        int element1 = getIntRandomNumber(0, list.size() - 1);
        int element2 = getIntRandomNumber(0, list.size() - 1);
        if (element1 == element2) {
          continue;
        }
        String saveElement1 = list.get(element1);
        list.set(element1, list.get(element2));
        list.set(element2, saveElement1);
      }

      return list;
    }

}