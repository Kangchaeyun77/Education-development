# java basic

# 속성


```jsx
double 은 값을 크게 설정할 수 있음.
float 은 값을 상세하게 설정할 수 없어서 
f나 F를 붙여서 관련(f,F)값에 3.14를 넣는다는 개념.
```


```jsx
마찬가지로 너무 큰 정수도 int로는 출력할 수 없기 때문에 long을 사용해서 표기하며, 알아보기 
편하도록 언더바(_)를 넣어서 표기하고 sout을 사용하여 볼 수 있다.
```

```jsx
각각의 자료형이 뜻하는 부분과 포함범위를 알고 표시하면 좋을 듯 하다.
논리형 boolean => true, false
문자형 String은 문자를 저장하는 데이터타입으로 크기는 글자당 2바이트
실수형 double은 8바이트이며, 소수점 표현에 유용함
float은 더 작은 소수의 범위를 표현할 수 있고, 끝에 f를 적어 실수를 선언하게 됨.
정수형 int는 4바이트, long은 8바이트

byte는 1바이트, short은 2바이트로 :표현할 수 있는 범위가 작아 잘 사용되지 않음
```

# 문장 복사

```jsx
인텔리제이에서는 같은 문장을 바로 아래 복사하는데 컨트롤 d를 누르면 밑줄에 복사됨.
```

# 주석 처리

```jsx
인텔리제이는 **한줄 주석**의 경우 -> **컨트롤 + / 를 누르면 주석처리됨**
**여러줄 주석**의 경우 ->**컨트롤+ shift +/ 를 누르면 주석처리됨**.
전체문장을 하고 싶으면 주석처리하고 싶은만큼 드레그 해서 주석처리함.
주석하고싶은 문장에 **일부 주석이 포함되어있으면 주석처리 되지 않음.**
```

# 변수 이름 짓는 법


```jsx
변수 이름 앞에 숫자로 먼저 시작할 수 없음.
변수 이름 앞에 _ - 로 먼저 시작할 수 없음.
```

# 상수

```jsx
상수는 변하지 않는 값이기 때문에 자바에서 약속한 키워드인 **final**을 앞에 붙이고
뒤에 문장을 작성한다. 
**final String 의 변수명은 대문자로만 사용**가능하다.
이후 관련 값을 변경할 수 없게 된다.
그러므로, **변하지 않는 값만 적어야 한다.**
```

# 정수 vs 실수

```jsx
정수 (Integer)
정의: 정수는 소수점이 없는 수입니다. 자연수, 음의 정수, 0을 포함합니다.
예시: -3, -2, -1, 0, 1, 2, 3 등
특징:
소수점이 없습니다.
수의 크기만큼 메모리를 사용합니다. (예: 32비트 정수, 64비트 정수 등)
나누기 연산 시 결과가 정수로 나옵니다. 예를 들어, 7 / 2는 3 (나머지 버림).
실수 (Floating-point number)
정의: 실수는 소수점 이하의 자리를 가지는 수입니다. 유리수와 무리수를 포함합니다.
예시: -3.14, -2.0, 0.0, 1.5, 2.718 등
특징:
소수점을 포함할 수 있습니다.
부동 소수점 방식을 사용하여 저장됩니다. (예: float, double)
나누기 연산 시 결과가 실수로 나옵니다. 예를 들어, 7.0 / 2.0은 3.5입니다.
부동 소수점 오차가 존재할 수 있습니다.
차이점 요약
형태:

정수: 소수점이 없음.
실수: 소수점을 가질 수 있음.
표현 범위:

정수: 정해진 크기의 메모리 내에서 정확하게 표현됨. (예: 32비트 정수는 -2,147,483,648부터 2,147,483,647까지 표현 가능)
실수: 더 넓은 범위를 표현할 수 있지만, 정확도에 한계가 있음. 부동 소수점 표기법을 사용하여 근사값을 저장함.
사용 메모리:

정수: 일반적으로 실수보다 적은 메모리를 사용함. (예: int는 4바이트, float는 4바이트, double은 8바이트)
실수: 더 많은 메모리를 사용할 수 있음. (예: double은 8바이트)
연산:

정수: 정수 연산(덧셈, 뺄셈, 곱셈, 나눗셈)에서 결과가 정수로 나옴.
실수: 실수 연산(덧셈, 뺄셈, 곱셈, 나눗셈)에서 결과가 실수로 나옴.
오차:

정수: 정밀도 문제가 없음.
실수: 부동 소수점 오차가 발생할 수 있음. 예를 들어, 0.1을 정확하게 표현할 수 없음.

실수는 float, double 사용, 
숫자가 커지면 21346456F; F를 끝에 붙여서 출력 다만, byte기반이라 수가 깨져서 
뒤에가 출력되지 않을 수 있어서 수가 커진다면 double을 사용하게 되는 것

정수는 기본적으로 int를 주로 사용하고 길어지면 long을 사용한다.
12315646103L;
```

