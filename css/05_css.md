# Css04

---

# **< display-block >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>display block</title>
    <style>
        .item {
            border: 2px solid green;
            background-color: chartreuse;
            padding: 15px;
            width: 200px;
            height: 100px;
            display: block; /* div의 기본값 */
        }
    </style>
</head>
<body>
<!-- .item*3>lorem1 -->
<div class="item">Lorem.</div><div class="item">Amet?</div>
<div class="item">Neque.</div>
</body>
</html>
```

---

# **< display-inline-block >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>inline block</title>
    <style>
        .item {
            border: 5px solid blue;
            background-color: cyan;
            width: 200px;
            height: 100px;
            padding: 20px;
            display: inline-block;
            margin: 20px;
        }
    </style>
</head>
<body>
    <!-- .item*5>lorem1 -->
    <div class="item">Lorem.</div>
    <div class="item">Laborum!</div>
    <div class="item">Quod?</div>
    <div class="item">Temporibus!</div>
    <div class="item">Dolorum?</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bgl1hR/btrhxrAE11x/4iFO89dwq5vvuq70eksyj1/img.png](https://blog.kakaocdn.net/dn/bgl1hR/btrhxrAE11x/4iFO89dwq5vvuq70eksyj1/img.png)

---

# **< display-inline-block >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>inline block navbar</title>
    <style>
        ul, li {
            padding: 0px;
            margin: 0px;
        }
        a {
            text-decoration: none;
            color: black;
            line-height: 75px;
        }
        li {
            text-align: center;
            height: 75px;
            width: 125px;
            display: inline-block;
            background-color: blue;
        }
        li:hover {
            background-color: black;
            color: white;
        }
        li:hover a {
            color: white;
        }
    </style>
</head>
<body>
    <!-- ul>li*4>a>lorem1 -->
    <ul>
        <li><a href="#">Lorem.</a></li>
        <li><a href="#">Odit?</a></li>
        <li><a href="#">Consequuntur.</a></li>
        <li><a href="#">Repellat!</a></li>
    </ul>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/z0g3q/btrhvO3WpaA/Wizh2kJnGpGG0QCdbZi2sk/img.png](https://blog.kakaocdn.net/dn/z0g3q/btrhvO3WpaA/Wizh2kJnGpGG0QCdbZi2sk/img.png)

마우스 커서가 올라가면 내가 설정한 대로, 배경이나 글자색 등 바꿀 수 있다!

---

# **< flexbox >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>flexbox</title>
    <style>
        /* li {
            display: inline-block;
        } */
        ul {
            display: flex;
        }
    </style>
</head>
<body>
    <!-- ul>li*5>a[href="#"]>lorem1 -->
    <ul>
        <li><a href="#">Lorem.</a></li>
        <li><a href="#">Vero!</a></li>
        <li><a href="#">Voluptate.</a></li>
        <li><a href="#">Reiciendis!</a></li>
        <li><a href="#">Aut!</a></li>
    </ul>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/q7cLf/btrhzrmq2eZ/Ck5LnKecZ0NpJC22qAW5q0/img.png](https://blog.kakaocdn.net/dn/q7cLf/btrhzrmq2eZ/Ck5LnKecZ0NpJC22qAW5q0/img.png)

---

# **< flexbox >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>flexbox</title>
    <style>
        .item {
            background-color: darkgrey;
            font-weight: bold;
            font-size: 32px;
        }
        .item:nth-child(2n) {
            background-color: chocolate;
        }
        .container {
            display: flex;
            background-color: khaki;
            height: 500px;
        }
    </style>
</head>
<body>
    <p>
        display 속성을 flex로 둔 요소는 flex container <br>
        flex container의 자식 요소들은 flex item <br>
        flex items은 flex container의 main축 기준으로 배치됨
    </p>
    <!-- .container>.item*5#item${$} -->
    <div class="container">
        <div class="item" id="item1">1</div>
        <div class="item" id="item2">2</div>
        <div class="item" id="item3">3</div>
        <div class="item" id="item4">4</div>
        <div class="item" id="item5">5</div>
    </div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/EGlHx/btrhw79Uslj/ZZL5aaY7fZ8ffQjIlTJbXK/img.png](https://blog.kakaocdn.net/dn/EGlHx/btrhw79Uslj/ZZL5aaY7fZ8ffQjIlTJbXK/img.png)

---

# **< flexbox-justify-content >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>justify content</title>
    <style>
        .container {
            display: flex;
            background-color: gold;
            height: 300px;
            margin-top: 10px;
        }

        .item {
            background-color: red;
            color: white;
            font-size: 40px;
            font-weight: bold;
            width: 100px;
        }
        .item:nth-child(2n) {
            background-color: blue;
        }
        #container1 {
            justify-content: flex-start;
        }
        #container2 {
            justify-content: flex-end;
        }
        #container3 {
            justify-content: center;
        }
        #container4 {
            justify-content: space-between;
        }
        #container5 {
            justify-content: space-around;
        }
        #container6 {
            justify-content: space-evenly;
        }
    </style>
</head>
<body>
    <p>justify-content 속성은 메인축 기준으로
        아이템을 배치하는 방법을 정의함
    </p>
<!-- .container*6#container$>.item*5{$} -->
<div class="container" id="container1">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container2">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container3">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container4">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container5">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container6">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/k1dSy/btrhw7B6OHM/vPYAWeiekI8bWcZYgz2Ee1/img.png](https://blog.kakaocdn.net/dn/k1dSy/btrhw7B6OHM/vPYAWeiekI8bWcZYgz2Ee1/img.png)

같은 색의 화살표들은 크기가 같은 칸이다!

- 초록색 화살표 : space-between을 지정하면 주축 방향 여유 공간을 **flex 항목** 사이의 공간에 균등 배분합니다.
- 노란색 화살표 : space-around는 시작선 및 끝선과 **flex 항목**간 공간도 균등 배분에 고려하므로,

시작선 및 끝선과 **flex 항목** 간의 공간의 크기를 1로 배분한다면 **flex 항목** 사이의 공간은 2로 배분합니다.

- 빨간색 화살표 : space-evenly로 지정하면 여유 공간을 **flex 항목** 사이의 공간 및 시작선 및 끝선과

**flex 항목** 간의 공간에 모두 균등하게 배분합니다.

---

# **< flexbox-justify-content >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>justify content</title>
    <style>
        .button {
            color: white;
            background-color: seagreen;
            border-radius: 10px;
            font-size: 32px;
            font-weight: bold;
            padding: 15px;
            text-align: center;
            width: 150px;
        }
        .container {
            display: flex;
            justify-content: space-between;
        }
    </style>
</head>
<body>
<div class="container">
    <!-- div.button*2{BUTTON} -->
    <div class="button">BUTTON</div>
    <div class="button">BUTTON</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/cBcMiF/btrhykuCPcg/1ksPPKhpxk8wslxeUF8Kwk/img.png](https://blog.kakaocdn.net/dn/cBcMiF/btrhykuCPcg/1ksPPKhpxk8wslxeUF8Kwk/img.png)

---

# **< flexbox-align-items >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>align items</title>
    <style>
        .container {
            display: flex;
            margin-top: 15px;
            height: 300px;
            background-color: skyblue;
            justify-content: space-around;
        }
        .item {
            text-align: center;
            font-size: 32px;
            font-weight: bold;
            color: snow;
            background-color: blue;
            width: 100px;
        }
        .item:nth-child(2n) {
            background-color: red;
        }
        #container1 {
            align-items: stretch;
        }
        #container2 {
            align-items: flex-start;
        }
        #container3 {
            align-items: flex-end;
        }
        #container4 {
            align-items: center;
        }
        #container5 {
            align-items: baseline;
        }
        #container5 > .item:first-child {
            font-size: 64px;
        }
    </style>
</head>
<body>
<!-- .container#container$*5>.item[contenteditable=true]*5{$} -->
<div class="container" id="container1">
    <div class="item" contenteditable="true">1</div>
    <div class="item" contenteditable="true">2</div>
    <div class="item" contenteditable="true">3</div>
    <div class="item" contenteditable="true">4</div>
    <div class="item" contenteditable="true">5</div>
</div>
<div class="container" id="container2">
    <div class="item" contenteditable="true">1</div>
    <div class="item" contenteditable="true">2</div>
    <div class="item" contenteditable="true">3</div>
    <div class="item" contenteditable="true">4</div>
    <div class="item" contenteditable="true">5</div>
</div>
<div class="container" id="container3">
    <div class="item" contenteditable="true">1</div>
    <div class="item" contenteditable="true">2</div>
    <div class="item" contenteditable="true">3</div>
    <div class="item" contenteditable="true">4</div>
    <div class="item" contenteditable="true">5</div>
</div>
<div class="container" id="container4">
    <div class="item" contenteditable="true">1</div>
    <div class="item" contenteditable="true">2</div>
    <div class="item" contenteditable="true">3</div>
    <div class="item" contenteditable="true">4</div>
    <div class="item" contenteditable="true">5</div>
</div>
<div class="container" id="container5">
    <div class="item" contenteditable="true">1</div>
    <div class="item" contenteditable="true">2</div>
    <div class="item" contenteditable="true">3</div>
    <div class="item" contenteditable="true">4</div>
    <div class="item" contenteditable="true">5</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/K0RU1/btrhqfBlXMP/wakVhNkK1i0KslOPXnJCbk/img.png](https://blog.kakaocdn.net/dn/K0RU1/btrhqfBlXMP/wakVhNkK1i0KslOPXnJCbk/img.png)

```jsx
align-items의 기본값은 stretch로 첫번째와 같이 일자로 쭉이 이어지는 형태 (행의 최대값)
교차축 방향의 시작선에 따라서, 2,3,4번째는 박스의 위치가 위 아래, 중심으로 나뉘게 된다.
5번째에서 baseline을 64px 하고, fist-child로 1번 글자의 크기를 64px로하고,
그 64px의 값을 베이스라인으로해서 뒤에 나온 숫자들의 크기도 변하게 되었다.
```

---

# **< flexbox-center >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>center</title>
    <style>
        .center {
            background-color: black;
            color: white;
            font-size: 32px;
            font-weight: bold;
            text-align: center;
            padding: 10px;
            width: 150px;
        }
        .container {
            background-color: thistle;
            margin-top: 15px;
            height: 300px;
        }

        #div1 > .center {
            margin: auto;
        }

        #div1 {
            display: flex;
        }

        #div2 {
            display: flex;
            align-items: center;
            justify-content: center;
        }
    </style>
</head>
<body>
    <!-- .container*2#div$>.center[contenteditable=true]{CENTER} -->
    <div class="container" id="div1">
        <div class="center" contenteditable="true">CENTER</div>
    </div>
    <div class="container" id="div2">
        <div class="center" contenteditable="true">CENTER</div>
    </div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/mlZbz/btrhAflM1QZ/9hYf4QK4GTR4UNmKjXBxR1/img.png](https://blog.kakaocdn.net/dn/mlZbz/btrhAflM1QZ/9hYf4QK4GTR4UNmKjXBxR1/img.png)

글자를 중앙에 위치하게 하는 두가지의 방법!

---

# **< flexbox-flex-grow >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>flex grow</title>
    <style>
        .container {
            display: flex;
            background-color: skyblue;
            margin-top: 15px;
            height: 300px;
        }
        .item {
            font-size: 40px;
            text-align: center;
            font-weight: bold;
            background-color: tomato;
        }
        .item:nth-child(even) {
            background-color: yellow;
        }

        #container1 > .item:nth-child(5) {
            flex-grow: 1; /* 단위 없음 */
        }

        #container2 > .item:nth-child(4),
        #container2 > .item:nth-child(5) {
            flex-grow: 1;
        }

        #container3 > .item:nth-child(4) {
            flex-grow: 2;
        }

        #container3 > .item:nth-child(5) {
            flex-grow: 1;
        }

        #container4 > .item:nth-child(3) {
            flex-grow: 1;
        }
    </style>
</head>
<body>
    <p>flex-grow: flex 아이템이 남은 공간을 얼마나 차지할 것인지 정의</p>
<!-- .container*5#container$>.item*5{$} -->
<div class="container" id="container1">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container2">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container3">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container4">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
<div class="container" id="container5">
    <div class="item">1</div>
    <div class="item">2</div>
    <div class="item">3</div>
    <div class="item">4</div>
    <div class="item">5</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/mVd7a/btrhxr8CP3W/nRjmjymjlftlbEvZwMUkk0/img.png](https://blog.kakaocdn.net/dn/mVd7a/btrhxr8CP3W/nRjmjymjlftlbEvZwMUkk0/img.png)

---

# **< flexbox-flex-grow >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>flex grow</title>
    <style>
        .container {
            display: flex;
            background-color: silver;
        }
        .menus {
            width: 200px;
            background-color: yellow;
        }
        .ads {
            width: 150px;
            background-color: violet;
        }
        .main-content {
            background-color: white;
            width: 300px;
            flex-grow: 1;
        }
    </style>
</head>
<body>
<!-- .container>.menus+.main-content+.ads -->
<div class="container">
    <div class="menus"></div>
    <div class="main-content">
        <!-- (h1>lorem3^p>lorem)*3 -->
        <h1>Lorem, ipsum dolor.</h1>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sit asperiores laudantium delectus, recusandae iusto voluptatum molestias enim nam debitis veniam vero aperiam laboriosam atque! Fuga perferendis exercitationem impedit asperiores quas.</p>
        <h1>Pariatur, voluptas ab.</h1>
        <p>Quasi reiciendis sed suscipit repellat ea ipsum cupiditate incidunt esse impedit, voluptatem labore officiis iusto totam aspernatur nobis nesciunt praesentium nihil minima eum, delectus reprehenderit. Accusamus velit deserunt quos dignissimos.</p>
        <h1>Molestiae, eum numquam?</h1>
        <p>Atque deleniti, aliquam molestias labore dignissimos, voluptas accusamus est modi, amet fuga praesentium! Fugit labore laboriosam ab fuga illo? Culpa itaque eius, officiis nesciunt illum voluptatibus commodi quas assumenda minus!</p>
    </div>
    <div class="ads"></div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/U0OTd/btrhhSfjBOo/jQj2HkdajgNf1LPG60C9qK/img.png](https://blog.kakaocdn.net/dn/U0OTd/btrhhSfjBOo/jQj2HkdajgNf1LPG60C9qK/img.png)

왼쪽에 카테고리를 넣고, 중앙에 메인컨텐츠와 오른쪽에 광고를 넣는다면,

이런형식으로 삽입해서 진행할 수 있다!

---

# **< flexbox-flex-basis >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>flex basis</title>
    <style>
        .container {
            background-color: thistle;
            margin-top: 15px;
            display: flex;
        }
        .item {
            background-color: yellow;
            flex-grow: 1;
        }
        .item:nth-child(even) {
            background-color: tomato;
            flex-grow: 1;
        }
        #container2 > .item {
            flex-basis: 0;
        }
    </style>
</head>
<body>
<!-- .container#container$*2>.item{loooooong}+.item{s} -->
<div class="container" id="container1">
    <div class="item">loooooong</div>
    <div class="item">s</div>
</div>
<div class="container" id="container2">
    <div class="item">loooooong</div>
    <div class="item">s</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/Azor7/btrhA1U9pEX/0Jd6ZTwlfMrfutIesimfu0/img.png](https://blog.kakaocdn.net/dn/Azor7/btrhA1U9pEX/0Jd6ZTwlfMrfutIesimfu0/img.png)

```jsx
사진 첫번째 줄 : 1로 되어있는 것은 입력하고 남은 빈칸들 중에서 반반을 
요소들이나눠갖는 것이라고 되어있습니다.
사진 두번째 줄 : 0으로 하면, 전체 flex의 칸을 요소끼리 1:1로 나눠 갖는다!
```

---

# **< flexbox-flex >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>flex</title>
    <style>
        .container {
            display: flex;
            background-color: thistle;
        }
        .item:nth-child(1) {
            background-color: yellowgreen;
        }
        .item:nth-child(2) {
            background-color: tomato;
        }
        #container1 > .item {
            flex-grow: 1;
        }
        #container2 > .item {
            flex-grow: 1;
            flex-basis: 0;
        }
        #container3 > .item {
            flex: 1;
        }
    </style>
</head>
<body>
<!-- .container*3#container$>.item{loooooooooooong}+.item{s} -->
<div class="container" id="container1">
    <div class="item">loooooooooooong</div>
    <div class="item">s</div>
</div>
<div class="container" id="container2">
    <div class="item">loooooooooooong</div>
    <div class="item">s</div>
</div>
<div class="container" id="container3">
    <div class="item">loooooooooooong</div>
    <div class="item">s</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/cijd8s/btrhqheYq4Q/AoksYFcdChQYUCzOqOwea0/img.png](https://blog.kakaocdn.net/dn/cijd8s/btrhqheYq4Q/AoksYFcdChQYUCzOqOwea0/img.png)

---

# **< icon >**

```html
<head>
    <link href="../../icon/css/all.css" rel="stylesheet"> <!--load all styles -->
  </head>
  <body>
    <i class="fas fa-user"></i> <!-- uses solid style -->
    <i class="far fa-user"></i> <!-- uses regular style -->
    <i class="fal fa-user"></i> <!-- uses light style -->
    <!--brand icon-->
    <i class="fab fa-github-square"></i> <!-- uses brands style -->
    <br>
    <i style="font-size: 50px;color: red;" class="fab fa-apple"></i>

  </body>
