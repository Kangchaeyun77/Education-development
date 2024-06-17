# javascript 01

# var과 let의 차이

```jsx
JavaScript에서 let과 var는 변수를 선언하는 키워드입니다. 
이 두 키워드 간에는 몇 가지 중요한 차이가 있습니다.
1. **Scope(유효 범위):**
    - `var`로 선언된 변수는 함수 스코프를 갖습니다. 
    즉, 해당 변수는 선언된 함수 내에서만 유효합니다.
    - `let`으로 선언된 변수는 블록 스코프를 갖습니다. 
    즉, 해당 변수는 선언된 블록({}) 내에서만 유효합니다.
    
    1. **Hoisting(끌어올리기):**
    - `var`로 선언된 변수는 호이스팅 됩니다. 
    이는 변수가 선언되기 전에도 참조될 수 있음을 의미합니다. 
    하지만 값은 undefined로 초기화됩니다.
    - `let`은 블록 스코프를 가지므로 호이스팅되지만, 
    선언 전에 접근하면 ReferenceError가 발생합니다.
    
    1. **재선언:**
    - `var`로 선언된 변수는 동일한 이름으로 여러 번 선언할 수 있습니다. 
    이 경우 이전 값은 덮어쓰입니다.
    - `let`은 동일한 이름의 변수를 블록 내에서 다시 선언할 수 없습니다. 
    하지만 다른 스코프에서는 가능합니다.
    
    1. **전역 객체와 연결:**
    - `var`로 선언된 변수는 전역 객체(window 객체에서 브라우저에서의 경우)와 연결됩니다.
     이는 전역 변수를 선언할 때 유용하지만, 예기치 않은 결과를 초래할 수 있습니다.
    - `let`으로 선언된 변수는 전역 객체와 연결되지 않습니다
    
    대부분의 경우에는 let을 사용하는 것이 더 안전하고
    예측 가능한 코드를 작성하는 데 도움이 됩니다. 
    특히 블록 스코프와 재선언의 방지는 코드의 가독성과 유지 관리성을 향상시킵니다.
```

# **< js >**

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>javascript</title>
    <style>
    </style>
</head>
<body>
    <div id="icon"><i class="far fa-heart"></i></div>
<!-- 자바스크립트는 script 요소 안에 작성 --><script>
    document.querySelector("#icon i").onclick=function(){
// this.classList.remove("far");// this.classList.add("fas");this.classList.toggle("far");
        this.classList.toggle("fas");
    }
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/tHnqB/btriiuv0pJu/xNt14F9VPZrDjJY5aNhWb0/img.png](https://blog.kakaocdn.net/dn/tHnqB/btriiuv0pJu/xNt14F9VPZrDjJY5aNhWb0/img.png)

![https://blog.kakaocdn.net/dn/EVqL5/btrihLkj6y6/rqXct3gsWhdCiMUMiCXnk1/img.png](https://blog.kakaocdn.net/dn/EVqL5/btrihLkj6y6/rqXct3gsWhdCiMUMiCXnk1/img.png)

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>javascript</title>
    <style>
    </style>
</head>
<body>
<button><i style="font-size: 50px;"; class="far fa-thumbs-up"></i><span>0</span></button>
<script>
    document.querySelector("i").onclick=function(){
        let cnt = document.querySelector("span").innerHTML;
        cnt=parseInt(cnt)+1;
        document.querySelector("span").innerHTML=cnt;
    }
</script>

</body>
</html>
```

![https://blog.kakaocdn.net/dn/bermqs/btrihbjmnhA/2CEIwyhzcv3R3S3gk3Rfk1/img.png](https://blog.kakaocdn.net/dn/bermqs/btrihbjmnhA/2CEIwyhzcv3R3S3gk3Rfk1/img.png)

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
/* display: none; */position: absolute;
            background-color: white;
            color: black;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            left: 0px;
            top: 50px;
            padding: 14px;
            width: 80px;
        }
        .d-none{
            display: none;
        }
/* .main-menu-item:hover .drop-down-menu {
            display: block;
        } */
    </style>
</head>
<body>
<!-- .main-menu>.main-menu-item*3{Home} --><div class="main-menu">
    <div class="main-menu-item">Home</div>
    <div class="main-menu-item">News</div>
    <div id="menu1" class="main-menu-item">
        Dropdown <i class="fas fa-caret-down"></i>
<!-- .drop-down-menu>.drop-down-menu-item*3{Link $} --><div class="drop-down-menu d-none">
            <div class="drop-down-menu-item">Link 1</div>
            <div class="drop-down-menu-item">Link 2</div>
            <div class="drop-down-menu-item">Link 3</div>
        </div>
    </div>
</div>
<h1>Lorem, ipsum dolor.</h1>

<script>
    document.querySelector("#menu1").onclick=function(){
        document.querySelector("#menu1 .drop-down-menu").classList.toggle("d-none");
    }
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/yAAoj/btrigIaHSzx/mySd9B94bu9BDWJ1pjuwfK/img.png](https://blog.kakaocdn.net/dn/yAAoj/btrigIaHSzx/mySd9B94bu9BDWJ1pjuwfK/img.png)

```html
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>position absolute</title>
    <style>
/*왜 right를 써야하는지 모르겠네*/.item {
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
<!-- .item>lorem10+.close>i.fas.fa-times --><div class="item">
    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ex, quasi!
    <div class="close"><i class="fas fa-times"></i></div>
</div>
<script>
    document.querySelector(".close").addEventListener("click",function(){
        document.querySelector(".item").remove();
    })
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bg24et/btriiAQnyjh/FUCKKI1E1UqrVCfv7wygZK/img.png](https://blog.kakaocdn.net/dn/bg24et/btriiAQnyjh/FUCKKI1E1UqrVCfv7wygZK/img.png)

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
<input type="text" id="input1">
<h1 id="head1"></h1>
<script>
document.getElementById("input1").onkeyup=function(){
    document.getElementById("head1").innerHTML=this.value;
}
</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/LqlSu/btrijqmAMvY/D3MwdEKub5II6oDV05hNb0/img.png](https://blog.kakaocdn.net/dn/LqlSu/btrijqmAMvY/D3MwdEKub5II6oDV05hNb0/img.png)
