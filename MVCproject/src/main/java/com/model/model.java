package com.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

public class model {
	private String name;
	private String password;
	private int reg_no;
	private int marks1;
	private int marks2;
	private int marks3;
	private int avg;
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public int getReg_no() {
		return reg_no;
	}
	public int getMarks1() {
		return marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public int getAvg() {
		return avg;
	}
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="SYSTEM";
	String pass="SYSTEM";
	String driver="oracle.jdbc.driver.OracleDriver";
	String sql="SELECT * FROM RESULTS WHERE REG_NO=? AND PASSWORD=?";
	
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	public model() {
		try {
			Class.forName(driver);
			con= DriverManager.getConnection(url,user,pass);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void GetResult(){
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, reg_no);
			pst.setString(2, password);
			rs=pst.executeQuery();
			while(rs.next()) {
				String name=rs.getString(1);
				String pas=rs.getString(2);
				int regg=rs.getInt(3);
				int marks1=rs.getInt(4);
				int marks2=rs.getInt(5);
				int marks3=rs.getInt(6);
				int avg=rs.getInt(7);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
}
