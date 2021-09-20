package gr.ioannis.java.app.spring.boot.ssh.shell.task;

import com.github.fonimus.ssh.shell.commands.SshShellComponent;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellMethod;

import java.util.Calendar;

@SshShellComponent
@ShellCommandGroup("Server Commands")
public class ServerDateTask {

  @ShellMethod("Returns the current date of the server.")
  public String getServerDate() {
    return String.format("The server current date is: %s", Calendar.getInstance().getTime());
  }

}
