# java 기본적인 이진수 및 데이터 타입 & 크기 알아보기

# 개념

```jsx
데이터는 메모리에 저장이 되며, 컴퓨터의 메모리는 수많은 방안에 들어있다. 
그 방은 방마다 주소가 있으며, 방마다 데이터를 저장하는데 
이 때 데이터는 숫자와 문자 사진 소리 등이 있다.사용자는 그에 따라서 "**CRUD"가 가능하다.**

"**CRUD"**는대부분의 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능인 
Create(생성), Read(읽기), Update(갱신), Delete(삭제)를 묶어서 일컫는다.

이 메모리를 효율적으로 관리하기 위해서, 데이터마다 메모리를 크기를 자동으로 할당한다.
이를 나누기 위한 분류 기준으로 정수형(int), 실수형(double), 문자형(String) 등으로 분류한다.
분류 기준을 다루기 전에 기본적으로 2진수를 알아보겠습니다.

컴퓨터도 장비간에 의사 소통을 하기 위해 필요한 언어가 있는데,
그의 대표적인 예로는 **"2진수(binary)"**가 있습니다.
컴퓨터는 전자식 스위치를 이용하여 데이터를 전달하는 걸 기초로 합니다.
단순히 on과 off로 구분하는데요. 이는 1과 0으로 해석이 됩니다.
```

# ○(0) / ●(1)

```jsx
안에가 비어있을 때는 0, 안에가 채워져 있을 때는 1이라고 생각하면 됩니다.
1비트 한가지만으로 양이 많은 데이터를 나타내기에는 비효율적인 면이 있습니다.
```

