package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Temp {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(3,3,9);
		
		tabuleiro.registarObservador(e->{
			if(e.isGanhou()) {
				System.out.println("ganhou... :)");
			}else {
				System.out.println("perdeu... :(");
			}
		});
		
		tabuleiro.altenarMarcacao(0, 0);
		tabuleiro.altenarMarcacao(0, 1);
		tabuleiro.altenarMarcacao(0, 2);
		tabuleiro.altenarMarcacao(1, 0);
		tabuleiro.altenarMarcacao(1, 1);
		tabuleiro.altenarMarcacao(1, 2);
		tabuleiro.altenarMarcacao(2, 0);
		tabuleiro.altenarMarcacao(2, 1);
		tabuleiro.abrir(2, 2);
		//tabuleiro.altenarMarcacao(2, 2);

	}

}
