public class TesteSomatoria {

	public static void main(String[] args) {
		int contador = 0;
		
		
		while (contador <= 10) {
			int total = 0;
			// total = total + contador;
			total  += contador;

			System.out.println(total);
			contador++;
		}
		
		
	}
}