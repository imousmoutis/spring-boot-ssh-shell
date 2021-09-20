package gr.ioannis.java.app.spring.boot.ssh.shell.task;

import com.github.fonimus.ssh.shell.commands.SshShellComponent;
import gr.ioannis.java.app.spring.boot.ssh.shell.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@SshShellComponent
@ShellCommandGroup("User Commands")
@RequiredArgsConstructor
public class UserAgeTask {

  private final UserService userService;

  @ShellMethod("Retrieves the age of the requested user.")
  public String getUserAge(@ShellOption(defaultValue = ShellOption.NULL) String username) {
    if (username == null) {
      return "You must provide the name of the user as a parameter.";
    }
    return String.format("The user %s is %d years old.", username, userService.getUserAge(username));
  }

}
