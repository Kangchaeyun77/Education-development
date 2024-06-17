# JQuery 01

# **JQuery 다운받기**

[https://jquery.com/](https://jquery.com/)

사이트 방문해서, download jquery버튼 누르기

![https://blog.kakaocdn.net/dn/bxzzJ3/btruWQgAMLu/eVEgPTj2lgaMGh6GepzfeK/img.png](https://blog.kakaocdn.net/dn/bxzzJ3/btruWQgAMLu/eVEgPTj2lgaMGh6GepzfeK/img.png)

![https://blog.kakaocdn.net/dn/bC1BQw/btruWjKKMsA/pMvNsBRIYtGSluQOpW9pO1/img.png](https://blog.kakaocdn.net/dn/bC1BQw/btruWjKKMsA/pMvNsBRIYtGSluQOpW9pO1/img.png)

```jsx
직접 다운로드 받아서 쓸 수 있는데, 아래로 스크롤해서
온라인에서 바로 사용할 수 있게 한 것을 다운로드 받자
```

![https://blog.kakaocdn.net/dn/zuovC/btru3LL29cq/ZZm9Gn4weaSTAqGKuOoEq1/img.png](https://blog.kakaocdn.net/dn/zuovC/btru3LL29cq/ZZm9Gn4weaSTAqGKuOoEq1/img.png)

```jsx
이걸 드래그 해서 새로운 탭에 붙여넣기 후 엔터!
그 위에꺼는, min으로 파일을 간단하게 줄여놓은건데, 우리는 위에 파일 min을 사용하기로 했다.
min.js 옆에 </> 버튼눌러서 copy 하나음에 01jquery에 복사해서 붙여넣기 하자
+) user snippets -> html.json 선택하고, 추가할 코드들 적기
"안에 "넣으려면 역 슬레시 (\) 넣어야 하는 것 까먹지 말지~
```

![https://blog.kakaocdn.net/dn/chih2L/btruNjxpIU5/y74grZQLr2tTdAJFjoOky0/img.png](https://blog.kakaocdn.net/dn/chih2L/btruNjxpIU5/y74grZQLr2tTdAJFjoOky0/img.png)

# **< jquery 기본 코드>**

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
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script>

</script>
</body>
</html>
```

```xml
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <title>jquery2</title>
    <style>

    </style>
</head>
<body>
    <!-- h1#head1>lorem1 -->
    <h1 id="head1">
        Lorem.
    </h1>

    <!-- h1#head2>lorem1 -->
    <h1 id="head2">
        Lorem.
    </h1>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script>
//jquery 함수 이름 $
// 파라미터 css selector(string)을 받는다
// 리턴 jquery 개체
let elem = $("#head1");
elem.html("hello jquery");
elem.css("color","blue");

let elem2 = document.querySelector("#head2");
elem2.innerHTML = "hello jquery";
elem2.style.color="blue";

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bh2Set/btruNi6kPOG/iNvXVpy1Kttf0AhoKo68lK/img.png](https://blog.kakaocdn.net/dn/bh2Set/btruNi6kPOG/iNvXVpy1Kttf0AhoKo68lK/img.png)

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

    <h1 id="head1">
        Lorem.
    </h1>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script>
console.log(document.querySelector("#head1"));
console.log($("#head1").html());
</script>
</body>
</html>
```

```jsx
스크립트 코드 작성할 때, element가 완성되기 이전에 그 element를 가져오는 코드를 실행하면 안된다.
```

= 스크립트에서 사용하고 싶은 코드는 항상 스크립트 이전에 위치해야 한다 -> 

스크립트 코드가 아래에 있단 말인데,

이럴 때는 유지보수 하기가 불편하다는 의견이 많았다.

+위에 작성하려면 어떻게 해야 하는가? 아래에서 실험해보자.

# **< js-onload>**

```jsx
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <title></title>
    <style>

    </style>
    <script>
        window.addEventListener("load", function () {
            console.log("로딩 완료");

            let elem = document.querySelector("#head1");
            console.log("로딩후", elem.innerHTML);
        });
    </script>
</head>

<body>
    <!-- h1#head1>lorem1 -->
    <h1 id="head1">
        Lorem.
    </h1>
    <!--
        <script>
            console.log(document.querySelector("#head1").innerHTML);
            // document.querySelector("#head1").addEventListener("click", function (params) {
                // });
            </script>
    -->
</body>

</html>
```

```jsx
스크립트가 아래있으면 , 아무 문제 없이 코드 사용이 가능한데, 
addeventlistner로 어떤 이벤트 발생하면, 적절한 함수가 실행되게 할 수 있었다. 
우리는 click할 때 생기게 할거고, 우리는 window라는 객체를 사용해보자
브라우저 창에 load되었을 때, 함수가 실행되게 할 수 있다.

**코드스닙펫 위로 옮기기.**
```

# **< jquery-ready >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title>jquery ready</title>
    <style>

    </style>

    <script>
        $(document).ready(function () {
            console.log(document.querySelector("#head1").innerHTML);
        });
    </script>
</head>
<body>
    <!-- h1#head1>lorem1 -->
    <h1 id="head1">
        Lorem.
    </h1>

<script>
    $("#head1").click(function () {
        console.log("제목 클릭됨");
    });
</script>
</body>
</html>
```

위에 script 코드는 문서가 준비되었을 때, 함수가 실행되게 한다.

여기서 자바스크립트 코드 작성해서 확인해보자.

돔에있는 id가 head1인 element가 click 되었을을 때, 함수를 실천해주는 아래부분,

그래서 우리들의 script 코드들은 , document가 ready 될 때 에 맞춰서 들어가게 살거여서, 이제 앞으로는

![https://blog.kakaocdn.net/dn/bX0hUj/btru5qOvdoj/KRVEyzzg3iaPsf0MGnDGw0/img.png](https://blog.kakaocdn.net/dn/bX0hUj/btru5qOvdoj/KRVEyzzg3iaPsf0MGnDGw0/img.png)

위의 박스에 사용하고 싶은 코드를 넣을 것이다.

[https://api.jquery.com/category/events/](https://api.jquery.com/category/events/)

[Events | jQuery API Documentation
Attach a handler to an event for the elements. Bind an event handler to the “blur” JavaScript event, or trigger that event on an element. Bind an event handler to the “change” JavaScript event, or trigger that event on an element. Bind an event han
api.jquery.com](https://api.jquery.com/category/events/)

jquery 사이트에가서, api documentation가면, 어떤 기능이 있는지 확인가능하기 때문에,

내가 원하는 기능이 있나 살펴보기 좋다

---

# **<event-click >**

```lua
      $(document).ready(function() {
            $("h1").click(function(){
                console.log("h1 클릭됨");
            });

            /* 아래의 식을, jquery와 같이 간추려서 사용하면 위에 3줄로 나타나게 된다.

            let heads= document.querySelectorAll("h1");
            for(let i = 0;i<heads.length; i++){

                heads[i].addEventListener("click",function(){
                    console.log("h1 클릭됨.vanilla js")
                })
            }
            */
        });
```

```jsx
쿼리 셀렉터는 element중 첫번째만 가져온거고, 
all은 전체를 가져와서 배열처럼 사용이 가능하다.
그냥 자바스크립트 코드는 바닐라 js라고도 하는데, 그 basic한 느낌으로 붙인 이름이라고 한다.
```

# **< event-dbclick >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("#head1").dblclick(function(){
                console.log("1번 제목 클릭됨");
            });
            $("#head2").dblclick(function(){
                console.log("2번 제목 클릭됨");
            });
            $("#head3").dblclick(function(){
                console.log("3번 제목 클릭됨");
            });
        });
    </script>
</head>
<body>
    <!-- h1#head$*3>lorem1 -->
    <h1 id="head1">
        Lorem.
    </h1>
    <h1 id="head2">
        Officia!
    </h1>
    <h1 id="head3">
        Expedita.
    </h1>
<script>

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/qNhol/btrv2FyquYs/qfzgQCBaAa8wiROkQ29esk/img.png](https://blog.kakaocdn.net/dn/qNhol/btrv2FyquYs/qfzgQCBaAa8wiROkQ29esk/img.png)

# **< event-mouseenter >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title> </title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("h1").mouseenter(function(){
                console.log("마우스 들어옴");
            });
        });
    </script>
