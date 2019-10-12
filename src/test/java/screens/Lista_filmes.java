package screens;


import io.appium.java_client.pagefactory.WithTimeout;
import screens.base.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;



import java.util.concurrent.TimeUnit;

public class Lista_filmes extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "home_omdb")
    private MobileElement tela_inicial;

    @AndroidFindBy(id = "search_title")
    private MobileElement digite_nome;

    @AndroidFindBy(id = "search")
    private MobileElement btn_search;


    public void home() {
        this.tela_inicial.isDisplayed();
    }

    public void digite_nome() {

       this.digite_nome.sendKeys("spider");
    }

    public void btn_search() {

        this.btn_search.click();
    }



}
