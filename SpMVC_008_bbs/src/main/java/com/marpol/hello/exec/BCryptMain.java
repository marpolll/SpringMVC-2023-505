package com.marpol.hello.exec;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jasypt.encryption.pbe.StandardPBEBigIntegerEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class BCryptMain {
	
	public static void main(String[] args) {
		// 컴퓨터 운영체제에 등록된 "환경변수"를 추출하는 코드
		Map<String, String> envList = System.getenv();
		
		// Map 데이터에서 key 만 List 로 추출하기
//		List<String> envKeys = new ArrayList<>(envList.keySet());
//		
//		for(String env : envKeys) {
//			System.out.printf("%s : %s\n", env, envList.get(env));
//		}
	 System.out.println(envList.get("marpol.com"));
	 
	 String slatKey = envList.get("marpol.com");
	 // 암호문을 만드는 도구
	 StandardPBEStringEncryptor pbe = new StandardPBEStringEncryptor();
	 // MD5 와 DES 방식으로 암호화를 하겠다.
	 pbe.setAlgorithm("PBEWithMD5AndDES");
	 pbe.setPassword(slatKey);

	 // plan Text 를 암호화 시키는 method
	 String encString = pbe.encrypt("marpol");
	 System.out.println(encString);
	 
	 String s1 = "ZfL0ZIZDhPP6n3CdXDDIrg==";
	 String s2 = "7Ps0NRUCriTKeuRPzxCEXw==";
	 String s3 = "yyq9RYVb6lmfEpTEawcgIA==";
	 
	 // 암호화된 Text 를 복호화(plan Text 로 변환) 시키는 method
	 System.out.println(pbe.decrypt(s1));
	 System.out.println(pbe.decrypt(s2));
	 System.out.println(pbe.decrypt(s3));
	 
	 String savePath = "./src/main/webapp/WEB-INF/spring/properties/db_info.properties";
	 
	 try {
		PrintWriter out = new PrintWriter(savePath);
		out.println("username=marpol");
		out.println("password=12345");
		out.flush();
		out.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	}
}
