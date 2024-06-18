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
 * File			: Car.java
 * Notes		:
 * History		: [NO][Programmer][Description]
 *				: [20240617170350][rkdcodbs77#naver.com][CREATE: Initial Release]
 */

/**
 * @version 1.0.0
 * @author rkdcodbs77#naver.com
 * 
 * @since 2024-06-17
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
 */
    public class Car {
    	//필드
    	String company = "현대자동차";
    	String model;
    	String color;
    	int maxSpeed;
    	
    	//생성자
    	Car() {
    	}
    	
    	Car(String model) {
    		this(model, null, 0);
    	}
    	
    	Car(String model, String color) {
    		this(model, color, 0);
    	}
    	
    	Car(String model, String color, int maxSpeed) {
    		this.model = model;
    		this.color = color;
    		this.maxSpeed = maxSpeed;
    	}
}

