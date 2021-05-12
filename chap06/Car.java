package chap06;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "Black";
	int maxSpeed = 300;
	int speed;
	

	Car(String model) {
		//this.model = model;
		this(model, "은색", 300);
	}

	// 다른 생성자를 호출해 중복 코드 줄이기.
	Car(String model, String color) {
		this(model, color, 300);
//		this.model = model;
//		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
