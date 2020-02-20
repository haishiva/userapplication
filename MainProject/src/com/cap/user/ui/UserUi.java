package com.cap.user.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cap.user.service.UserServiece;

public class UserUi {
public static void main(String[] args) {
	String userId;
	long phonenumber;
	String password;
	String emailid;
	String password1;
	Pattern pattern;
    Matcher matcher;
     String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
   String EMAIL_PATTERN="^[\\w.+\\-]+@gmail\\.com$";
	Scanner s=new Scanner(System.in);
	int i;
	int result,result1;
	System.out.println("1.Register\n2.Login");;
	i=s.nextInt();
	switch(i)
	{
	case 1:System.out.println("enter userid:");
	       userId=s.next();
	       System.out.println("enter phonenumber:");
	       phonenumber=s.nextLong();
do{
	       System.out.println("enter emailid:");
	       emailid=s.next();
	       pattern = Pattern.compile(EMAIL_PATTERN);
           matcher = pattern.matcher(emailid);
           if(matcher.matches()==false)
           {
        	   System.out.println("enter valid Emailid");
               
           }
}while(matcher.matches()==false);
	       do{
	    	   System.out.println("enter password:");
	    	   
	       password=s.next();
	      
	           pattern = Pattern.compile(PASSWORD_PATTERN);
	           matcher = pattern.matcher(password);
	           if(matcher.matches()==false)
	           {
	        	   System.out.println("Password must contain one UPPERCASE letter one LOWERCASE letter one SPECIAL CHARACTER");
	               
	           }
	   }while(matcher.matches()==false);
	           
	do{
	       System.out.println("Reenter password:");
	       password1=s.next();
	       if(password.compareTo(password1)==0)
	       {
	    	   System.out.println("password is matched");
	    	   
	       }
	       else
	       {
	    	   System.out.println("password does not match");
	       }
	}while(password.compareTo(password1)!=0);
	UserServiece user=new UserServiece();
	result=user.addUser(userId, phonenumber, emailid, password);
	if(result==1)
	{
		System.out.println("Registration is successful");
	}
	break;
	case 2:System.out.println("enter userId:");
	       userId=s.next();
	       System.out.println("enter password");
	       password=s.next();
	       UserServiece user1=new UserServiece();
	   result1=	user1.userAccount(userId,password);
	   if(result1==0)
		{
			System.out.println("Account does not exist");
		}
	   else
	   {
		   System.out.println("Login Successful");
	   }
	       break;
	}
	s.close();
}
}