# 형 변환

```jsx
int는 정수형의 숫자만 나타낼 수 있다.
하지만 float은 실수형의 숫자를 나타내므로, 
System.out.println (어떤 형변환을 하는지 나타냄)); => 형변환을 할 수 있다.
```


```jsx
실수를 정수로 변경도 가능하다.
```
# 산술 연산자

```jsx
System.*out*.println(5 / 2); //2
System.*out*.println(2 / 4); //0

vs

        System.out.println(4 % 2);
        //4를 2로 나눔(나머지 연산) //0
        // % 연산자는 나머지를 반환합니다. 
        //4를 2로 나눈 나머지는 0이므로 결과는 0이 됩니다.
```

```jsx
//변수를 이용한 연산

int a =20;
int b= 10;

int c; c = a + b;
System.*out*.println(c); //30

c = a - b;
System.*out*.println(c);//10

c= a *b;
System.*out*.println(c);//200

c= a / b;
System.*out*.println(c);//2

c = a % b;
System.*out*.println(c);//0
```

# 삼항 연산자

```jsx
결과 = (조건)? (참의 경우의 결과값) : (거짓의 경우 결과값)
```

```java
조건식을 따진 뒤 그 결과에 따라서 어떤 식을 수행할지 결정되는 삼항 연산자입니다.
int score =95;
char grad=(score>90)? 'A':'B'
조건식이 true일 때 A이 실행되고 조건식이 false일 때 B가 실행됩니다.

간혹 사람에 따라 if {}else{} 구문으로 사용하기도 함.
코드의 효율성면에서 간결하게 사용하는 것.
```

# 문자열(String)

```jsx
public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);

        //문자열 길이
        System.out.println((s.length())); //28

        //대소문자 변환
        System.out.println(s.toUpperCase());
        //소문자로 변환
        System.out.println(s.toLowerCase());

        //포함관계
        System.out.println(s.contains("Java"));//포함되면 true
        System.out.println(s.contains("C#")); //false
        System.out.println(s.indexOf("Java")); //위치정보, 없는 문자열 -1
        System.out.println(s.indexOf("and")); //처음 위치하는 위치정보
        System.out.println(s.lastIndexOf("and")); //마지막에 위치하는 위치정보
        System.out.println(s.startsWith("I like"));//관련 문자열로 시작하면 true
        System.out.println(s.endsWith("C")); //이 문자열로 끝나면 true
    }
}

```

```jsx
`String s = "I like Java and Python and C";
        
//문자열 변환        
System.*out*.println(s.replace("and",",")); //s라는 문자열 속 and를 ,로 변환
        
System.*out*.println(s.substring(7)); 
//index기준(0부터 시작) 7부터 시작하고 이전 내용 잘라내어 출력
       
System.*out*.println(s.substring(s.indexOf("Java"))); //시작부터 끝까지 출력        
System.*out*.println(s.substring(s.indexOf("Java"), s.indexOf("C"))); 
// 시작 위치부터 끝 위치 "직전"까지 출력 
      
//공백 제거       
 s="             I love Java.   ";        
 System.*out*.println(s);        
 System.*out*.println(s.trim()); //앞 뒤 공백제거        
 //문자열 결합        
 String s1 ="Java";       
 String s2 ="C";        
 System.*out*.println(s1 + s2);//공백없이 붙어서 출력        
 System.*out*.println(s1+ "," + s2); //Java,C        
 System.*out*.println(s1.concat(",").concat(s2)); //Java,C 
