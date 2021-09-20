package gr.ioannis.java.app.spring.boot.ssh.shell.service;

import gr.ioannis.java.app.spring.boot.ssh.shell.util.Randomizer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

  public int getUserAge(String username) {
    log.warn("Looking up the age of the user {}", username);
    return Randomizer.generate(18, 100);
  }

}
