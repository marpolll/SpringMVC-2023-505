package com.marpol.hello.exec;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.jasypt.encryption.pbe.StandardPBEBigIntegerEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class BCryptMainV2 {
	
	public static void main(String[] args) {
		Map<String, String> envList = System.getenv();
		
	 System.out.println(envList.get("marpol.com"));
	 
	 String slatKey = envList.get("marpol.com");
	 StandardPBEStringEncryptor pbe = new StandardPBEStringEncryptor();
	 pbe.setAlgorithm("PBEWithMD5AndDES");
	 pbe.setPassword(slatKey);

	 String savePath = "./src/main/webapp/WEB-INF/spring/properties/db_info.properties";
	 System.out.printf("SALT Password : %s\n", slatKey);
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("DB Username >>");
	 String username = scan.nextLine();
	 
	 System.out.println("DB Password >>");
	 String password= scan.nextLine();
	 
	 String encUsername = pbe.encrypt(username);
	 String encPassword = pbe.encrypt(password);
	 
	 String saveUsername = String.format("db.username=ENC(%s)", encUsername);
	 String savePassword= String.format("db.password=ENC(%s)", encPassword);
	 
	 try {
		PrintWriter out = new PrintWriter(savePath);
		out.println(saveUsername);
		out.println(savePassword);
		out.flush();
		out.close();
		System.out.println("저장완료!!");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 
	}
}
