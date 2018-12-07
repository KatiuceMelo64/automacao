package steps.api;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class TrelloStep {
    final String BASE_URL = "https://api.trello.com/1/";
    final String AUTH = "key=bcba5de1401034847f5459929a315170&token=325b94d6c7f1953047d62a4210452898099696b226cd8cd34d6a6866f47f3c88";
    final String BOARD_ID = "ICLxsmNI";
    final String TODO_ID="5bb8c3f4f634931873d8ffa6";
    private Response response;
    private String cardId;

    @Dado("^que acesse a API com sucesso$")
    public void queAcesseAAPIComSucesso() {
        response = given().get(BASE_URL + "boards/" + BOARD_ID + "?" + AUTH);
        response.prettyPrint();
        Assert.assertEquals(200, response.statusCode());
    }

    @Quando("^crio um card com o nome \"([^\"]*)\" usando a API$")
    public void crioUmCardComONomeUsandoAAPI(String nome) throws Throwable {
        response = given().contentType("application/json").post(BASE_URL+"cards?name="+nome+"&desc=descricao&idList="+TODO_ID+
                "&keepFromSource=all&key="+"bcba5de1401034847f5459929a315170"+"&token="+
                        "325b94d6c7f1953047d62a4210452898099696b226cd8cd34d6a6866f47f3c88");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @E("^comento \"([^\"]*)\" no card gerado$")
    public void comentoNoCardGerado(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Entao("^o card deve ser criado com sucesso$")
    public void oCardDeveSerCriadoComSucesso() {
    }


    @Quando("^excluo usando a API$")
    public void excluoUsandoAAPI() {
    }


    @Entao("^eu tenho o resultado com status \"([^\"]*)\"$")
    public void euTenhoOResultadoComStatus(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
