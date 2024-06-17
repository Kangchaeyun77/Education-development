# javascript 정규식

# 정규식 읽는 법

```
// 리터럴 방식const regex = /abc/;
// 생성자 방식 const regex = new RegExp("abc");
							 const regex = new RegExp(/abc/);// 이렇게 해도 됨
```

```
정규식 구성정규식 구성 코드는 다음과 같다.슬래쉬 문자 두개 사이로 정규식 기호가 들어가는 
형태이다. 뒤의i 는 정규식 플래그이다.
```

# 정규식을 쓰는 이유, 사용하는 곳

```jsx
이처럼 반복문과 조건문을 사용해야 할것같은 **복잡한 코드도 
정규표현식을 이용하면 매우 간단하게 표현**할 수 있으며 
주로 다음과 같은 상황에서 굉장히 **유용**하게 사용된다.

1)**각각 다른 포맷으로 저장된 엄청나게 많은 전화번호 데이터를 추출**해야 할 때
2)사용자가 입력한 정보(이메일, 휴대폰 번호, IP 주소 등)이 올바른지 검증하고 싶을 때
3)코드에서 특정 변수의 이름을 치환하고 싶지만, 해당 변수의 이름을 포함하고 있는 
	함수는 제외하고 싶을 때
4)특정 조건과 위치에 따라서 문자열에 포함된 공백이나 특수문자를 제거하고 싶을 때
```

# 핸드폰 번호 숫자 갯수 관련 정규식

```jsx
[핸드폰 번호 정규식]
const regex = /\d{3}-\d{4}-\d{4}/; 
// (\d는 숫자를 의미하고, {} 안의 숫자는 갯수를 의미한다.) 

regex.test('010-1111-2222') // true; 
regex.test('01-11-22') // false;
```

# 정규식 단점

```jsx
정규표현식은 주석이나 공백을 허용하지 않고 여러가지 기호를 혼합하여 사용하기 때문에 
가독성이 좋지 않다는 문제가 있다는 단점
```

[https://inpa.tistory.com/entry/JS-📚-정규식-RegExp-누구나-이해하기-쉽게-정리](https://inpa.tistory.com/entry/JS-%F0%9F%93%9A-%EC%A0%95%EA%B7%9C%EC%8B%9D-RegExp-%EB%88%84%EA%B5%AC%EB%82%98-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0-%EC%89%BD%EA%B2%8C-%EC%A0%95%EB%A6%AC)