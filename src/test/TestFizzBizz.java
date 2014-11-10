package test;

import game.FizzBizzGame;
import game.FizzBizzPlay;

import org.junit.Test;

public class TestFizzBizz {

	@Test (expected = NumberFormatException.class)
	public void testExceptionNegativeNumbers() {
		FizzBizzPlay game = new FizzBizzPlay("-100");
		game.play();
	}
	
	@Test (expected = NumberFormatException.class)
	public void testExceptionNotNumber() {
		FizzBizzPlay play = new FizzBizzPlay("asdfasdf");
		play.play();
	}
	
	@Test 
	public void test() {
		FizzBizzPlay play = new FizzBizzPlay("700");
		play.play();
	}

	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testNoArg() {
		String[] arg = {};
		FizzBizzGame.main(arg);
	}
	
}
