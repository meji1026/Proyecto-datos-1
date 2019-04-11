package Entidades;



public class Ficha  {
	public  Ficha() {}
	private String[] listaPaths = {"src/interfaz/images/a.jpg", "src/interfaz/images/b.jpg", "src/interfaz/images/c.jpg", "src/interfaz/images/ch.jpg", "src/interfaz/images/d.jpg", "src/interfaz/images/e.jpg", "src/interfaz/images/f.jpg", "src/interfaz/images/g.jpg", "src/interfaz/images/h.jpg", "src/interfaz/images/i.jpg", 
			"src/interfaz/images/j.jpg", "src/interfaz/images/l.jpg", "src/interfaz/images/ll.jpg", "src/interfaz/images/m.jpg", "src/interfaz/images/n.jpg", "src/interfaz/images/ñ.jpg", "src/interfaz/images/o.jpg", "src/interfaz/images/p.jpg", "src/interfaz/images/q.jpg", "src/interfaz/images/r.jpg", 
			"src/interfaz/images/rr.jpg", "src/interfaz/images/s.jpg", "src/interfaz/images/t.jpg", "src/interfaz/images/u.jpg", "src/interfaz/images/v.jpg", "src/interfaz/images/x.jpg", "src/interfaz/images/y.jpg" , "src/interfaz/images/z.jpg"};
	private String path;
	private String letra;
	private int valor;
	private String pos;
	
	public Ficha(String letra,String pos) {
		this.letra = letra;		
		switch(letra) {
		case "A":
			this.path = listaPaths[0];
			this.valor = 1;
			break;
		case "B":
			this.path = listaPaths[1];
			this.valor = 3;
			break;
		case "C":
			this.path = listaPaths[2];
			this.valor = 3;
			break;
		case "CH":
			this.path = listaPaths[3];
			this.valor = 5;
			break;
		case "D":
			this.path = listaPaths[4];
			this.valor = 2;
			break;
		case "E":
			this.path = listaPaths[5];
			this.valor = 1;
			break;
		case "F":
			this.path = listaPaths[6];
			this.valor = 4;
			break;
		case "G":
			this.path = listaPaths[7];
			this.valor = 2;
			break;
		case "H":
			this.path = listaPaths[8];
			this.valor = 4;
			break;
		case "I":
			this.path = listaPaths[9];
			this.valor = 1;
			break;
		case "J":
			this.path = listaPaths[10];
			this.valor = 8;
			break;
		case "L":
			this.path = listaPaths[11];
			this.valor = 1;
			break;
		case "LL":
			this.path = listaPaths[12];
			this.valor = 8;
			break;
		case "M":
			this.path = listaPaths[13];
			this.valor = 3;
			break;
		case "N":
			this.path = listaPaths[14];
			this.valor = 1;
			break;
		case "Ñ":
			this.path = listaPaths[15];
			this.valor = 8;
			break;
		case "O":
			this.path = listaPaths[16];
			this.valor = 1;
			break;
		case "P":
			this.path = listaPaths[17];
			this.valor = 3;
			break;
		case "Q":
			this.path = listaPaths[18];
			this.valor = 5;
			break;
		case "R":
			this.path = listaPaths[19];
			this.valor = 1;
			break;
		case "RR":
			this.path = listaPaths[20];
			this.valor = 8;
			break;
		case "S":
			this.valor = 1;
			this.path = listaPaths[21];
			break;
		case "T":
			this.path = listaPaths[22];
			this.valor = 1;
			break;
		case "U":
			this.path = listaPaths[23];
			this.valor = 1;
			break;
		case "V":
			this.path = listaPaths[24];
			this.valor = 4;
			break;
		case "X":
			this.path = listaPaths[25];
			this.valor = 8;
			break;
		case "Y":
			this.path = listaPaths[26];
			this.valor = 4;
			break;
		case "Z":
			this.path = listaPaths[27];
			this.valor = 10;
			break;
		case " ":
			this.path = listaPaths[28];
			this.valor = 0;
			break;
		}
		this.pos = pos;
	}
	

	public String getPos() {
		return pos;
	}


	public void setPos(String pos) {
		this.pos = pos;
	}


	public Ficha(String letra) {
		this.letra = letra;		
		switch(letra) {
		case "A":
			this.path = listaPaths[0];
			this.valor = 1;
			break;
		case "B":
			this.path = listaPaths[1];
			this.valor = 3;
			break;
		case "C":
			this.path = listaPaths[2];
			this.valor = 3;
			break;
		case "CH":
			this.path = listaPaths[3];
			this.valor = 5;
			break;
		case "D":
			this.path = listaPaths[4];
			this.valor = 2;
			break;
		case "E":
			this.path = listaPaths[5];
			this.valor = 1;
			break;
		case "F":
			this.path = listaPaths[6];
			this.valor = 4;
			break;
		case "G":
			this.path = listaPaths[7];
			this.valor = 2;
			break;
		case "H":
			this.path = listaPaths[8];
			this.valor = 4;
			break;
		case "I":
			this.path = listaPaths[9];
			this.valor = 1;
			break;
		case "J":
			this.path = listaPaths[10];
			this.valor = 8;
			break;
		case "L":
			this.path = listaPaths[11];
			this.valor = 1;
			break;
		case "LL":
			this.path = listaPaths[12];
			this.valor = 8;
			break;
		case "M":
			this.path = listaPaths[13];
			this.valor = 3;
			break;
		case "N":
			this.path = listaPaths[14];
			this.valor = 1;
			break;
		case "Ñ":
			this.path = listaPaths[15];
			this.valor = 8;
			break;
		case "O":
			this.path = listaPaths[16];
			this.valor = 1;
			break;
		case "P":
			this.path = listaPaths[17];
			this.valor = 3;
			break;
		case "Q":
			this.path = listaPaths[18];
			this.valor = 5;
			break;
		case "R":
			this.path = listaPaths[19];
			this.valor = 1;
			break;
		case "RR":
			this.path = listaPaths[20];
			this.valor = 8;
			break;
		case "S":
			this.valor = 1;
			this.path = listaPaths[21];
			break;
		case "T":
			this.path = listaPaths[22];
			this.valor = 1;
			break;
		case "U":
			this.path = listaPaths[23];
			this.valor = 1;
			break;
		case "V":
			this.path = listaPaths[24];
			this.valor = 4;
			break;
		case "X":
			this.path = listaPaths[25];
			this.valor = 8;
			break;
		case "Y":
			this.path = listaPaths[26];
			this.valor = 4;
			break;
		case "Z":
			this.path = listaPaths[27];
			this.valor = 10;
			break;
		case " ":
			this.path = listaPaths[28];
			this.valor = 0;
			break;
		}
	}

	public String[] getListaPaths() {
		return listaPaths;
	}

	public void setListaPaths(String[] listaPaths) {
		this.listaPaths = listaPaths;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}



}
