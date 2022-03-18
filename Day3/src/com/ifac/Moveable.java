package com.ifac;

public interface Moveable {
	
	void move();

}

interface Bouncable extends Moveable{
	abstract void bounce();
}

class Football implements Bouncable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("FootBall is moving");
	}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("Football is bouncing");
	}
	
}