![https://blog.kakaocdn.net/dn/SvFo0/btrcgO1N0TG/QnTHqv29Is9nsZwVBJX0Y0/img.png](https://blog.kakaocdn.net/dn/SvFo0/btrcgO1N0TG/QnTHqv29Is9nsZwVBJX0Y0/img.png)

1바이트(byte)는 8비트(bit)의 묶음입니다.

![https://blog.kakaocdn.net/dn/dlcI9s/btrcgPzCEIU/Dm5Emh7LUdk2fiZCXn9fY0/img.png](https://blog.kakaocdn.net/dn/dlcI9s/btrcgPzCEIU/Dm5Emh7LUdk2fiZCXn9fY0/img.png)

```jsx
그래서 **1바이트(byte)는 8비트(bit)**의 묶음으로 하여 (2^8) = 256개가 됩니다.
따라서 1바이트는 0부터 255값을 가질 수 있게 됩니다.
자, 위의 내용을 활용해서 정수형 데이터 유형부터 알아보도록 하겠습니다.
```

# **정수형 데이터 유형 = byte < short < int < long**

```jsx
byte부터 순서대로 1,2,4,8 바이트의 크기를 가지고 있습니다.
데이터 유형에 따라서, 표현 범위를 표현하면 아래와 같습니다.
```

![https://blog.kakaocdn.net/dn/c6ZbSR/btrb9GC3F0b/L2SwFORYnBq4fDrnP9X3k0/img.png](https://blog.kakaocdn.net/dn/c6ZbSR/btrb9GC3F0b/L2SwFORYnBq4fDrnP9X3k0/img.png)

```jsx
정수형에서 다음으로 발전시켜서 실수형으로 가볼까요?
정수형보다 더 큰 숫자를 표현 할 수 있는 실수형은,
정수형과 더 세부적으로 소숫점 까지 표현이 가능하다는 특징이 있습니다.
실수형 데이터 유형 flaot < double
float = 4byte, double =  8byte 입니다.
```

![https://blog.kakaocdn.net/dn/bKj6EI/btrcb9yBG7V/QLiSr5KXEfWw65k2AfoFE1/img.png](https://blog.kakaocdn.net/dn/bKj6EI/btrcb9yBG7V/QLiSr5KXEfWw65k2AfoFE1/img.png)

```jsx
표현 범위에서 E는 거듭제곱의 지수를 나타내는 것입니다.
Exponential의 약자로, flaot의 E다음 -45는 (10의 -45제곱 분의 1)을 타나냅니다.
그냥 참고용으로 알아두고만 계시면 되는 부분 같아요~
드디어 마지막으로 문자타입 char - 2byte가 있습니다.
char의 특이점은 유니코드를 기반으로 문자를 표현합니다.
+) 유니코드는  세계 각국의 문자를 2byte로 표현 할 수 있는 숫자
(0 ~ 65535)로 매핑한 국제 표준 규약입니다.
아래에 있는 내용을 예시로 보겠습니다.
```

![https://blog.kakaocdn.net/dn/kWg84/btrb9Fc5wfH/DbiMpJjnXBsV0LFCjgTIg1/img.png](https://blog.kakaocdn.net/dn/kWg84/btrb9Fc5wfH/DbiMpJjnXBsV0LFCjgTIg1/img.png)

출력되는 값을 살펴보자면, 아래와 같습니다.

![https://blog.kakaocdn.net/dn/cFeDLG/btrb67uSkQu/RDHqZMhWfq6h7uYGtxCfYK/img.png](https://blog.kakaocdn.net/dn/cFeDLG/btrb67uSkQu/RDHqZMhWfq6h7uYGtxCfYK/img.png)

```jsx
char의 특징은 ""를 사용하지 않고, ''를 사용하는 것입니다.
문자열을 표현하는 String을 확인해봅시다.
평소와 같게 문자열 값은 겹 따옴표 안에 넣는다는 것
(char만 특이한 경우라고 생각하면 됩니다.)
```

![https://blog.kakaocdn.net/dn/ek5reB/btrcb8T2o6P/fztvaaGQrVSkyiHB7BOPQK/img.png](https://blog.kakaocdn.net/dn/ek5reB/btrcb8T2o6P/fztvaaGQrVSkyiHB7BOPQK/img.png)

![https://blog.kakaocdn.net/dn/cyQXDR/btrb81VqCrh/BGFKYY9k0UNoyIMDMgGtTK/img.png](https://blog.kakaocdn.net/dn/cyQXDR/btrb81VqCrh/BGFKYY9k0UNoyIMDMgGtTK/img.png)

+) 추가적인 내용 확인하기

![https://blog.kakaocdn.net/dn/v6P9t/btrcj01MiS6/BafunKXGM78tZZPKNLtHFk/img.png](https://blog.kakaocdn.net/dn/v6P9t/btrcj01MiS6/BafunKXGM78tZZPKNLtHFk/img.png)

![https://blog.kakaocdn.net/dn/cRzvOc/btrb67hkOGr/mbaCkHK0A7OZMQhkMDgJz1/img.png](https://blog.kakaocdn.net/dn/cRzvOc/btrb67hkOGr/mbaCkHK0A7OZMQhkMDgJz1/img.png)

```jsx
오른쪽에 있는 사진은 출력값입니다.
특이함을 확인해보시면, 주석에 달려있는 대로의 특이점이 확인 간읗바니다
논리타입의 boolean
bloolean은 특이하게 1byte만 사용합니다.
왜냐하면 bloolean의 출력값으로는 true, false 단 두가지의 값만 가질 수 있기 때문입니다
```

![https://blog.kakaocdn.net/dn/bg0T8n/btrb9RkHP6A/d80kgmkrF4ospVFeqdMhq0/img.png](https://blog.kakaocdn.net/dn/bg0T8n/btrb9RkHP6A/d80kgmkrF4ospVFeqdMhq0/img.png)

![https://blog.kakaocdn.net/dn/PXRpJ/btrcokyQC2J/nKoxb02zLknTbKy0Sj1qk0/img.png](https://blog.kakaocdn.net/dn/PXRpJ/btrcokyQC2J/nKoxb02zLknTbKy0Sj1qk0/img.png)

```jsx
**마무리 정리)
**정수형 데이터 유형 - byte < short < int < long**
**실수형 데이터 유형 - float < double**
**+ 데이터의 크기**
**# byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)**
**+) 추가적인 데이터 유형당 크기 및 특징 사진****
```

![https://blog.kakaocdn.net/dn/btqoLV/btrb78fLuOV/NQyClzdghROYCPPkETmmrK/img.png](https://blog.kakaocdn.net/dn/btqoLV/btrb78fLuOV/NQyClzdghROYCPPkETmmrK/img.png)
