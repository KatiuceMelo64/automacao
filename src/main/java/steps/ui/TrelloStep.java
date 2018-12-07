package steps.ui;
	
	import cucumber.api.java.pt.Dado;
	import cucumber.api.java.pt.E;
	import cucumber.api.java.pt.Quando;
	import junit.framework.Assert;
	import pom.BoardPage;
	import pom.LoginPage;
	import cucumber.api.java.pt.Entao;
		
	@SuppressWarnings("deprecation")
	public class TrelloStep {
		BoardPage boardPage;
	    
	    
		@Dado("^que eu esteja logado no trello$")
	    public void queEstejaLogadoNoTrello() {
	    	LoginPage loginPage = new LoginPage();
	    	loginPage.acess();
	    	loginPage.doLogin("katiucemelo64@gmail.com", "senha123");
	    	Assert.assertEquals("Página Inicial do Trello", loginPage.checkInitialPage());
	    	
	    }

	    @E("^acesse o board$")
	    public void acessoOBoard() {
			boardPage=new BoardPage();
			boardPage.acessBoard();
			Assert.assertEquals("Automation_prime", boardPage.getBoardName());
	    }

	    @Quando("^crio um card com o nome \"([^\"]*)\"$")
	    public void crioUmCardComONome(String cardName) {

			boardPage.clickAddCard("To do");
			boardPage.addCardName(cardName);
			Assert.assertEquals("Card existe na lista", boardPage.checkExistenceCard());
	    }
	    
	    @E("^comento \"([^\"]*)\"$")
	    public void comentoCard(String comment) {

			boardPage.commentCard(comment);
			//check o momentario
	    }
	    
	    @Entao("^o card deve estar na lista$")
	    public void cardNaLista() {
			Assert.assertEquals("Card existe na lista", boardPage.checkExistenceCard());
	    } 
	    
	    @Quando("^excluo o card$")
	    public void excluoCard() {

			boardPage.excludeCard();
	    }
	    
	    @Entao("^o card nao existe mais$")
	    public void cardExcluido() {

			Assert.assertEquals("Card não existe na lista", boardPage.checkExistenceCard());

		}
	}


