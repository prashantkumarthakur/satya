package com.n;

import com.app.CustomException;

public class Client {
public static void main(String[] args) {
	CustomeExceptionMsg ce=new CustomeExceptionMsg();
	try{
	String bar=ce.getBar(0);
	System.out.println(bar);
}
	catch(CustomException e){
		e.printStackTrace();
	}
}
}