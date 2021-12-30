import java.util.*;

public class Main {
    public static void main(String args[]) {
     
      Scanner scanner = new Scanner(System.in);
      String word = scanner.nextLine();
      int middleIndex =(int) Math.floor(word.length() / 2);
      int endIndex = word.length();
      String trailingWord = word.substring(middleIndex, endIndex);
      String leadingWord = word.substring(0, middleIndex);
     
      String newWord = trailingWord + leadingWord;

      int row = word.length();
      int start = newWord.length() - 1;
   
      for (int i = 0; i< row; i++) {
        int current = 0;
        for (int j = 0; j < row; j++) {
            if (j >= start) {
                System.out.print(newWord.charAt(current));
                current += 1;
            } else {
                System.out.print(" ");
            }
        }
        start--;
        System.out.println();
      }
    }
}
