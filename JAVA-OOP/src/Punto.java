
public class Punto {

	private int x=0;
	private int y=0;
	static private int conta = 0;
	
// costruttori
	
public Punto(int _x, int _y)
{
	x = _x;
	setY(_y);
	conta++;
}
	
	static public int getConta()

		{return conta;}

public int getX(){
	return x;
}
//setter
public void setX(int _x)
{
x=_x;	
}
public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public Punto(int _x)
{
	x = _x;
}
public Punto() {this(0,0);}
	
}
		