package Interfaz;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import Entidades.Ficha;
import Entidades.Jugador;
import estructurasDeDatos.ListaEnlazadaSimple;


public class Tablero extends JFrame{	
	private String matriz[][] =new String[15][15];
	Jugador j = Jugador.getInstance();
	
	
	
		boolean flag1 = false;
		Ficha A = new Ficha("A");
		Ficha B = new Ficha("B");
		Ficha C = new Ficha("C");
		Ficha CH = new Ficha("CH");
		Ficha D = new Ficha("D");
		Ficha E = new Ficha("E");
		Ficha F = new Ficha("F");
		Ficha G = new Ficha("G");
		Ficha H = new Ficha("H");
		Ficha I = new Ficha("I");
		Ficha J = new Ficha("J");
		Ficha L = new Ficha("L");
		Ficha LL = new Ficha("LL");
		Ficha M = new Ficha("M");
		Ficha N = new Ficha("N");
		Ficha Ñ = new Ficha("Ñ");
		Ficha O = new Ficha("O");
		Ficha P = new Ficha("P");
		Ficha Q = new Ficha("Q");
		Ficha R = new Ficha("R");
		Ficha RR = new Ficha("RR");
		Ficha S = new Ficha("S");
		Ficha T = new Ficha("T");
		Ficha U = new Ficha("U");
		Ficha V = new Ficha("V");
		Ficha X = new Ficha("X");
		Ficha Y = new Ficha("Y");
		Ficha Z = new Ficha("Z");
		Ficha Blanca = new Ficha("");

	private Ficha[] listafichas = {A,A,A,A,A,A,A,A,A,A,A,A,B,B,C,C,C,C,CH,D,D,D,D,D,E,E,E,E,E,E,E,E,E,E,E,E,F,G,G,H,H,I,I,I,I,I,I,J,L,L,L,L,LL,M,M,N,N,N,N,N,Ñ,O,O,O,O,O,O,O,O,O,
			P,P,Q,R,R,R,R,R,RR,S,S,S,S,S,S,T,T,T,T,U,U,U,U,U,V,X,Y,Z,Blanca,Blanca};
	
	public Tablero() {
	}
	
//	public void pintar() {
//		this.matriz = j.getMatriz();
//		for (int x=0; x < matriz.length; x++) {
//			
//			  for (int y=0; y < matriz[x].length; y++) {
//				  if(matriz[x][y]!=null) {
//			    for(int temp = 0; temp<listafichas.length; temp++) {
//			    	if(listafichas[temp].getLetra() == matriz[x][y]) {
//				  JLabel  aux = new JLabel(listafichas[temp].());
//					aux.setBounds(y*49,x*50, 49, 50);
//					aux.setText(listafichas[temp].getLetra());
//					add(aux);
//					}
//			    }
//				  }
//			  }
//		}
//		
//	}


