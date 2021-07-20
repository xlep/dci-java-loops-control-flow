public class Continue {

  public static void main (String[] args) {
    System.out.println("# Countdown");
    for (int i = 10; i >= 0; i--) {
      // skip even numbers
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }

    System.out.println("\n\n# Skip spaces");
    String sentence = "I'll make him an offer he can't refuse";
    StringBuilder withoutSpaces = new StringBuilder();
    char space = ' ';

    for (int i = 0; i < sentence.length(); i++) {
      char currentChar = sentence.charAt(i);
      if (currentChar == space) {
        continue;
      }
      withoutSpaces.append(currentChar);
    }

    System.out.println(withoutSpaces);
  }
}
