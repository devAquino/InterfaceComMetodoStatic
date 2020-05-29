
public interface Imc {

	//Now interfaces allows statics and defaults methods
	static double calcularImc(double peso, double altura) {
		return peso/(altura*altura);
	}
	

	
}
