package pac_imc;

public class Imc {
	public float peso;
	public float altura;
	public double imc;
	public String classific;
	
	public double CalcImc(){
		imc = peso/Math.pow(altura, 2);
		return imc;
	}
	
	public String MostrarClassific() {
		if(imc <= 18.5)
			classific = "Abaixo";
		if(imc > 18.5 && imc < 25 )
			classific = "Ideal";
		if(imc >= 25 && imc < 30)
			classific = "Sobrepeso";
		if(imc >= 30 && imc < 35)
			classific = "Obeso";
		if(imc >= 35 && imc < 40)
			classific = "Obesidade Severa";
		if(imc >= 40)
			classific = "Obesidade M�rbida";
		return classific;
	}
	
}
