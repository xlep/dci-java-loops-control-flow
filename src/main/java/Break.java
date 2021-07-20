public class Break {

  public static void main (String[] args) {

    System.out.println("# next prime number");
    int currentNumber = 50;
    StringBuilder primeNumbers = new StringBuilder();

    while (true) {
      // any number between 2 and 100 needs to be checked
      int previousNumbers = 2;

      boolean isPrime = true;
      while (previousNumbers < currentNumber) {
        // if there is no remainder, we add it to our list of prime numbers
        if (currentNumber % previousNumbers == 0) {
          isPrime = false;
        }
        previousNumbers++;
      }

      if (isPrime) {
        System.out.println("The next prime numbr is: " + currentNumber);
        break;
      }
      currentNumber++;
    }

    System.out.println("\n\n# First Sentence");
    String sentence = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    StringBuilder firstSentence = new StringBuilder();
    char period = '.';

    for (int i = 0; i < sentence.length(); i++) {
      char currentChar = sentence.charAt(i);
      firstSentence.append(currentChar);
      if (currentChar == period) {
        break;
      }
    }

    System.out.println(firstSentence);
  }

}
