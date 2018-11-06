package com.luck.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.luck.dto.LuckDTO;

public class LuckDAO {
	public LuckDTO findLuckList(LuckDTO luckdto) {
		Connection con = null;// 创建一个数据库连接
		PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
		ResultSet result = null;// 创建一个结果集对象
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
			String url = "jdbc:oracle:" + "thin:@DESKTOP-1LO98I2:1521:Jux";
			String user = "student";// 用户名,系统默认的账户名
			String password = "student";// 你安装时选设置的密码
			con = DriverManager.getConnection(url, user, password);// 获取连接
			String sql = "select * from luck order by luck_id desc";// 预编译语句
			pre = con.prepareStatement(sql);// 实例化预编译语句
			result = pre.executeQuery();// 执行查询
			
			while (result.next()) {
        	
				luckdto.getLuckIdList().add(result.getString("luck_id"));
				luckdto.getLuckNo1List().add(result.getInt("luck_no1"));
				luckdto.getLuckNo2List().add(result.getInt("luck_no2"));
				luckdto.getLuckNo3List().add(result.getInt("luck_no3"));
				luckdto.getLuckNoList().add(result.getString("luck_no"));
				luckdto.getInsertDateList().add(result.getString("insert_date"));
				luckdto.getInsertDayList().add(result.getString("insert_day"));
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
				// 注意关闭的顺序，最后使用的最先关闭
				if (result != null)
					result.close();
				if (pre != null)
					pre.close();
				if (con != null)
					con.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		return luckdto;
	}
	
	public LuckDTO findLuck(LuckDTO luckdto) {
		Connection con = null;// 创建一个数据库连接
		PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
		ResultSet result = null;// 创建一个结果集对象
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
			String url = "jdbc:oracle:" + "thin:@DESKTOP-1LO98I2:1521:Jux";
			String user = "student";// 用户名,系统默认的账户名
			String password = "student";// 你安装时选设置的密码
			con = DriverManager.getConnection(url, user, password);// 获取连接
			String sql = "select * from luck where luck_id = ? order by luck_id desc";// 预编译语句
			pre = con.prepareStatement(sql);// 实例化预编译语句
			pre.setString(1, luckdto.getLuckId());// 设置参数
			result = pre.executeQuery();// 执行查询
			
			while (result.next()) {
        	
				luckdto.setLuckId(result.getString("luck_id"));
				luckdto.setLuckNo1(result.getInt("luck_no1"));
				luckdto.setLuckNo2(result.getInt("luck_no2"));
				luckdto.setLuckNo3(result.getInt("luck_no3"));
				luckdto.setLuckNo(result.getString("luck_no"));
				luckdto.setInsertDate(result.getString("insert_date"));
				luckdto.setInsertDay(result.getString("insert_day"));
				
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
				// 注意关闭的顺序，最后使用的最先关闭
				if (result != null)
					result.close();
				if (pre != null)
					pre.close();
				if (con != null)
					con.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		return luckdto;
	}
}

