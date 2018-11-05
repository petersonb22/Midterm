
public class Player {
	private int xCoord;
	private int yCoord;
	public Player (int x, int y)
	{
		xCoord = x;
		yCoord = y;
	}
	public void move (int xMove, int yMove)
	{
		xCoord += xMove;
		yCoord += yMove;
	}
	public int getX()
	{
		return xCoord;
	}
	public int getY()
	{
		return yCoord;
	}
}