```

![https://blog.kakaocdn.net/dn/4p4OR/btrhxrOnHgG/EoP5AcXToUTyESJqLLQPbK/img.png](https://blog.kakaocdn.net/dn/4p4OR/btrhxrOnHgG/EoP5AcXToUTyESJqLLQPbK/img.png)

아이콘을 사용할 수 있는 사이트는 여기서부터 사용하면된다!

[https://fontawesome.com/](https://fontawesome.com/)

[Font Awesome
The world’s most popular and easiest to use icon set just got an upgrade. More icons. More styles. More Options.
fontawesome.com](https://fontawesome.com/)

![https://blog.kakaocdn.net/dn/L79I3/btrhxrVcUj2/GmN2BamckZ5dsSrSkaUgKK/img.png](https://blog.kakaocdn.net/dn/L79I3/btrhxrVcUj2/GmN2BamckZ5dsSrSkaUgKK/img.png)

start for free 클릭 후, 나오는 페이지 아래로 내려서 download클릭

![https://blog.kakaocdn.net/dn/IIaZQ/btrhyjWWcDG/9hLKSsfrhSH4Y6ThHSa47K/img.png](https://blog.kakaocdn.net/dn/IIaZQ/btrhyjWWcDG/9hLKSsfrhSH4Y6ThHSa47K/img.png)

![https://blog.kakaocdn.net/dn/CQkoY/btrhAfsFxjM/xMOkIbcPWlxan88YH6aXrK/img.png](https://blog.kakaocdn.net/dn/CQkoY/btrhAfsFxjM/xMOkIbcPWlxan88YH6aXrK/img.png)

오른쪽 다운로드 버튼을 누르고, 묶여있는 파일을 보통 내가 사용하는, css 파일들 저장해놓는 위치에 저장하면 된다.

![https://blog.kakaocdn.net/dn/eDtVAb/btrhTuQpwJ1/7P8M5QwlwzXtflBBtrAOv1/img.png](https://blog.kakaocdn.net/dn/eDtVAb/btrhTuQpwJ1/7P8M5QwlwzXtflBBtrAOv1/img.png)

내경우에는 여기에 저장

icon폴더를 내가 사용하는 폴더에 저장해주고, user snippet을 수정했는데,

file - preferences - user snippets html검색 후 아래 입력하고 저장!

href에 ../을 한번 더 붙여줘야헀다, 나같은경우는 수업 파일을 날짜별로 정리하고 싶어서,

day01 안에 수업내용을 저장해놨기 때문이다~

```html
{
   // Place your snippets for html here. Each snippet is defined under a snippet name and has a prefix, body and
   // description. The prefix is what is used to trigger the snippet and the body will be expanded and inserted. Possible variables are:
   // $1, $2 for tab stops, $0 for the final cursor position, and ${1:label}, ${2:another} for placeholders. Placeholders with the
   // same ids are connected.
   // Example:
   // "Print to console": {
   //    "prefix": "log",
   //    "body": [
   //       "console.log('$1');",
   //       "$2"
   //    ],
   //    "description": "Log output to console"
   // }
   "my snippet": {
      "prefix": "aa",
      "body": [
         "<!DOCTYPE html>",
         "<html>",
         "<head>",
         "\t<link rel=\"stylesheet\" href=\"../../icon/css/all.css\">",
         "\t<title>$1</title>",
         "\t<style>",
         "\t\t",
         "\t</style>",
         "</head>",
         "<body>",
         "$0",
         "<script>",
         "",
         "</script>",
         "</body>",
         "</html>"
      ]
   }
}
```

---

# **< flexbox >**

```html
<!DOCTYPE html>
<html>
<head>
    <link href="../icon/css/all.css" rel="stylesheet"> <!--load all styles -->
    <title>flexbox 연습</title>
    <style>
        .menu-container {
            display: flex;
            justify-content: space-between;
            background-color: #222;
            color: white;
        }
        .left-menu, .right-menu {
            display: flex;
        }
        .menu-item {
            padding: 5px 10px;
        }
        .menu-item:hover {
            background-color: seagreen;
        }
        .top-container {
            display: flex;
            height: 42px;
            align-items: center;
            justify-content: space-between;
            margin-bottom: 7px;
        }
        .button {
            padding: 3px 10px;
            color: white;
            background-color: seagreen;
            border-radius: 10px;
        }
        .top-container > .left-menu > div {
            margin-right: 10px;
        }
        .logo {
            font-size: 40px;
            color: red;
        }
        .top-container > .left-menu {
            align-items: center;
        }
        .main-container {
            display: flex;
            margin-top: 7px;
        }
        .side-menu, .ad-container {
            width: 200px;
            background-color: silver;
        }
        .side-menu-item {
            padding-left: 15px;
            padding-top: 10px;
            padding-bottom: 10px;
        }
        .side-menu-item:hover {
            color: white;
            background-color: seagreen;
        }
        .main-content {
            flex: 1;
            margin: 0px 5px;
        }
    </style>
