/**
 * YOU ARE STRICTLY PROHIBITED TO COPY, DISCLOSE, DISTRIBUTE, MODIFY OR USE THIS PROGRAM
 * IN PART OR AS A WHOLE WITHOUT THE PRIOR WRITTEN CONSENT OF HIMEDIA.CO.KR.
 * HIMEDIA.CO.KR OWNS THE INTELLECTUAL PROPERTY RIGHTS IN AND TO THIS PROGRAM.
 * COPYRIGHT (C) 2024 HIMEDIA.CO.KR ALL RIGHTS RESERVED.
 *
 * 하기 프로그램에 대한 저작권을 포함한 지적재산권은 himedia.co.kr에 있으며,
 * himedia.co.kr이 명시적으로 허용하지 않는 사용, 복사, 변경 및 제 3자에 의한 공개, 배포는 엄격히 금지되며
 * himedia.co.kr의 지적재산권 침해에 해당된다.
 * Copyright (C) 2024 himedia.co.kr All Rights Reserved.
 *
 *
 * Program		: kr.co.himedia.ecommerce
 * Description	:
 * Environment	: JRE 1.7 or more
 * File			: Calculator.java
 * Notes		: 
 * History		: [NO][Programmer][Description]
 *				: [20240618115527][rkdcodbs77#naver.com][CREATE: Initial Release]
 */

/**
 * @version 1.0.0
 * @author rkdcodbs77#naver.com
 * 
 * @since 2024-06-18
 * <p>DESCRIPTION:계산기 클래스</p>
 * <p>IMPORTANT:</p>
 */
public class Calculator {
		//메소드
		void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		void powerOff() {
			System.out.println("전원을 끕니다.");
		}
		/**
		 * [2024-06-18] [rkdcodbs77#naver.com][TODO 추후 빼기하고 곱하기도 개발 예정]
		 * @param 첫번째 인자 (x)
		 * @param 두번째 인자 (y)
		 * @return int
		 * 
		 * @version 1.0.0
		 * @author rkdcodbs77#naver.com
		 * 
		 * @since 2024-06-18
		 * <p>DESCRIPTION:x(첫번째 인자)와 y(두번째 인자) 나눈를 리턴(int)합니다.</p>
		 * <p>IMPORTANT:</p>
		 */
		int plus(int x, int y) {
			int result = x + y;
			return result;
		}
		
		double divide(int x, int y) {
			double result = (double)x / (double)y;
			return result;
		}
		


}
