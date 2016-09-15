
public class Quadrato extends Rettangolo {

	public Quadrato (int x, int y, int lato)
	{
	super(x,y,lato,lato);
	
	}
	public int perimetro() {
		return (base*4);
		
	}
}