</head>
<body>
<!-- .top-container>.left-menu+.right-menu -->
<div class="top-container">
    <div class="left-menu">
        <!-- div{image}+div{Menu} -->
        <div class="logo"><i class="fab fa-apple"></i></div>
        <div>Menu <i class="fas fa-caret-down"></i></div>
    </div>
    <div class="right-menu">
        <div class="button">Log In</div>
    </div>
</div>
<div class="menu-container">
    <!-- .left-menu>.menu-item*5 -->
    <div class="left-menu">
        <div class="menu-item"><i class="fas fa-bars"></i></div>
        <div class="menu-item"><i class="fas fa-home"></i></div>
        <div class="menu-item">HTML</div>
        <div class="menu-item">CSS</div>
        <div class="menu-item">JAVASCRIPT</div>
    </div>

    <!-- .right-menu>.menu-item*3 -->
    <div class="right-menu">
        <div class="menu-item"><i class="fas fa-adjust"></i></div>
        <div class="menu-item"><i class="fas fa-globe-americas"></i></div>
        <div class="menu-item"><i class="fas fa-search"></i></div>
    </div>
</div>

<!-- .main-container>.side-menu+.main-content+.ad-container -->
<div class="main-container">
    <div class="side-menu">
        <!-- .side-menu-item*5>lorem1 -->
        <div class="side-menu-item">Lorem.</div>
        <div class="side-menu-item">Tenetur!</div>
        <div class="side-menu-item">Minima.</div>
        <div class="side-menu-item">Aliquam.</div>
        <div class="side-menu-item">Consequuntur!</div>

    </div>
    <div class="main-content">
        <!-- (h1>lorem3^p>lorem)*3 -->
        <h1>Lorem, ipsum dolor.</h1>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Laborum iusto, impedit rem magni eaque ipsam inventore vitae iure repellat nam dolor tempore accusamus aspernatur, quidem culpa ipsa, illum provident mollitia.</p>
        <h1>Enim, obcaecati perferendis?</h1>
        <p>Repudiandae dolores ex, consequatur modi velit libero corporis obcaecati facere numquam neque a saepe beatae asperiores itaque hic ipsam illum aliquid debitis quia deserunt? A repudiandae magnam vitae doloremque ipsam.</p>
        <h1>Quia, culpa necessitatibus?</h1>
        <p>Cupiditate maxime nulla sit quaerat est pariatur ut! Ex at accusantium minima perferendis earum, dignissimos doloribus harum, iste ab ullam atque a nam repudiandae, eius quis deserunt sint. Autem, itaque!</p>

    </div>
    <div class="ad-container"></div>
</div>
</body>
</html>
```

오늘 배운 것들을 총 정리해서 풀어보았던 문제(?), 예제(?)

![https://blog.kakaocdn.net/dn/YJd8j/btrhy1uUCSm/e2n04ZS5jNv22tWbEZF6L0/img.png](https://blog.kakaocdn.net/dn/YJd8j/btrhy1uUCSm/e2n04ZS5jNv22tWbEZF6L0/img.png)

너무 페이지가 길어서, 조금만 잘라서 가져왔다.

왼쪽에는 카테고리, 중앙에는 본문 오른쪽은 광고칸!

그리고 위쪽에 또 큰 카테고리~
