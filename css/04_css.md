# css05

# **< position-static >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>position static</title>
    <style>
        h1{
            border: 5px solid green;
            position: static /*position의 기본 값 static*/
            /*이동하지 않음*/;
        }
    </style>
</head>
<body>
<h1>Lorem, ipsum dolor.</h1>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/9gQqK/btrhJrn2hMA/57swXJmitqN1yVMgN8ATk1/img.png](https://blog.kakaocdn.net/dn/9gQqK/btrhJrn2hMA/57swXJmitqN1yVMgN8ATk1/img.png)

static은 position의 기본 값으로, 열어놓은 인터넷 창의 크기에 맞춰서 박스가 설정된다.

---

# **<position-relative >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>position relative</title>
    <style>
        h1{
            border: 5px solid green;
        }
        #head1{
            position: relative; /*원래 자기 위치 (normal position) 기준*/
        left: 30px; /*왼쪽에서 30px 멀어지게*/;
        top: 50px; /*위에서부터 50px 멀어지게*/
        }
    </style>
</head>
<body>
<h1 id="head1">Lorem, ipsum dolor.</h1>
<h1 id="head2">Nostrum, tempora eveniet?</h1>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/tGaB7/btrhN3MvnP6/0Mdsb4DKYkZBTRsOLJsYsK/img.png](https://blog.kakaocdn.net/dn/tGaB7/btrhN3MvnP6/0Mdsb4DKYkZBTRsOLJsYsK/img.png)

relative의 제일 기억해야하는 부분은 **멀어지게!** 라는 것 까먹지 말기~

기본적으로 static에서 **top, right, bottom, left** 설정한값으로부터 **멀어지게!**

---

# **< position-relative >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>position relative</title>
    <style>
        p{
            position: relative;
            border: 5px solid blue;
        }
        p:hover{
            bottom:5px;
        }
    </style>
</head>
<body>
    <!-- p*10>lorem -->
<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsam officiis distinctio possimus consequatur, quia harum neque fuga enim aliquam nostrum voluptates mollitia dolores quae delectus cupiditate quas. Ab, ipsum mollitia?</p>
<p>Maiores eum unde sequi adipisci facilis, sint ex explicabo aut, veritatis non rerum numquam. Praesentium blanditiis ea adipisci temporibus ipsum quasi, modi nemo, mollitia obcaecati possimus eligendi! Et, laudantium consequuntur?</p>
<p>Excepturi consequatur architecto nulla, dolor dolore laboriosam in, sunt, deserunt accusantium perferendis aliquid! Optio aperiam error harum! Voluptas placeat, iure magnam temporibus ab assumenda, a quaerat cum consectetur omnis dicta!</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/oXJDr/btrhLSyEfv5/Fyh7muobvV8zF1G51KLY00/img.png](https://blog.kakaocdn.net/dn/oXJDr/btrhLSyEfv5/Fyh7muobvV8zF1G51KLY00/img.png)

사진의 중간 박스는 마우스 커서가 박스 위에 올라가면 (hover), 중앙으로부터 5px멀어지게!하기

---

# **< position-fixed >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>position fixed</title>
    <style>
        .item {
            border: 3px solid green;
            width: 100px;
            height: 50px;
            font-size: 32px;
            font-weight: bold;
            text-align: center;
        }
        #div1 {
            position: fixed; /* viewport(브라우저 창) 기준 */
            top: 0px;
            left: 0px;
             /* 정상적인 배치 흐름에서 제외 */
        }
        #div2 {
            position: fixed;
            right: 0;
            top: 0;
        }
        #div4 {
            position: fixed;
            right: 0;
            bottom: 0;
        }
        #div6 {
            position: fixed;
            left: 0;
            bottom: 0;
        }
    </style>
</head>
<body>
<!-- .item*5#div${$} -->
<div class="item" id="div1">1</div>
<div class="item" id="div2">2</div>
<div class="item" id="div3">3</div>
<div class="item" id="div4">4</div>
<div class="item" id="div5">5</div>

