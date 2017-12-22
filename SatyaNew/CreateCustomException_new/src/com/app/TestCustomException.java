package com.app;

public class TestCustomException {
public static void main(String[] args) {
	CustomExceptionMsg ce=new CustomExceptionMsg();
	try{
	String bar=ce.getBar(0);
	System.out.println("hjhgggdgfjjkj");
}
	catch(CustomException e){
		e.printStackTrace();
	}
}
}