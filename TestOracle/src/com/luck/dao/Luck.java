package com.luck.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 一个非常标准的连接Oracle数据库的示例代码
 */
public class Luck {
	public static void main(String[] args) {
		Connection con = null;// 创建一个数据库连接
	    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	    ResultSet result = null;// 创建一个结果集对象
	    try
	    {
	        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
	        System.out.println("开始尝试连接数据库！");
	        String url = "jdbc:oracle:" + "thin:@DESKTOP-1LO98I2:1521:Jux";// DESKTOP-1LO98I是本机地址，Jux是Oracle的默认数据库名
	        String user = "student";// 用户名,系统默认的账户名
	        String password = "student";// 你安装时选设置的密码
	        con = DriverManager.getConnection(url, user, password);// 获取连接
	        System.out.println("连接成功！");
	        String sql = "select * from luck";// 预编译语句
	        pre = con.prepareStatement(sql);// 实例化预编译语句
	        // pre.setString(1, "012");// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
	        result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
	        
	        List<String>  id = new ArrayList<>();
	        List<Integer> no1 = new ArrayList<>();
        	List<Integer> no2 = new ArrayList<>();
        	List<Integer> no3 = new ArrayList<>();
        	List<String> no = new ArrayList<>();
        	List<Integer> date = new ArrayList<>();

	        
	        while (result.next()) {
	        	
	        	id.add(result.getString("luck_id"));
	        	no1.add(result.getInt("luck_no1"));
	        	no2.add(result.getInt("luck_no2"));
	        	no3.add(result.getInt("luck_no3"));
	        	no.add(result.getString("luck_no"));
	        	date.add(result.getInt("insert_date"));
	        }
	        
	        for (int i = 0; i <= 9; i++) {
        		for (int j = i +1; j <= 9; j++) {
        			for (int k = j + 1; k <= 9; k++) {
        				String number = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
        				int value = 0;
        				int m = 0;
        				System.out.println();
        				System.out.print(number);
        				for ( ;m < id.size(); m++) {
        					if (number.equals(no.get(m))) {
        						System.out.println("\t第" + id.get(m) + "期" + date.get(m) + "出現，漏了" + value + "次\t");
        						value = 0;
        					} else {
        						value++;
        					}
        				}
        			}
        		}
        	}
	    }
	    catch (Exception e)
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
	            System.out.println("数据库连接已关闭！");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	}
}