</head>
<body>
<!-- h1*3>lorem1 -->
<h1>
    Lorem.
</h1>
<h1>
    Itaque.
</h1>
<h1>
    Qui.
</h1>
<script>

</script>
</body>
</html>
```

```jsx
마우스 엔터같은 경우에는, 정해진 위치에 마우스 커서가 들어갔을 때,
마우스가 들어왔다는걸 보여줌.
그리고 자바스크립트에서는 ;가 필수이지 않기 때문에 생략이 가능하다.
그래서 마우스 들어옴 로그 출력 이후에  ; 가 빠져있어도 정상적이게 코드가
출력되는 것임.
```

![https://blog.kakaocdn.net/dn/dmRaBH/btrvZ3UihtH/O8t8yHr9IxeOho48Cj8fg0/img.png](https://blog.kakaocdn.net/dn/dmRaBH/btrvZ3UihtH/O8t8yHr9IxeOho48Cj8fg0/img.png)

`+) 기본적으로 쓰는 언어 + 컨벤션 치면 그 규칙이 정해진 것들이 나온다는 팁`

# **< event-mouseleave >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("h1").mouseleave(function(){
                console.log("마우스 떠남");
            });
        });
    </script>
</head>
<body>
<!-- h1>lorem1 -->
<h1>
    Lorem.
</h1>
<script>

</script>
</body>
</html>
```

