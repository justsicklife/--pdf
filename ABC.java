package javaStudy2;

public class ABC {

	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		ABC.checkCasting(d2);
	}
	
	public static void checkCasting(Dog2 d2) {
		if(d2 instanceof Dog2) {
			System.out.println("캐스팅 가능!");
		} 
	}

}

class Dog2 {
	
}


class Parent {
	public void method2() {
		System.out.println("저는 부모 클래스입니다.");
	};
}

class A extends Parent {
	
	// 오버 라이딩
	// 부모 클래스에서 상속받은 메소드가 이름이 같지만, 구현부{} 즉 기능이 다르다
	public void method2() {
		System.out.println("나는 자식 클래스입니다.");
	}
	
	// 오버 로딩
	// 서로 같은 클래스 안에서 같은 메소드명을 가지고 있고
	// 매개변수의 위치나 타입, 갯수 다른 것
	public void method1() {};
	public void method1(int num) {};
	public void method1(String str) {};
	public void method1(int num1, int num2) {};
	public void method1(int num1, String str1) {};
	
}










