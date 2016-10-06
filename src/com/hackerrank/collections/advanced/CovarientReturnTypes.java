package com.hackerrank.collections.advanced;

public class CovarientReturnTypes {}

class Flower{
	
	String whatsYourName(){
		return "I have many names and types";
	}
}

class Jasmine extends Flower{
	
	@Override
	String whatsYourName(){
		return "Jasmine";
	}
}

class Lotus extends Flower{
	
	@Override
	String whatsYourName(){
		return "Lotus";
	}
}

class Lily extends Flower{
	@Override
	String whatsYourName(){
		return "Lily";
	}
}

class State{
	Flower yourNationalFlower(){
		return new Flower();
	}
}

class WestBengal extends State{
	Jasmine yourNationalFlower(){
		return new Jasmine();
	}
}

class AndhraPradesh extends State{
	Lily yourNationalFlower(){
		return new Lily();
	}
}

class Karnataka extends State{
	Lotus yourNationalFlower(){
		return new Lotus();
	}
}