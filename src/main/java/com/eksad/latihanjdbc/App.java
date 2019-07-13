package com.eksad.latihanjdbc;

import java.util.Scanner;

import com.eksad.latihanjdbc.model.Employe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeService employeeService = new EmployeService();
//        employee.conn();
        
//        employee.getAll();
//        employee.getById(2);
//        employee.getByName("D");
//        employee.save();
//        employee.update("jakarta");
        
        Scanner scan = new Scanner(System.in);
//        String inputan = scan.nextLine();
//        System.out.println("Halo" + inputan);
        
        Employe employe = new Employe();
//   	 
//        
//    	 System.out.println("Masukkan Nama : ");
//    	 String inputname = scan.nextLine();
//    	 employe.setName(inputname);
//    	 
//    	 System.out.println("Masukkan Alamat : ");
//    	 String inputaddress = scan.nextLine();
//    	 employe.setAddress(inputaddress);
//    	 
//    	 System.out.println("Masukkan dob: ");
//    	 String inputdob = scan.nextLine();
//    	 employe.setDob(inputdob);
    	 
//    	 employee.input(inputname, inputaddress, inputdob);
//    	 System.out.println(inputname + "Berhasil Tersimpan");
    	 
//    	 employeeService.save(employe);

//        System.out.println("Pilih Angka:");
//        System.out.println("1. Jeruk");
//        System.out.println("2. Mangga");
//        System.out.println("3. Apel");
//        
//        String angkaTerpilih = scan .nextLine();
//        if (angkaTerpilih.equals("1")) {
//        	System.out.println("Saya Pilih Jeruk");
//        }else if (angkaTerpilih.equals("2")) {
//        	System.out.println("Saya Pilih Mangga");
//        }else if (angkaTerpilih.equals("3")) {
//        	System.out.println("Saya Pilih Apel");
//        }else {
//			System.out.println("Anda Salah Pilih");
//		}
			
        System.out.println("Pilih Menu:");
        System.out.println("1. Tampilkan Data Karyawan");
        System.out.println("2. Cari Karyawan");
        System.out.println("3. Input Karyawann");
        
        String Pilihmenu = scan .nextLine();
        if (Pilihmenu.equals("1")) {
        	employeeService.getAll();
        	
        }else if (Pilihmenu.equals("2")) {
        	String inputNama = scan.nextLine();
        	employeeService.getByName(inputNama);
        	
        }else if (Pilihmenu.equals("3")) {
        	System.out.println("Masukkan Nama : ");
       	 String inputname = scan.nextLine();
       	 employe.setName(inputname);
       	 
       	 System.out.println("Masukkan Alamat : ");
       	 String inputaddress = scan.nextLine();
       	 employe.setAddress(inputaddress);
       	 
       	 System.out.println("Masukkan dob: ");
       	 String inputdob = scan.nextLine();
       	 employe.setDob(inputdob);
       	 
       	// employee.input(inputname, inputaddress, inputdob);
       	// System.out.println(inputname + "Berhasil Tersimpan");
       	 
       	 employeeService.save(employe);
        }else {
			System.out.println("Anda Salah Pilih");
		}
        	
        	
    	 
    }
}
