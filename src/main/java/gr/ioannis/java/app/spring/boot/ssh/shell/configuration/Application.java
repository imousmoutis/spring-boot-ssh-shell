package gr.ioannis.java.app.spring.boot.ssh.shell.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = {"gr.ioannis.java.app.spring.boot.ssh.shell"})
public class Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws InterruptedException {
    log.info("Waiting for SSH Shell commands...");
    Thread.currentThread().join();
  }

}
