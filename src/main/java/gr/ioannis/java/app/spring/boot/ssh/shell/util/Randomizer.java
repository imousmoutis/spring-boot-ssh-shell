package gr.ioannis.java.app.spring.boot.ssh.shell.util;

public class Randomizer {

  public static int generate(int min, int max) {
    return min + (int) (Math.random() * ((max - min) + 1));
  }
}
