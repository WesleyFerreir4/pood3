package pac_investimento;

public class Investimento {
	public float vp, taxa;
	public int prazo; 
	public double vf;
	public String tipo;
	
	public double calcvf() {
		vf = vp * Math.pow((1+taxa), prazo);
		return vf;
	}
	
	public String mostrartipo() {
		if(prazo >= 24 && vf >= 30000) {
			tipo = "Poupan�a";
		}else if(prazo >= 12 && vf <= 15000) {
			tipo = "Renda Fixa";
		}else if(prazo <= 6 && vf <= 10000) {
			tipo = "Renda Variavel";
		}else {
			tipo = "Rever Investimento";
		}
		
		return tipo;
	}
}