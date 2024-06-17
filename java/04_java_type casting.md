# java -형 변환 (Type Casting)

# 데이터의 크기

```jsx
# byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
+) int a = 1;

Byte b = 2;

B= (byte)a;

Short(2)와 char(2)는 2로 같지만 형이 달라서 강제적으로 캐스팅을 걸어줘야 한다.

실제로의 종류는 총 9개 (바이트의 순서는 작은 것에서부터 큰 것으로)

Byte short int long float double Boolean char String

(빨간색으로 칠해진 것을 중점으로 외우고, 나머지를 추가적으로 암기하기 시작하면 좋다)

추가적으로 float은 4 바이트인데 왜 long보다 크냐!

그 이유는 정수보다는 실수가 소숫점 단위로 표현 할 수 있는 수가 많기 때문입니다.

**데이터 형 변환 (Type Casting)**

형 변환은 크게 2가지의 유형이 있습니다.

자동 형 변환 / 명시적 형 변환 입니다.

**자동 형변환**의 포인트!

**자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서**

**넓은 데이터 타입으로의 변환만 허용된다는 것이다.**

한마디로 박스안에 딱 맞는 내용물을 예시로 들어보겠습니다.

byte 라는 박스의 내용물은 더 큰 short 박스에 들어갈 수 있지만,

short 박스의 내용물은 더 작은 byte 박스에 들어갈 수 없는 것입니다.

**자동 형변환**의 예시를 들어봅시다!
```

![https://blog.kakaocdn.net/dn/b9aJrS/btrci9LoVP0/erTIdyESI3kjBBKgK0ftz1/img.png](https://blog.kakaocdn.net/dn/b9aJrS/btrci9LoVP0/erTIdyESI3kjBBKgK0ftz1/img.png)

```jsx
**명시적 형변환**은 큰 데이터 유형 -> 작은 데이터 유형 형변환이 이루어집니다.
명시적 형변환이 필요한 이유는 위에 박스로 들었던 예시와 같이,
큰 박스에 들어있는 내용물을 작은 박스에 넣기 위해서
그 작은 박스 크기에 맞춰서 내용물을 맞게 잘라내기 위함입니다
실질적인 사유는, 명시적 형변환 해야되는 아이들을, 자동 형변환을 해버리면, 
데이터가 손실 될 수 있기 때문입니다.
```

![https://blog.kakaocdn.net/dn/bZoMUZ/btrb83Tjb43/E8QQfmK1LRMM0oVpkIwolk/img.png](https://blog.kakaocdn.net/dn/bZoMUZ/btrb83Tjb43/E8QQfmK1LRMM0oVpkIwolk/img.png)

![https://blog.kakaocdn.net/dn/cIKuzJ/btrb8gFjINp/eAqz9PBQBIp8tjdCqGWgv0/img.png](https://blog.kakaocdn.net/dn/cIKuzJ/btrb8gFjINp/eAqz9PBQBIp8tjdCqGWgv0/img.png)

```jsx
위 사진 제일 아래쪽 부분 //예외인 경우를 확인 해봐야합니다.
같은 2byte의 유형이지만, char는 양수만 표현이 가능하며,
 short는 음수와 양수 둘 다 표현하기 때문에
 저 두 경우에도 명시적 형변환을 해주어야 합니다.
```

```jsx
# byte / boolean (1)< short / char(2) < int(4) < long(8) < float(4) < double(8)
= 연산에서 형변환의 큰 유형 2가지 =
1. 서로 다른 타입의 연산에서는 큰 타입을 따라갑니다
2. int형보다 작은 데이터타입의 연산을 진행할 경우 자동으로 int형으로 형 변환이 이루어집니다.
위의 유형에 따라서 예시를 확인하겠습니다~
1. char와 int를 비교하면 int가 큽니다.
```

![https://blog.kakaocdn.net/dn/bDvUCN/btrcgQftRBz/Dx7rUNLVMz5QZJKr3rqv1K/img.png](https://blog.kakaocdn.net/dn/bDvUCN/btrcgQftRBz/Dx7rUNLVMz5QZJKr3rqv1K/img.png)

```jsx
(c+i) 앞에 (char)로 명시적 형변환을 해준다면 cc의 값이 나올 수 있습니다.
명시적 형변환없이 c+i를 계산했다면 'A'의 정수형 값 65+2로 67이 나왔을 겁니다.
```

![https://blog.kakaocdn.net/dn/b129W2/btrctacotw6/kFxkPcd0qbJXtM2YGfxGW0/img.png](https://blog.kakaocdn.net/dn/b129W2/btrctacotw6/kFxkPcd0qbJXtM2YGfxGW0/img.png)

```jsx
당연히 int와 double을 계산했을 때는 double로 타입을 따라가겠죠?
실제로 출력하면 나오는 값은 주석에 있는 간략하게 표현된 6.14가 아닌
6.1400000001과 같은 소수점이 존재하는 실수의 형태로 나타나게 됩니다.
2. int형 보다 작은 연산의 결과
```

![https://blog.kakaocdn.net/dn/yTmuY/btrcgOBW2Qu/GhkRSXVFFD2vke4z3B0et0/img.png](https://blog.kakaocdn.net/dn/yTmuY/btrcgOBW2Qu/GhkRSXVFFD2vke4z3B0et0/img.png)

```jsx
이렇게 b3과 s3값을 확인해도, 답은 112로 같습니다. 왜냐~
int형보다 작은 연산의 결과는 무조건 int의 형태로 답이 출력되기 떄문입니다.
```

.
