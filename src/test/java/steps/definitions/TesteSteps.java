package steps.definitions;

import cucumber.api.java.pt.*;
import screens.InitialScreen;

public class TesteSteps {

    InitialScreen initialScreen;

    public TesteSteps() {

        initialScreen = new InitialScreen();
    }


    @Dado("^que tenha  aberto o app$")
    public void que_tenha_aberto_o_app() {
    }

    @Quando("^clicar no formulário$")
    public void clicar_no_formulário() {
        this.initialScreen.clickFormulario();
    }

    @Quando("^e colocar o meu nome \"([^\"]*)\"$")
    public void e_colocar_o_meu_nome(String nome) {
        this.initialScreen.inputNome(nome);

    }

    @Quando("^salvar a alteração$")
    public void salvar_a_alteração() {
        this.initialScreen.saveClick();

    }

   

}
