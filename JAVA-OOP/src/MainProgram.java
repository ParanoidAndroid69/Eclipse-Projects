


public class MainProgram {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Rettangolo r = new Rettangolo(10,10,2,3);
		Quadrato q = new Quadrato(10,10,2);
		Cubo c = new Cubo(10,10,2);
		System.out.println("il rettangolo ha perimetro " + r.perimetro());
		System.out.println("il quadrato ha area " + q.area());
		System.out.println("il rettangolo ha area " + r.area());
		System.out.println("il cubo ha area " + c.area());


	}
		 

}