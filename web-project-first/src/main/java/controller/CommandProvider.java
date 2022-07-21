package controller;

import java.util.HashMap;
import java.util.Map;

import controller.impl.DoLogination;
import controller.impl.GoToLoginationPageCommand;
import controller.impl.GoToRegistrationPageCommand;

public class CommandProvider {
	
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.GO_TO_LOGINATION_PAGE, new GoToLoginationPageCommand());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPageCommand());
		commands.put(CommandName.DO_LOGINATION, new DoLogination());
	}
	
	public Command getCommand (String name) {
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;
	}
}
