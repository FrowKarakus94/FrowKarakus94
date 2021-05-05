package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
	System.out.println("Hello " +gamer.getFirstName()+ ", You bought the game " + game.getName() + 
			" for " + salePrice(game.getUnitPrice(),campaign.getDiscountRate()) + 
			" lira with the normal price of " + game.getUnitPrice() + " lira with the " +
			campaign.getName() + "campaign.");
	}

	private double salePrice(double gameUnitPrice, int campaingDiscountRate) {
		return gameUnitPrice*(100-campaingDiscountRate)/100;
	}

	
	
}