package pers.lwm.springstudy.dynamicproxy;

public class RealSubject implements ISubject {

	@Override
	public void doSth() {
		System.out.println( "call doSth()" );   
		
	}

}
