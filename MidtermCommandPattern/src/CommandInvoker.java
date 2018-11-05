import java.util.Stack;

public class CommandInvoker {
	private Player player;
	private Stack<CommandInterface> commandStack;
	public CommandInvoker(Player p)
	{
		player = p;
		commandStack = new Stack<CommandInterface>();
	}
	public void execute(CommandInterface command)
	{
		commandStack.push(command);
		command.execute(player);
	}
	public boolean undo()
	{
		if (commandStack.isEmpty())
		{
			return false;
		}
		return commandStack.pop().undo(player);
	}
}
