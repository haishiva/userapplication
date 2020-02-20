package com.cap.user.service;

import com.cap.user.bean.UserBean;
import com.cap.user.dao.UserDb;

public class UserServiece {
	public int addUser(String userId,long phonenumber,String emailid,String password)
	{
		
		UserDb userdb=new UserDb();
		UserBean userBean=new UserBean();
		userBean.setUserId(userId);
		userBean.setPhonenumber(phonenumber);
		userBean.setEmailid(emailid);
		userBean.setPassword(password);
		int updateResult=0;
		try{
		updateResult=userdb.addUser1(userBean);
		return updateResult;
		}
		catch(Exception e)
		{
			System.out.println("exception resolved");
		}
		return 0;
	}
	public int userAccount(String userId,String password)
	{
		UserDb userdb=new UserDb();
		UserBean userBean=new UserBean();
		userBean.setUserId(userId);
		userBean.setPassword(password);
		int updateResult=0;
		try{
		updateResult=userdb.userAccount1(userBean);
		return updateResult;
		}
		catch(Exception e)
		{
			System.out.println("exception resolved");
		}
		return 0;
	}
}
