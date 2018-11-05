import java.util.Random;

public class CommandClient {
	public static void main(String[] args)
	{
		Player p = new Player(0,0);
		CommandInvoker inv = new CommandInvoker(p);
		Random rand = new Random();
		for(int i = 0; i < 50; i++)
		{
			int cmdNum;
			cmdNum = rand.nextInt(4)+1;
			CommandInterface cmd;
			switch(cmdNum)
			{
			case(1):
				cmd = new MoveNorth();
				inv.execute(cmd);
				System.out.println("Player moved North: " + p.getX() + "," + p.getY());
				break;
			case(2):
				cmd = new MoveEast();
				inv.execute(cmd);
				System.out.println("Player moved East: " + p.getX() + "," + p.getY());
				break;
			case(3):
				cmd = new MoveSouth();
				inv.execute(cmd);
				System.out.println("Player moved South: " + p.getX() + "," + p.getY());
				break;
			case(4):
				cmd = new MoveWest();
				inv.execute(cmd);
				System.out.println("Player moved West: " + p.getX() + "," + p.getY());
				break;
			}
		}
		while (inv.undo())
		{
			System.out.println(p.getX() + "," + p.getY());
		}
	}
}