```

# 문자열 비교 (String Comapare)

```jsx
package Chp_03_;public class _04_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "고양이 네오";
        String s2 = "고양이 BOBO";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals("고양이 네오")); //true
        System.out.println(s2.equals("고양이 bobo"));//false
        System.out.println(s2.equalsIgnoreCase("고양이 bobo"));
        //true,대소문자 구별없이 내용이 같은지 확인

        //문자열 비교 심화
        s1 = "1234"; //A의 비밀번호
        s2 = "1234"; //B의 비밀번호

        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//true

        s1= new String("1234");
        s2= new String("1234");
        System.out.println(s1.equals(s2));//true, 내용을 비교
        System.out.println(s1==s2);
        //false , s1의 데이터는 한개만 있고 s2와는 다르다. 
        //참조(s1,s2)하는 것을 비교하는 것
    }
}

```

# 특수 문자

```jsx
package Chp_03_;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프문자(=EscapeSequence, Escape Character, Special Character)
        // \n , \t , \\ , \" , \`
        System.out.println("고양이가");
        System.out.println("너무");
        System.out.println("귀여워요");
             //위아래가 같음
        System.out.println("고양이가\n너무\n귀여워요"); // \=>줄바꿈(\n)
        System.out.println("해물파전\t 9,000원");  // \t => tab키
        System.out.println("부추전\t\t 5,000원");

       //System.out.println("C:\Program Files\Java"); ,
       //Window의 경로표시와 다르게 Java의 경우 \\(2번)해줘야함
       
        System.out.println("C:\\Program Files\\Java"); // \\=>역슬러시

        System.out.println("단비가\"냐옹\"했어요"); // \"=>문장 내 ""표시
        System.out.println("단비가\'냐옹\'했어요");// \'=>문장 내 ''표시
        System.out.println("단비가 '냐옹' 했어요"); 
        // \' 없이도 문장 내에서 ''표시를 출력할 수 있다. 그렇다면,어디에 \'를 사용하는가?

        char c = 'A';
        c= '\'';
        System.out.println(c);

    }
}
```

# 조건문 If

```jsx
    public static void main(String[] args) {
        //조건문 If
        int hour =10; //오전10시
        if(hour<14) // if문에서 한문장만 출력할 경우에는 {} 생략가능
            System.out.println("아이스아메리카노 +1");

        //조건문 If
        int time  =15; 
        if(time<14) {
            System.out.println("아이스아메리카노 +1");
            System.out.println("샷추가");
        } //두개 이상의 출력을 사용할 경우는 {} 사용해야함.
        System.out.println("커피주문완료");

        //오후 2시 이전, 모닝 커피를 마시지 않을 경우,마시지 않아(false)라서 실행됨
        hour =10;
        boolean moringCoffe = false;
        if(hour<14&&moringCoffe==false){
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피주문완료#2");
```

```java
	int score = 93;

		 if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80보다 큽니다.");
            System.out.println("등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70보다 큽니다.");
            System.out.println("등급은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("점수가 60보다 큽니다.");
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("점수가 60보다 작습니다.");
            System.out.println("등급은 F 입니다.");
        }
	
	
	
	<원하는 값을 입력하지 않을 경우를 대비한 코드>
	import java.util.Scanner;

	public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        while (true) {
            System.out.print("점수를 입력하세요: ");
            if (scanner.hasNextInt()) {
                score = scanner.nextInt();

                if (score < 0) {
                    System.out.println("음수는 입력할 수 없습니다. 다시 입력하세요.");
                } else {
                    break;
                }
            } else {
                System.out.println("숫자가 아닌 값이 입력되었습니다. 다시 입력하세요.");
                scanner.next(); // Clear the invalid input
            }
        }

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80보다 큽니다.");
            System.out.println("등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70보다 큽니다.");
            System.out.println("등급은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("점수가 60보다 큽니다.");
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("점수가 60보다 작습니다.");
            System.out.println("등급은 F 입니다.");
        }

        scanner.close();
    }
}

<정규식을 사용한 예시(숫자를 제외한 값을 받지 않음>
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int score;

        // 숫자 입력 받기
        System.out.print("점수를 입력하세요: ");
    	  input = "85";
        
        // 정규식을 이용하여 숫자가 아닌 값을 0으로 대체
        input = input.replaceAll("[^0-9]", "0");
        
        // 숫자로 변환
        score = Integer.parseInt(input);

        // 점수에 따른 등급 출력
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80보다 큽니다.");
            System.out.println("등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70보다 큽니다.");
            System.out.println("등급은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("점수가 60보다 큽니다.");
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("점수가 60보다 작습니다.");
            System.out.println("등급은 F 입니다.");
        }
    }
}

