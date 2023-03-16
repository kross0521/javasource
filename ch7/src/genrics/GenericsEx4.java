package genrics;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}
class Toy {
	@Override
	public String toString() {
		return "Toy";
	}
}

// T extends Fruit : Fruit의 자손만 타입으로 지정 가능
class FruitBox<T extends Fruit>	 extends Box3<T>{}


public class GenericsEx4 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox();
		FruitBox<Apple> appleBox = new FruitBox();
		FruitBox<Grape> grapeBox = new FruitBox();
		// FruitBox<Toy> toybox = new FruitBox();  (x)  : Fruit 를 상속받지 않았으니 toy는 들어오지 못한다.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		
		appleBox.add(new Apple());
		
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
		
	}

}
