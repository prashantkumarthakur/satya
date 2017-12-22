package com.f;

public class ClientApp {
  public static void main(String[] args) {
	  try{
	CustomExceptionMsg ce=new CustomExceptionMsg();
	String bar=ce.getBar(0);
	  }
	catch(CustomException e){
		e.printStackTrace();
	}
	
}
}
