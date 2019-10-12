package screens;

import io.appium.java_client.pagefactory.WithTimeout;
import screens.base.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


import java.util.concurrent.TimeUnit;

public class InitialScreen extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Formulário']")
    private MobileElement clickFormulario;

    @AndroidFindBy(accessibility = "nome")
    private MobileElement inputNome;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='save']/android.widget.TextView")
    private MobileElement save;


    public void clickFormulario() {
        this.clickFormulario.click();
    }

    public void inputNome(String nome) {

        this.inputNome.sendKeys(nome);
    }

    public void saveClick() {

        this.save.click();
    }



}
