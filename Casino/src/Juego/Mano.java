package Juego;

public class Mano {
	
	private Carta[] cartas;
	private String nombreMano;
	private int indice;
	private int numeroCartas;
	
	public Mano(String nombreMano, int tamanioMano) {
		
		this.nombreMano=nombreMano;
		this.numeroCartas=tamanioMano;
		this.indice=0;		
	}
	public void cogerCarta(Carta[] cartaRobada) {
		
		for(int i=0;i<=numeroCartas;i++) {
			int CAleatoria=(int)(Math.random()*54);
			if(cartas[CAleatoria].getEnBaraja()==true) {
				cartas[CAleatoria]=cartas[CAleatoria];
				
				
			}
		}
		
	}

}
