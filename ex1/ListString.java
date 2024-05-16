package ex1;

import java.util.*;

public class ListString {
	private static class No {

		String ler;
		No proximo;

		public No(String ler) {
			this.ler = ler;
			this.proximo = null;
		}

		public String getLer() {
			return this.ler;
		}
	}

	private No inicio;
	private No fim;

	public boolean vazia() {
		return this.inicio == null;
	}

	public ListaString() {
		this.inicio = null;
		this.fim = null;
	}

	public void adde(String ler) {
		No novoNo = new No(ler);
		if (vazia()) {
			this.inicio = novoNo;
			this.fim = novoNo;
		} else {
			this.fim.proximo = novoNo;
			this.fim = novoNo;
		}
	}

	public String remove() {
		if (vazia()) {
			return null;
		} else {
			No aux = this.inicio;
			if (this.inicio == this.fim) {
				this.inicio = null;
				this.fim = null;
			} else {
				this.inicio = this.inicio.proximo;
				aux.proximo = null;
			}
			return aux.ler;
		}
	}

	public String mostra(String lista) {
		while (!lista.vazia()) {
			System.out.printf("\nLista String = %s", lista);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Fila listaString = new listaString();
		listaString.adde("- INICIO -");
		listaString.adde(" MEIO ");
		listaString.adde("- FINALMENTE -");

		listaString.mostra();

	}
}