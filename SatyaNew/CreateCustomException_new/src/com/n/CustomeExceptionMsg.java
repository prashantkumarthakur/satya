package com.n;

import com.app.CustomException;

public class CustomeExceptionMsg {
public String getBar(int i)throws CustomException{
	if(i==0){
		throw new CustomException("Anything Dont't take");
		
	}
	else{
		return "thanks";
	}
}
}
