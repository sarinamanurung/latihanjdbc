package com.eksad.latihanjdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.eksad.latihanjdbc.model.Employe;

public class EmployeService {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/eksaddb";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgres";
	
	public Connection conn() {
		try {
			Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("koneksi berhasil");
			return con ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("koneksi gagal");
			e.printStackTrace();
			return null;
		}
		
	}
		public void getAll() {
			try {
				Connection con = conn();
				Statement st = con.createStatement();
				
				String sql = "SELECT * FROM EMPLOYE";
				ResultSet result = st.executeQuery(sql);
				
				while (result.next()) {
					int id = result.getInt("id");
					String name = result.getString("name");
					Date dob = result.getDate("dob");
					String address = result.getString("address");
					System.out.print("ID: " + id);
					System.out.print("Name: " + name);
					System.out.print("Date Of Birth: " + dob);
					System.out.print("Address: " + address);
				}
				result.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void getById(int id) {
			try {
				Connection con = conn();
				Statement st = con.createStatement();
				
				String sql = "SELECT * FROM EMPLOYE WHERE id= " + id;
				ResultSet result = st.executeQuery(sql);
				
				while (result.next()) {
					id = result.getInt("id");
					String name = result.getString("name");
					Date dob = result.getDate("dob");
					String address = result.getString("address");
					System.out.print("ID: " + id);
					System.out.print("Name: " + name);
					System.out.print("Date Of Birth: " + dob);
					System.out.print("Address: " + address);
				}
				result.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void getByName(String name) {
			try {
				Connection con = conn();
				Statement st = con.createStatement();
				
				String sql = "SELECT * FROM EMPLOYE WHERE Name like '" + name  + "%'" ;
				ResultSet result = st.executeQuery(sql); // quary untuk mengirim perintah 
				
				while (result.next()) {
					name = result.getString("name");
					Date dob = result.getDate("dob");
					String address = result.getString("address");
					System.out.print("Name: " + name);
					System.out.print("Date Of Birth: " + dob);
					System.out.print("Address: " + address);
				}
				result.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void save() {
			try {
				Connection con = conn();
				Statement st = con.createStatement();
				
				String sql = "INSERT INTO employe(name, dob, address) VALUES (" + "'abc', " + "'2019-06-28', " + "'Bandung')";
				int result = st.executeUpdate(sql);
//				
//				while (result.next()) {
//				}
//					name = result.getString("name");
//					Date dob = result.getDate("dob");
//					String address = result.getString("address");
//					System.out.print("Name: " + name);
//					System.out.print("Date Of Birth: " + dob);
//					System.out.print("Address: " + address);
//				}
//				result.close();
//				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		
		
		public void update (String address) {
			try {
				Connection con = conn();
				Statement st = con.createStatement();
				
				
				String sql = "UPDATE employe set name = 'Sintia' where address = '"+ address + "'";
				int result = st.executeUpdate(sql);
//				
//				while (result.next()) {
//				}
//					name = result.getString("name");
//					Date dob = result.getDate("dob");
//					String address = result.getString("address");
//					System.out.print("Name: " + name);
//					System.out.print("Date Of Birth: " + dob);
//					System.out.print("Address: " + address);
//				}
//				result.close();
//				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void save (Employe employe) {
			try {
				Connection con = conn();
				Statement st = con.createStatement();
				
				
				String sql = "INSERT INTO employe(name, address, dob) VALUES ('" +employe.getName()+ "','"+employe.getAddress()+"','"+employe.getDob()+"')";
				int result = st.executeUpdate(sql);
				//System.out.println("berhasil");
//				
//				while (result.next()) {
//				}
//					name = result.getString("name");
//					Date dob = result.getDate("dob");
//					String address = result.getString("address");
//					System.out.print("Name: " + name);
//					System.out.print("Date Of Birth: " + dob);
//					System.out.print("Address: " + address);
//				}
//				result.close();
//				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void input (String name, String address, String dob) {
			try {
				Connection con = conn();
				Statement st = con.createStatement();
				
				
				String sql = "INSERT INTO employe(name, address, dob) VALUES ('" +name+ "','"+address+"','"+dob+"')";
				int result = st.executeUpdate(sql);
				//System.out.println("berhasil");
//				
//				while (result.next()) {
//				}
//					name = result.getString("name");
//					Date dob = result.getDate("dob");
//					String address = result.getString("address");
//					System.out.print("Name: " + name);
//					System.out.print("Date Of Birth: " + dob);
//					System.out.print("Address: " + address);
//				}
//				result.close();
//				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}

			
