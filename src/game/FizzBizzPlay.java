package game;


public class FizzBizzPlay {

	private Integer endLimit = 0;
	
	public FizzBizzPlay(String number) {
		this.endLimit = Integer.valueOf(number);
		if (this.endLimit < 0) throw new NumberFormatException("No numeros negativos");
	}

	public void play() {
		for (int index = 1; index <= endLimit; index++) {
			if (isFizzBizz(index)) System.out.print("Fizz-Bizz, ");
			else if (isFizz(index)) System.out.print("Fizz, ");
			else if (isBizz(index)) System.out.print("Bizz, ");
			else System.out.print(index + ", ");
		}
	}

	private boolean isBizz(int index) {
		return index % 5 == 0;
	}

	private boolean isFizz(int index) {
		return index % 3 == 0;
	}

	private boolean isFizzBizz(int index) {
		if (isFizz(index) && isBizz(index)) return true;
		return false;
	}
	
}