<random 코드 >
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		//(int)1<=?<6.9999999
		//1<? <= 6
		if(num==1) 			    {System.out.println("1번이 나왔습니다.");}
		else if(num==2) 	  {System.out.println("2번이 나왔습니다.");
		} else if(num==3) 	{System.out.println("3번이 나왔습니다.");
		} else if(num==4) 	{System.out.println("4번이 나왔습니다.");
		} else if(num==5) 	{System.out.println("5번이 나왔습니다.");
		} else 				      {System.out.println("6번이 나왔습니다.");
	}
}
```

# Else If

```jsx
public class _03_ElseIf {
    public static void main(String[] args) {
        boolean hall =true;//한라봉에이드
        boolean mango=true;//망고 주스

        if(hall){
            System.out.println("한라봉에이드 +1");
        }else if (mango){
            System.out.println("망고주스 +1");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
    }
}
```

# 조건문(Else)

```jsx
public class _02_Else {
    public static void main(String[] args) {
        //조건문 If Else
        int hour =10;
        if(hour<14) {
            System.out.println("아이스아메리카노 +1");
        } else {
            System.out.println("아이스아메리카노 (디카페인) +1");
        }
        System.out.println("커피주문완료 #1");
        
        hour =15;
        boolean moringCoffe= true;
        if(hour>=14||moringCoffe==true) {
            System.out.println("아이스 아메리카노(디카페인) +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
    }
}

/*아이스아메리카노 +1
커피주문완료 #1
아이스 아메리카노(디카페인) +1*/
```

# Switch문

```jsx
public class _04_switchcase {
    public static void main(String[] args) {
        int ranking = 1;

        if (ranking == 1) {
            System.out.println("전액 장학");
        } else if (ranking == 2) {
            System.out.println("반액 장학");
        } else if (ranking == 3) {
            System.out.println("반액의 반 장학");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 +1");
    }
}
//전액 장학 조회 완료 +1

  ranking =1;
        switch (ranking){
           case 1 :
               System.out.println("전액 장학");
                break;
           case 2 :
               System.out.println("반액 장학");
                break;
            case 3 :
                System.out.println("반액의 반 장학");
                break;
            case 4 :
                System.out.println("아쉽네");
                break;

            default:
                System.out.println("공부 더 해야함");
            
  break가 없으면 아래 문장출력이 실행됨. 
  그래서 case별 break; 문을 넣어줘야 해당 로직이 실행됨.
  
  
                  int grade =2;
                int price =7000;
                switch (grade) {
                    case 1:
                        price += 1000;
                    case 2:
                        price += 700;
                    case 3:
                        price += 300;
                        break;
                }
                System.out.println(grade + "등급 제품의 가격:" +price + "원");
                
=>특정조건에 따른 결과 출력을 할 경우 switch문을 사용 할 수 있음.
구매가능시간이나 조건에 따른 상태를 출력하기에도 좋음.
```

```java
switch문의 case 끝날 때 break;문을 다 사용해야하고
해당되는 값이 없을 경우 Defult문을 사용하게 되는데, 
Defult문의 경우 break;문을 넣게 되면
의미가 없음으로 코드를 작성할 때 맨 하단에 넣지 않도록 한다.
```

```java
자바 버전에 따라 switch ()안에 숫자가 아닌 값을 넣으면 실행이 되지 않는 경우가 존재함.
그러면 관련된 코드를 변경하여 쓰면 됨.
```

# do- while 문

```java
	while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//(Math.random()*6)+1; => 1~7까지의 수를 랜덤으로 출력하자는 것
	
	
	중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문 이름을 붙이고 
	break 이름; 을 사용함
```

# for문 구구단 출력

```java
public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
	}
	
첫 번째 루프 (loop): 1부터 9까지 각 단을 의미합니다.
두 번째 루프 (loop2nd): 각 단에서 1부터 9까지 곱할 숫자를 의미합니다.
각 단을 시작할 때 "*** x단 ***"을 출력합니다.
각 단에서 1부터 9까지의 곱셈 결과를 출력합니다.
이 코드는 1단부터 9단까지 구구단을 출력합니다.

public static void main(String[] args) {
		for (int loop = 1; loop <= 999; loop++) {
			System.out.println("*** " + loop + "단 ***");
			// 각 단에서 1부터 9까지 곱함
			for (int loop2nd = 1; loop2nd <= 9; loop2nd++) {
				System.out.println(loop + " x " + loop2nd + " = " + (loop * loop2nd));
			}
		}
	}
	
1단부터 999단까지 구구단을 만드는 코드 

한줄에 3개씩만 찍히도록 하는 코드
public static void main(String[] args) {
        // 1부터 9까지 곱셈 반복
        for (int loop = 1; loop  <= 9; loop ++) {
            // 1부터 999단까지 3단씩 한 줄에 출력
            for (int loop2 = 1; loop2 <= 999; loop2 += 3) {
                // 각 단의 곱셈 결과를 출력
                for (int loop3 = loop2; loop3< loop2 + 3 &&loop3 <= 999; k++) {
                 System.out.print(loop3 + " x " + loop + " = " + (loop3 * loop) + "\t");
                }
                System.out.println();
            }
      }
 ............................................................................. 
    public static void main(String[] args) {
        // 1부터 9까지 곱셈 반복
        for (int i = 1; i <= 9; i++) {
            // 1부터 999까지 반복하며 각 단에서의 곱셈 결과 출력
            for (int j = 1; j <= 999; j++) {
                // 현재 단과 곱할 숫자 계산
                int dan = (j - 1) % 9 + 1; // 현재 출력할 단 계산 (1~9)
                int num = (j - 1) / 9 + 1; // 현재 출력할 곱할 숫자 계산 (1~999)
                
                // 현재 단과 숫자에 맞게 곱셈 결과 출력
                System.out.printf("%3d x %d = %-6d   ", dan, num, dan * num);
                
                // 각 단의 9번째 숫자마다 줄 바꿈
                if (j % 9 == 0) {
                    System.out.println(); // 한 줄 출력 후 줄 바꿈
                }
                
                // 3단마다 한 번씩 빈 줄 추가
                if (dan % 3 == 0 && j % 9 == 0) {
                    System.out.println(); // 세 단 출력 후 빈 줄 추가
                }
            }
        }
    }
 
 System.out.printf를 사용해서 자릿단을 지정해서 예쁘게 만들 수 있음..
 ~~참고로 실무랑 전혀 상관없는 작업~~

이쯤에서 정리하는 자바 문법
\t =>탭(줄바꿈)
\n =>줄바꿈
%숫자d =>숫자를 넣은 수만큼의 정수 왼쪽부터 공백 //ex. %6d ---123
%-숫자d =>숫자를 넣은 수 만큼의 정수 오른쪽부터 공백//ex. -%6d 123---
```

# for문(반복문)
```jsx
  for (int i =0; i < 11; i++) {
            System.out.println("어서오세요 아코입니다."+i);
        }
//응용 (짝수, 홀수만 출력)
        for (int i = 0; i <11 ; i+=2) {
            System.out.println(i);
/*
0
2
4
6
8
10
*/
   for (int i = 0; i < 11; i += 3) {
            System.out.println(i);
/*
0
3
6
9
*/

+ System.out.println(); vs  System.out.print();
 /*                         
0
3
6
9
*/
vs
 /*0369*/
```

```java
public static void main(String[] args) {
		for (int i = 1; i < 10 ; i++) {
			System.out.println(i);
		}
}

주의사항:  i++ 조건을 지정하지 않으면 프로그램이 
계속 돌면서 CPU가 전부 가득차서 프로그램이 죽을 수 있다.
public static void main(String[] args) {
		for (int i = 1; i < 10 ; ) {
			System.out.println(i);
		}
}
....................................................................................

	public static void main(String[] args) {
		int sum =0;
		for (int i = 1; i < 100 ;i++) {
			System.out.println(i);
			//sum= sum + i;
			sum+= i;
		}
		System.out.println("1~100 합계"+sum);
		}
	}
//1부터 99까지 찍어주고, 
//1~100 합계4950 (*전역변수 관련 int sum =0;)

강사님은 i를 사용하지 않고 loop를 사용함..

```

# 증감 연산자

```jsx
int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" +result2);
		System.out.println("result2=" +result1);

		byte b = 100;
		int result3 = -b;
		System.out.println("result3="+ result3);
		
/*result1=-100
result2=-100
result3=-100
*/

System.out.println("result1=" + result2);는 result1= 문자열과 
result2의 값을 연결하여 **하나의 문자열로 만듭니다**. 결과적으로 "result1=100"이 출력됩니다.
System.out.println("result2=" + result1);는 result2= 문자열과 
result1의 값을 연결하여 하나의 문자열로 만듭니다. 결과적으로 "result2=-100"이 출력됩니다.
이때 문자열 리터럴 "result1="와 "result2="는 그대로 출력되며,
 result2와 result1의 값이 각각 그 뒤에 연결되어 출력됩니다.
따라서, 출력되는 문자열에서 ""에 있던 피연산자들은 
실제로는 연결되어 최종 출력 문자열을 구성하게 되는 것입니다.

<기억해봐>
result 3 =b++;
result 3 =++b

int x = 10;
int y = 10;
		int z;
//x,y는 할당되어있음
		System.out.println("-----------------------");
		x++; //11
		++x; //12
		System.out.println("x=" + x); //12

		System.out.println("-----------------------");
		y--; //9
		--y; //8
		System.out.println("y=" + y); //8

		System.out.println("-----------------------");
		z = x++; //12
		System.out.println("z=" + z); //z=12, x=13
		System.out.println("x=" + x); 

		System.out.println("-----------------------");
		z = ++x; //z=14 x=14
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("-----------------------");
		z = ++x + y++; //x=15,y=8 z=15+8, y=9(증감연산자가 y의 앞에 붙어있어서 나중에 증감됨)
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		
		i++; vs i=i+1; 
		의미론적인 출력값은 같지만 어샘블과 같은 언어에서 로직이 프로그램화 되어 있어서
		코드를 완성 했을 때 처리 속도의 영향을 주게 됨/
		i++;라는 것이 내장 되어 있는 경우를 생각해서 좀 더 처리 속도가 빠른 형태로 코드를
		만드는 것이 좋다.
		
		증감 연산 시 좀 더 큰 값인 int로 바뀌는 강제 변형이 일어난다.
		(변형 안시키면 컴파일 에러남) //(byte, char etc..)
		실수 연산에서 결과값이 정수로 변환되어 (소수점 값이 사라짐) 출력되는 경우가 있음.
```

# 증감 연산자 中 char, println

```jsx
char는 정수형을 나타내는데 기본적으로 사용됨. 근데 문자를 넣을 수도 있음. 
		
		char c1 = 'A'+1;
		char c2 = 'A';
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);

//c1=B , C2=A

유니코드... A=65
           66=B
println의 속성으로 문자로 출력함
그러나, 코드 자체를 변경하면 숫자로 형변환하여 숫자 값도 얻을 수 있음
ex)

char c1 = 'A'+1;
		char c2 = 'A';
		System.out.println(int)c1); //=>66
-----------------------------------------------------------------------------------		
	String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";

		System.out.println(str2); //JDK6.0 특징

		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		
		System.out.println(str3); //JDK33.0
		System.out.println(str4); //6.0JDK
		
		println의 속성으로 문자열로 출력하는 것을 기본값으로 둠, 그러나 왼쪽부터 계산됨으로
		숫자가 먼저 나오면 3+ 3.0 을 수행 했고, 6.0 의 결과에 문자인 JDK를 붙여 형변환이 
		이루어져서 결과적으로 문자형 6.0Jdk가 됨

```

# 비교 연산자(논리 연산자 boolean이 사용된)

```jsx
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //true
		boolean result2 = (num1 != num2); //false
		boolean result3 = (num1 <= num2); //true
		System.out.println("result1=" + result1); //true
		System.out.println("result2=" + result2); //false
		System.out.println("result3=" + result3); //true

		char char1 = 'A';//65
		char char2 = 'B';//66
		boolean result4 = (char1 < char2);//true
		System.out.println("result4=" + result4);//true

```

# 비교 연산자(float & double)

```java
public static void main(String[] args) {
		int v2 			= 1;
		double v3 	= 1.0;

		System.out.println(v2 == v3);					  //true

		double v4 	= 0.1;
		float v5 		= 0.1f;

		System.out.println(v4 == v5);					  //false
		System.out.println((float)v4 == v5);			  //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true

	}
	
	실수 관련 표현해주는 float과 double
	float의 경우 문법적으로 숫자끝에 f를 붙인다. (문법)
	float의 경우 정밀도가 소수점 7자리까지, 메모리사양도 (4byte~32byte)
	vs
	double의 경우 정밀도가 소수점 15자리까지,메모리사양도(8byte~64byte)
	그러므로 v4==v5는 false로 출력되는 것을 알 수 있다.
	 
```

# 논리 연산자

```java
public static void main(String[] args) {
		int charCode = 'A';		
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}		
	}
	
