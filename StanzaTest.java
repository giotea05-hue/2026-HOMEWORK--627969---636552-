package HomeworkA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class StanzaTest {
	//Definisco qui i privati in modo da non ripeterli ogni volta
		private Stanza stanza;
		private Stanza stanzaAdicente;
		private Attrezzo attrezzo;
		
		//Definisco con BeforeEach e setUp cosa deve essere eseguito prima di ogni test
		
		@BeforeEach
		public void setUp() {
			stanza=new Stanza("n11");
			stanzaAdiacente = new Stanza("n12");
			attrezzo=new Attrezzo("falce", 4);

	@Test
	void test() {
		fail("Not yet implemented");
	}

}








