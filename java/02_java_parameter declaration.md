#java 변수 선언 후 출력

```jsx
변수 선언 후 출력하기
변수 = 변할 수 있는 수 
```

![https://blog.kakaocdn.net/dn/uWzsA/btrb82Nxoyo/7hh5TubHUkblzWsYDr9MwK/img.png](https://blog.kakaocdn.net/dn/uWzsA/btrb82Nxoyo/7hh5TubHUkblzWsYDr9MwK/img.png)

```jsx
(day 01의 프로젝트에서 저는 Identifier라는 클래스를 새로 생성하여 진행하였습니다)
클래스 생성하자 마자 main을 타이핑 후 ctrl + space 후 enter

main 내용 안쪽을 살펴 보면 (int + 여러가지의 age모양 = 숫자) 의 형태가 보입니다.

그 중에서 제일 첫 줄 : int age = 10;을 살펴보도록 합시다.

int는 데이터의 유형이고, 변수 자체의 이름은 age, 변수의 값은 20, 한 줄 작성 완료를 의미

여기서 제일 중요한 포인트!

코딩에서 = 의 의미는 수학과는 조금 다릅니다!

코딩에서 =의 의미는 **=의 오른쪽에 위치한 값이 왼쪽에 있는 변수에 대입**한다. 라는 의미입니다.

출력되는 값을 확인해보도록 하겠습니다.

ex. A = 10 ⇒ 10이라는 수가 A에 포함된다.
```

![https://blog.kakaocdn.net/dn/biOpWU/btrbVnRameY/hq766bgADiDQXoqgPtaKd0/img.png](https://blog.kakaocdn.net/dn/biOpWU/btrbVnRameY/hq766bgADiDQXoqgPtaKd0/img.png)

```jsx
age의 값은 10이 출력되었습니다.
println은 자동으로 줄바꿈을 해주는 출력언어라는거! 다시 확인하고
만약 데이터 유형이 없다고 해도, 변수 선언을 처음 한 번 해주었다면, 이후에는
데이터 유형 없이 변수의 이름 및 변수의 값만 입력해준다면 출력은 원활하게 이루어 집니다.
```

![https://blog.kakaocdn.net/dn/bOifY1/btrcgPsOpA7/gQYcdIelgk495W1BsT0MV0/img.png](https://blog.kakaocdn.net/dn/bOifY1/btrcgPsOpA7/gQYcdIelgk495W1BsT0MV0/img.png)

위와 같이 입력 했을 때, 아래와 같이 출력이 되는 것을 확인했습니다.

![https://blog.kakaocdn.net/dn/bbVTqS/btrb82GKEwe/FDecUITQVniGvbPSrNA2wk/img.png](https://blog.kakaocdn.net/dn/bbVTqS/btrb82GKEwe/FDecUITQVniGvbPSrNA2wk/img.png)

```jsx
변수를 선언 할 때의 규칙이 있습니다.
- 카멜표기법 형태로 표기하기
( "^"의 모양으로 첫글자는 소문자로 시작하고, 연결되는 단어의 첫 글자는 대글자료 표기하는 것.)
- 명사적 의미를 갖게 변수를 선언해야 합니다.
- int class , int public과 같이 예약어로는 변수를 지정 할 수 없습니다.
```