```jsx
일반적인 자바로 썻으면 addeventlistner + leave 해가지고 가지고 왔어야 하는데,
그렇지 아니하고 자바 스크립트로 간단하게 표현할 수 있으니,
그거 자체로 자바스크립트의 충분한 장점이 되지 않을 까 생각한다.
```

![https://blog.kakaocdn.net/dn/bLER91/btrv0OWWvHe/gyj7GS38WK1KCNEUwcLjKk/img.png](https://blog.kakaocdn.net/dn/bLER91/btrv0OWWvHe/gyj7GS38WK1KCNEUwcLjKk/img.png)

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("h1").hover(function(){
                //mouseenter
                console.log("마우스 들어옴");
            }, function(){
                //moseleave
                console.log("마우스 떠남");
            })
        });
    </script>
</head>
<body>
<h1>
    lorem.
</h1>
<script>

</script>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/lbb1z/btrv0PVPUAN/dX4YrZrSRkR2U8JukdReO1/img.png](https://blog.kakaocdn.net/dn/lbb1z/btrv0PVPUAN/dX4YrZrSRkR2U8JukdReO1/img.png)

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            //#input1 요소에 keyup 이벤트 발생시
            //console에 "키업이벤트발생" 메세지 출력
            $("#input1").keyup(function(){
                console.log("키업이벤트발생");
            })
        });
    </script>
</head>
<body>
<!-- input#input1 -->
<input type="text" id="input1">
<script>

</script>
</body>
</html>
```

# **< event-on >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("h1").on("click",function(){
                console.log("h1 클릭됨");
            });
            $("h1").on("mouseenter",function(){
                console.log("h1 마우스 들어감");
            });
            $("h1").on("mouseleave",function(){
                console.log("h1마우스 떠남");
            });
        });
    </script>
</head>
<body>
<h1>
    Lorem.
</h1>
<script>

</script>
</body>
</html>
```

이벤트 명이랑 함수 명이랑 이어서 쓰면된다.

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("h1").on({
                click:function(){
                    console.log("h1 클릭됨");
                },
                mouseenter:function(){
                    console.log("h1 마우스 들어감");
                },
                mouseleave : function () {
                    console.log("h1 마우스 떠남 ");
                }
            });
        });
    </script>
</head>
<body>
<h1>
    Lorem.
</h1>
<script>

</script>
</body>
</html>
```

13번과 같이 h1을 요소로 놓고, 쭉 나열하는 것이 아닌 하나를 객체 취급할 수 있다는 것

식 써보니까 **,**가 엄청 중요할 것 같다.

이벤트가 발생되었을 때 실행되는 함수 : 이벤트 핸들러, 이벤트 리스너

![https://blog.kakaocdn.net/dn/bOfJQ1/btrv121Mf4D/3JEE2XYalENbuKlpgLAtXk/img.png](https://blog.kakaocdn.net/dn/bOfJQ1/btrv121Mf4D/3JEE2XYalENbuKlpgLAtXk/img.png)

- [ ]  [ ]부분 같은경우는 생략이 가능하다는 표시!

# **< event-on >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            // #input1 요소에
            // select 이벤트 발생시 console에 "셀렉트 이벤트 발생" 출력
            // keyup 이벤트 발생시 console에 "키업 이벤트 발생" 출력
            // --- on 메소드 활용
            $("#input1").on({
                select:function(){
                    console.log("셀렉트 이벤트 발생");
                },
                keyup:function(){
                    console.log("키업 이벤트 발생");
                }
            });
        });
    </script>
</head>
<body>
    <!-- input#input1 -->
    <input type="text" id="input1">

<script>

</script>
</body>
</html>
```

선생님이 주석에다가 예제 내주고 문제풀기

![https://blog.kakaocdn.net/dn/cecRwd/btrvZ3UoFX5/5htZMoAoI64iI4rA08piY1/img.png](https://blog.kakaocdn.net/dn/cecRwd/btrvZ3UoFX5/5htZMoAoI64iI4rA08piY1/img.png)

출력 잘되는거 확인
