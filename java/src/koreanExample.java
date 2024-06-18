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
 * File			: koreanExample.java
 * Notes		:
 * History		: [NO][Programmer][Description]
 *				: [20240618105303][rkdcodbs77#naver.com][CREATE: Initial Release]
 */

/**
 * @version 1.0.0
 * @author rkdcodbs77#naver.com
 * 
 * @since 2024-06-18
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
 */
public class koreanExample{
	public static void main(String[] args) {
	Korean k1 = new Korean("박자바", "011225-1234567");
	System.out.println("k1.name : " + k1.name);
	System.out.println("k1.ssn : " + k1.ssn);
	
	Korean k2 = new Korean("김자바", "930525-0654321");
	System.out.println("k2.name : " + k2.name);
	System.out.println("k2.ssn : " + k2.ssn);

	}
}