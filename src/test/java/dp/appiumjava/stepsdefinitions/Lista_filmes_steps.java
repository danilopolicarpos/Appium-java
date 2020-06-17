package dp.appiumjava.stepsdefinitions;

import cucumber.api.java.pt.*;
import dp.appiumjava.screens.Lista_filmes;


public class Lista_filmes_steps {

	Lista_filmes lista;

    public Lista_filmes_steps() {

        lista = new Lista_filmes();
    }
	
	@Dado("^que estou na lista de filmes$")
	public void queEstouNaListaDeFilmes() throws Throwable {
		this.lista.home();
	   
	}

	@Quando("^realizar uma busca por titulo$")
	public void realizarUmaBuscaPorTitulo() throws Throwable {
		this.lista.digite_nome();
	 
	}

	@Então("^vejo o resultado da busca$")
	public void vejoOResultadoDaBusca() throws Throwable {
		this.lista.btn_search();
	    
	}

}
