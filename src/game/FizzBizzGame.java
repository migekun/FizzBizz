package game;

public class FizzBizzGame {

	/**
	 * compilar: javac -cp . FizzBizzGame.java FizzBizzPlay.java
	 * ejecutar java -cp 'path del proyecto hasta src incluido' game/FizzBizzGame 'numero'
	 */
	
	public static void main(String[] args) {
		FizzBizzPlay fizBiz = new FizzBizzPlay(args[0]);
		fizBiz.play();
	}
}
