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
		Connection con = null;// ����һ�����ݿ�����
		PreparedStatement pre = null;// ����Ԥ����������һ�㶼�������������Statement
		ResultSet result = null;// ����һ�����������
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");// ����Oracle��������
			String url = "jdbc:oracle:" + "thin:@DESKTOP-1LO98I2:1521:Jux";
			String user = "student";// �û���,ϵͳĬ�ϵ��˻���
			String password = "student";// �㰲װʱѡ���õ�����
			con = DriverManager.getConnection(url, user, password);// ��ȡ����
			String sql = "select * from luck order by luck_id desc";// Ԥ�������
			pre = con.prepareStatement(sql);// ʵ����Ԥ�������
			result = pre.executeQuery();// ִ�в�ѯ
			
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
				// ��һ������ļ�������رգ���Ϊ���رյĻ���Ӱ�����ܡ�����ռ����Դ
				// ע��رյ�˳�����ʹ�õ����ȹر�
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
		Connection con = null;// ����һ�����ݿ�����
		PreparedStatement pre = null;// ����Ԥ����������һ�㶼�������������Statement
		ResultSet result = null;// ����һ�����������
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");// ����Oracle��������
			String url = "jdbc:oracle:" + "thin:@DESKTOP-1LO98I2:1521:Jux";
			String user = "student";// �û���,ϵͳĬ�ϵ��˻���
			String password = "student";// �㰲װʱѡ���õ�����
			con = DriverManager.getConnection(url, user, password);// ��ȡ����
			String sql = "select * from luck where luck_id = ? order by luck_id desc";// Ԥ�������
			pre = con.prepareStatement(sql);// ʵ����Ԥ�������
			pre.setString(1, luckdto.getLuckId());// ���ò���
			result = pre.executeQuery();// ִ�в�ѯ
			
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
				// ��һ������ļ�������رգ���Ϊ���رյĻ���Ӱ�����ܡ�����ռ����Դ
				// ע��رյ�˳�����ʹ�õ����ȹر�
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

