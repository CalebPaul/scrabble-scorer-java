

public class Scrabble {
  public Integer calculateScore(String word) {
    Integer result = 0;
    for (Integer i = 0; i < word.length(); i++) {
      char at = word.charAt(i);
      if ((at == 'a') || (at == 'e') || (at == 'i') || (at == 'o') || (at == 'u') || (at == 'l') || (at == 'n') || (at == 'r') || (at == 's') || (at == 't')) {
        result += 1;
      }
    }
    return result;
  }
}
