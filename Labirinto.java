package HomeworkA;

public class Labirinto {
	private  Stanza entrata;
	private Stanza uscita;
	private Stanza stanzaVincente;
	private Stanza stanzaIniziale;
	
	
	
	
	public void creaStanze() {  //HO MODIFICATO DA PRIVATE A PUBLIC, NON SO SE SI PUO

		/* crea gli attrezzi */
    	Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);
    	
		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		stanzaIniziale=atrio;
		
		/* collega le stanze */
		atrio.impostaStanzaAdiacente("nord", biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		biblioteca.impostaStanzaAdiacente("sud", atrio);

        /* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);

		// il gioco comincia nell'atrio
          
		stanzaVincente = biblioteca;
    }
	
	public Stanza getStanzaIniziale() {
		return stanzaIniziale;
	}

	
	
	
	
	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}
	
	
	
	
	
	
	
	public Labirinto(Stanza e, Stanza u) {
		this.entrata=e;
		this.uscita=u;
	}
	
	public Stanza getEntrata() {
		return entrata;
	}
	
	public Stanza getUscita() {
		return uscita;
	}
	
	public void setEntrata(Stanza e) {
		entrata=e;
	}
	
	public void setUscita(Stanza eu) {
		uscita=eu;
	}

}