<!-- h1*3>lorem -->
<h1>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Libero laudantium perspiciatis inventore praesentium deleniti rem nostrum voluptates provident sequi voluptas assumenda maxime amet a, magnam deserunt dolor labore quisquam blanditiis!</h1>
<h1>Impedit quae aut, optio necessitatibus vel est, mollitia beatae odio atque voluptates debitis. Quos, provident? Tenetur autem in velit aliquid, nihil, quos iusto commodi dolores quaerat quis recusandae error ipsum?</h1>
<h1>Laborum corporis eveniet natus velit, minima id consequatur, assumenda sint iste, porro debitis quam impedit cumque aspernatur tempore error dicta. Nisi cupiditate soluta quisquam natus vel magnam beatae numquam distinctio.</h1>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/cbI0n1/btrhJruKJ7n/dJBQIdQ885BstDl8nxsNnK/img.png](https://blog.kakaocdn.net/dn/cbI0n1/btrhJruKJ7n/dJBQIdQ885BstDl8nxsNnK/img.png)

fixed의 제일 특징은 페이지를 스크롤하더라도 항상 같은 위치에 고정된다는거! 그래서 fixed~

또 특징은 위치했을 때, 보통 공백 없이 위치한다.

---

# **<position-fixed >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>position fixed</title>
    <style>
        .toTopLink {
            position: fixed;
            bottom: 50px;
            right: 50px;
            text-decoration: none;
            color: white;
            background-color:grey;
            display: block;
            width: 50px;
            height: 50px;
            font-size: 34px;
            text-align: center;
            border-radius: 50%;
        }
    </style>
</head>
<body>
<!-- (h1*4>lorem)+a[href="#top"]{맨 위로} -->
<h1>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Sapiente ea natus, rerum itaque obcaecati eveniet aspernatur non esse omnis nam eos officiis accusantium molestiae porro? Quos esse quia excepturi optio?</h1>
<h1>Repudiandae itaque delectus dolorum. Similique, beatae quasi ut ab aspernatur quidem quae alias rerum facere ipsum, reiciendis non. Quibusdam magnam laborum, beatae ullam ea pariatur minima quisquam natus inventore ipsam.</h1>
<h1>Laudantium, aperiam earum nostrum officia sequi voluptatum impedit adipisci totam est nam error facere nesciunt. Voluptatum pariatur autem voluptate enim quaerat dolorem dicta, velit, qui error repudiandae magni, beatae alias.</h1>
<h1>Quasi quisquam labore vel debitis sequi, nemo dolorum molestiae, harum vero saepe alias dolores eveniet, soluta tempora laborum placeat. Nulla eos dolorem corporis dicta, enim ex nemo maxime repellendus asperiores.</h1>
<a class="toTopLink" href="#top"><i class="fas fa-arrow-up"></i></a>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bPdmKx/btrhLSrWcS7/LGP8J8K37KNzLhTHkQ7TA0/img.png](https://blog.kakaocdn.net/dn/bPdmKx/btrhLSrWcS7/LGP8J8K37KNzLhTHkQ7TA0/img.png)

동그라미 버튼 누르면, 맨 위로 버튼과 같게 설정하기!

border-radius는 테두리를 둥글게 만드는 속성인데, 박스 크기를 정사각형으로 50px*50px 후에 50%로 설정하면

동그라미가 된다~

---

# **< position-sticky >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>position sticky</title>
    <style>
        #head1{
            border:5px solid greenyellow;
            position: sticky;
            top:10px
        }
    </style>
</head>
<body>
    <!-- h1*15>lorem1 -->
