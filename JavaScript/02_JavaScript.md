# javascript 02

# **< script-element >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>script element</title>
    <style>

    </style>
    <script>
        console.log("hello java");
    </script>
</head>
<body>
<script>
    console.log("hello css");
</script>
    <h1>javascript </h1>
<script>
    console.log("hello javascript");
</script>

<script>
    console.log("hello html");
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/IGJK6/btrihOO2Auk/usRdRClFeSPeW9QB98kv01/img.png](https://blog.kakaocdn.net/dn/IGJK6/btrihOO2Auk/usRdRClFeSPeW9QB98kv01/img.png)

---

# **< comment >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>comment</title>
    <style>

    </style>
</head>
<body>

<script>
// 한 줄 주석
/*
    여러 줄 주석
*/
/*
    페이지 소스 보기 하면 보이니
    중요한 내용 작성 금지
*/
console.log("단축키는 ctrl + /");
</script>
</body>
</html>
```

---

# **< variable >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>variable</title>
    <style>

    </style>
</head>
<body>

<script>
/* 변수 선언 */
/* var 키워드로 변수 선언 */
// javascript는 변수 선언시 타입을 지정하지 않음
// 변수에 값이 할당될 때 타입이 결정
var a;
var b;
a = 3;
b = "hello";

console.log(a);
console.log(b);

b = 4;
console.log(b);

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/sYs6Y/btrig4kaa14/f325LK3KVI96sbJH0eAa51/img.png](https://blog.kakaocdn.net/dn/sYs6Y/btrig4kaa14/f325LK3KVI96sbJH0eAa51/img.png)

---

# **< variable-let >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>variable - let</title>
    <style>

    </style>
</head>
<body>

<script>
// let 키워드로 변수 선언
let a;
let b;
a = 3;
b = "js";

console.log(a);
console.log(b);

b = 5;
console.log(b);

var c = 10;
let d = 20;

console.log(c);
console.log(d);
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/vvT29/btrighK8lW4/Dg5riGk78GqAAH5eUasHek/img.png](https://blog.kakaocdn.net/dn/vvT29/btrighK8lW4/Dg5riGk78GqAAH5eUasHek/img.png)

---

# **< variable-const >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>const</title>
    <style>

    </style>
</head>
<body>

<script>
// const : constant(상수)
// 값을 다시 할당할 수 없음
// 선언시 값을 할당해야 함
// const a; // 안됨
const a = 10;

console.log(a);

// a = 20; // 안됨
console.log(a);
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/dXYMC8/btrijry3Du0/8QM6hCC0YKylKsqNduZcjK/img.png](https://blog.kakaocdn.net/dn/dXYMC8/btrijry3Du0/8QM6hCC0YKylKsqNduZcjK/img.png)

---

# **< variable >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>variable</title>
    <style>

    </style>
</head>
<body>

<script>
let a = 3;
let b = 5;

// 코드 작성

console.log(a); // 5
console.log(b); // 3
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/rqEe4/btrihaSoxcq/45UJqreVd5qeEsiIc8lK2K/img.png](https://blog.kakaocdn.net/dn/rqEe4/btrihaSoxcq/45UJqreVd5qeEsiIc8lK2K/img.png)

---

# **< operator-arithmetic ⇒산술연산>**

```html
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
let a = 3;
let b = 5;

console.log(a+b);
console.log(a-b);
console.log(a*b);
console.log(a/b);
console.log(b%a);
console.log(b**a); //b의 a승

//단항 연산자
a++;
console.log(a);
b--;
console.log(b);
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/CnawT/btricEHaIDc/Fp8KPbvkNQGUNDo0DgGkEk/img.png](https://blog.kakaocdn.net/dn/CnawT/btricEHaIDc/Fp8KPbvkNQGUNDo0DgGkEk/img.png)

---

# **< operator-assignment⇒산술임무 >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>assignment</title>
    <style>

    </style>
</head>
<body>

<script>
let a = 5;

a+=3;
console.log(a);
a-=2;
console.log(a);
a*=7;
console.log(a);
a/=3;
console.log(a);
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/6MYdr/btrijqz9MrW/yB3sZvJfqZTFOMAj7VDeY0/img.png](https://blog.kakaocdn.net/dn/6MYdr/btrijqz9MrW/yB3sZvJfqZTFOMAj7VDeY0/img.png)

---

# **< operator-comparison ⇒비교 연산자 >**

```html
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
let a = 3;
let b = 5;

console.log(a==b);
console.log(a!=b);
console.log(a>b);
console.log(a>=b);
console.log(a<b);
console.log(a<=b);

//다른 타입과 비교
console.log("===== 다른 타입 비교 =====");
let c = 3;
let d = "3";
let f = "5";
//양변의 type 중 number가 있으면 number로 변환해서 비교
console.log(c==d);
console.log(c<f);

//같은 type인지 확인할 때
console.log(c===d); //타입도 같고, 값도 같아야 true
console.log(c!==d); //타입이 다르거나 값이 다르면 true
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/cRYm0k/btrid7I3Vy0/eR64eLiYTdDSWd4NQzKEF1/img.png](https://blog.kakaocdn.net/dn/cRYm0k/btrid7I3Vy0/eR64eLiYTdDSWd4NQzKEF1/img.png)

---

# **< operator-logical ⇒논리연산자 >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title></title>
    <style>

    </style>
</head>
<body>

<script>
console.log("and "); // 양변이 true일 때만 true, 나머지 false
console.log(true && true); // true
console.log(true && false); // false
console.log(false && true); // false
console.log(false && false); // false

console.log("or "); // 양변이 false일 때만 false, 나머지 true
console.log(true || true); // true
console.log(true || false); // true
console.log(false || true); // true
console.log(false || false); // false

console.log("not ");
console.log(!true);// false
console.log(!false);// true

console.log("example ");
let x = 6;
let y = 3;

let r1 = (x < 10) && (y > 1);
console.log(r1);

let r2 = (x == 5) || (y == 5);
console.log(r2);

let r3 = !(x == y);
console.log(r3);

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bfwK1i/btrifnEVKkM/eI2Y3LpxyFcO2QxmYboI8K/img.png](https://blog.kakaocdn.net/dn/bfwK1i/btrifnEVKkM/eI2Y3LpxyFcO2QxmYboI8K/img.png)

---

# **< operator-ternary ⇒삼항연산자>**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>ternary</title>
    <style>

    </style>
</head>
<body>

<script>
// 삼항연산자
// v1 ? v2 : v3
// 연산결과는 v2 또는 v3
// v1이 true이면 연산결과가 v2
// v1이 false 면 연산결과는 v3

let a = true ? 3 : 5;
console.log(a); // 3

let b = false ? 10 : 20;
console.log(b); // 20

let c = (a > b) ? 100 : 200;
console.log(c); // 200
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/u88U3/btriivaDDzr/3X99r0vpcF168TwfKS5WSk/img.png](https://blog.kakaocdn.net/dn/u88U3/btriivaDDzr/3X99r0vpcF168TwfKS5WSk/img.png)

---

# **< data-type-conversion ⇒ 데이터 타입 변환 >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>type conversion : string to number</title>
    <style>

    </style>
</head>
<body>

<script>
let a = "12";
let b = 2;
let c = "2";

console.log(a);
console.log(b);

console.log(a < b); // false
console.log(a < c); // true

// string to number
console.log("Number 함수");
let d = Number(a); // number 12
let e = Number(c); // number 2
console.log(d < e); // false

console.log("parseInt 함수");
let f = parseInt("3");
console.log(f);
let g = parseInt("3.14");
console.log(g);

console.log("parseFloat 함수");
let h = parseFloat("3.14");
console.log(h);

// string concat
let i = "3";
let j = "4";

console.log(i + j); // 연결연산
console.log(Number(i) + Number(j)); // 산술연산
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/dZAzyz/btrihN3GrfN/LWwIVYjDSeKAQv2D0W60q0/img.png](https://blog.kakaocdn.net/dn/dZAzyz/btrihN3GrfN/LWwIVYjDSeKAQv2D0W60q0/img.png)

---

# **< function >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>function</title>
    <style>

    </style>
</head>
<body>

<script>
// 함수 정의
// function 키워드, 함수명, () 파라미터, {} 함수 body
function myFunction() {
    // 명령문들
    console.log("myFunction 실행됨");
}

// 함수 실행
myFunction();
myFunction();
myFunction();

yourFunction();

function yourFunction() { // function hoisting
    console.log("yourFunction 실행됨");
}

yourFunction();
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/SN2xy/btrid6wHbxK/5dyrGLfIMTOk9JNoMGq2K0/img.png](https://blog.kakaocdn.net/dn/SN2xy/btrid6wHbxK/5dyrGLfIMTOk9JNoMGq2K0/img.png)

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>function</title>
    <style>

    </style>
</head>
<body>
    <button onclick="function1();">함수 실행시키기</button>
<script>
function function1() {
    console.log("함수 실행됨!!!!");
}
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bE6NYZ/btrh931oIW8/sZuGvE1cIwdBuP3R0Yve9K/img.png](https://blog.kakaocdn.net/dn/bE6NYZ/btrh931oIW8/sZuGvE1cIwdBuP3R0Yve9K/img.png)

![https://blog.kakaocdn.net/dn/blTeps/btrikM32GNJ/21AkMjr0AOhA5lEnXc4zj1/img.png](https://blog.kakaocdn.net/dn/blTeps/btrikM32GNJ/21AkMjr0AOhA5lEnXc4zj1/img.png)

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>function</title>
    <style>

    </style>
</head>
<body>
<!-- input+button -->
<input type="text"><button onclick="func1()">함수 실행</button>
<script>
function func1() {
    // console.log("함수 실행됨!!");
    let v = document.querySelector("input").value;
    console.log(v);
}
</script>
</body>
</html>
```

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>function</title>
    <style>

    </style>
</head>
<body>
<!-- input*2#input$+button -->
<input type="text" id="input1">
<input type="text" id="input2">
<button onclick="show();">값 출력</button>
<button onclick="add();"><i class="fas fa-plus"></i></button>
<!-- button*3>i.fas.fa-plus -->
<button onclick="subtract();"><i class="fas fa-minus"></i></button>
<button onclick="times();"><i class="fas fa-times"></i></button>
<button onclick="divide();"><i class="fas fa-divide"></i></button>

<script>
function divide() {
    let v1 = document.querySelector("#input1").value;
    let v2 = document.querySelector("#input2").value;

    console.log(Number(v1) / Number(v2));
}

function times() {
    let v1 = document.querySelector("#input1").value;
    let v2 = document.querySelector("#input2").value;

    console.log(Number(v1) * Number(v2));
}

function subtract() {
    let v1 = document.querySelector("#input1").value;
    let v2 = document.querySelector("#input2").value;

    console.log(Number(v1) - Number(v2));
}

function show() {
    let v1 = document.querySelector("#input1").value;
    let v2 = document.querySelector("#input2").value;

    console.log(v1);
    console.log(v2);
}

function add() {
    let v1 = document.querySelector("#input1").value;
    let v2 = document.querySelector("#input2").value;

    console.log(Number(v1) + Number(v2));
}
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/Hvhhq/btriiBPjtly/nMBUpb0blus0jSDDXvYyx0/img.png](https://blog.kakaocdn.net/dn/Hvhhq/btriiBPjtly/nMBUpb0blus0jSDDXvYyx0/img.png)

---

# **< function-parameter ⇒매개변수 >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>function parameter</title>
    <style>

    </style>
</head>
<body>

<script>
function func1(a){
    console.log(a);
}
function func2(a,b){
    console.log(a);
    console.log(b);
}
func1();
func1(3);
func1("hello");
func1("js","css");

func2();
func2(1);
func2(3,4);
func2(3,4,5);
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bxsSfE/btrihOIhDzi/88Od6OnLKpi2VJwzyNMdu0/img.png](https://blog.kakaocdn.net/dn/bxsSfE/btrihOIhDzi/88Od6OnLKpi2VJwzyNMdu0/img.png)

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>parameter</title>
    <style>

    </style>
</head>
<body>
<script>
function add(a,b){
    console.log(Number(a)+Number(b));
}
function subtract(c,d){
    console.log(Number(c)-Number(d));
}
add(3, 4); // 7 출력
add(10, 20); // 30
subtract(5, 3); // 2
subtract(3, 5); // -2

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/c1gpEm/btrigJU0Cci/EpKehBEKPQFdxVjVSG0xMk/img.png](https://blog.kakaocdn.net/dn/c1gpEm/btrigJU0Cci/EpKehBEKPQFdxVjVSG0xMk/img.png)

---

# **< function-return >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>return</title>
    <style>

    </style>
</head>
<body>

<script>
    // return : 1.메소드 종료
    // 2. 오른쪽에 있는 값 반환(return)
function func1(){
    console.log(1, "func1 실행됨")
    console.log(2, "func1 실행중")
    return;
    console.log(3, "func1 실행중");

}
func1();

console.log("코드 실행중...");
function func2(){
    console.log(1, "func2 실행됨");
    return 3;
    console.log(2, "func2 실행중");
}
let a =func2();
    console.log("코드 실행중!!!");
    console.log(a);
    console.log(func2());
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/ltnRu/btrihb4O9AI/FWIKZpzvA2QaWMkywnfxp1/img.png](https://blog.kakaocdn.net/dn/ltnRu/btrihb4O9AI/FWIKZpzvA2QaWMkywnfxp1/img.png)

RETURN 공부하기 위해서 작성해봤던 파일~

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>return</title>
    <style>

    </style>
</head>
<body>

<script>
function add(a, b) {
    return a+b;
}
function subtract(x, y) {
    return x - y;
}
function times(a, b) {
    return a * b;
}
function divide(x, y) {
    let r = x / y;
    return r;
}
let a = add(3, 5);
console.log(a); // 8

let b = subtract(3, 7);
console.log(b); // -4

let c = times(2, 3);
console.log(c); // 6;

let d = divide(10, 2);
console.log(d); // 5;

let e = add(30, 300);
console.log(e);
console.log(subtract(100, 50));
console.log(times(3, 3));

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/ErEnD/btridwBM0g7/gWCsoFLc8o4UnPpeWpkYyk/img.png](https://blog.kakaocdn.net/dn/ErEnD/btridwBM0g7/gWCsoFLc8o4UnPpeWpkYyk/img.png)

---

# **< random >**

```html
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
//Math.random(); //0보다 크거나 같고 1보다 작은 임의의 수 리턴
let a = Math.random();
console.log(a);
console.log(Math.random());

//0~9의 랜덤값
let b= Math.random()*10;
console.log(b);
console.log(parseInt(b));

//1~5사이의 랜덤값
let c = (Math.random()*5)+1;
console.log(c);
console.log(parseInt(c));
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/6IQyH/btrig4R02BN/gU9KwcpFYfQKzokE3MabH1/img.png](https://blog.kakaocdn.net/dn/6IQyH/btrig4R02BN/gU9KwcpFYfQKzokE3MabH1/img.png)

---

# **< function-random >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title>random</title>
    <style>

    </style>
</head>
<body>
<!-- input+button -->
<input type="text" value="5">
<button onclick="showRandom();">랜덤값 출력</button>
<script>
function showRandom() {
    let val = document.querySelector("input").value;
    val = Number(val);

    // genRandom 함수 정의
    let r = genRandom(val);
    console.log(r); // 1 ~ val 사이의 임의의 값 출력
}

function genRandom(param) {
    return parseInt(Math.random() * param) + 1;
}

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/lpyjf/btrig4YJOhV/Km0m7Kr84wCJDgtWpqfnz0/img.png](https://blog.kakaocdn.net/dn/lpyjf/btrig4YJOhV/Km0m7Kr84wCJDgtWpqfnz0/img.png)

---

# **< function >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>function</title>
    <style>

    </style>
</head>
<body>

<script>
    //28~30까지는 우선 복습 X 나머지만 복습 ㄱㄱ
// javascript 함수는 어디서든 가능
function func1() {
    function func2() {
        console.log("func2");
    }

    console.log("func1");
    func2(); // o
}

func1();
// func2(); // x

// va1(); // x
// 함수를 값으로 사용
let val1 = function () {
    console.log("값으로 정의된 함수");
}

val1();
val1();
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/vrklq/btrikLxiRxi/dcfgCpYyY9OyddhZjlzxH0/img.png](https://blog.kakaocdn.net/dn/vrklq/btrikLxiRxi/dcfgCpYyY9OyddhZjlzxH0/img.png)

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>function</title>
    <style>

    </style>
</head>
<body>

<script>
function func1() {
    let val1 = function () {
        console.log("값으로 정의된 함수");
    }

    return val1;
}

let f1 = func1();
f1();
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/Bzwmr/btriitRskvt/K08qlzlwk94GXwOJiBmKLK/img.png](https://blog.kakaocdn.net/dn/Bzwmr/btriitRskvt/K08qlzlwk94GXwOJiBmKLK/img.png)

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>function</title>
    <style>

    </style>
</head>
<body>

<script>

function func1(param) {
    param();
}

// func1(3);
let f1 = function () {
    console.log("f1 함수");
}
func1(f1);
func1(function () {
    console.log("파라미터로 넘긴 함수");
});

// 함수정의와 실행 동시
(function () {
    console.log("정의와 실행");
})();

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/qvhtq/btrifoKAVAd/m6ob8Va9odg0eNNgFkRAA1/img.png](https://blog.kakaocdn.net/dn/qvhtq/btrifoKAVAd/m6ob8Va9odg0eNNgFkRAA1/img.png)

---

# **< function-random >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>random</title>
    <style>

    </style>
</head>
<body>
<!-- input*2#input$+br+button -->
<input type="text" id="input1" value="1">
<input type="text" id="input2" value="5">
<br>
<button onclick="showRandom();">랜덤값 출력</button>
<script>
function showRandom() {
    let v1 = Number(document.querySelector("#input1").value);
    let v2 = Number(document.querySelector("#input2").value);

    let r = genRandom(v1, v2);
    console.log(r);
}

function genRandom(a, b) {
    // a:3, b:5
    let len = (b - a) + 1; // 3
    let ran = parseInt(Math.random() * len); // 0, 1, 2
    let result = ran + a;

    return result;
}
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bmgB6u/btriggel4Ma/yqMXZHgeHEdSBasykPllc1/img.png](https://blog.kakaocdn.net/dn/bmgB6u/btriggel4Ma/yqMXZHgeHEdSBasykPllc1/img.png)
