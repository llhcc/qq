package com.llh.test;

public class StringHashCodeTest {
	 public static void main(String[] args)
	    {
	      System.out.println("192.168.0.0:111�Ĺ�ϣֵ��" + "192.168.0.0:1111".hashCode());
	      System.out.println("192.168.0.1:111�Ĺ�ϣֵ��" + "192.168.0.1:1111".hashCode());
	      System.out.println("192.168.0.2:111�Ĺ�ϣֵ��" + "192.168.0.2:1111".hashCode());
	      System.out.println("192.168.0.3:111�Ĺ�ϣֵ��" + "192.168.0.3:1111".hashCode());
	      System.out.println("192.168.0.4:111�Ĺ�ϣֵ��" + "192.168.0.4:1111".hashCode());
	      
	      System.out.println("192.168.1.0:111�Ĺ�ϣֵ��" + "192.168.1.0:1111".hashCode());
	    }
}
