package com.cap.user.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cap.user.bean.UserBean;
public class UserDb {
	public int addUser1(UserBean UserBean)
	{
		Connection con=null;
		PreparedStatement pst=null;
		try{
			con=UserDao.getConnection1();
			pst=con.prepareStatement("insert into userdetails values(?,?,?,?)");
			pst.setString(1, UserBean.getUserId());
			pst.setLong(2, UserBean.getPhonenumber());
			pst.setString(3, UserBean.getEmailid());
			pst.setString(4, UserBean.getPassword());
			int updateCount=pst.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	public int userAccount1(UserBean UserBean)
	{
		Connection con=null;
		PreparedStatement pst=null;
		try{
			con=UserDao.getConnection1();
			pst=con.prepareStatement("select *from userdetails where userId=? and password=?");
			pst.setString(1, UserBean.getUserId());
			pst.setString(2, UserBean.getPassword());
			int updateCount=pst.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
}
