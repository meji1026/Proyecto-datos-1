package palabras;

public class Letra implements java.io.Serializable {
	
	public Letra() {
	}
	
	public Letra(String letra) {
		this.letra = letra;
		switch(letra) {
		case "A":
			this.puntaje = 1;
			break;
		case "B":
			this.puntaje = 3;
			break;
		case "C":
			this.puntaje = 3;
			break;
		case "CH":
			this.puntaje = 5;
			break;
		case "D":
			this.puntaje = 2;
			break;
		case "E":
			this.puntaje = 1;
			break;
		case "F":
			this.puntaje = 4;
			break;
		case "G":
			this.puntaje = 2;
			break;
		case "H":
			this.puntaje = 4;
			break;
		case "I":
			this.puntaje = 1;
			break;
		case "J":
			this.puntaje = 8;
			break;
		case "L":
			this.puntaje = 1;
			break;
		case "LL":
			this.puntaje = 8;
			break;
		case "M":
			this.puntaje = 3;
			break;
		case "N":
			this.puntaje = 1;
			break;
		case "Ñ":
			this.puntaje = 8;
			break;
		case "O":
			this.puntaje = 1;
			break;
		case "P":
			this.puntaje = 3;
			break;
		case "Q":
			this.puntaje = 5;
			break;
		case "R":
			this.puntaje = 1;
			break;
		case "RR":
			this.puntaje = 8;
			break;
		case "S":
			this.puntaje = 1;
			break;
		case "T":
			this.puntaje = 1;
			break;
		case "U":
			this.puntaje = 1;
			break;
		case "V":
			this.puntaje = 4;
			break;
		case "X":
			this.puntaje = 8;
			break;
		case "Y":
			this.puntaje = 4;
			break;
		case "Z":
			this.puntaje = 10;
			break;
		case " ":
			this.puntaje = 0;
			break;
		}
	}
	
	private int puntaje;
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	private String letra;

}
