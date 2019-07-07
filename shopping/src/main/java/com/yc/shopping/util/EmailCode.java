package com.yc.shopping.util;

public class EmailCode {

	public static String getNumber(){
        String str = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = "";
        for(int i= 0;i<4;i++){
            int index = (int)(Math.random()*str.length());
            code+=str.charAt(index);
        }
        return code;
    }
}