	&&,||,&,|,^,!
	
AND(논리곱) && 또는 & => &&앞의 피연산자가 false일 경우, 
뒤에 데이터검증 없이 false를 출력
	&&->피연산자 모두가 ture일 경우 true를 반환함. 
	그러므로 한개라도 false이면 뒤는 검증하지 않아도, false임.
	 근데, &를 1개만 사용한다면 뒤의 데이터까지 검증함.

OR(논리합) || 피연산자 중에 한개라도 true이면 true를 반환함.
근데 |를 1개만 사용한다면 뒤의 데이터까지 검증함.

XOR(배타적 논리합) ^ 피연산자가 하나는 true이고 나머지가 false라면 
true를 반환함.

Not(논리부정) ! true일때 false를 반환함.

```

# ctrl+space, Date

```jsx
컨트롤 엔터

public class Hello {

	public static void main(String[] args) {

		Date(컨트롤 엔터) today = new Date();
		System.out.println(today);

	}

}

import java.util.Date;
```

# 자바에서 제공하는 기본 객체(라이브러리)

```jsx
C:\Program Files\Java\jdk1.8.0_202
```


# Java관련 폴더 설정, 용어

```jsx
java exe =>실행파일
javaw exe=>이클립스용
lib jar =>라이브러리 파일, 표준 확장하는 파일들
conf =>설정
bin =>실행파일
log=> 프로그램 실행기록
temp=>임시파일
```

```jsx
jdk 파일 안에 jre 파일이 포함되어 설치되는 형식이기 때문에 
jre 가 함께 설치되는 파일이 없어도 사용가능하다.
```

# Array(배열)

```jsx
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeR="아메리카노";
        String coffeeRa="카페모카";
        String coffeeC="라떼";
        String coffeeM="카푸치노";

