package javaStudy2;

public class Abstract {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.eat();
//		a.breath();
		
		AB ab = new AB(5, 10);
		
		Plant p = new Plant();
		p.eat();
		p.breath();
	}
}

abstract class Organism {
	public abstract void eat();
	public abstract void breath();
}

abstract class Animal extends Organism {
	public Animal(int i, int j) {
	 System.out.println(i+j);
	}

	@Override
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}

class AB extends Animal {
	
	AB(int num1, int num2){
		super(num1, num2);
	};
	
	@Override
	public  void breath() {
		System.out.println("aaa");
	};
}


class Plant extends Organism {
	@Override
	public void eat() {
		System.out.println("광합성을 통해 영양분을 보충합니다.");
	}
	
	@Override
	public void breath() {
		System.out.println("교환기능을 통해 호흡합니다.");
	}
}








