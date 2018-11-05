
public class MoveEast implements CommandInterface {

	@Override
	public void execute(Player p) {
		// TODO Auto-generated method stub
		p.move(1, 0);
	}

	@Override
	public boolean undo(Player p) {
		// TODO Auto-generated method stub
		p.move(-1,0);
		return true;
	}

}
