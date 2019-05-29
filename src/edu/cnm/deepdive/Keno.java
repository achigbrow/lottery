package edu.cnm.deepdive;

import edu.cnm.deepdive.Lottery;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Keno {
  private static final int MAXIMUM_NUMBER = 80;
  private static final int NUMBER_TO_PICK = 20;
  private static final String PICK_FORMAT = "ticket #%d: %s%n";

  public static void main(String[] args) {
    Lottery lotto = new Lottery(MAXIMUM_NUMBER);
    Random rng = new SecureRandom();
    for (int i = 0; i <1; i++) {
      int[] pick = lotto.pick(NUMBER_TO_PICK, rng);
      String prettyPick = Arrays.toString(pick);
      System.out.printf(PICK_FORMAT, i + 1, prettyPick);
    }
  }
}

