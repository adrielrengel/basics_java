
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;
		if (salario >= 3751.01) {
			System.out.println("Sua aliquota do IR e de 22,5% e pode ser deduzido ate R$ 636,00");
		} else if (salario >= 1900.0 && salario < 2800.0) {
			System.out.println("Sua aliquota do IR e de 7,5% e pode ser deduzido ate R$ 142,00");
		} else {
			System.out.println("Sua aliquota do IR e de 15% e pode ser deduzido ate R$ 350,00");
		}
		/*
		 * e 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de
		 * R$ 142 De 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350 De 3751.01
		 * at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636
		 */

	}

}
