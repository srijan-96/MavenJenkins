package com.amdocs;

public class OperatorFactory {

	
	  public Operator getOperator(String Operator){
	      if(Operator == null){
	         return null;
	      }		
	      if(Operator.equalsIgnoreCase("+")){
	         return new Addition();
	         
	      } else if(Operator.equalsIgnoreCase("-")){
	         return new Subtraction();
	         
	      } else if(Operator.equalsIgnoreCase("*")){
	         return new Multiplication();
	      }else if(Operator.equalsIgnoreCase("/")){
		         return new Division();
		      }
	      
	      return null;
	   }
	
	
	
	
}
