package com.f;

public class CustomExceptionMsg {
    public String getBar(int i)throws CustomException{
    	if(i==0){
    		throw new CustomException("Hi User You are not giving right number");
    	}
    	else{
    		return "thanks";
    	}
    }
}
