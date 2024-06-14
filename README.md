1.Education-development

2. JDK 설치 및 설정
최신 다운로드(java.sun.com) 또는 기존 다운로드된 파일(예: jdk-8u202-windows-x64.exe)을 실행
컴퓨터 속성 > 고급 시스템 설정 > 고급 > 환경 변수 > 시스템 변수에서 PATH 편집 클릭 후 JDK 경로(예: C:\Program Files\Java\jdk1.8.0_202\bin)를 추가
컴퓨터 속성 > 고급 시스템 설정 > 고급 > 환경 변수 > 시스템 변수에서 새로 만들기 클릭 후 JAVA_HOME(예: C:\Program Files\Java\jdk1.8.0_202)을 추가
명령 프롬프트에서 C:\java -version로 확인

4. Eclipse 설치 및 설정
최신 다운로드(eclipse.org) 또는 기존 다운로드된 파일(eclipse-inst-jre-win64.exe)을 실행
D:\Business\00.kr.co.himedia.sn.ecommerce5th.eclipse 폴더를 생성 후 1st Workspace로 설정

6. Tomcat 설치 및 설정
최신 다운로드(tomcat.org) 또는 기존 다운로드된 파일(apache-tomcat-9.0.80-windows-x64.zip)을 압축 해제 후 이동(예: C:\apache-tomcat-9.0.80)
%TOMCAT%\conf\server.xml 수정을 통해 홈 폴더 등을 변경
<Context displayName="www"
	docBase="D:/Business/Eclipse/kr.co.himedia.sn.ecommerce5th.localhost/WebContent"
	path=""
	workDir="D:/Business/Eclipse/dirWork"
	reloadable="true" />
%HOME_FOLDER%\index.jsp
%TOMCAT%\bin\start.bat를 실행하고 브라우저(예: http://127.0.0.1:8080)에서 확인

7. 공용 저장소 설정 at Eclipse
계정 생성(필요 시 관리자에게 문의)
공용 저장소 경로(예: http://192.168.0.254/all/kr.co.himedia.sn.ecommerce7th.moon.git)를 확인하고 Clone
Workspace로 import(예: 00.kr.co.himedia.sn.ecommerce5th.moon)

8. 팀별 저장소 설정 at Eclipse(추후)
   
9. JDK, Tomcat 등 설치 및 설정 at VM(Unbuntu)
   
  7-1. JDK
  최신 다운로드(java.sun.com) 또는 기존 다운로드된 파일(jdk-8u202-linux-x64.tar.gz)을 압축 해제
  $ tar zxvf jdk-8u202-linux-x64.tar.gz 
  압축 해제된 파일들 이동
  $ cd /usr/local
  $ sudo mkdir java
  $ cd ~
  $ sudo mv jdk1.8.0_202/ /usr/local/java/
  JDK 환경 설정을 위해 nano 편집기로 ~/.profile을 열기
  $ nano ~/.profile 
  ~/.profile에 다음(하기 4개 라인)을 추가
  ...
  export JAVA_HOME=/usr/local/java/jdk1.8.0_202
  export JRE_HOME=/usr/local/java/jdk1.8.0_202/jre
  export CLASSPATH=.:$JAVA_HOME/jre/lib/ext:$JAVA_HOME/lib/tools.jar
  export PATH=$PATH:$JAVA_HOME/bin
  추가된 JDK 환경 설정(상기 4개 라인) 확인
  cat ~/.profile
  해당 계정 프로파일을 즉시 반영
  $ source ~/.profile 
  설치된 자바 버전 확인
  $ java -version

7-2. Tomcat
  최신 다운로드(tomcat.org) 또는 기존 다운로드된 파일(apache-tomcat-9.0.80.tar.gz)을 압축 해제
  $ tar zxvf apache-tomcat-9.0.80.tar.gz
  %TOMCAT%/conf/server.xml 수정을 통해 홈 폴더 등을 변경
  %HOME_FOLDER%/index.jsp
  %TOMCAT%/bin/start.sh를 실행하고 브라우저(http://%VM_IP%:8080)에서 확인

8. Copyright
/**
 * YOU ARE STRICTLY PROHIBITED TO COPY, DISCLOSE, DISTRIBUTE, MODIFY OR USE THIS PROGRAM
 * IN PART OR AS A WHOLE WITHOUT THE PRIOR WRITTEN CONSENT OF HIMEDIA.CO.KR.
 * HIMEDIA.CO.KR OWNS THE INTELLECTUAL PROPERTY RIGHTS IN AND TO THIS PROGRAM.
 * COPYRIGHT (C) ${year} HIMEDIA.CO.KR ALL RIGHTS RESERVED.
 *
 * 하기 프로그램에 대한 저작권을 포함한 지적재산권은 himedia.co.kr에 있으며,
 * himedia.co.kr이 명시적으로 허용하지 않는 사용, 복사, 변경 및 제 3자에 의한 공개, 배포는 엄격히 금지되며
 * himedia.co.kr의 지적재산권 침해에 해당된다.
 * Copyright (C) ${year} himedia.co.kr All Rights Reserved.
 *
 *
 * Program		: kr.co.himedia.ecommerce
 * Description	:
 * Environment	: JRE 1.7 or more
 * File			: ${file_name}
 * Notes		:
 * History		: [NO][Programmer][Description]
 *				: [${currentDateTime:date('yyyyMMddHHmmss')}][rkdcodbs77#naver.com][CREATE: Initial Release]
 */
${package_declaration}

/**
 * @version 1.0.0
 * @author rkdcodbs77#naver.com
 * 
 * @since ${currentDate:date('yyyy-MM-dd')}
 * <p>DESCRIPTION:</p>
 * <p>IMPORTANT:</p>
 */
${typecomment}
${type_declaration}
