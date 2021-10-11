
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 10;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("vc ja e maior de idade");
		}else {
			if(quantidadePessoas > 1) {
				System.out.println("pode beber");
			}else {
				System.out.println("sem bebidas pra voce");
			}
			
		}

	}

}
