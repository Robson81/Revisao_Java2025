package classesBPM;

public class ExtruturasdeSelecao {

	private double num;
	private double width;
	private double height;
	private double imc;
	private String peso;
	private String triangle;
	private Double vFinal;
	private String velocidadeKm;
	public ExtruturasdeSelecao() {

	}

	public ExtruturasdeSelecao(double num) {

		this.num = num;
	}

	public ExtruturasdeSelecao(double width, double height) {

		this.width = width;
		this.height = height;

	}

	public double getNum() {
		return num;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double maiorTerreno(double x, double y) {

		if (x > y)
			return x;
		else
			return y;
	}

	public String imc(String x, double y, double z) {

		imc = z / Math.pow(y, 2);

		if (x.charAt(0) == 'm') {
			if (imc < 20) {
				peso = String.format("Sexo: MASCULINO. IMC: %.2f", imc) + ", Abaixo do Peso";

			} else if (imc >= 20 && imc < 25) {
				peso = String.format("Sexo: MASCULINO. IMC: %.2f", imc) + ", Peso Ideal";

			} else if (imc >= 25) {
				peso = String.format("Sexo: MASCULINO. IMC: %.2f", imc) + ", Acima do Peso";

			}

			return peso;

		} else if (x.charAt(0) == 'f') {
			if (imc < 19) {
				peso = String.format("Sexo: FEMININO. IMC: %.2f", imc) + ", A Baixo do Peso";

			} else if (imc >= 19 && imc < 24) {
				peso = String.format("Sexo: FEMININO. IMC: %.2f", imc) + ", Peso Ideal";
			} else if (imc >= 24) {
				peso = String.format("Sexo: FEMININO. IMC: %.2f", imc) + ", Acima do Peso";
			}
			return peso;
		} else
			return "Sexo não identificado";
	}

	public String triangleTest(double a, double b, double c) {
		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				triangle = "O triangulo informado é do Tipo Equilátero.";
			} else if ((a == b && b != c) || (a != b && b != c && a == c) || (a != b && b == c)) {
				triangle = "O triangulo informado é do Tipo Isóceles.";
			} else if ((a != b && b != c && c != a)&&(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)))) {		
				triangle = "O triangulo informado é do Tipo Escaleno, Retangulo e sua hipotenusa é: o primeiro valor digitado";
			} else if ((a != b && b != c && c != a)&&(Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2)))) {
					triangle = "O triangulo informado é do Tipo Escaleno, Retangulo e sua hipotenusa é: o segundo valor digitado";
			} else if ((a != b && b != c && c != a) && (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2)))) {
					triangle = "O triangulo informado é do Tipo Escaleno, Retangulo e sua hipotenusa é: o terceiro valor digitado";

			}else 
				triangle = "O triangulo Informado é do tipo Escaleno e não Regangulo";

			return triangle;

		} else

			return "A Condição de Existência do Triangulo Não Foi Atendida";
	}
	public String finalVelocity(double vInicial, double tempo, double aceleracao) {

		vFinal = (vInicial + tempo*aceleracao) *3.6;

		if(vFinal<=40) {

			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Veículo Muito Lento\n";

		}else if(vFinal>40&&vFinal<=60) {

			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Velocidade Permitida\n";

		}else if(vFinal>60&&vFinal<=80) {

			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Velocidade de Cruzeiro\n";	

		}else if(vFinal>8040&&vFinal<=120) {

			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Veículo Rápido\n";

		}else if(vFinal>120) {

			velocidadeKm = String.format("Velocidade Final: %.2f km/h", vFinal) + ", Veículo Muito Rápido\n";

		}		

		return velocidadeKm;

	}

	public String toString() {

		return String.format("%.2f", num);
	}

}
