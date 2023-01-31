package Juego;

import java.util.Arrays;

public class Baraja {

	private Carta[] cartas;
	

	public Baraja() {
		
		cartas = new Carta[54];
		
		Carta ayuda2=new Carta("0",true);
		for(int i=0;i<54;i++) {
			cartas[i]=ayuda2;
		}
	}
	
	protected void generarBaraja() {
//EL CODIGO COMENTADO EN ESTE METODO NO FUNCIONABA CORRECTAMENTE ASI QUE LO INTENTAMOS DE OTRA FORMA
		//PERO POR CULPA DEL SIMULACRO NO DIO TIEMPO.
		Carta ayuda = new Carta("0", true);
		
		int numeros =54;
		
		while(numeros<55) {
			if(numeros<14) {
				for(int i =0;i<=14;i++) {
					switch(i) {
					case 1:
					ayuda.setValor("AC");
					ayuda.setEnBaraja(true);
					cartas[numeros] = ayuda;
					case 11:
						ayuda.setValor("JC");
						ayuda.setEnBaraja(true);
						cartas[numeros] = ayuda;
						break;
					case 12:
						ayuda.setValor("QC");
						ayuda.setEnBaraja(true);
						cartas[numeros] = ayuda;
						break;
					case 13:
						ayuda.setValor("KC");
						ayuda.setEnBaraja(true);
						cartas[numeros] = ayuda;
						break;
					default:
						ayuda.setValor(i+"C");
						ayuda.setEnBaraja(true);
						cartas[numeros] = ayuda;
						break;
					}
					
				}
				if(numeros>14&&numeros<28) {
					for(int i =0;i<=14;i++) {
						switch(i) {
						case 1:
							ayuda.setValor("AT");
							ayuda.setEnBaraja(true);
							cartas[numeros] = ayuda;
							break;
						case 11:
							ayuda.setValor("JT");
							ayuda.setEnBaraja(true);
							cartas[numeros] = ayuda;
							break;
						case 12:
							ayuda.setValor("QT");
							ayuda.setEnBaraja(true);
							cartas[numeros] = ayuda;
							break;
						case 13:
							ayuda.setValor("KT");
							ayuda.setEnBaraja(true);
							cartas[numeros] = ayuda;
							break;
						default:
							ayuda.setValor(i+"T");
							ayuda.setEnBaraja(true);
							cartas[numeros] = ayuda;
							break;
						}
						
					}
					if(numeros>28&&numeros<42) {
						for(int i =0;i<=14;i++) {
							switch(i) {
							case 1:
								ayuda.setValor("AP");
								ayuda.setEnBaraja(true);
								cartas[numeros] = ayuda;
								break;
							case 11:
								ayuda.setValor("JP");
								ayuda.setEnBaraja(true);
								cartas[numeros] = ayuda;
								break;
							case 12:
								ayuda.setValor("QP");
								ayuda.setEnBaraja(true);
								cartas[numeros] = ayuda;
								break;
							case 13:
								ayuda.setValor("KP");
								ayuda.setEnBaraja(true);
								cartas[numeros] = ayuda;
								break;
							default:
								ayuda.setValor(i+"P");
								ayuda.setEnBaraja(true);
								cartas[numeros] = ayuda;
								break;
							}
							
						}
					
					
				}}}
			
		
//		
//		int valor=1;
//		int palo = 1;
//		for (; valor < 14; valor++) {
//			
//			int posicion=0;
//			
//			
//			
////			switch (valor) {
////			case 1:
////				ayuda.setValor("A");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 2:
////				ayuda.setValor("2");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 3:
////				ayuda.setValor("3");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 4:
////				ayuda.setValor("4");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 5:
////				ayuda.setValor("5");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 6:
////				ayuda.setValor("6");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 7:
////				ayuda.setValor("A");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 8:
////				ayuda.setValor("8");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 9:
////				ayuda.setValor("9");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 10:
////				ayuda.setValor("10");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////
////			case 11:
////				ayuda.setValor("J");
////				ayuda.setEnBaraja(true);
////				cartas[valor] = ayuda;
////				break;
////			case 12:
////				ayuda.setValor("Q");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////			case 13:
////				ayuda.setValor("K");
////				ayuda.setEnBaraja(true);
////				cartas[posicion] = ayuda;
////				break;
////
////			}
//			for (; palo <= 4; palo++) {
//				switch(palo) {
//				case 1:
//					ayuda.valor+="D";
//					cartas[posicion] = ayuda;
//					palo=5;
//					
//					break;
//				case 2:
//					ayuda.valor+="C";
//					cartas[posicion] = ayuda;
//					palo=5;
//					break;
//				case 3:
//					ayuda.valor+="R";
//					cartas[posicion] = ayuda;
//					palo=5;
//					break;
//				case 4:
//					ayuda.valor+="T";
//					cartas[posicion] = ayuda;
//					palo=5;
//					break;
//				}
//			}
//			posicion++;
//			
//		}
//	}

	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
}
