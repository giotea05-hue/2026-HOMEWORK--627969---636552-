package HomeworkA;





/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	static final private int CFU_INIZIALI = 20;

	private Stanza stanzaCorrente;  
	 //QUA è INUTILE, PERCHE TENERLA NELLA PARTITA? SPOSTA IN LABIRINTO!
	private Labirinto labirintoCorrente;
	private boolean finita;
	private int cfu;
	private Giocatore player;
	
	
	
	public Partita(){
		 this.labirintoCorrente= new Labirinto(null,null);
		this.labirintoCorrente.creaStanze();
		this.stanzaCorrente = labirintoCorrente.getStanzaIniziale();
		this.finita = false;
		this.player=new Giocatore();
		this.player.creaGiocatore();
		
	}

    /**
     * Crea tutte le stanze e le porte di collegamento
     */
    
	

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.getStanzaCorrente()== labirintoCorrente.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.player.getCFU() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}
	
	public Giocatore getPlayer() {
		return this.player;
	}

	//public int getCfu() {
		//return this.cfu;
	//}

	//public void setCfu(int cfu) {
	//	this.cfu = cfu;		
	//}	
}

