# javascript 03

# **< object  >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title></title>
    <style>

    </style>
</head>
<body>

<script>
let str1="javascript";//stringlet obj1={};// objectlet obj2={name:"john"};
console.log(obj2.name);

obj2.name="jane";
console.log(obj2.name);

let obj3={name:"cap", age:20};
console.log(obj3.name);
console.log(obj3.age);

let obj4={
    id:99,
    text:"javascript",
    value:"hello",
    city:"seoul",
    number:11};
//속성이 여러개면 줄을 나눠서 표현하는게 좋다.console.log(obj4.id);
console.log(obj4.text);
console.log(obj4.value);
console.log(obj4.city);
console.log(obj4.number);

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/xs506/btruW9GnDKo/GJL5QNQzWgLJKjZZ6F3Xlk/img.png](https://blog.kakaocdn.net/dn/xs506/btruW9GnDKo/GJL5QNQzWgLJKjZZ6F3Xlk/img.png)

.하고나서의 다음 어쩌구 저쩌구가 그 object의 속성을 가져온 걸 말한다.

만약 기존에 있는 값을 수정하고싶다면?

```jsx
let age = 333;
let colorName = "red";

let obj5 = {
    age: age,
    color:colorName
}
console.log(obj5.age);
console.log(obj5.color);
```

앞에 age는 이름이고, : 뒤에 있는 age는 위에있는 값을 가져오는 것이니까 헷갈리지 말기

![https://blog.kakaocdn.net/dn/DXUqo/btruI7QR0dC/nta0t9NvdP2wtnrujKriBk/img.png](https://blog.kakaocdn.net/dn/DXUqo/btruI7QR0dC/nta0t9NvdP2wtnrujKriBk/img.png)

이렇게 출력되는거까지 확인 완료

객체는 속성과 기능을 가질수있다. 상태와 기능 / 값과 기능 등등 비슷한 말이 많다.

자바로 치면 필드와 메소드

속성명과 값을 쌍으로 넣어주면 된다.

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>object</title>
    <style>

    </style>
</head>
<body>
<!-- {name}+input#input1+{age}+input#input2+button{show}+h1#head1 -->
name
<input type="text" id="input1">
age
<input type="text" id="input2">
<button>show</button>
<h1 id="head1"></h1>

<script>
document.querySelector("button").addEventListener("click",function(){
    let name = document.querySelector("#input1").value;
    let age = document.querySelector("#input2").value;

    let obj={
        name:name,
        age: age
    }
    document.querySelector("#head1").innerHTML=
        `이름은 ${obj.name}이고, 나이는 ${obj.age}입니다.`;
})
</script>
</body>
</html>
```

input1, input2를 객체로 만들고, 객체로 저장된 property를 가져와서 내눈으로 직접 확인하는 식을 짜보았다

![https://blog.kakaocdn.net/dn/P7TOZ/btruXTraVYX/b16d97vbuXw47S8kR1NFLk/img.png](https://blog.kakaocdn.net/dn/P7TOZ/btruXTraVYX/b16d97vbuXw47S8kR1NFLk/img.png)

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>object</title>
    <style>

    </style>
</head>
<body>
<!-- {item}+input#input1+button{+}+ul#list1 -->
item
<input type="text" id="input1">
<button>+</button>
<ul id="list1">
    <li>1, lorem</li>
</ul>
<script>
document.querySelector("button").addEventListner("click",function(){

    document.querySelector("#list1").innerHTML +=`<li>${data.num},${data.item}</li>`;

})
</script>
</body>
</html>
```

선생님이 위와 같이 짜주신 코드에 추가해서,

아래의 사진과 같이, 입력했을 때 원하는바가 나오게 만들기!

![https://blog.kakaocdn.net/dn/7Eyyt/btru0wBSo6T/B8xf5B4umqsLkvfDIgbqU1/img.png](https://blog.kakaocdn.net/dn/7Eyyt/btru0wBSo6T/B8xf5B4umqsLkvfDIgbqU1/img.png)

num 자체는 click될 때마다 1이면 안되니까 식을 바깥으로 뺀 다음에, 마우스가 클릭 될 때마다 num 자체에 1을 더해주는 식으로 문제를 풀어가야 하지 않을까?

```xml
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>object</title>
    <style>
        li:last-child{
            color:blue;
        }
    </style>
</head>
<body>
<!-- {item}+input#input1+button{+}+ul#list1 -->
item
<input type="text" id="input1">
<button>+</button>
<ul id="list1">
    <li>1, lorem</li>
</ul>
<script>
let number = 1;
document.querySelector("button").addEventListener("click", function () {
// 코드 작성let text = document.querySelector("#input1").value;

    number++;
    let data = {
        num: number,
        item: text
    };

    document.querySelector("#list1").innerHTML += `<li>${data.num}, ${data.item}</li>`;
})
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/RPUYW/btruWPWdDRR/hMPmkuimyWncdkh5CTF6Fk/img.png](https://blog.kakaocdn.net/dn/RPUYW/btruWPWdDRR/hMPmkuimyWncdkh5CTF6Fk/img.png)

코드확인 완료

# **< object-function >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>object function</title>
    <style>

    </style>
</head>
<body>

<script>
let obj1 = {
    text:"apple",
    num: 1,
    desc: function(){
        console.log("desc 메소드 실행");
    }
}
console.log(obj1.text);
obj1.desc();

let obj2 = {
    method1:function(){
        console.log("method1 실행");
    },
    method2:function(){
        console.log("method2 실행");
    }
};
obj2.method1();
obj2.method2();

let name = "john";
let obj3 = {
    name:name
}
console.log(obj3.name);

function method3(){
    console.log("method3 실행");
}
let obj4 = {
    method33:method3
}
obj4.method33();

</script>
</body>
</html>
```

기능을 넣고 싶으면, 함수명을 property이름을 쓰고, 값이 함수 이름이면 된다.

주의해야 할 점은 만약 객체의 method를 여러개 넣고싶으면 각자의 method 사이에 ,를 까먹지 말고 넣어야한다.

이미 존재하는 함수가 있다면, 그대로 가져와서 객체에 넣어서 사용할 수 있다.

(굳이 객체에서 매번 정의하지 않아도 된다는 의미)

![https://blog.kakaocdn.net/dn/cZocAK/btruXUjoXCC/zI5pBmyuBbMB5CumqctRJk/img.png](https://blog.kakaocdn.net/dn/cZocAK/btruXUjoXCC/zI5pBmyuBbMB5CumqctRJk/img.png)

# **< external-js.html >**

```xml
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>외부 js</title>
    <style>

    </style>
</head>
<body>

<script src="cool.js"></script>
<script>
//function cool(){//   console.log("coool~~~");//}
cool();

</script>
</body>
</html>
```

```xml
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>외부 js2</title>
    <style>

    </style>
</head>
<body>

<script src="cool.js"></script>
<script >
cool();
</script>
</body>
</html>
```

98에서 만든 함수를 99에서 쓰고 싶을 땐 어떻게 하는지 배워보자

98에서 쓴 함수를 외부코드로 빼놓는다면, 사용 할 수 있다.

# **< cool.js >**

```jsx
function cool(){
    console.log("coool~~~");
}
```

그래서 누군가가 script 파일을 잘 만들었다면, 가져와서 수정해서 쓸 수 있다는 부분 알고있으면 좋다.

- > 그러기 위해서 jquery를 배워봅시다.
