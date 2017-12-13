package pt_9_2;

public class main {

	public static void main(String[] args) throws TypeExeption, ColorExeption {
		
		Plant[] flower = new Plant[5];
		
		try {
			flower[0] = new Plant("rose", "red", 24);
			flower[1] = new Plant("sunflower", "yellow", 32);
			flower[2] = new Plant("iris", "yellow", 15);
			flower[3] = new Plant("gladiolus", "green", 24);
			flower[4] = new Plant("lily", "blue", 22);		
			System.out.println("Everything ok");
		} catch (TypeExeption e) {
			System.err.println(e.getMessage());
			System.out.println("Abort\n");
		}catch (ColorExeption e) {
			System.err.println(e.getMessage());
			System.out.println("Abort\n");
		}
	}

}
