package com.luck.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * һ���ǳ���׼������Oracle���ݿ��ʾ������
 */
public class Luck {
	public static void main(String[] args) {
		Connection con = null;// ����һ�����ݿ�����
		PreparedStatement pre = null;// ����Ԥ����������һ�㶼�������������Statement
		ResultSet result = null;// ����һ�����������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// ����Oracle��������
			System.out.println("1113");
			String url = "jdbc:oracle:" + "thin:@DESKTOP-1LO98I2:1521:Jux";// DESKTOP-1LO98I�Ǳ�����ַ��Jux��Oracle��Ĭ�����ݿ���
			String user = "student";// �û���,ϵͳĬ�ϵ��˻���
			String password = "student";// �㰲װʱѡ���õ�����
			con = DriverManager.getConnection(url, user, password);// ��ȡ����
			System.out.println("琚欣");
			String sql = "select * from luck";// Ԥ�������
			pre = con.prepareStatement(sql);// ʵ����Ԥ�������
			// pre.setString(1, "012");// ���ò�����ǰ���1��ʾ�����������������Ǳ�������������
			result = pre.executeQuery();// ִ�в�ѯ��ע�������в���Ҫ�ټӲ���

			List<String> id = new ArrayList<>();
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
				for (int j = i + 1; j <= 9; j++) {
					for (int k = j + 1; k <= 9; k++) {
						String number = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
						int value = 0;
						int m = 0;
						System.out.println();
						System.out.print(number);
						for (; m < id.size(); m++) {
							if (number.equals(no.get(m))) {
								System.out.println("\t期数" + id.get(m) + "时间" + date.get(m) + "号码" + value + "\t");
								value = 0;
							} else {
								value++;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ��һ������ļ�������رգ���Ϊ���رյĻ���Ӱ�����ܡ�����ռ����Դ
				// ע��رյ�˳�����ʹ�õ����ȹر�
				if (result != null)
					result.close();
				if (pre != null)
					pre.close();
				if (con != null)
					con.close();
				System.out.println("���ݿ������ѹرգ�");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}