<h1>Lorem.</h1>
<h1>Nostrum!</h1>
<h1>Maiores!</h1>
<h1 id="head1">Suscipit.</h1>
<h1>Sapiente?</h1>
<h1>Aliquid!</h1>
<h1>Aut.</h1>
<h1>Esse?</h1>
<h1>Asperiores.</h1>
<h1>Voluptatum.</h1>
<h1>Suscipit?</h1>
<h1>Possimus.</h1>
<h1>Voluptatum.</h1>
<h1>Rem.</h1>
<h1>Iste?</h1>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/uhmrP/btrhJrPcxxD/NwwKumhGWg8rjHZw5qCVwk/img.png](https://blog.kakaocdn.net/dn/uhmrP/btrhJrPcxxD/NwwKumhGWg8rjHZw5qCVwk/img.png)

사용자의 스크롤 위치를 기준으로 배치되기 때문에, top을 위치로 sticky하게 했으니,

스크롤을 아래로 내려도, 창 위쪽에 고정되어있다는거!

어디에서든 고정되어야하기 때문에, 무조건 4방향 중에서 한군데를 골라야한다.

---

# **< position-absolute >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>position absolute</title>
    <style>
        .container{
            border:5px solid red;
            width:300px;
            height:300px;
        }
        .item{
            position:absolute;
            border: 5px solid blue;
            width:200px;
            height:200px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="item">Lorem.</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bf6MDT/btrhOApRk4P/1IkXdpasN6uRZQQjaKLx7K/img.png](https://blog.kakaocdn.net/dn/bf6MDT/btrhOApRk4P/1IkXdpasN6uRZQQjaKLx7K/img.png)

이건 좀 어색했는데, 가장 가까운 위치에 있는 조상을 기준으로 배치가 되는데,

위치를 따로 설정하지는 않았기에 위아래는 겹쳐져서 박스가 보이게 된다.

---

# **< position-absolute >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>absolute sample</title>
    <style>
        .container{
            position: relative;
        }
        .icon{
            width: 30px;
        }
        .text{
            position: absolute;
            top: 0px;
            left: 30px;
            display: none;
        }
        .icon:hover+.text{
            display:block;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="icon">...</div>
    <div class="text">숨겨진 텍스트</div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/lqwQc/btrhOAwDHiK/g4njJVf52OwYRXrWEeZg11/img.png](https://blog.kakaocdn.net/dn/lqwQc/btrhOAwDHiK/g4njJVf52OwYRXrWEeZg11/img.png)

...에 마우스 커서를 올리면, 숨겨진 텍스트가 등장하게 됩니다.

당연히 hover기능을 쓰고, 약간 헷갈린게, text가 absolute이니까,

조상인 container의 위치에서부터 왼쪽에서 30 멀어진 위치에 나오게 되는

---

# **< positioin-absolute >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>absolute sample</title>
    <style>
        * {
            font-size: 24px;
        }
        .main-menu-item {
            text-align: right;
            background-color: black;
            color: white;
            width: 200px;
            height: 75px;
            border-right: 10px solid black;
            position: relative;
        }
        .sub-menu {
            background-color: black;
            color: white;
            display: none;
            position: absolute;
            top: 0px;
            left: 210px;
        }
        .main-menu-item:hover > .sub-menu {
            display: block;
        }
        .main-menu-item:hover {
            border-right-color: yellow;
        }
    </style>
</head>
<body>
<!-- .main-menu>.main-menu-item*3>lorem1+.sub-menu>.sub-menu-item*3>lorem1 -->
<div class="main-menu">
    <div class="main-menu-item">
        Lorem.
        <div class="sub-menu">
            <div class="sub-menu-item">Lorem.</div>
            <div class="sub-menu-item">Hic?</div>
            <div class="sub-menu-item">Odio.</div>
            <div class="sub-menu-item">Minus!</div>
            <div class="sub-menu-item">Officiis.</div>
        </div>
    </div>
    <div class="main-menu-item">
        Accusamus.
        <div class="sub-menu">
            <div class="sub-menu-item">Lorem.</div>
            <div class="sub-menu-item">Odit.</div>
            <div class="sub-menu-item">Debitis.</div>
            <div class="sub-menu-item">Iusto.</div>
            <div class="sub-menu-item">Molestiae!</div>
        </div>
    </div>
    <div class="main-menu-item">
        Quisquam?
        <div class="sub-menu">
            <div class="sub-menu-item">Lorem.</div>
            <div class="sub-menu-item">Iusto!</div>
            <div class="sub-menu-item">Deleniti.</div>
            <div class="sub-menu-item">Porro.</div>
            <div class="sub-menu-item">Culpa!</div>
        </div>
    </div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/WZgvB/btrhNnR3Qd7/zAo6Me3wvKM4LvRWOniom1/img.png](https://blog.kakaocdn.net/dn/WZgvB/btrhNnR3Qd7/zAo6Me3wvKM4LvRWOniom1/img.png)

---

# **< position-absolute >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>absolute, drop down menu</title>
    <style>
        .main-menu {
            display: flex;
            background-color: #333;
            font-size: 16px;
            color: white;
        }
        .main-menu-item {
            padding: 14px;
            position: relative;
        }
        .main-menu-item:hover {
            background-color: red;
        }
        .drop-down-menu {
            display: none;
            position: absolute;
            background-color: white;
            color: black;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            left: 0px;
            top: 50px;
            padding: 14px;
            width: 80px;
        }
        .main-menu-item:hover .drop-down-menu {
            display: block;
        }
    </style>
</head>
<body>
<!-- .main-menu>.main-menu-item*3{Home} -->
<div class="main-menu">
    <div class="main-menu-item">Home</div>
    <div class="main-menu-item">News</div>
    <div class="main-menu-item">
        Dropdown <i class="fas fa-caret-down"></i>
        <!-- .drop-down-menu>.drop-down-menu-item*3{Link $} -->
        <div class="drop-down-menu">
            <div class="drop-down-menu-item">Link 1</div>
            <div class="drop-down-menu-item">Link 2</div>
            <div class="drop-down-menu-item">Link 3</div>
        </div>
    </div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/0jWBs/btrhMdCDpMc/B2xDvahzDjPkrKLzgC5Wj0/img.png](https://blog.kakaocdn.net/dn/0jWBs/btrhMdCDpMc/B2xDvahzDjPkrKLzgC5Wj0/img.png)

---

# **< position-absolute-z-index ⇒사진넣는것>**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>z-index</title>
    <style>
        img{
            position: absolute;
            z-index: -1;
        }
        span{
            position: relative;
            z-index: 999;
            color: white;
            font-size: 24px;
            background-color: black;
        }
    </style>
</head>
<body>
<div><img src="me.jpg" alt="">
    <span>내사진</span>
</div>
</body>
</html>
```

---

# **< position-absolute >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>position absolute</title>
    <style>
        .item {
            border : 2px solid navy;
            font-size: 24px;
            margin-top: 200px;
            width: 500px;
            padding-right: 70px;
            position: relative;
        }
        .close {
            padding: 14px;
            border-radius: 50%;
            background-color: black;
            color: white;
            text-align: center;
            box-sizing: border-box;
            width: 60px;
            height: 60px;
            position: absolute;
            right: 30px;
            top: -30px;
        }
    </style>
</head>
<body>
<!-- .item>lorem10+.close>i.fas.fa-times -->
<div class="item">
    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ex, quasi!
    <div class="close"><i class="fas fa-times"></i></div>
</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/eknkFr/btrhLSyIHpP/XYuDKUV5YOiGM1Go84wHJK/img.png](https://blog.kakaocdn.net/dn/eknkFr/btrhLSyIHpP/XYuDKUV5YOiGM1Go84wHJK/img.png)

x 동그라미를 움직여서, 네모 박스 위에 걸치게 만들기!

우선 x가 박스보다 위에있어야해서, z-index를 사용해야하고,

동그랗게 만들어야하니까 border-radius: 50% 오른쪽에서 멀어져야하니까 right 30px!

아래 네모는 relative하고, 동그라미는 네모에 따라서 움직이게 하기위해서 absolute를 사용~
