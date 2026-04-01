package HomeworkA;

public class Giocatore {
	private int CFU;
	private Borsa borsa;
	
	
	static final private int CFU_INIZIALI = 20;
	
	
	public void creaGiocatore() {
		
		Borsa borsa= new Borsa();
		this.CFU = CFU_INIZIALI;
		
		
		
		
		
	}
	
	
	
	public void setCFU(int c) {
		this.CFU=c;
	
	}
	
	public int getCFU() {
		return this.CFU;
	}
	
	public Borsa getBorsa() {
		return this.borsa;
	}
	

}