        System.out.println(coffeeR +"하나");
        System.out.println(coffeeRa +"하나");
        System.out.println(coffeeC +"하나");
        System.out.println(coffeeM +"하나");
        System.out.println("주세요");

        //배열 선언 첫 번째 방법
        //String[] coffees = new String[4];
        //크기 4개의 새로운 스트링 배열을 만듦, 변수명을 coffees라고 줌

      //배열선언 두번째 방법, 첫 번째와 똑같음 다만, 대괄호가 변수명 뒤에 옴
      //String coffees[] = new String[4];
      //[] =>명칭 index ,  컴퓨터에서 0부터 위치를 잡을 수 있음으로 0~3이 들어감
			//coffees[0] = "아메리카노";
			//coffees[1] = "카페모카";
			//coffees[2] = "라떼";
			//coffees[3] = "카푸치노";
			//주석처리가 하고 싶은 문단을 마우스로 선택하고, ctrl+/ 하면 주석처리됨

       //세번째 방법
       // String[] coffees = new String[] {"아메리카노","카페모카","라떼","카푸치노"};
       //해당하는 내용을 직접적으로 넣었기 때문에 Index안에 숫자를 표기하지 않는다.

        //네번째 방법
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        System.out.println(coffees[0]+"하나");
        System.out.println(coffees[1]+"하나");
        // System.out.println(coffees[2]+"하나");
        coffees[2]="에스프레소";
        System.out.println(coffees[2]+"하나");
        System.out.println(coffees[3]+"하나");

