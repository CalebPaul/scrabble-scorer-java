

public class Scrabble {
  public Integer calculateScore(String word) {
    Integer result = 0;
    for (Integer i = 0; i < word.length(); i++) {
      char at = word.charAt(i);
      if ((at == 'a') || (at == 'e') || (at == 'i') || (at == 'o') || (at == 'u') || (at == 'l') || (at == 'n') || (at == 'r') || (at == 's') || (at == 't')) {
        result += 1;
      } else if ((at == 'd') || (at == 'g')) {
        result += 2;
      } else if ((at == 'b') || (at == 'c') || (at == 'm') || (at == 'p')){
        result += 3;
      } else if ((at == 'f') || (at == 'h') || (at == 'v') || (at == 'w') || (at == 'y')){
        result += 4;
      } else if (at == 'k') {
        result += 5;
      } else if ((at == 'j') || (at == 'x')) {
        result += 8;
      } else if ((at == 'q') || (at == 'z')) {
        result += 10;
      }
    }
    return result;
  }
}
