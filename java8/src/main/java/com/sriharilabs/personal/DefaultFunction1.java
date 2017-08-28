package com.sriharilabs.personal;

import com.sriharilabs.functionDefault.InterfaceDefault;

public class DefaultFunction1 implements InterfaceDefault{

	

	public void disp() {
		//System.out.println(show());
	}
	public static void main(String as[]) {
		
		DefaultFunction1 d=new DefaultFunction1();
		d.disp();
		//System.out.println(String::show);
	}
}