        System.out.println("주세요");

        //다른 자료형도 가능
        int i[] = new int[3];
        i[0]=1;
        i[1]=2;
        i[2]=3;

        double[] d =new double[] {10.0,11.2,13.5};
        boolean[] b = {true,true,false};
    }

}
```

# Arrayloop(배열순회)

```jsx
public class _02_Arrayloop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        
        //for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나" );
        }
        System.out.println("주세요");

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나" );
        }
        System.out.println("주세요");
        
        //enhanced for (for-each)반복문
        for(String coffee: coffees){
            System.out.println(coffee + "하나");
            System.out.println("주세요");
        }
    }
}

```

# Multi-dimensional array(다차원 배열)

```jsx
    public static void main(String[] args) {
        //다차원 배열(2차원 배열)

        //소규모 영화관 좌석
        //A1~A5
        //B1~B5
        //C1~C5

        String[] seatA = {"A1","A2","A3","A4","A5"};
        String[] seatB = {"B1","B2","B3","B4","B5"};
        String[] seatC = {"C1","C2","C3","C4","C5"};

        //3x5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"},
        };
        //B2에 접근하려면
        System.out.println(seats[1][1]);

        //C5에 접근하려면
        System.out.println(seats[2][4]);

        //첫줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };
        //A3에 접근하려면
            System.out.println(seats[0][2]);

            //3차원 배열 만들기
        //String[][][]marry = new String[][][] {
        //{{}.{},{}},
        // {{}.{},{}},
        //{{}.{},{}},
        //};
           // marry[0][1][2]
            //3차원 배열 만들기 (세로 x 가로 x 높이)
           // String[][][] marray = new String[3][3][3];
        }
    }

