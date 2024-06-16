# Html 기초 03 style

# **< style-attribute >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>style attribute</title>
</head>
<body>
<h1 style="color:darkslateblue;">Lorem, ipsum dolor.</h1>
<h1 style="color: magenta;">Lorem, ipsum dolor.</h1>
<h1 style="font-size: 50px;">Lorem, ipsum dolor.</h1>
<h1 style="font-size: 60px;color: orange;">Lorem, ipsum dolor.</h1>

<h1 style="background-color: purple;">Lorem, ipsum dolor.</h1>
<h1 style="background-color: seagreen;color: snow;">Lorem, ipsum dolor.</h1>
<!-- h1>span>lorem3 -->
<h1><span style="background-color: salmon;">Lorem, ipsum dolor.</span></h1>

</body>
</html>
```

![https://blog.kakaocdn.net/dn/bDWChY/btrgV82G00K/9xsQDtBpsBZpY6fb8RkN51/img.png](https://blog.kakaocdn.net/dn/bDWChY/btrgV82G00K/9xsQDtBpsBZpY6fb8RkN51/img.png)

---

# **< style-attribute ⇒스타일 속성>**

```html
<!DOCTYPE html>
<html>
<head>
    <title>style attribute</title>
</head>
<body>
    <!-- h1>lorem3 -->
    <h1>Lorem, ipsum dolor.</h1>
    <h1 style="font-family: D2Coding;">Lorem, ipsum dolor.</h1>
    <h1 style="text-align: center;">Lorem, ipsum dolor.</h1>
    <h1 style="text-align: right;">Lorem, ipsum dolor.</h1>
    <h1 style="text-align: left;">Lorem, ipsum dolor.</h1>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/cI7GwZ/btrgVSlzT5T/VMbKSK8FK4dKdFVpanpe11/img.png](https://blog.kakaocdn.net/dn/cI7GwZ/btrgVSlzT5T/VMbKSK8FK4dKdFVpanpe11/img.png)

---

# **< style-attribute ⇒스타일 속성>**

```html
<!DOCTYPE html>
<html>
<head>
    <title>style attribute</title>
</head>
<body style="background-color: rgb(68, 190, 160);text-align: center;">
<h1>Lorem, ipsum dolor.</h1>
<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi nemo fugit qui ratione, provident optio deleniti voluptatum veritatis placeat soluta velit eum beatae! Minus temporibus soluta, commodi consequuntur dolorum nobis?</p>
<p>Nesciunt dolorum quidem dolorem, reprehenderit nostrum perferendis atque inventore qui iusto sunt culpa quaerat consequatur, consequuntur tempore quae, rerum repudiandae impedit ex provident earum doloribus illum suscipit ullam. Omnis, deserunt.</p>
<p>Eos, laboriosam vitae. Quasi qui suscipit omnis, culpa quo similique repellendus enim, ea maxime exercitationem reiciendis perferendis necessitatibus deserunt rerum earum ipsa odit fugiat incidunt quidem commodi. Quidem, sunt quisquam!</p>

</body>
</html>
```

![https://blog.kakaocdn.net/dn/bc4AtL/btrgRNdMWEP/ggZCDObLpPQ3Fnvc5GSGHK/img.png](https://blog.kakaocdn.net/dn/bc4AtL/btrgRNdMWEP/ggZCDObLpPQ3Fnvc5GSGHK/img.png)

---

# **< color >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>color</title>
</head>
<body>
    <h1>color</h1>
    <p>color name : 140개 명칭</p>
    <p>rgb 함수: red, green, blue 색 혼합</p>
    <p>빛의 3원색 범위 : 0~255</p>

    <p>16진법 : rgb 함수의 16진법 표현</p>

    <hr>
    <h2>color name</h2>
    <!-- p>lorem5 -->
    <p style="color: violet;">Lorem ipsum dolor sit amet.</p>
    <hr>
    <h2>rgb 함수</h2>
    <p style="color: rgb(255, 255, 255);">Lorem ipsum dolor sit amet.</p>
    <p style="color: rgb(0, 0, 0);">Lorem ipsum dolor sit amet.</p>
    <p style="color: rgb(122, 122, 122);">Lorem, ipsum dolor.</p>
    <p style="color: rgb(0, 0, 255);">Lorem ipsum dolor sit amet.</p>
    <p style="color: rgb(255, 0, 0)">Lorem ipsum dolor sit amet.</p>
    <p style="color: rgb(0, 255, 0);">Lorem ipsum dolor sit amet.</p>
    <p style="color: rgb(255, 0, 255);">Lorem ipsum dolor sit amet.</p>
    <p style="color: rgb(91, 98, 160);">Lorem ipsum dolor sit amet.</p>
</body>
</html>
```

---

# < color >

```html
<!DOCTYPE html>
<html>
<head>
    <title>color</title>
</head>
<body>
<h2>16진법 표현</h2>
<p style = "color:rgb(255, 99, 71)">Lorem, ipsum dolor.</p>
<p style="color: #ff6347;">Lorem, ipsum dolor.</p>
<p style="color: #0000ff;">Lorem, ipsum dolor.</p>
<p style="color: #ff0000;">Lorem, ipsum dolor.</p>
<p style="color: #ff00ff;">Lorem, ipsum dolor.</p>

<p style="background-color: #000000;color: #ffffff;">Lorem, ipsum dolor.</p>
<p style="color: #cccccc;">Lorem, ipsum dolor.</p>

<hr>
<p>16진법 표현은 대소문자 구분하지 않음</p>
<p style="color: #Ec2A3F;">Lorem, ipsum dolor.</p>
<p style="color: #ec2a3f;">Lorem, ipsum dolor.</p>
<hr>
<p>같은 글자가 연속되면 하나는 생략 가능</p>
<p style="color: #000000;">Lorem, ipsum dolor.</p>
<p style="color: #000;">Lorem, ipsum dolor.</p>
<p style="color: #ee11cc;">Lorem, ipsum dolor.</p>
<p style="color: #e1c;">Lorem, ipsum dolor.</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bzkNGJ/btrgU138y0M/RxYTwxkBepGlzyW398OVr0/img.png](https://blog.kakaocdn.net/dn/bzkNGJ/btrgU138y0M/RxYTwxkBepGlzyW398OVr0/img.png)

---

# **< block-inline >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>block and inline</title>
</head>
<body>
    <p>요소는 크게 block 요소와 inline요소 구분된다.</p>
    <hr>
    <h1>block</h1>
    <p>가장 넓은 너비를 차지하고 새로운 줄에 배치됨</p>
    <h1 style="background-color: rosybrown;">Lorem, ipsum dolor.</h1>
    <hr>
    <h1>inline</h1>
    <p>가능한 좁은 너비를 차지하고 같은 줄에 배치됨</p>
    <a style="background-color: salmon;" href="">Lorem, ipsum dolor.</a>
    <a style="background-color: skyblue;" href="">Lorem, ipsum dolor.</a>
    <h1 style="background-color: springgreen;">Lorem, ipsum dolor.</h1>

    <hr>
    <h1>block 요소 중 기본 스타일이 없는 요소 div</h1>
    <div style="background-color: tomato;">Lorem, ipsum dolor.</div>
    <div style="background-color: yellow;">Lorem, ipsum dolor.</div>

    <hr>
    <!-- h1*2[style]>lorem3 -->
    <h1 style="background-color: #aaa;">Lorem, ipsum dolor.</h1>
    <h1 style="background-color: blue;">Quis, est eaque.</h1>

    <hr>
    <h1>inline 요소 중 기본 스타일이 없는 요소 span</h1>
    <!-- span*2[style]>lorem1 -->
    <span style="background-color: chocolate;">Lorem.</span><span style="background-color: darkblue;">Autem.</span>
    <hr>
    <!-- a*2[style]>lorem1 -->
    <a href="" style="background-color: blue;">Lorem.</a><a href="" style="background-color:red;">Id!</a>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/TiGgg/btrgVSGnrrI/ySEh6ll1x4ApCsYuIhExzk/img.png](https://blog.kakaocdn.net/dn/TiGgg/btrgVSGnrrI/ySEh6ll1x4ApCsYuIhExzk/img.png)

---

# **< block-inline >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>block and inline</title>
</head>
<body>
    <h1>text-align : center</h1>

    <!-- div[style]>lorem3 -->
    <div style="text-align:center; background-color: gold;">Lorem, ipsum dolor.</div>

    <!-- span[style]>lorem3 -->
    <span style="background-color: grey;text-align: center;">Lorem, ipsum dolor.</span>

    <!-- div>span>lorem3 -->
    <div style="background-color: limegreen; ">
        <span style="background-color: khaki; text-align: center;">Lorem, ipsum dolor.</span>
    </div>

    <!-- div[style]>span[style]>lorem3 -->
    <div style="background-color: limegreen; text-align: center;">
        <span style="background-color: magenta;">Lorem, ipsum dolor.</span>
    </div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/beLagw/btrgVRAIokK/RBNXijmN7IiBUVHNL1dUT1/img.png](https://blog.kakaocdn.net/dn/beLagw/btrgVRAIokK/RBNXijmN7IiBUVHNL1dUT1/img.png)

---

# **< css맛보기 >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>css</title>
    <style>
        h1 {
            text-align: center;
        }
        p {
            color: maroon;
        }
        h1:last-of-type {
            font-size: 100px;
        }
    </style>
</head>
<body>
    <!-- (h1>lorem2^p>lorem)*3 -->
    <h1 style="color: magenta;">Lorem, ipsum.</h1>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Rerum cum itaque nostrum qui blanditiis voluptatum assumenda. Sit rerum explicabo ipsum ullam odio excepturi, cumque laudantium distinctio temporibus, aliquid ducimus quia!</p>
    <h1 style="color: magenta;">Ex, sapiente?</h1>
    <p>Eaque repudiandae mollitia labore in quibusdam fugit quo excepturi commodi nam, facere eius enim. Repellat exercitationem facilis quae saepe consequuntur magni? Aspernatur iure assumenda aliquid quae nisi. Quia, nam officiis.</p>
    <h1 style="color: magenta;">Fuga, placeat.</h1>
    <p>Iste totam quasi perspiciatis repellendus dolore dolorem, delectus hic unde nemo accusamus veniam fugit aliquam tempore deleniti rerum tempora quos iure rem libero et? Temporibus ullam dolorem vitae reiciendis ut.</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/mgP6B/btrgRMsXuln/G6LoWu7z1dqBFvdvPJkcn0/img.png](https://blog.kakaocdn.net/dn/mgP6B/btrgRMsXuln/G6LoWu7z1dqBFvdvPJkcn0/img.png)
