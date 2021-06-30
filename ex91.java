package examples;

//익명 객체(Anonymous Object) : 한번 쓰고 버릴 객체(함수-코드블럭)는 이름이 필요 없다. 
interface RomoteControl {
	public void turnOn();

	public void turnOff();
}

class Anonymous {
	// 인터페이스 구현 객체 - 이름이 있음.
	RomoteControl rc = new RomoteControl() {
		@Override
		public void turnOn() {
			System.out.println("전원을 켠다.");
		}

		@Override
		public void turnOff() {
			System.out.println("전원을 끈다.");
		}
	};

	void turnOn() {
		rc.turnOn();
	}

	void turnOff() {
		rc.turnOff();
	}

	// 밖에서 rc를 생성/주입하면서 제어한다.
	void trunOnWithRC(RomoteControl rc) {
		rc.turnOn();
	}

	void trunOffWithRC(RomoteControl rc) {
		rc.turnOff();
	}
}

public class ex91 {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.turnOn();
		anony.turnOff();
		anony.trunOnWithRC(new RomoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켠다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끈다.");
			}
		});
		anony.trunOffWithRC(new RomoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켠다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끈다.");
			}
		});
	}
}