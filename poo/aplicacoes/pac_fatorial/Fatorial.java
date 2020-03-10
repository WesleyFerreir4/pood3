package pac_fatorial;

public class Fatorial {
	public int num;
	public long fat=1;
	public int i;
	
	public long calcfat() {
		for(i=num; i>0; i--) {
			fat = fat*i;
		}
		return fat;
	}
}
