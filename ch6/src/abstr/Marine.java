package abstr;

public class Marine extends Unit{
	
	void stimPark() {}
@Override
	void move(int x, int y) {
		System.out.println("Marime[x="+x+", y="+y+"]");
	}
}

class Tank extends Unit {
	void changeMode() {}
	@Override
	void move(int x, int y) {
		System.out.println("Tank[x="+x+", y="+y+"]");
	}
}

class DropShip extends Unit{
	void load() {}
	void unload() {}
	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x="+x+", y="+y+"]");
	}


}