```

# 특징 및 기본 문법 및 배열

```jsx
		String firstName;
		String lastName;
		
		String NameFirst;
		String NameLast;
		
=>복합어일 경우 뒤에 단어 시작을 대문자로 적는다, 카멜표기법에 의거함

자바는 상수 바뀌지 않을 값에 final을 주는데
자바스크립트에서는 constant를 줌.
자동형(묵시적)형변환 vs강제적(명시적) 형 변환
자동형(묵시적)형변환
name="jain";
age= 27;
total = name+age;
=>자동형으로 숫자가 문자형으로 형 변환됨.
자동형은 long이 아닌경우 숫자를 나타내는 int 같은 것들
문자열을 강제로 타입 변환하는 parse(문자열을 자료형으로 변환)

ex)
byte a=10;
int b =a;
=>byte타입이었던 a의 값 10을 int를 사용하는 b에 할당함으로 , int로 강제 형변환됨.

	public static void main(String[] args) {
		int intValue =10;
		byte byteValue = (byte) intValue;
=>문법상으로 큰 데이터를 작은 데이터에 넣으면 데이터가 터질 수 있어서 
경고표시가 나는데 (byte)를 넣어 강제로 변환할 수 있음.

문자열 숫자 더하기
ex) 		int value = 10 + 2 + 8;
		System.out.println("value: " + value);//20

		//결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);//128

		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);//1028

		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);//1028

		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);//1010
		
연산자와 우선순위

제어문

기본타입 vs 참조타입
참조타입은 객체를 포함하는 타입

배열(Array)
열거타입
```

# 만약 byte의 범위를 초과한 값을 넣고, 출력한다면?

```jsx
	public static void main(String[] args) {
		int intValue =129;
		byte byteValue = (byte) intValue;
		System.out.println(intValue);
		System.out.println(byteValue);
		
 129
-127

byte의 경우 127까지만 출력하기 때문에 초과된 값을 입력하면 음수로 변환하고, 음수에서 수를 
더해서 점점 다시 양수로 바뀜..ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
```



# %d, %6d, %-6d, :%06d 차이

```jsx
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); //value값에 원을 붙이는 코드
		System.out.printf("상품의 가격:%6d원\n", value); //전체를 6자리로 만들고 우측정렬
		System.out.printf("상품의 가격:%-6d원\n", value); //전체를 6자리 만들고 좌측정렬
		System.out.printf("상품의 가격:%06d원\n", value);
		//전체를 6자리로 만들고 우측정렬하고 좌측은 000으로 채우기

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
/*		
상품의 가격:123원
상품의 가격:   123원
상품의 가격:123   원
상품의 가격:000123원
반지름이 10인 원의 넓이:    314.16
     1 | 홍길동        |         도적 */
```
