package pac_sqroot;

public class sqroot {
	public int num, i=1, cc=0;
	public String raizq;
	
	public String CalcularRQ() {
		while (num >= i) {
			num = num-i;
			i = i+2;
			cc = cc+1;
		}
		
		if (num == 0) {
			raizq = "" + cc;
		}else {
			raizq = "Entre " + cc + " e " + (cc+1);
		}
		
		return raizq;
	}
}
