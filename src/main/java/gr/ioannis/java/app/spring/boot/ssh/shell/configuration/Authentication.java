package gr.ioannis.java.app.spring.boot.ssh.shell.configuration;

import com.github.fonimus.ssh.shell.auth.SshShellAuthenticationProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class provides a dummy security implementation for logging to the SSH Server. The accepted login action is to
 * use the same value for username and password.
 */
@Configuration
public class Authentication {

  @Bean
  public SshShellAuthenticationProvider sshShellAuthenticationProvider() {
    return (user, pass, serverSession) -> user.equals(pass);
  }

}
