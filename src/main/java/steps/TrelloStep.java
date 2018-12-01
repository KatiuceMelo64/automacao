package steps;
	
	import cucumber.api.java.pt.Dado;
	import cucumber.api.java.pt.E;
	import cucumber.api.java.pt.Quando;
	import junit.framework.Assert;
	import pom.LoginPage;
	import cucumber.api.java.pt.Entao;
		
	@SuppressWarnings("deprecation")
	public class TrelloStep {
	    
	    
		@Dado("^que eu esteja logado no trello$")
	    public void queEstejaLogadoNoTrello() {
	    	LoginPage loginPage = new LoginPage();
	    	loginPage.acess();
	    	loginPage.doLogin("katiucemelo64@gmail.com", "senha123");
	    	Assert.assertEquals("Página Inicial do Trello", loginPage.checkInitialPage());
	    	
	    }

	    @E("^acesse o board$")
	    public void acessoOBoard() {
	    	System.out.println("acesse o board");   
	    }

	    @Quando("^crio um card com o nome \"([^\"]*)\"$")
	    public void crioUmCardComONome(String nomeCard) {
	    	System.out.println("crio um card com o nome");
	    }
	    
	    @E("^comento \"([^\"]*)\"$")
	    public void comentoCard(String comentario) {
	    	System.out.println("comento");
	    }
	    
	    @Entao("^o card deve estar na lista$")
	    public void cardNaLista() {
	    	System.out.println("o card deve estar na lista");
	    } 
	    
	    @Quando("^excluo o card$")
	    public void excluoCard() {
	    	System.out.println("excluo o card");
	    }
	    
	    @Entao("^o card nao existe mais$")
	    public void cardExcluido() {
	    	System.out.println("o card n�o existe mais");  
	    } 	    	    	   
	}


