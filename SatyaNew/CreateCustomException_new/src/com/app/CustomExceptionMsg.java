package com.app;

public class CustomExceptionMsg {
   public String getBar(int i)throws CustomException{
	   if(i==0){
		   throw new CustomException("Anything");
	   }
	   else{
		   return "hell";
	   }
   }
}
