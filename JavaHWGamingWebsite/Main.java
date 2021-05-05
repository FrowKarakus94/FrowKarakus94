
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.FakeCheck;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(1,"The Elder Scrolls V: Skyrim 5", 115);
		Gamer gamer = new Gamer(1,"Hardal","Yıldırım","91166186431",1995);
		Campaign campaign = new Campaign(1,"The boss is crazy ", "It happened this way, it happened this way", 20);
		
		GameManager gameManager = new GameManager();
		GamerManager gamerManager = new GamerManager(new FakeCheck()); // unconditional
//      GamerManager gamerManager = new GamerManager(new MernisServiceAdapter()); mernis system checked with real data 
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		gamerManager.add(gamer);
//		gamerManager.update(gamer);
//		gamerManager.delete(gamer);
				
		gameManager.add(game);
//		gameManager.update(game);
//		gameManager.delete(game);
		
		campaignManager.add(campaign);
//		campaignManager.update(campaign);
//		campaignManager.delete(campaign);
		
		saleManager.sale(gamer, game, campaign);
	}

}