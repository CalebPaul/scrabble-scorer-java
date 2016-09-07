import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("t"));
  }

  @Test
  public void calculateSCore_returnScoreForSingleLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("g"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("m"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("y"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_5() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }
}
