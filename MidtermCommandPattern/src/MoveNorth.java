
public class MoveNorth implements CommandInterface {

	@Override
	public void execute(Player p) {
		// TODO Auto-generated method stub
		p.move(0, 1);
	}

	@Override
	public boolean undo(Player p) {
		// TODO Auto-generated method stub
		p.move(0,-1);
		return true;
	}

}
