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
 * File			: CarExample.java
 * Notes		:
 * History		: [NO][Programmer][Description]
 *				: [20240617170414][rkdcodbs77#naver.com][CREATE: Initial Release]
 */

/**
 * @version 1.0.0
 * @author rkdcodbs77#naver.com
 * 
 * @since 2024-06-17
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
 */
public class CarExample {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.company : 		" + car1.company);
        System.out.println("car1.company :		" + car1.company);
        System.out.println("car1.model 	 : 		" + car1.model);
        System.out.println("car1.color 	:		" + car1.color);
        System.out.println("car1.maxSpeed : 	" + car1.maxSpeed);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("car2.company :		" + car2.company);
        System.out.println("car2.company :		" + car2.company);
        System.out.println("car2.model 	 : 		" + car2.model);
        System.out.println("car2.color 	:		" + car2.color);
        System.out.println("car2.maxSpeed : 	" + car2.maxSpeed);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : 		" + car3.company);
        System.out.println("car3.model : 		" + car3.model);
        System.out.println("car3.color : 		" + car3.color);
        System.out.println("car3.maxSpeed : 	" + car3.maxSpeed);
        System.out.println();

        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company : 		" + car4.company);
        System.out.println("car4.model : 		" + car4.model);
        System.out.println("car4.color : 		" + car4.color);
        System.out.println("car4.maxSpeed : 	" + car4.maxSpeed);
    }
}