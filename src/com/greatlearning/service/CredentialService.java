package com.greatlearning.service;
import java.lang.String;
import java.util.Random;

public class CredentialService {
	
	public String GeneratePassword()
	{
		
		String Uppercaseletter ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Lowercaseletter ="abcdefghijklmnopqrstuvwxyz";
        String Specialcharacters="!@#$%^&*=-_+<>)?+.";
        String Numbers ="0123456789";
        
        String Values=Uppercaseletter+Lowercaseletter+Specialcharacters+Numbers;
        
        //Using inbuilt Random Method to generate random password.
        Random random = new Random();
        
        char[] password = new char[8];
        
        
        for(int i=0 ; i<8; i++) {
        	//Inbuilt charAt() method to store the random char generated.
        	//nextInt() method is used to read the total length od string Values.
        	password[i]= Values.charAt(random.nextInt(Values.length()));
        	
        }
        //type casting Char[] to String 
        String PW = String.valueOf(password);
        
      return PW;
	}
	
	public String generateEmailAddress(String Firstname,String Lastname,String Department)
    {
    	   
          String generatedCred = Firstname+Lastname+Department+"abc.com";
          
           // Generating the email in lower case using inbuilt string method toLowerCase
           return generatedCred.toLowerCase();
    	 
    }
	
	public void showCredentials( String PassWord,String GeneratedCred ) {
    
	System.out.println("Email --->"+GeneratedCred);
	System.out.println("Password ---->"+PassWord);
	
	
	}
}
