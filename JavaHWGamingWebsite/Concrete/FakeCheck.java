package Concrete;

import Abstract.ValidationService;
import Entities.Gamer;

public class FakeCheck implements ValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		return true;
	}
}