	public void cargarTablero() {
		super.setTitle("Scrabble");
		JLabel background, letrasfondo;
		setSize(1100, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		ImageIcon img = new ImageIcon("src/interfaz/images/tablero.jpg");
		ImageIcon icono = new ImageIcon("src/interfaz/images/Icono.png");
		setIconImage(icono.getImage());
		ImageIcon letras = new ImageIcon("src/interfaz/images/fondo.png");

		JLabel A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,
		D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15,E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,E12,E13,E14,E15,F1,F2,F3,F4,F5,F6,F7,F8,F9,F10,F11,F12,F13,F14,F15,
		G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11,G12,G13,G14,G15,H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,
		J1,J2,J3,J4,J5,J6,J7,J8,J9,J10,J11,J12,J13,J14,J15,K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,
		M1,M2,M3,M4,M5,M6,M7,M8,M9,M10,M11,M12,M13,M14,M15,N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,O1,O2,O3,O4,O5,O6,O7,O8,O9,O10,O11,O12,O13,O14,O15;

		A1 = new JLabel();
		A1.setBounds(36,34,49,50);
		add(A1);
		A1.setName("00");
		A2 = new JLabel();
		A2.setBounds(86,34,49,50);
		add(A2);
		A2.setName("01");
		A3 = new JLabel();
		A3.setBounds(135,34,49,50);
		add(A3);
		A3.setName("02");
		A4 = new JLabel();
		A4.setBounds(185,34,49,50);
		add(A4);
		A4.setName("03");
		A5 = new JLabel();
		A5.setBounds(236,34,49,50);
		add(A5);
		A5.setName("04");
		A6 = new JLabel();
		A6.setBounds(286,34,49,50);
		add(A6);
		A6.setName("05");
		A7 = new JLabel();
		A7.setBounds(336,34,49,50);
		add(A7);
		A7.setName("06");
		A8 = new JLabel();
		A8.setBounds(385,34,49,50);
		add(A8);
		A8.setName("07");
		A9 = new JLabel();
		A9.setBounds(435,34,49,50);
		add(A9);
		A9.setName("08");
		A10 = new JLabel();
		A10.setBounds(485,34,49,50);
		add(A10);
		A10.setName("09");
		A11 = new JLabel();
		A11.setBounds(535,34,49,50);
		add(A11);
		A11.setName("010");
		A12 = new JLabel();
		A12.setBounds(585,34,49,50);
		add(A12);
		A12.setName("011");
		A13 = new JLabel();
		A13.setBounds(636,34,49,50);
		add(A13);
		A13.setName("012");
		A14 = new JLabel();
		A14.setBounds(686,34,49,50);
		add(A14);
		A14.setName("013");
		A15 = new JLabel();
		A15.setBounds(735,34,49,50);
		add(A15);
		A15.setName("014");

		B1 = new JLabel();
		B1.setBounds(36,84,49,50);
		B1.setName("10");
		add(B1);
		B2 = new JLabel();
		B2.setBounds(86,84,49,50);
		add(B2);
		B2.setName("11");
		B3 = new JLabel();
		B3.setBounds(135,84,49,50);
		add(B3);
		B3.setName("12");
		B4 = new JLabel();
		B4.setBounds(185,84,49,50);
		add(B4);
		B4.setName("13");
		B5 = new JLabel();
		B5.setBounds(236,84,49,50);
		add(B5);
		B5.setName("14");
		B6 = new JLabel();
		B6.setBounds(286,84,49,50);
		add(B6);
		B6.setName("15");
		B7 = new JLabel();
		B7.setBounds(336,84,49,50);
		add(B7);
		B7.setName("16");
		B8 = new JLabel();
		B8.setBounds(385,84,49,50);
		add(B8);
		B8.setName("17");
		B9 = new JLabel();
		B9.setBounds(435,84,49,50);
		add(B9);
		B9.setName("18");
		B10 = new JLabel();
		B10.setBounds(485,84,49,50);
		add(B10);
		B10.setName("19");
		B11 = new JLabel();
		B11.setBounds(535,84,49,50);
		add(B11);
		B11.setName("110");
		B12 = new JLabel();
		B12.setBounds(585,84,49,50);
		add(B12);
		B12.setName("111");
		B13 = new JLabel();
		B13.setBounds(636,84,49,50);
		add(B13);
		B13.setName("112");
		B14 = new JLabel();
		B14.setBounds(686,84,49,50);
		add(B14);
		B14.setName("113");
		B15 = new JLabel();
		B15.setBounds(735,84,49,50);
		add(B15);
		B15.setName("114");

		C1 = new JLabel();
		C1.setBounds(36,134,49,50);
		add(C1);
		C1.setName("20");
		C2 = new JLabel();
		C2.setBounds(86,134,49,50);
		add(C2);
		C2.setName("21");
		C3 = new JLabel();
		C3.setBounds(135,134,49,50);
		add(C3);
		C3.setName("22");
		C4 = new JLabel();
		C4.setBounds(185,134,49,50);
		add(C4);
		C4.setName("23");
		C5 = new JLabel();
		C5.setBounds(236,134,49,50);
		add(C5);
		C5.setName("24");
		C6 = new JLabel();
		C6.setBounds(286,134,49,50);
		add(C6);
		C6.setName("25");
		C7 = new JLabel();
		C7.setBounds(336,134,49,50);
		add(C7);
		C7.setName("26");
		C8 = new JLabel();
		C8.setBounds(385,134,49,50);
		add(C8);
		C8.setName("27");
		C9 = new JLabel();
		C9.setBounds(435,134,49,50);
		add(C9);
		C9.setName("28");
		C10 = new JLabel();
		C10.setBounds(485,134,49,50);
		add(C10);
		C10.setName("209");
		C11 = new JLabel();
		C11.setBounds(535,134,49,50);
		add(C11);
		C11.setName("210");
		C12 = new JLabel();
		C12.setBounds(585,134,49,50);
		add(C12);
		C12.setName("211");
		C13 = new JLabel();
		C13.setBounds(636,134,49,50);
		add(C13);
		C13.setName("212");
		C14 = new JLabel();
		C14.setBounds(686,134,49,50);
		add(C14);
		C14.setName("213");
		C15 = new JLabel();
		C15.setBounds(735,134,49,50);
		add(C15);
		C15.setName("215");


		D1 = new JLabel();
		D1.setBounds(36,184,49,50);
		add(D1);
		D1.setName("30");
		D2 = new JLabel();
		D2.setBounds(86,184,49,50);
		add(D2);
		D2.setName("31");
		D3 = new JLabel();
		D3.setBounds(135,184,49,50);
		add(D3);
		D3.setName("32");
		D4 = new JLabel();
		D4.setBounds(185,184,49,50);
		add(D4);
		D4.setName("33");
		D5 = new JLabel();
		D5.setBounds(236,184,49,50);
		add(D5);
		D5.setName("34");
		D6 = new JLabel();
		D6.setBounds(286,184,49,50);
		add(D6);
		D6.setName("35");
		D7 = new JLabel();
		D7.setBounds(336,184,49,50);
		add(D7);
		D7.setName("36");
		D8 = new JLabel();
		D8.setBounds(385,184,49,50);
		add(D8);
		D8.setName("37");
		D9 = new JLabel();
		D9.setBounds(435,184,49,50);
		add(D9);
		D9.setName("38");
		D10 = new JLabel();
		D10.setBounds(485,184,49,50);
		add(D10);
		D10.setName("39");
		D11 = new JLabel();
		D11.setBounds(535,184,49,50);
		add(D11);
		D11.setName("310");
		D12 = new JLabel();
		D12.setBounds(585,184,49,50);
		add(D12);
		D12.setName("311");
		D13 = new JLabel();
		D13.setBounds(636,184,49,50);
		add(D13);
		D13.setName("312");
		D14 = new JLabel();
		D14.setBounds(686,184,49,50);
		add(D14);
		D14.setName("313");
		D15 = new JLabel();
		D15.setBounds(735,184,49,50);
		add(D15);
		D15.setName("314");

		E1 = new JLabel();
		E1.setBounds(36,234,49,50);
		add(E1);
		E1.setName("40");
		E2 = new JLabel();
		E2.setBounds(86,234,49,50);
		add(E2);
		E2.setName("41");
		E3 = new JLabel();
		E3.setBounds(135,234,49,50);
		add(E3);
		E3.setName("42");
		E4 = new JLabel();
		E4.setBounds(185,234,49,50);
		add(E4);
		E4.setName("43");
		E5 = new JLabel();
		E5.setBounds(236,234,49,50);
		add(E5);
		E5.setName("44");
		E6 = new JLabel();
		E6.setBounds(286,234,49,50);
		add(E6);
		E6.setName("45");
		E7 = new JLabel();
		E7.setBounds(336,234,49,50);
		add(E7);
		E7.setName("46");
		E8 = new JLabel();
		E8.setBounds(385,234,49,50);
		add(E8);
		E8.setName("47");
		E9 = new JLabel();
		E9.setBounds(435,234,49,50);
		add(E9);
		E9.setName("48");
		E10 = new JLabel();
		E10.setBounds(485,234,49,50);
		add(E10);
		E10.setName("49");
		E11 = new JLabel();
		E11.setBounds(535,234,49,50);
		add(E11);
		E11.setName("410");
		E12 = new JLabel();
		E12.setBounds(585,234,49,50);
		add(E12);
		E12.setName("411");
		E13 = new JLabel();
		E13.setBounds(636,234,49,50);
		add(E13);
		E13.setName("412");
		E14 = new JLabel();
		E14.setBounds(686,234,49,50);
		add(E14);
		E14.setName("413");
		E15 = new JLabel();
		E15.setBounds(735,234,49,50);
		add(E15);
		E15.setName("414");

		F1 = new JLabel();
		F1.setBounds(36,284,49,50);
		add(F1);
		F1.setName("50");
		F2 = new JLabel();
		F2.setBounds(86,284,49,50);
		add(F2);
		F2.setName("51");
		F3 = new JLabel();
		F3.setBounds(135,284,49,50);
		add(F3);
		F3.setName("52");
		F4 = new JLabel();
		F4.setBounds(185,284,49,50);
		add(F4);
		F4.setName("53");
		F5 = new JLabel();
		F5.setBounds(236,284,49,50);
		add(F5);
		F5.setName("54");
		F6 = new JLabel();
		F6.setBounds(286,284,49,50);
		add(F6);
		F6.setName("55");
		F7 = new JLabel();
		F7.setBounds(336,284,49,50);
		add(F7);
		F7.setName("56");
		F8 = new JLabel();
		F8.setBounds(385,284,49,50);
		add(F8);
		F8.setName("57");
		F9 = new JLabel();
		F9.setBounds(435,284,49,50);
		add(F9);
		F9.setName("58");
		F10 = new JLabel();
		F10.setBounds(485,284,49,50);
		add(F10);
		F10.setName("59");
		F11 = new JLabel();
		F11.setBounds(535,284,49,50);
		add(F11);
		F11.setName("510");
		F12 = new JLabel();
		F12.setBounds(585,284,49,50);
		add(F12);
		F12.setName("511");
		F13 = new JLabel();
		F13.setBounds(636,284,49,50);
		add(F13);
		F13.setName("512");
		F14 = new JLabel();
		F14.setBounds(686,284,49,50);
		add(F14);
		F14.setName("513");
		F15 = new JLabel();
		F15.setBounds(735,284,49,50);
		add(F15);
		F15.setName("514");

		G1 = new JLabel();
		G1.setBounds(36,334,49,50);
		add(G1);
		G1.setName("60");
		G2 = new JLabel();
		G2.setBounds(86,334,49,50);
		add(G2);
		G2.setName("61");
		G3 = new JLabel();
		G3.setBounds(135,334,49,50);
		add(G3);
		G3.setName("62");
		G4 = new JLabel();
		G4.setBounds(185,334,49,50);
		add(G4);
		G4.setName("63");
		G5 = new JLabel();
		G5.setBounds(236,334,49,50);
		add(G5);
		G5.setName("64");
		G6 = new JLabel();
		G6.setBounds(286,334,49,50);
		add(G6);
		G6.setName("65");
		G7 = new JLabel();
		G7.setBounds(336,334,49,50);
		add(G7);
		G7.setName("66");
		G8 = new JLabel();
		G8.setBounds(385,334,49,50);
		add(G8);
		G8.setName("67");
		G9 = new JLabel();
		G9.setBounds(435,334,49,50);
		add(G9);
		G9.setName("68");
		G10 = new JLabel();
		G10.setBounds(485,334,49,50);
		add(G10);
		G10.setName("69");
		G11 = new JLabel();
		G11.setBounds(535,334,49,50);
		add(G11);
		G11.setName("610");
		G12 = new JLabel();
		G12.setBounds(585,334,49,50);
		add(G12);
		G12.setName("611");
		G13 = new JLabel();
		G13.setBounds(636,334,49,50);
		add(G13);
		G12.setName("612");
		G14 = new JLabel();
		G14.setBounds(686,334,49,50);
		add(G14);
		G14.setName("613");
		G15 = new JLabel();
		G15.setBounds(735,334,49,50);
		add(G15);
		G11.setName("614");

		H1 = new JLabel();
		H1.setBounds(36,384,49,50);
		add(H1);
		H1.setName("70");
		H2 = new JLabel();
		H2.setBounds(86,384,49,50);
		add(H2);
		H2.setName("71");
		H3 = new JLabel();
		H3.setBounds(135,384,49,50);
		add(H3);
		H3.setName("72");
		H4 = new JLabel();
		H4.setBounds(185,384,49,50);
		add(H4);
		H4.setName("73");
		H5 = new JLabel();
		H5.setBounds(236,384,49,50);
		add(H5);
		H5.setName("74");
		H6 = new JLabel();
		H6.setBounds(286,384,49,50);
		add(H6);
		H6.setName("75");
		H7 = new JLabel();
		H7.setBounds(336,384,49,50);
		add(H7);
		H7.setName("76");
		H8 = new JLabel();
		H8.setBounds(385,384,49,50);
		add(H8);
		H8.setName("77");
		H9 = new JLabel();
		H9.setBounds(435,384,49,50);
		add(H9);
		H9.setName("78");
		H10 = new JLabel();
		H10.setBounds(485,384,49,50);
		add(H10);
		H10.setName("79");
		H11 = new JLabel();
		H11.setBounds(535,384,49,50);
		add(H11);
		H11.setName("710");
		H12 = new JLabel();
		H12.setBounds(585,384,49,50);
		add(H12);
		H12.setName("711");
		H13 = new JLabel();
		H13.setBounds(636,384,49,50);
		add(H13);
		H13.setName("712");
		H14 = new JLabel();
		H14.setBounds(686,384,49,50);
		add(H14);
		H14.setName("713");
		H15 = new JLabel();
		H15.setBounds(735,384,49,50);
		add(H15);
		H15.setName("714");

		I1 = new JLabel();
		I1.setBounds(36,434,49,50);
		add(I1);
		I1.setName("80");
		I2 = new JLabel();
		I2.setBounds(86,434,49,50);
		add(I2);
		I2.setName("81");
		I3 = new JLabel();
		I3.setBounds(135,434,49,50);
		add(I3);
		I3.setName("82");
		I4 = new JLabel();
		I4.setBounds(185,434,49,50);
		add(I4);
		I4.setName("83");
		I5 = new JLabel();
		I5.setBounds(236,434,49,50);
		add(I5);
		I5.setName("84");
		I6 = new JLabel();
		I6.setBounds(286,434,49,50);
		add(I6);
		I6.setName("85");
		I7 = new JLabel();
		I7.setBounds(336,434,49,50);
		add(I7);
		I7.setName("86");
		I8 = new JLabel();
		I8.setBounds(385,434,49,50);
		add(I8);
		I8.setName("87");
		I9 = new JLabel();
		I9.setBounds(435,434,49,50);
		add(I9);
		I9.setName("88");
		I10 = new JLabel();
		I10.setBounds(485,434,49,50);
		add(I10);
		I10.setName("89");
		I11 = new JLabel();
		I11.setBounds(535,434,49,50);
		add(I11);
		I11.setName("810");
		I12 = new JLabel();
		I12.setBounds(585,434,49,50);
		add(I12);
		I12.setName("811");
		I13 = new JLabel();
		I13.setBounds(636,434,49,50);
		add(I13);
		I13.setName("812");
		I14 = new JLabel();
		I14.setBounds(686,434,49,50);
		add(I14);
		I14.setName("813");
		I15 = new JLabel();
		I15.setBounds(735,434,49,50);
		add(I15);
		I15.setName("814");

		J1 = new JLabel();
		J1.setBounds(36,484,49,50);
		add(J1);
		J1.setName("90");
		J2 = new JLabel();
		J2.setBounds(86,484,49,50);
		add(J2);
		J2.setName("91");
		J3 = new JLabel();
		J3.setBounds(135,484,49,50);
		add(J3);
		J3.setName("92");
		J4 = new JLabel();
		J4.setBounds(185,484,49,50);
		add(J4);
		J4.setName("93");
		J5 = new JLabel();
		J5.setBounds(236,484,49,50);
		add(J5);
		J5.setName("94");
		J6 = new JLabel();
		J6.setBounds(286,484,49,50);
		add(J6);
		J6.setName("95");
		J7 = new JLabel();
		J7.setBounds(336,484,49,50);
		add(J7);
		J7.setName("96");
		J8 = new JLabel();
		J8.setBounds(385,484,49,50);
		add(J8);
		J8.setName("97");
		J9 = new JLabel();
		J9.setBounds(435,484,49,50);
		add(J9);
		J9.setName("98");
		J10 = new JLabel();
		J10.setBounds(485,484,49,50);
		add(J10);
		J10.setName("99");
		J11 = new JLabel();
		J11.setBounds(535,484,49,50);
		add(J11);
		J11.setName("910");
		J12 = new JLabel();
		J12.setBounds(585,484,49,50);
		add(J12);
		J12.setName("911");
		J13 = new JLabel();
		J13.setBounds(636,484,49,50);
		add(J13);
		J13.setName("912");
		J14 = new JLabel();
		J14.setBounds(686,484,49,50);
		add(J14);
		J14.setName("913");
		J15 = new JLabel();
		J15.setBounds(735,484,49,50);
		add(J15);
		J15.setName("914");

		K1 = new JLabel();
		K1.setBounds(36,534,49,50);
		add(K1);
		K1.setName("10000");
		K2 = new JLabel();
		K2.setBounds(86,534,49,50);
		add(K2);
		K2.setName("10100");
		K3 = new JLabel();
		K3.setBounds(135,534,49,50);
		add(K3);
		K3.setName("10200");
		K4 = new JLabel();
		K4.setBounds(185,534,49,50);
		add(K4);
		K4.setName("10300");
		K5 = new JLabel();
		K5.setBounds(236,534,49,50);
		add(K5);
		K5.setName("10400");
		K6 = new JLabel();
		K6.setBounds(286,534,49,50);
		add(K6);
		K6.setName("10500");
		K7 = new JLabel();
		K7.setBounds(336,534,49,50);
		add(K7);
		K7.setName("10600");
		K8 = new JLabel();
		K8.setBounds(385,534,49,50);
		add(K8);
		K8.setName("10700");
		K9 = new JLabel();
		K9.setBounds(435,534,49,50);
		add(K9);
		K9.setName("10800");
		K10 = new JLabel();
		K10.setBounds(485,534,49,50);
		add(K10);
		K10.setName("10900");
		K11 = new JLabel();
		K11.setBounds(535,534,49,50);
		add(K11);
		K11.setName("1010");
		K12 = new JLabel();
		K12.setBounds(585,534,49,50);
		add(K12);
		K12.setName("1011");
		K13 = new JLabel();
		K13.setBounds(636,534,49,50);
		add(K13);
		K13.setName("1012");
		K14 = new JLabel();
		K14.setBounds(686,534,49,50);
		add(K14);
		K14.setName("1013");
		K15 = new JLabel();
		K15.setBounds(735,534,49,50);
		add(K15);
		K11.setName("1014");

		L1 = new JLabel();
		L1.setBounds(36,584,49,50);
		add(L1);
		L1.setName("11000");
		L2 = new JLabel();
		L2.setBounds(86,584,49,50);
		add(L2);
		L2.setName("11100");
		L3 = new JLabel();
		L3.setBounds(135,584,49,50);
		add(L3);
		L3.setName("11200");
		L4 = new JLabel();
		L4.setBounds(185,584,49,50);
		add(L4);
		L4.setName("11300");
		L5 = new JLabel();
		L5.setBounds(236,584,49,50);
		add(L5);
		L5.setName("11400");
		L6 = new JLabel();
		L6.setBounds(286,584,49,50);
		add(L6);
		L6.setName("11500");
		L7 = new JLabel();
		L7.setBounds(336,584,49,50);
		add(L7);
		L7.setName("11600");
		L8 = new JLabel();
		L8.setBounds(385,584,49,50);
		add(L8);
		L8.setName("11700");
		L9 = new JLabel();
		L9.setBounds(435,584,49,50);
		add(L9);
		L9.setName("11800");
		L10 = new JLabel();
		L10.setBounds(485,584,49,50);
		add(L10);
		L10.setName("11900");
		L11 = new JLabel();
		L11.setBounds(535,584,49,50);
		add(L11);
		L11.setName("1110");
		L12 = new JLabel();
		L12.setBounds(585,584,49,50);
		add(L12);
		L11.setName("1111");
		L13 = new JLabel();
		L13.setBounds(636,584,49,50);
		add(L13);
		L11.setName("1112");
		L14 = new JLabel();
		L14.setBounds(686,584,49,50);
		add(L14);
		L14.setName("1113");
		L15 = new JLabel();
		L15.setBounds(735,584,49,50);
		add(L15);
		L15.setName("1114");

		M1 = new JLabel();
		M1.setName("12000");
		M1.setBounds(36,634,49,50);
		add(M1);
		M2 = new JLabel();
		M2.setBounds(86,634,49,50);
		add(M2);
		M2.setName("12100");
		M3 = new JLabel();
		M3.setBounds(135,634,49,50);
		add(M3);
		M3.setName("12200");
		M4 = new JLabel();
		M4.setBounds(185,634,49,50);
		add(M4);
		M4.setName("12300");
		M5 = new JLabel();
		M5.setBounds(236,634,49,50);
		add(M5);
		M5.setName("12400");
		M6 = new JLabel();
		M6.setBounds(286,634,49,50);
		add(M6);
		M6.setName("12500");
		M7 = new JLabel();
		M7.setBounds(336,634,49,50);
		add(M7);
		M7.setName("12600");
		M8 = new JLabel();
		M8.setBounds(385,634,49,50);
		add(M8);
		M8.setName("12700");
		M9 = new JLabel();
		M9.setBounds(435,634,49,50);
		add(M9);
		M9.setName("12800");
		M10 = new JLabel();
		M10.setBounds(485,634,49,50);
		add(M10);
		M10.setName("12900");
		M11 = new JLabel();
		M11.setBounds(535,634,49,50);
		add(M11);
		M11.setName("1210");
		M12 = new JLabel();
		M12.setBounds(585,634,49,50);
		add(M12);
		M12.setName("1211");
		M13 = new JLabel();
		M13.setBounds(636,634,49,50);
		add(M13);
		M13.setName("1212");
		M14 = new JLabel();
		M14.setBounds(686,634,49,50);
		add(M14);
		M14.setName("1213");
		M15 = new JLabel();
		M15.setBounds(735,634,49,50);
		add(M15);
		M15.setName("1214");

		N1 = new JLabel();
		N1.setBounds(36,684,49,50);
		add(N1);
		N1.setName("13000");
		N2 = new JLabel();
		N2.setBounds(86,684,49,50);
		add(N2);
		N2.setName("13100");
		N3 = new JLabel();
		N3.setBounds(135,684,49,50);
		add(N3);
		N3.setName("13200");
		N4 = new JLabel();
		N4.setBounds(185,684,49,50);
		add(N4);
		N4.setName("13300");
		N5 = new JLabel();
		N5.setBounds(236,684,49,50);
		add(N5);
		N5.setName("13400");
		N6 = new JLabel();
		N6.setBounds(286,684,49,50);
		add(N6);
		N6.setName("13500");
		N7 = new JLabel();
		N7.setBounds(336,684,49,50);
		add(N7);
		N7.setName("13600");
		N8 = new JLabel();
		N8.setBounds(385,684,49,50);
		add(N8);
		N8.setName("13700");
		N9 = new JLabel();
		N9.setBounds(435,684,49,50);
		add(N9);
		N9.setName("13800");
		N10 = new JLabel();
		N10.setBounds(485,684,49,50);
		add(N10);
		N10.setName("13900");
		N11 = new JLabel();
		N11.setBounds(535,684,49,50);
		add(N11);
		N11.setName("1310");
		N12 = new JLabel();
		N12.setBounds(585,684,49,50);
		add(N12);
		N12.setName("1311");
		N13 = new JLabel();
		N13.setBounds(636,684,49,50);
		add(N13);
		N13.setName("1312");
		N14 = new JLabel();
		N14.setBounds(686,684,49,50);
		add(N14);
		N14.setName("1313");
		N15 = new JLabel();
		N15.setBounds(735,684,49,50);
		add(N15);
		N15.setName("1314");

		O1 = new JLabel();
		O1.setBounds(36,734,49,50);
		add(O1);
		O1.setName("14000");
		O2 = new JLabel();
		O2.setBounds(86,734,49,50);
		add(O2);
		O2.setName("14100");
		O3 = new JLabel();
		O3.setBounds(135,734,49,50);
		add(O3);
		O3.setName("14200");
		O4 = new JLabel();
		O4.setBounds(185,734,49,50);
		add(O4);
		O4.setName("14300");
		O5 = new JLabel();
		O5.setBounds(236,734,49,50);
		add(O5);
		O5.setName("14400");
		O6 = new JLabel();
		O6.setBounds(286,734,49,50);
		add(O6);
		O6.setName("14500");
		O7 = new JLabel();
		O7.setBounds(336,734,49,50);
		add(O7);
		O7.setName("14600");
		O8 = new JLabel();
		O8.setBounds(385,734,49,50);
		add(O8);
		O8.setName("14700");
		O9 = new JLabel();
		O9.setBounds(435,734,49,50);
		add(O9);
		O9.setName("14800");
		O10 = new JLabel();
		O10.setBounds(485,734,49,50);
		add(O10);
		O10.setName("14900");
		O11 = new JLabel();
		O11.setBounds(535,734,49,50);
		add(O11);
		O11.setName("1410");
		O12 = new JLabel();
		O12.setBounds(585,734,49,50);
		add(O12);
		O12.setName("1411");
		O13 = new JLabel();
		O13.setBounds(636,734,49,50);
		add(O13);
		O13.setName("1412");
		O14 = new JLabel();
		O14.setBounds(686,734,49,50);
		add(O14);
		O14.setName("1413");
		O15 = new JLabel();
		O15.setBounds(735,734,49,50);
		add(O15);
		O15.setName("1414");

		MouseListener listener = new DragMouseAdapter();

		/*H8.addMouseListener(listener);
		H8.setTransferHandler(new TransferHandler("icon"));
		
		if(flag1 == true) {
			
			G8.addMouseListener(listener);
			G8.setTransferHandler(new TransferHandler("icon"));
			
			
			H7.addMouseListener(listener);
			H7.setTransferHandler(new TransferHandler("icon"));
			
			I8.addMouseListener(listener);
			I8.setTransferHandler(new TransferHandler("icon"));
			
			H9.addMouseListener(listener);
			H9.setTransferHandler(new TransferHandler("icon"));
		}
		
		*/
		
		MouseListener listen = new Events();
		
		A1.addMouseListener(listen);
		A1.setTransferHandler(new TransferHandler("icon"));
		
		A2.addMouseListener(listen);
		A2.setTransferHandler(new TransferHandler("icon"));
		
		A3.addMouseListener(listen);
		A3.setTransferHandler(new TransferHandler("icon"));
		
		A4.addMouseListener(listen);
		A4.setTransferHandler(new TransferHandler("icon"));
		
		A5.addMouseListener(listen);
		A5.setTransferHandler(new TransferHandler("icon"));
		
		A6.addMouseListener(listen);
		A6.setTransferHandler(new TransferHandler("icon"));
		
		A7.addMouseListener(listen);
		A7.setTransferHandler(new TransferHandler("icon"));
		
		A8.addMouseListener(listen);
		A8.setTransferHandler(new TransferHandler("icon"));
		
		A9.addMouseListener(listen);
		A9.setTransferHandler(new TransferHandler("icon"));
		
		A10.addMouseListener(listen);
		A10.setTransferHandler(new TransferHandler("icon"));
		
		A11.addMouseListener(listen);
		A11.setTransferHandler(new TransferHandler("icon"));
		
		A12.addMouseListener(listen);
		A12.setTransferHandler(new TransferHandler("icon"));
		
		A13.addMouseListener(listen);
		A13.setTransferHandler(new TransferHandler("icon"));
		
		A14.addMouseListener(listen);
		A14.setTransferHandler(new TransferHandler("icon"));
		
		A15.addMouseListener(listen);
		A15.setTransferHandler(new TransferHandler("icon"));
		
		

		B1.addMouseListener(listen);
		B1.setTransferHandler(new TransferHandler("icon"));
		
		B2.addMouseListener(listen);
		B2.setTransferHandler(new TransferHandler("icon"));
		
		B3.addMouseListener(listen);
		B3.setTransferHandler(new TransferHandler("icon"));
		
		B4.addMouseListener(listen);
		B4.setTransferHandler(new TransferHandler("icon"));
		
		B5.addMouseListener(listen);
		B5.setTransferHandler(new TransferHandler("icon"));
		
		B6.addMouseListener(listen);
		B6.setTransferHandler(new TransferHandler("icon"));
		
		B7.addMouseListener(listen);
		B7.setTransferHandler(new TransferHandler("icon"));
		
		B8.addMouseListener(listen);
		B8.setTransferHandler(new TransferHandler("icon"));
		
		B9.addMouseListener(listen);
		B9.setTransferHandler(new TransferHandler("icon"));
		
		B10.addMouseListener(listen);
		B10.setTransferHandler(new TransferHandler("icon"));
		
		B11.addMouseListener(listen);
		B11.setTransferHandler(new TransferHandler("icon"));
		
		B12.addMouseListener(listen);
		B12.setTransferHandler(new TransferHandler("icon"));
		
		B13.addMouseListener(listen);
		B13.setTransferHandler(new TransferHandler("icon"));
		
		B14.addMouseListener(listen);
		B14.setTransferHandler(new TransferHandler("icon"));
		
		B15.addMouseListener(listen);
		B15.setTransferHandler(new TransferHandler("icon"));
		
		
		C1.addMouseListener(listen);
		C1.setTransferHandler(new TransferHandler("icon"));
		
		C2.addMouseListener(listen);
		C2.setTransferHandler(new TransferHandler("icon"));
		
		C3.addMouseListener(listen);
		C3.setTransferHandler(new TransferHandler("icon"));
		
		C4.addMouseListener(listen);
		C4.setTransferHandler(new TransferHandler("icon"));
		
		C5.addMouseListener(listen);
		C5.setTransferHandler(new TransferHandler("icon"));
		
		C6.addMouseListener(listen);
		C6.setTransferHandler(new TransferHandler("icon"));
		
		C7.addMouseListener(listen);
		C7.setTransferHandler(new TransferHandler("icon"));
		
		C8.addMouseListener(listen);
		C8.setTransferHandler(new TransferHandler("icon"));
		
		C9.addMouseListener(listen);
		C9.setTransferHandler(new TransferHandler("icon"));
		
		C10.addMouseListener(listen);
		C10.setTransferHandler(new TransferHandler("icon"));
		
		C11.addMouseListener(listen);
		C11.setTransferHandler(new TransferHandler("icon"));
	
		C12.addMouseListener(listen);
		C12.setTransferHandler(new TransferHandler("icon"));
		
		C13.addMouseListener(listen);
		C13.setTransferHandler(new TransferHandler("icon"));
		
		C14.addMouseListener(listen);
		C14.setTransferHandler(new TransferHandler("icon"));
		
		C15.addMouseListener(listen);
		C15.setTransferHandler(new TransferHandler("icon"));
		
		D1.addMouseListener(listen);
		D1.setTransferHandler(new TransferHandler("icon"));
		
		D2.addMouseListener(listen);
		D2.setTransferHandler(new TransferHandler("icon"));
		
		D3.addMouseListener(listen);
		D3.setTransferHandler(new TransferHandler("icon"));
		
		D4.addMouseListener(listen);
		D4.setTransferHandler(new TransferHandler("icon"));
		
		D5.addMouseListener(listen);
		D5.setTransferHandler(new TransferHandler("icon"));
		
		D6.addMouseListener(listen);
		D6.setTransferHandler(new TransferHandler("icon"));
		
		D7.addMouseListener(listen);
		D7.setTransferHandler(new TransferHandler("icon"));
		
		D8.addMouseListener(listen);
		D8.setTransferHandler(new TransferHandler("icon"));
		
		D9.addMouseListener(listen);
		D9.setTransferHandler(new TransferHandler("icon"));
		
		D10.addMouseListener(listen);
		D10.setTransferHandler(new TransferHandler("icon"));
	
		D11.addMouseListener(listen);
		D11.setTransferHandler(new TransferHandler("icon"));
	
		D12.addMouseListener(listen);
		D12.setTransferHandler(new TransferHandler("icon"));
		
		D13.addMouseListener(listen);
		D13.setTransferHandler(new TransferHandler("icon"));
		
		D14.addMouseListener(listen);
		D14.setTransferHandler(new TransferHandler("icon"));
		
		D15.addMouseListener(listen);
		D15.setTransferHandler(new TransferHandler("icon"));
		
		E1.addMouseListener(listen);
		E1.setTransferHandler(new TransferHandler("icon"));
		
		E2.addMouseListener(listen);
		E2.setTransferHandler(new TransferHandler("icon"));
	
		E3.addMouseListener(listen);
		E3.setTransferHandler(new TransferHandler("icon"));
		
		E4.addMouseListener(listen);
		E4.setTransferHandler(new TransferHandler("icon"));
		
		E5.addMouseListener(listen);
		E5.setTransferHandler(new TransferHandler("icon"));
		
		E6.addMouseListener(listen);
		E6.setTransferHandler(new TransferHandler("icon"));
		
		E7.addMouseListener(listen);
		E7.setTransferHandler(new TransferHandler("icon"));
		
		E8.addMouseListener(listen);
		E8.setTransferHandler(new TransferHandler("icon"));
	
		E9.addMouseListener(listen);
		E9.setTransferHandler(new TransferHandler("icon"));
		
		E10.addMouseListener(listen);
		E10.setTransferHandler(new TransferHandler("icon"));
		
		E11.addMouseListener(listen);
		E11.setTransferHandler(new TransferHandler("icon"));
	
		E12.addMouseListener(listen);
		E12.setTransferHandler(new TransferHandler("icon"));
		
		E13.addMouseListener(listen);
		E13.setTransferHandler(new TransferHandler("icon"));
		
		E14.addMouseListener(listen);
		E14.setTransferHandler(new TransferHandler("icon"));
		
		E15.addMouseListener(listen);
		E15.setTransferHandler(new TransferHandler("icon"));
		
		F1.addMouseListener(listen);
		F1.setTransferHandler(new TransferHandler("icon"));
		
		F2.addMouseListener(listen);
		F2.setTransferHandler(new TransferHandler("icon"));
		
		F3.addMouseListener(listen);
		F3.setTransferHandler(new TransferHandler("icon"));
		
		F4.addMouseListener(listen);
		F4.setTransferHandler(new TransferHandler("icon"));
		
		F5.addMouseListener(listen);
		F5.setTransferHandler(new TransferHandler("icon"));
		
		F6.addMouseListener(listen);
		F6.setTransferHandler(new TransferHandler("icon"));
		
		F7.addMouseListener(listen);
		F7.setTransferHandler(new TransferHandler("icon"));
		
		F8.addMouseListener(listen);
		F8.setTransferHandler(new TransferHandler("icon"));
		
		F9.addMouseListener(listen);
		F9.setTransferHandler(new TransferHandler("icon"));
		
		F10.addMouseListener(listen);
		F10.setTransferHandler(new TransferHandler("icon"));
		
		F11.addMouseListener(listen);
		F11.setTransferHandler(new TransferHandler("icon"));
	
		F12.addMouseListener(listen);
		F12.setTransferHandler(new TransferHandler("icon"));
		
		F13.addMouseListener(listen);
		F13.setTransferHandler(new TransferHandler("icon"));
		
		F14.addMouseListener(listen);
		F14.setTransferHandler(new TransferHandler("icon"));
		
		F15.addMouseListener(listen);
		F15.setTransferHandler(new TransferHandler("icon"));
		
		G1.addMouseListener(listen);
		G1.setTransferHandler(new TransferHandler("icon"));
		
		G2.addMouseListener(listen);
		G2.setTransferHandler(new TransferHandler("icon"));
		
		G3.addMouseListener(listen);
		G3.setTransferHandler(new TransferHandler("icon"));
		
		G4.addMouseListener(listen);
		G4.setTransferHandler(new TransferHandler("icon"));
		
		G5.addMouseListener(listen);
		G5.setTransferHandler(new TransferHandler("icon"));
		
		G6.addMouseListener(listen);
		G6.setTransferHandler(new TransferHandler("icon"));
		
		G7.addMouseListener(listen);
		G7.setTransferHandler(new TransferHandler("icon"));
		
		G8.addMouseListener(listen);
		G8.setTransferHandler(new TransferHandler("icon"));
		
		G9.addMouseListener(listen);
		G9.setTransferHandler(new TransferHandler("icon"));
		
		G10.addMouseListener(listen);
		G10.setTransferHandler(new TransferHandler("icon"));
		
		G11.addMouseListener(listen);
		G11.setTransferHandler(new TransferHandler("icon"));
	
		G12.addMouseListener(listen);
		G12.setTransferHandler(new TransferHandler("icon"));
		
		G13.addMouseListener(listen);
		G13.setTransferHandler(new TransferHandler("icon"));
		
		G14.addMouseListener(listen);
		G14.setTransferHandler(new TransferHandler("icon"));
		
		G15.addMouseListener(listen);
		G15.setTransferHandler(new TransferHandler("icon"));
		
		H1.addMouseListener(listen);
		H1.setTransferHandler(new TransferHandler("icon"));
		
		H2.addMouseListener(listen);
		H2.setTransferHandler(new TransferHandler("icon"));
		
		H3.addMouseListener(listen);
		H3.setTransferHandler(new TransferHandler("icon"));
		
		H4.addMouseListener(listen);
		H4.setTransferHandler(new TransferHandler("icon"));
		
		H5.addMouseListener(listen);
		H5.setTransferHandler(new TransferHandler("icon"));
		
		H6.addMouseListener(listen);
		H6.setTransferHandler(new TransferHandler("icon"));
		
		H7.addMouseListener(listen);
		H7.setTransferHandler(new TransferHandler("icon"));
		
		H8.addMouseListener(listen);
		H8.setTransferHandler(new TransferHandler("icon"));
		
		H9.addMouseListener(listen);
		H9.setTransferHandler(new TransferHandler("icon"));
		
		H10.addMouseListener(listen);
		H10.setTransferHandler(new TransferHandler("icon"));
		
		H11.addMouseListener(listen);
		H11.setTransferHandler(new TransferHandler("icon"));
	
		H12.addMouseListener(listen);
		H12.setTransferHandler(new TransferHandler("icon"));
		
		H13.addMouseListener(listen);
		H13.setTransferHandler(new TransferHandler("icon"));
		
		H14.addMouseListener(listen);
		H14.setTransferHandler(new TransferHandler("icon"));
		
		H15.addMouseListener(listen);
		H15.setTransferHandler(new TransferHandler("icon"));
		
		I1.addMouseListener(listen);
		I1.setTransferHandler(new TransferHandler("icon"));
		
		I2.addMouseListener(listen);
		I2.setTransferHandler(new TransferHandler("icon"));
		
		I3.addMouseListener(listen);
		I3.setTransferHandler(new TransferHandler("icon"));
		
		I4.addMouseListener(listen);
		I4.setTransferHandler(new TransferHandler("icon"));
		
		I5.addMouseListener(listen);
		I5.setTransferHandler(new TransferHandler("icon"));
		
		I6.addMouseListener(listen);
		I6.setTransferHandler(new TransferHandler("icon"));
		
		I7.addMouseListener(listen);
		I7.setTransferHandler(new TransferHandler("icon"));
		
		I8.addMouseListener(listen);
		I8.setTransferHandler(new TransferHandler("icon"));
		
		I9.addMouseListener(listen);
		I9.setTransferHandler(new TransferHandler("icon"));
		
		I10.addMouseListener(listen);
		I10.setTransferHandler(new TransferHandler("icon"));
		
		I11.addMouseListener(listen);
		I11.setTransferHandler(new TransferHandler("icon"));
	
		I12.addMouseListener(listen);
		I12.setTransferHandler(new TransferHandler("icon"));
		
		I13.addMouseListener(listen);
		I13.setTransferHandler(new TransferHandler("icon"));
		
		I14.addMouseListener(listen);
		I14.setTransferHandler(new TransferHandler("icon"));
		
		I15.addMouseListener(listen);
		I15.setTransferHandler(new TransferHandler("icon"));
		
		J1.addMouseListener(listen);
		J1.setTransferHandler(new TransferHandler("icon"));
		
		J2.addMouseListener(listen);
		J2.setTransferHandler(new TransferHandler("icon"));
		
		J3.addMouseListener(listen);
		J3.setTransferHandler(new TransferHandler("icon"));
		
		J4.addMouseListener(listen);
		J4.setTransferHandler(new TransferHandler("icon"));
		
		J5.addMouseListener(listen);
		J5.setTransferHandler(new TransferHandler("icon"));
		
		J6.addMouseListener(listen);
		J6.setTransferHandler(new TransferHandler("icon"));
		
		J7.addMouseListener(listen);
		J7.setTransferHandler(new TransferHandler("icon"));
		
		J8.addMouseListener(listen);
		J8.setTransferHandler(new TransferHandler("icon"));
		
		J9.addMouseListener(listen);
		J9.setTransferHandler(new TransferHandler("icon"));
		
		J10.addMouseListener(listen);
		J10.setTransferHandler(new TransferHandler("icon"));
		
		J11.addMouseListener(listen);
		J11.setTransferHandler(new TransferHandler("icon"));
	
		J12.addMouseListener(listen);
		J12.setTransferHandler(new TransferHandler("icon"));
		
		J13.addMouseListener(listen);
		J13.setTransferHandler(new TransferHandler("icon"));
		
		J14.addMouseListener(listen);
		J14.setTransferHandler(new TransferHandler("icon"));
		
		J15.addMouseListener(listen);
		J15.setTransferHandler(new TransferHandler("icon"));
		
		K1.addMouseListener(listen);
		K1.setTransferHandler(new TransferHandler("icon"));
		
		K2.addMouseListener(listen);
		K2.setTransferHandler(new TransferHandler("icon"));
		
		K3.addMouseListener(listen);
		K3.setTransferHandler(new TransferHandler("icon"));
		
		K4.addMouseListener(listen);
		K4.setTransferHandler(new TransferHandler("icon"));
		
		K5.addMouseListener(listen);
		K5.setTransferHandler(new TransferHandler("icon"));
		
		K6.addMouseListener(listen);
		K6.setTransferHandler(new TransferHandler("icon"));
		
		K7.addMouseListener(listen);
		K7.setTransferHandler(new TransferHandler("icon"));
		
		K8.addMouseListener(listen);
		K8.setTransferHandler(new TransferHandler("icon"));
		
		K9.addMouseListener(listen);
		K9.setTransferHandler(new TransferHandler("icon"));
		
		K10.addMouseListener(listen);
		K10.setTransferHandler(new TransferHandler("icon"));
		
		K11.addMouseListener(listen);
		K11.setTransferHandler(new TransferHandler("icon"));
	
		K12.addMouseListener(listen);
		K12.setTransferHandler(new TransferHandler("icon"));
		
		K13.addMouseListener(listen);
		K13.setTransferHandler(new TransferHandler("icon"));
		
		K14.addMouseListener(listen);
		K14.setTransferHandler(new TransferHandler("icon"));
		
		K15.addMouseListener(listen);
		K15.setTransferHandler(new TransferHandler("icon"));
		
		L1.addMouseListener(listen);
		L1.setTransferHandler(new TransferHandler("icon"));
		
		L2.addMouseListener(listen);
		L2.setTransferHandler(new TransferHandler("icon"));
		
		L3.addMouseListener(listen);
		L3.setTransferHandler(new TransferHandler("icon"));
		
		L4.addMouseListener(listen);
		L4.setTransferHandler(new TransferHandler("icon"));
		
		L5.addMouseListener(listen);
		L5.setTransferHandler(new TransferHandler("icon"));
		
		L6.addMouseListener(listen);
		L6.setTransferHandler(new TransferHandler("icon"));
		
		L7.addMouseListener(listen);
		L7.setTransferHandler(new TransferHandler("icon"));
		
		L8.addMouseListener(listen);
		L8.setTransferHandler(new TransferHandler("icon"));
		
		L9.addMouseListener(listen);
		L9.setTransferHandler(new TransferHandler("icon"));
		
		L10.addMouseListener(listen);
		L10.setTransferHandler(new TransferHandler("icon"));
		
		L11.addMouseListener(listen);
		L11.setTransferHandler(new TransferHandler("icon"));
	
		L12.addMouseListener(listen);
		L12.setTransferHandler(new TransferHandler("icon"));
		
		L13.addMouseListener(listen);
		L13.setTransferHandler(new TransferHandler("icon"));
		
		L14.addMouseListener(listen);
		L14.setTransferHandler(new TransferHandler("icon"));
		
		L15.addMouseListener(listen);
		L15.setTransferHandler(new TransferHandler("icon"));
		
		M1.addMouseListener(listen);
		M1.setTransferHandler(new TransferHandler("icon"));
		
		M2.addMouseListener(listen);
		M2.setTransferHandler(new TransferHandler("icon"));
		
		M3.addMouseListener(listen);
		M3.setTransferHandler(new TransferHandler("icon"));
		
		M4.addMouseListener(listen);
		M4.setTransferHandler(new TransferHandler("icon"));
		
		M5.addMouseListener(listen);
		M5.setTransferHandler(new TransferHandler("icon"));
		
		M6.addMouseListener(listen);
		M6.setTransferHandler(new TransferHandler("icon"));
		
		M7.addMouseListener(listen);
		M7.setTransferHandler(new TransferHandler("icon"));
		
		M8.addMouseListener(listen);
		M8.setTransferHandler(new TransferHandler("icon"));
		
		M9.addMouseListener(listen);
		M9.setTransferHandler(new TransferHandler("icon"));
		
		M10.addMouseListener(listen);
		M10.setTransferHandler(new TransferHandler("icon"));
		
		M11.addMouseListener(listen);
		M11.setTransferHandler(new TransferHandler("icon"));
	
		M12.addMouseListener(listen);
		M12.setTransferHandler(new TransferHandler("icon"));
		
		M13.addMouseListener(listen);
		M13.setTransferHandler(new TransferHandler("icon"));
		
		M14.addMouseListener(listen);
		M14.setTransferHandler(new TransferHandler("icon"));
		
		M15.addMouseListener(listen);
		M15.setTransferHandler(new TransferHandler("icon"));
		
		N1.addMouseListener(listen);
		N1.setTransferHandler(new TransferHandler("icon"));
		
		N2.addMouseListener(listen);
		N2.setTransferHandler(new TransferHandler("icon"));
		
		N3.addMouseListener(listen);
		N3.setTransferHandler(new TransferHandler("icon"));
		
		N4.addMouseListener(listen);
		N4.setTransferHandler(new TransferHandler("icon"));
		
		N5.addMouseListener(listen);
		N5.setTransferHandler(new TransferHandler("icon"));
		
		N6.addMouseListener(listen);
		N6.setTransferHandler(new TransferHandler("icon"));
		
		N7.addMouseListener(listen);
		N7.setTransferHandler(new TransferHandler("icon"));
		
		N8.addMouseListener(listen);
		N8.setTransferHandler(new TransferHandler("icon"));
	
		N9.addMouseListener(listen);
		N9.setTransferHandler(new TransferHandler("icon"));
		
		N10.addMouseListener(listen);
		N10.setTransferHandler(new TransferHandler("icon"));
		
		N11.addMouseListener(listen);
		N11.setTransferHandler(new TransferHandler("icon"));
	
		N12.addMouseListener(listen);
		N12.setTransferHandler(new TransferHandler("icon"));
		
		N13.addMouseListener(listen);
		N13.setTransferHandler(new TransferHandler("icon"));
		
		N14.addMouseListener(listen);
		N14.setTransferHandler(new TransferHandler("icon"));
		
		N15.addMouseListener(listen);
		N15.setTransferHandler(new TransferHandler("icon"));
		
		O1.addMouseListener(listen);
		O1.setTransferHandler(new TransferHandler("icon"));
		
		O2.addMouseListener(listen);
		O2.setTransferHandler(new TransferHandler("icon"));
		
		O3.addMouseListener(listen);
		O3.setTransferHandler(new TransferHandler("icon"));
		
		O4.addMouseListener(listen);
		O4.setTransferHandler(new TransferHandler("icon"));
		
		O5.addMouseListener(listen);
		O5.setTransferHandler(new TransferHandler("icon"));
		
		O6.addMouseListener(listen);
		O6.setTransferHandler(new TransferHandler("icon"));
	
		O7.addMouseListener(listen);
		O7.setTransferHandler(new TransferHandler("icon"));
		
		O8.addMouseListener(listen);
		O8.setTransferHandler(new TransferHandler("icon"));
		
		O9.addMouseListener(listen);
		O9.setTransferHandler(new TransferHandler("icon"));
		
		O10.addMouseListener(listen);
		O10.setTransferHandler(new TransferHandler("icon"));
		
		O11.addMouseListener(listen);
		O11.setTransferHandler(new TransferHandler("icon"));
	
		O12.addMouseListener(listen);
		O12.setTransferHandler(new TransferHandler("icon"));
		
		O13.addMouseListener(listen);
		O13.setTransferHandler(new TransferHandler("icon"));
		
		O14.addMouseListener(listen);
		O14.setTransferHandler(new TransferHandler("icon"));
		
		O15.addMouseListener(listen);
		O15.setTransferHandler(new TransferHandler("icon"));

		background = new JLabel(img);
		background.setBounds(10, 8, 800, 800);
		add(background);


		letrasfondo = new JLabel(letras);
		letrasfondo.setVerticalAlignment(JLabel.BOTTOM);
		letrasfondo.setBounds(10, 764, 800, 200);
		add(letrasfondo);

	}


	public void cargarFichas() {		
		
		JLabel a,b,c,ch,d,e,f,g,h,i,j,l,ll,m,n,ñ,o,p,q,r,rr,s,t,u,v,x,y,z;

//		ImageIcon letra_a = A.getImage();
//		ImageIcon letra_b = B.getImage();
//		ImageIcon letra_c = C.getImage();
//		ImageIcon letra_ch = CH.getImage();
//		ImageIcon letra_d= D.getImage();
//		ImageIcon letra_e= E.getImage();
//		ImageIcon letra_f = F.getImage();
//		ImageIcon letra_g = G.getImage();
//		ImageIcon letra_h = H.getImage();
//		ImageIcon letra_i = I.getImage();
//		ImageIcon letra_j = J.getImage();
//		ImageIcon letra_l = L.getImage();
//		ImageIcon letra_ll = LL.getImage();
//		ImageIcon letra_m = M.getImage();
//		ImageIcon letra_n = N.getImage();
//		ImageIcon letra_ñ = Ñ.getImage();
//		ImageIcon letra_o = O.getImage();
//		ImageIcon letra_p = P.getImage();
//		ImageIcon letra_q = Q.getImage();
//		ImageIcon letra_r = R.getImage();
//		ImageIcon letra_rr = RR.getImage();
//		ImageIcon letra_s = S.getImage();
//		ImageIcon letra_t = T.getImage();
//		ImageIcon letra_u = U.getImage();
//		ImageIcon letra_v = V.getImage();
//		ImageIcon letra_x = X.getImage();
//		ImageIcon letra_y = Y.getImage();
//		ImageIcon letra_z = Z.getImage();

/*
		a = new JLabel(letra_a);
		a.setBounds(36,812, 49, 50);
		add(a);

		b = new JLabel(letra_b);
		b.setBounds(86,812, 49, 50);
		add(b);

		c = new JLabel(letra_c);
		c.setBounds(136,812, 49, 50);
		add(c);

		ch = new JLabel(letra_ch);
		ch.setBounds(186,812, 49, 50);
		add(a);

		d = new JLabel(letra_d);
		d.setBounds(236,812, 49, 50);
		add(d);

		e = new JLabel(letra_e);
		e.setBounds(286,812, 49, 50);
		add(e);

		f = new JLabel(letra_f);
		f.setBounds(336,812, 49, 50);
		add(f);

		g = new JLabel(letra_g);
		g.setBounds(386,812, 49, 50);
		add(g);

		h = new JLabel(letra_h);
		h.setBounds(436,812, 49, 50);
		add(h);

		i = new JLabel(letra_i);
		i.setBounds(486,812, 49, 50);
		add(i);

		j = new JLabel(letra_j);
		j.setBounds(536,812, 49, 50);
		add(j);

		l = new JLabel(letra_l);
		l.setBounds(586,812, 49, 50);
		add(l);

		ll = new JLabel(letra_ll);
		ll.setBounds(636,812, 49, 50);
		add(ll);

		m = new JLabel(letra_m);
		m.setBounds(686,812, 49, 50);
		add(m);

		n = new JLabel(letra_n);
		n.setBounds(736,812, 49, 50);
		add(n);

		ñ = new JLabel(letra_ñ);
		ñ.setBounds(36,864,49,50);
		add(ñ);

		o = new JLabel(letra_o);
		o.setBounds(86,864, 49, 50);
		add(o);

		p = new JLabel(letra_p);
		p.setBounds(136,864, 49, 50);
		add(p);

		q = new JLabel(letra_q);
		q.setBounds(186,864, 49, 50);
		add(q);


		r = new JLabel(letra_r);
		r.setBounds(236,864, 49, 50);
		add(r);


		rr = new JLabel(letra_rr);
		rr.setBounds(286,864, 49, 50);
		add(rr);

		s = new JLabel(letra_s);
		s.setBounds(336,864, 49, 50);
		add(s);

		t = new JLabel(letra_t);
		t.setBounds(386,864, 49, 50);
		add(t);

		u = new JLabel(letra_u);
		u.setBounds(436,864, 49, 50);
		add(u);

		v = new JLabel(letra_v);
		v.setBounds(486,864, 49, 50);
		add(v);

		x = new JLabel(letra_x);
		x.setBounds(536,864, 49, 50);
		add(x);

		y = new JLabel(letra_y);
		y.setBounds(586,864, 49, 50);
		add(y);

		z = new JLabel(letra_z);
		z.setBounds(636,864, 49, 50);
		add(z);

		MouseListener listener = new DragMouseAdapter();

		a.addMouseListener(listener);
		b.addMouseListener(listener);
		c.addMouseListener(listener);
		d.addMouseListener(listener);
		e.addMouseListener(listener);
		f.addMouseListener(listener);
		g.addMouseListener(listener);
		h.addMouseListener(listener);
		i.addMouseListener(listener);
		j.addMouseListener(listener);
		l.addMouseListener(listener);
		m.addMouseListener(listener);
		n.addMouseListener(listener);
		ñ.addMouseListener(listener);
		o.addMouseListener(listener);
		p.addMouseListener(listener);
		q.addMouseListener(listener);
		r.addMouseListener(listener);
		s.addMouseListener(listener);
		t.addMouseListener(listener);
		u.addMouseListener(listener);
		v.addMouseListener(listener);
		x.addMouseListener(listener);
		y.addMouseListener(listener);
		z.addMouseListener(listener);


		a.setTransferHandler(new TransferHandler("icon"));
		b.setTransferHandler(new TransferHandler("icon"));
		c.setTransferHandler(new TransferHandler("icon"));
		d.setTransferHandler(new TransferHandler("icon"));
		e.setTransferHandler(new TransferHandler("icon"));
		f.setTransferHandler(new TransferHandler("icon"));
		g.setTransferHandler(new TransferHandler("icon"));
		h.setTransferHandler(new TransferHandler("icon"));
		i.setTransferHandler(new TransferHandler("icon"));
		j.setTransferHandler(new TransferHandler("icon"));
		l.setTransferHandler(new TransferHandler("icon"));
		m.setTransferHandler(new TransferHandler("icon"));
		n.setTransferHandler(new TransferHandler("icon"));
		ñ.setTransferHandler(new TransferHandler("icon"));
		o.setTransferHandler(new TransferHandler("icon"));
		p.setTransferHandler(new TransferHandler("icon"));
		q.setTransferHandler(new TransferHandler("icon"));
		r.setTransferHandler(new TransferHandler("icon"));
		s.setTransferHandler(new TransferHandler("icon"));
		t.setTransferHandler(new TransferHandler("icon"));
		u.setTransferHandler(new TransferHandler("icon"));
		v.setTransferHandler(new TransferHandler("icon"));
		x.setTransferHandler(new TransferHandler("icon"));
		y.setTransferHandler(new TransferHandler("icon"));
		z.setTransferHandler(new TransferHandler("icon"));
*/		
			
		
		ImageIcon letra_1;
		int random1 = (int)(Math.random() * 99);
		letra_1 = new ImageIcon( listafichas[random1].getPath());
		JLabel le1 = new JLabel(letra_1);
		le1.setBounds(900,100, 49, 50);
		le1.setText(listafichas[random1].getLetra());
		add(le1);
		
		
		ImageIcon letra_2;
		int random2 = (int)(Math.random() * 99);
		letra_2 = new ImageIcon(listafichas[random2].getPath());
		JLabel le2 = new JLabel(letra_2);
		le2.setBounds(900,150, 49, 50);
		le2.setText(listafichas[random2].getLetra());
		add(le2);
		
//		ImageIcon letra_3;
//		int random3 = (int)(Math.random() *99);
//		letra_3 = listafichas[random3].getImage();
//		JLabel le3 = new JLabel(letra_3);
//		le3.setBounds(900,200, 49, 50);
//		le3.setText(listafichas[random3].getLetra());
//		add(le3);
//		
//		
//		ImageIcon letra_4;
//		int random4 = (int)(Math.random() * 99);
//		letra_4 = listafichas[random4].getImage();
//		JLabel le4 = new JLabel(letra_4);
//		le4.setBounds(196,812, 49, 50);
//		le4.setText(listafichas[random4].getLetra());
//		add(le4);
//		
//		ImageIcon letra_5;
//		int random5 = (int)(Math.random() * 99);
//		letra_5 = listafichas[random5].getImage();
//		JLabel le5 = new JLabel(letra_5);
//		le5.setBounds(256,812, 49, 50);
//		le5.setText(listafichas[random5].getLetra());
//		add(le5);
//		
//		ImageIcon letra_6;
//		int random6 = (int)(Math.random() * 99);
//		letra_6 = listafichas[random6].getImage();
//		JLabel le6 = new JLabel(letra_6);
//		le6.setBounds(316,812, 49, 50);
//		le6.setText(listafichas[random6].getLetra());
//		add(le6);
//		
//		ImageIcon letra_7;
//		int random7 = (int)(Math.random() * 99);
//		letra_7 = listafichas[random7].getImage();
//		JLabel le7 = new JLabel(letra_7);
//		le7.setBounds(376,812, 49, 50);
//		le7.setText(listafichas[random7].getLetra());
//		add(le7);
//		
//		ImageIcon letra_8;
//		int random8 = (int)(Math.random() * 99);
//		letra_8 = listafichas[random8].getImage();
//		JLabel le8 = new JLabel(letra_8);
//		le8.setBounds(430,812, 49, 50);
//		le8.setText(listafichas[random8].getLetra());
//		add(le8);

		/**
		System.out.println(listafichas[random1].getLetra());
		System.out.println(listafichas[random2].getLetra());
		System.out.println(listafichas[random3].getLetra());
		System.out.println(listafichas[random4].getLetra());
		System.out.println(listafichas[random5].getLetra());
		System.out.println(listafichas[random6].getLetra());
		System.out.println(listafichas[random7].getLetra());
		System.out.println(listafichas[random8].getLetra());
		**/
		DragMouseAdapter listener = new DragMouseAdapter();
		le1.addMouseListener((listener));
		le2.addMouseListener((listener));
//		le3.addMouseListener((listener));
//		le4.addMouseListener((listener));
//		le5.addMouseListener((listener));
//		le6.addMouseListener((listener));
//		le7.addMouseListener((listener));
//		le8.addMouseListener((listener));
		
		
		
		le1.setTransferHandler(new TransferHandler("icon"){
		    @Override
		    protected void exportDone(JComponent source, Transferable data, int action) {
		        if (action == MOVE){
		            ((JLabel) source).setIcon(null);
		            ((JLabel) source).addMouseListener(null);
		            ((JLabel) source).setText("");
		            flag1 = true;
		            cargarTablero();
		        }
		    }
		    @Override
		    public int getSourceActions(JComponent c) {
		        return COPY | MOVE;
		    }
		});
		le2.setTransferHandler(new TransferHandler("icon"){
		    @Override
		    protected void exportDone(JComponent source, Transferable data, int action) {
		        if (action == MOVE){
		        	((JLabel) source).setIcon(null);
		            ((JLabel) source).addMouseListener(null);
		            ((JLabel) source).setText("");
		            flag1 = true;
		            cargarTablero();
		        }
		    }

		    @Override
		    public int getSourceActions(JComponent c) {
		        return COPY | MOVE;
		    }
		});
//		le3.setTransferHandler(new TransferHandler("icon"){
//		    @Override
//		    protected void exportDone(JComponent source, Transferable data, int action) {
//		        if (action == MOVE){
//		        	((JLabel) source).setIcon(null);
//		            ((JLabel) source).addMouseListener(null);
//		            ((JLabel) source).setText("");
//		            flag1 = true;
//		            cargarTablero();
//		        }
//		    }
//
//		    @Override
//		    public int getSourceActions(JComponent c) {
//		        return COPY | MOVE;
//		    }
//		});
//		le4.setTransferHandler(new TransferHandler("icon"){
//		    @Override
//		    protected void exportDone(JComponent source, Transferable data, int action) {
//		        if (action == MOVE){
//		        	((JLabel) source).setIcon(null);
//		            ((JLabel) source).addMouseListener(null);
//		            ((JLabel) source).setText("");
//		            flag1 = true;
//		            cargarTablero();
//		        }
//		    }
//
//		    @Override
//		    public int getSourceActions(JComponent c) {
//		        return COPY | MOVE;
//		    }
//		});
//		le5.setTransferHandler(new TransferHandler("icon"){
//		    @Override
//		    protected void exportDone(JComponent source, Transferable data, int action) {
//		        if (action == MOVE){
//		        	((JLabel) source).setIcon(null);
//		            ((JLabel) source).addMouseListener(null);
//		            ((JLabel) source).setText("");
//		            flag1 = true;
//		            cargarTablero();
//		        }
//		    }
//
//		    @Override
//		    public int getSourceActions(JComponent c) {
//		        return COPY | MOVE;
//		    }
//		});
//		le6.setTransferHandler(new TransferHandler("icon"){
//		    @Override
//		    protected void exportDone(JComponent source, Transferable data, int action) {
//		        if (action == MOVE){
//		        	((JLabel) source).setIcon(null);
//		            ((JLabel) source).addMouseListener(null);
//		            ((JLabel) source).setText("");
//		            flag1 = true;
//		            cargarTablero();
//		        }
//		    }
//
//		    @Override
//		    public int getSourceActions(JComponent c) {
//		        return COPY | MOVE;
//		    }
//		});
//		le7.setTransferHandler(new TransferHandler("icon"){
//		    @Override
//		    protected void exportDone(JComponent source, Transferable data, int action) {
//		        if (action == MOVE){
//		        	((JLabel) source).setIcon(null);
//		            ((JLabel) source).addMouseListener(null);
//		            ((JLabel) source).setText("");
//		            flag1 = true;
//		            cargarTablero();
//		        }
//		    }
//
//		    @Override
//		    public int getSourceActions(JComponent c) {
//		        return COPY | MOVE;
//		    }
//		});
//		le8.setTransferHandler(new TransferHandler("icon"){
//		    @Override
//		    protected void exportDone(JComponent source, Transferable data, int action) {
//		        if (action == MOVE){
//		        	((JLabel) source).setIcon(null);
//		            ((JLabel) source).addMouseListener(null);
//		            ((JLabel) source).setText("");
//		            flag1 = true;
//		            cargarTablero();
//		        }
//		    }
//
//		    @Override
//		    public int getSourceActions(JComponent c) {
//		        return COPY | MOVE;
//		    }
	//	});
		
		
		
		
		JButton button1 = new JButton();
        button1.setText("Play");
        button1.setBounds(900, 50, 120, 50);
        button1.addMouseListener(listener);
        add(button1);
        button1.setName("button1");
 
        
		JButton button2 = new JButton();
		button2.setText("Done");
		button2.setBounds(170, 897, 120, 50);
		add(button2);
		
		JButton button3 = new JButton();
		button2.setText("SCRABBLE!");
		button2.setBounds(474, 890, 120, 50);
		add(button3);
		
		
		
		
		setVisible(true);
	}

}




