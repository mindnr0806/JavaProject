package com.kh.practice1;

public class operationPractice4 {
	
	public static void main(String[] args) {
		
		public class OperationPractice4 { // 기능 제공용 클래스
			public void method() {
			int iNum1 = 10;
			int iNum2 = 4;
			float fNum = 3.0f;
			double dNum = 2.5;
			char ch = 'A';
			System.out.println( iNum1 iNum2 ); // 2
			System.out.println( dNum ); // 2
			System.out.println( iNum2 dNum ); // 10.0
			System.out.println( iNum1 ); // 10.0
			System.out.println( iNum1 iNum2 ); // 2.5
			System.out.println( dNum ); // 2.5
			System.out.println( fNum ); // 3
			System.out.println( iNum1 fNum ); // 3
			System.out.println( iNum1 fNum );// 3.3333333
			System.out.println( iNum1 fNum ); // 3.3333333333333335
			System.out.println( ch ); // 'A'
			System.out.println( ch ); // 65
			System.out.println( ch iNum1 ); // 75
			System.out.println( (ch iNum1) ); // 'K'		
	}

}
