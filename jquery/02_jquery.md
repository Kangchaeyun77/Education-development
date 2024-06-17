# JQuery 02

# **< this >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("h1").click(function(){
                console.log("h1 클릭됨");
                // this:이벤트가 발생된 element object(dom)
                console.log(this.innerHTML);
            })
        });
    </script>
</head>
<body>
<!-- h1*5lorem1 -->
<h1>
    Lorem.
</h1>
<h1>
    Aspernatur.
</h1>
<h1>
    Dignissimos?
</h1>
<h1>
    Alias.
</h1>
<h1>
    Ab!
</h1>

<script>

</script>
</body>
</html>
```

함수안에서 this 를 사용할 수 있는데, 이 것은 클릭 된, 돔에 잇는 엘레멘트 객체를 가르킨다.

(여기에서는 클릭이벤트가 발생된 엘레멘트를 말하는 듯)

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title>this</title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("input").keyup(function () {
                // 코드 작성
                let val = this.value;

                document.querySelector("#result").innerHTML = val;
            })
        });
    </script>
</head>
<body>
    <!-- (input+br)*3+h1#result -->
    <input type="text">
    <br>
    <input type="text">
    <br>
    <input type="text">
    <br>
    <h1 id="result"></h1>
<script>

</script>
</body>
</html>
```

---

# **< effect-hide >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            // $("h1").hide();
            $("h1").click(function(){
                $(this).hide();
            })
        });
    </script>
</head>
<body>
<!-- h1*5>lorem1 -->
<h1>
    Lorem.
</h1>
<h1>
    Dolor.
</h1>
<h1>
    Laboriosam?
</h1>
<h1>
    Nam.
</h1>
<h1>
    Hic.
</h1>
<script>

</script>
</body>
</html>
```

돔에 존재하기는 하지만, 우선 보이지는 않게하는 방법!

이제는 클릭했을 때, 그 요소가 하나씩 사라지게 해봅시다.

this가 이벤트를 받은 아이이기 때문에, 이벤트 받은 애를 jquery 객체를 만들엇으니. 선택된 객체가 사라진다 (?)

페이지 검사 창에서 요소에서 클릭 했을 대, display : none;으로 확인 가능했다.

---

# **< effect-hide >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("p").click(function(){
                $(this).hide();
            })
        });
    </script>
</head>
<body>
<!-- p*5>lorem -->
<p>
    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Consequatur, consectetur ullam repellat debitis, cum alias quos perferendis eum earum, est eius ut dolorem nemo corporis perspiciatis harum minus illo velit?
</p>
<p>
    Deserunt vero voluptates cumque natus tempore dolorem rerum fugiat consequatur, iure nostrum possimus quasi asperiores vitae commodi laboriosam sapiente ullam, aliquid culpa reprehenderit quas inventore voluptas soluta laudantium quisquam. Consequuntur.
</p>
<p>
    Vero laudantium ab corrupti quis maxime vitae, iste necessitatibus fugit ad ullam aliquam similique architecto molestias debitis expedita earum voluptatum dolores sit possimus, nemo, aspernatur eius praesentium! Quae, ipsa pariatur.
</p>
<p>
    At, ad iure modi vero, temporibus officiis adipisci reiciendis aperiam et laboriosam debitis totam odio quae autem nulla eos animi voluptatem distinctio laborum, porro accusantium ab tempora. Asperiores, illo id.
</p>
<p>
    Eum officiis, pariatur, harum voluptates omnis repellendus ad, id porro vel deserunt ut ipsa quo provident aut quam incidunt maiores quae hic quibusdam aspernatur facilis doloremque. Iure modi adipisci eligendi.
</p>
<script>

</script>
</body>
</html>
```

선생님이 원하는대로 답 도출할 수 있도록 코드 완성하기. -> 이건 너무 똑같아서 잘 했음 굳~

---

# **< effect-show >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            $("h1").hide();
            $("#btn1").click(function(){
                $("h1").show();
                    })
            $("#btn2").click(function(){
                $("h1").hide();
            })
        });
    </script>
</head>
<body>
    <!-- button{show} -->
    <button id="btn1">show</button>

    <!-- button{hide} -->
    <button id="btn2">hide</button>

    <!-- h1*5>lorem1 -->
<h1>
    Lorem.
</h1>
<h1>
    Nostrum.
</h1>
<h1>
    Alias.
</h1>
<h1>
    Unde.
</h1>
<h1>
    Quia.
</h1>
<script>

</script>
</body>
</html>
```

처음에 show라는 이벤트를 발생시켜 보기 전에는 지금 lorem 5개가 이미 페이지에 존재하고 있음.

두개의 함수를 실행하기위해 간단하게 두개의 버튼을 만든 후, id를 줘서 그 id를 가져와서 클릭하게 하면 된다.

---

# **< effect-show >**

```jsx
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../icon/css/all.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <title></title>
    <style>

    </style>
    <script>
        $(document).ready(function() {
            // 코드 작성
        $("#button1").click(function(){
            $("p").hide();
        });
        $("#button2").click(function(){
            $("p").show();
        })
        });
    </script>
</head>
<body>
<!-- button#button1{hide}+button#button2{show}+p*5>lorem -->
<button id="button1">hide</button>
<button id="button2">show</button>
<p>
    Lorem ipsum dolor sit amet consectetur adipisicing elit. Inventore dolore necessitatibus dolorem assumenda facere facilis corporis quo. Voluptatum dicta ullam debitis officia sunt aut nesciunt sint eos quidem, molestiae quod!
</p>
<p>
    Quos ullam porro numquam veniam dolore id aperiam voluptas nihil at nisi! Tempora repudiandae impedit ea, omnis minima commodi, quisquam illo, dolores magnam voluptate accusamus aut autem dolor repellat corrupti!
</p>
<p>
    Beatae consequuntur assumenda commodi velit dolorum atque at ea architecto reiciendis, officia enim quia modi dolor culpa esse. Quidem a aut voluptatibus iusto tenetur quia inventore dolor laborum architecto sunt!
</p>
<p>
    Dignissimos quo aliquam temporibus saepe ducimus corrupti sunt. Optio commodi illo numquam accusamus iure, maiores nulla labore est quasi itaque consequuntur quae minima saepe libero laboriosam quo similique nobis dolores!
</p>
<p>
    Repellendus voluptatum doloremque, quasi provident pariatur voluptate. Eligendi repudiandae laudantium minus officia modi minima dolorum aliquid, reiciendis impedit architecto numquam quia! Ipsa totam ratione sit debitis cupiditate similique deserunt architecto!
</p>
<script>

</script>
</body>
</html>

dhsmf dlfrl
Rmx
```
