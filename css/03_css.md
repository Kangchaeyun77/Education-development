# css 03

# **< pseudo-class >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>pseudo class</title>
    <style>
        #link2:link {
            color: yellow;
        }
        #link1:link {
            color: yellow;
        }
        #link2:visited {
            color: skyblue;
        }
        #link2:active {
            color: black;
        }
        #link2:hover {
            color: darkblue;
            background-color: darkgrey;
        }
    </style>
</head>
<body>
    <a id="link1" href="https://www.daum.net">다음</a>
    <a id="link2" href="https://www.duck.com">덕덕고</a>
</body>
</html>
```

---

# **< pseudo-class >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>hover</title>
    <style>
        div {
            box-sizing: border-box;
            background-color: ivory;
            width: 200px;
            height: 100px;
            margin: 10px;
            text-align: center;
        }
        div:hover {
            border: 5px solid yellow;
            background-color: black;
            color: white;
        }
        div:active {
            border: 5px solid red;
        }
    </style>
</head>
<body>
<!-- div*6>lorem1 --><div>Lorem.</div>
    <div>Pariatur.</div>
    <div>Dolorem.</div>
    <div>Assumenda!</div>
    <div>Ratione?</div>
    <div>Corrupti!</div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bYrrpb/btrg8Y7HjaZ/gXHQO4OH9h5u07dhVGxp0K/img.png](https://blog.kakaocdn.net/dn/bYrrpb/btrg8Y7HjaZ/gXHQO4OH9h5u07dhVGxp0K/img.png)

---

# **< selector-child >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>child selector</title>
    <style>
        p {
            color: blue;
        }

        div > p {/* p 요소 중 div 요소의 자식만 */text-decoration: underline;
        }

        body > p {
            font-size: 32px;
        }

        #div1>p {
            text-decoration: line-through;
        }
    </style>
</head>
<body>
<!-- #div$*2>p>lorem --><div id="div1">
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Doloremque id eum eveniet, impedit ducimus aliquam temporibus quas omnis eos accusamus dignissimos nulla hic explicabo aut optio laudantium dolore. Maxime, earum?</p>
    </div>
    <div id="div2">
        <p>Dolorum unde debitis modi esse inventore neque quisquam, a deserunt ipsam error, aspernatur nobis perferendis fugit at officia soluta eius est ullam. Veritatis, atque minima illo voluptate veniam corporis nobis.</p>
    </div>

<!-- p*2>lorem --><p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quo, culpa doloremque. Deserunt vero ipsum, ad est, sunt, rem temporibus quo nam reprehenderit voluptates sed laudantium eum! Qui recusandae deleniti molestias!</p>
    <p>Placeat assumenda suscipit tempore ipsum nisi molestiae minima porro qui voluptatum ullam non molestias asperiores sed debitis iusto ad voluptates pariatur illum fugit harum fugiat in, aliquam earum nostrum. Placeat!</p>
</body>
</html>
```

평소에, body쪽을 채우던 식에서 ">"를 활용하는 방법

---

# **< selector-child >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>child selector</title>
    <style>
        p {
            display: none;
        }
        div:hover > p {
            display: block;
        }
    </style>
</head>
<body>
<!-- div*3>lorem1+p>lorem --><div>
        Lorem.
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Similique voluptatibus rem quis nisi maiores velit iste officiis eveniet delectus natus? Fugiat cumque consectetur aperiam facere alias reprehenderit veritatis voluptatibus cum.</p>
    </div>
    <div>
        Eos!
        <p>Ut, illum ad doloribus in velit fuga, illo minima rerum hic nisi at? Numquam maiores autem quibusdam repudiandae pariatur, neque praesentium optio reiciendis corrupti. Aliquam excepturi facilis aut libero. Consequuntur?</p>
    </div>
    <div>
        Quam?
        <p>Animi, similique, praesentium, esse saepe possimus a expedita unde ipsum beatae sapiente aliquam! Sequi sed obcaecati quae architecto voluptatum temporibus exercitationem neque deleniti eaque incidunt corrupti, consequatur facere vero ea.</p>
    </div>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/2GCGc/btrhdvC4jRq/QuhbsfoyzfTTxPzBWKXqGk/img.png](https://blog.kakaocdn.net/dn/2GCGc/btrhdvC4jRq/QuhbsfoyzfTTxPzBWKXqGk/img.png)

eos!에 마우스 커서를 가져다 대면, 숨어있던 글이 나오는 것!

display는 none으로 해서, 보이지않게 해놓고 block으로보이게하는데,

block으로 넣는게 약간 익숙치가 않아서 조금 어색하다~

---

# **< selector-descendant >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>descendant selector</title>
    <style>
        div p {/* p 요소중 div를 조상으로 두고 있는 것들 *//* div의 자손인 p 들 */color: blue;
        }

        body p {
            text-decoration: underline;
        }

        body > p {
            font-size: 32px;
        }
    </style>
</head>
<body>
<!-- div*2>p>lorem^^p*2>lorem --><div>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aspernatur tenetur minus, accusantium, dolores tempore excepturi sit, aperiam nobis itaque ab placeat iusto dolor! Et, voluptate! Vero neque omnis minima repudiandae?</p>
</div>
<div>
    <p>Modi, ea ad fuga iusto itaque omnis illum nostrum totam commodi aspernatur velit architecto. Voluptate nostrum earum repudiandae veritatis, omnis consequatur tenetur repellat autem illo iure sit dolorem numquam ex!</p>
</div>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem, ab reiciendis. Eveniet reiciendis in porro tempora, sequi delectus enim quod voluptate, possimus, id aliquid voluptatum vitae deleniti. Maxime, vitae magni!</p>
<p>Quasi iure provident maxime explicabo, sint exercitationem aliquid, quia repellat vel vero obcaecati sed facere nemo qui, cupiditate ducimus. Quas, dicta? Ullam ea enim numquam cupiditate repellendus dolores unde nihil!</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bvK2O1/btrg9jYuY8H/LH1wJ61Rm09wgyKM7sv9k0/img.png](https://blog.kakaocdn.net/dn/bvK2O1/btrg9jYuY8H/LH1wJ61Rm09wgyKM7sv9k0/img.png)

---

# **<selector-adjacent-sibling >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>인접한 형제 선택자</title>
    <style>
        #div1 + p {/* p 중 #div1 바로 다음 형제들 */color: blue;
        }
        #div2 + p {
            color: red;
        }
        div + p {
            font-size: 32px;
        }
    </style>
</head>
<body>
<!-- (#div$>lorem1^p*3>lorem)*2 --><div id="div1">Lorem.</div>
<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quaerat cumque deserunt necessitatibus voluptates labore nemo. Exercitationem officia ducimus ipsam veniam cupiditate consequuntur porro consequatur esse culpa? Necessitatibus facere explicabo asperiores?</p>
<p>Assumenda sapiente saepe consequuntur debitis sint fugiat enim corrupti voluptas eligendi commodi voluptatibus quas magni unde, atque necessitatibus explicabo suscipit excepturi aut, facilis accusamus incidunt cumque perspiciatis! Quia, placeat culpa.</p>
<p>Eligendi consequatur molestias odit commodi cumque temporibus maxime dolorum ratione, ullam perspiciatis dolore? Unde, eum. Dicta molestias ex tempora sapiente est sit, aut totam recusandae placeat fuga et atque ullam.</p>
<div id="div2">Cum!</div>
<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Labore consequuntur tempora aliquam, iure rem natus facere deleniti ad quasi molestiae dolore enim praesentium corrupti! Odio iure tempora explicabo vero dolorem?</p>
<p>Aperiam nam harum sequi soluta dicta cum cumque, minus adipisci eveniet, pariatur repellat aut asperiores unde impedit, ipsum iusto incidunt odit excepturi doloribus laudantium necessitatibus ad corrupti quo! Facere, debitis.</p>
<p>Rem, veniam totam, doloremque aut harum sed rerum debitis nemo recusandae eius eaque error officia in tempore quo consequatur sint vel assumenda dolore repellat atque nisi est voluptates accusantium! Cupiditate.</p>
</body>
</html>
```

스페이스바랑 >를 구분 잘해야되는거 헷갈리지말기

---

# **< selector-adjacent-sibling >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>인접한 형제 선택자</title>
    <style>
        p {
            display: none;
        }
        div:hover + p {
            display: block;
        }
    </style>
</head>
<body>
<!-- (div>lorem1^p>lorem)*5 --><div>Lorem.</div>
<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta deserunt earum suscipit pariatur doloribus enim accusamus dolor iste veritatis assumenda autem cumque, impedit quis repellat reiciendis officia fuga? Atque, culpa.</p>
<div>Similique.</div>
<p>Explicabo soluta id enim nam officiis dolore magni? Laudantium magnam distinctio consequuntur, error eius nisi accusamus molestias, soluta, odio natus delectus. Nemo, dolorum harum sapiente in delectus qui sequi eaque!</p>
<div>Vitae!</div>
<p>At ducimus ut dolores enim a illum unde, earum, mollitia sed sunt nisi facere consequuntur minus, praesentium cupiditate. Illum, culpa? Consectetur eos porro exercitationem rerum provident! Nostrum exercitationem illo architecto.</p>
<div>Quisquam?</div>
<p>Ducimus eius aliquid officiis magnam in, doloribus adipisci recusandae natus quasi facere, similique quidem. Quaerat magnam et dolore fugit voluptas deleniti. Facilis doloremque dolore nesciunt dolor hic expedita vero repellat.</p>
<div>Quo!</div>
<p>Cum dignissimos, sit aut mollitia expedita excepturi quaerat aliquam voluptate saepe hic repudiandae deleniti quos culpa laborum, necessitatibus blanditiis corporis amet in ex dolorum ad dolorem accusantium asperiores eligendi. Cupiditate!</p>
</body>
</html>
```

---

# **< html-list-ordered >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>ordered list</title>
    <style>
        #list1 {
            list-style-type: upper-alpha;
        }
        #list2 {
            list-style-type: upper-roman;
        }
        #list3 {
            list-style-type: hiragana;
        }
        #list4 {
            list-style-type: lower-roman;
        }
        #list5 {
            list-style-type: korean-hangul-formal;
        }
        #list6 {
            list-style-type: korean-hanja-formal;
        }
        #list7 {
            list-style-type: korean-hanja-informal;
        }
        #list8 {
            list-style-type: cjk-ideographic;
        }
        #list9 {
            list-style-type: cjk-earthly-branch;
        }
        #list10 {
            list-style-type: cjk-heavenly-stem;
        }
    </style>
</head>
<body>
    <h1>순서 있는 리스트</h1>

<!-- ol>li*5>lorem1 --><ol>
        <li>Lorem.</li>
        <li>Quis.</li>
        <li>Non.</li>
        <li>Adipisci.</li>
        <li>Voluptates?</li>
    </ol>

<!-- ol#list$*5>li*5>lorem1 --><ol id="list1">
        <li>Lorem.</li>
        <li>Nisi.</li>
        <li>Quo!</li>
        <li>Corrupti.</li>
        <li>Laudantium.</li>
    </ol>
    <ol id="list2">
        <li>Lorem.</li>
        <li>Facilis?</li>
        <li>Accusantium!</li>
        <li>Aspernatur.</li>
        <li>Harum.</li>
    </ol>
    <ol id="list3">
        <li>Lorem.</li>
        <li>Culpa?</li>
        <li>Sequi?</li>
        <li>Iste?</li>
        <li>Eum.</li>
    </ol>
    <ol id="list4">
        <li>Lorem.</li>
        <li>Dignissimos.</li>
        <li>Quas?</li>
        <li>Delectus.</li>
        <li>Exercitationem!</li>
    </ol>
    <ol id="list5">
        <li>Lorem.</li>
        <li>Ad.</li>
        <li>Excepturi!</li>
        <li>Aspernatur.</li>
        <li>Quos!</li>
    </ol>
<!-- ol#list$@6*5>li*5>lorem1 --><ol id="list6">
        <li>Lorem.</li>
        <li>Quos.</li>
        <li>Saepe?</li>
        <li>Maiores.</li>
        <li>Libero!</li>
    </ol>
    <ol id="list7">
        <li>Lorem.</li>
        <li>Quae.</li>
        <li>Dolores?</li>
        <li>Dolorem.</li>
        <li>Molestias.</li>
    </ol>
    <ol id="list8">
        <li>Lorem.</li>
        <li>Ipsam!</li>
        <li>Pariatur?</li>
        <li>Beatae!</li>
        <li>Eaque.</li>
    </ol>
    <ol id="list9">
        <li>Lorem.</li>
        <li>Corrupti?</li>
        <li>Doloremque.</li>
        <li>Tempora!</li>
        <li>Nostrum!</li>
    </ol>
    <ol id="list10">
        <li>Lorem.</li>
        <li>Dolorum?</li>
        <li>Eius.</li>
        <li>Laborum?</li>
        <li>Aspernatur!</li>
    </ol>
</body>
</html>
```

---

# **<html-list-unordered >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>unordered list</title>
    <style>
        #list1 {
            list-style-type: square;
        }
        #list2 {
            list-style-type: circle;
        }
        #list3 {
            list-style-type: none;
        }
        #list4 {
            list-style-type: "\1F44D";
        }
        #list5 {
            list-style-type: "\1F601";
        }
    </style>
</head>
<body>
    <h1>순서 없는 리스트 (☞ﾟヮﾟ)☞</h1>
<!-- ul>li*5>lorem1 --><ul>
        <li>Lorem.</li>
        <li>Sequi!</li>
        <li>Recusandae!</li>
        <li>Eveniet!</li>
        <li>Quidem?</li>
    </ul>
<!-- ul#list$*10>li*5>lorem1 --><ul id="list1">
        <li>Lorem.</li>
        <li>Rem.</li>
        <li>Laudantium.</li>
        <li>Nobis.</li>
        <li>Molestiae.</li>
    </ul>
    <ul id="list2">
        <li>Lorem.</li>
        <li>Eius.</li>
        <li>Cupiditate!</li>
        <li>Aliquam.</li>
        <li>Repellat!</li>
    </ul>
    <ul id="list3">
        <li>Lorem.</li>
        <li>Impedit.</li>
        <li>Repellat?</li>
        <li>Pariatur.</li>
        <li>Quo!</li>
    </ul>
    <ul id="list4">
        <li>Lorem.</li>
        <li>Pariatur!</li>
        <li>Blanditiis?</li>
        <li>Autem!</li>
        <li>Tempore!</li>
    </ul>
    <ul id="list5">
        <li>Lorem.</li>
        <li>Repellendus?</li>
        <li>Cupiditate?</li>
        <li>Incidunt.</li>
        <li>Atque!</li>
    </ul>
    <ul id="list6">
        <li>Lorem.</li>
        <li>Accusamus.</li>
        <li>Saepe!</li>
        <li>Delectus.</li>
        <li>Reiciendis.</li>
    </ul>
    <ul id="list7">
        <li>Lorem.</li>
        <li>Autem?</li>
        <li>Amet!</li>
        <li>Minus?</li>
        <li>Quisquam!</li>
    </ul>
    <ul id="list8">
        <li>Lorem.</li>
        <li>Aspernatur!</li>
        <li>Voluptatum.</li>
        <li>Rem.</li>
        <li>Corporis!</li>
    </ul>
    <ul id="list9">
        <li>Lorem.</li>
        <li>Iusto.</li>
        <li>Provident.</li>
        <li>Temporibus.</li>
        <li>Accusamus!</li>
    </ul>
    <ul id="list10">
        <li>Lorem.</li>
        <li>Inventore!</li>
        <li>Maiores?</li>
        <li>Libero.</li>
        <li>Error.</li>
    </ul>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/m8jLo/btrhdwvhJhD/tKQWHDYtA1RhrSTTCLWqL1/img.png](https://blog.kakaocdn.net/dn/m8jLo/btrhdwvhJhD/tKQWHDYtA1RhrSTTCLWqL1/img.png)

그 아래 사진들은 생략!

---

# **<html-table >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>table</title>
    <style>
        table, tr, td, th {
            border: 1px solid black;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
    </style>
</head>
<body>

    <h3>table</h3>

<!-- table>tr*5>td*3>lorem1 --><!-- table>tr>th*3>lorem1^^tr*4>td*3>lorem1 -->
<table>
        <tr>
            <th>Lorem.</th>
            <th>Laborum!</th>
            <th>Incidunt.</th>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Animi.</td>
            <td>Dolorem.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Quia?</td>
            <td>Suscipit.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Quod.</td>
            <td>Et.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Incidunt.</td>
            <td>Aliquid.</td>
        </tr>
    </table>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bR15Za/btrhdehlVLm/NrFE3aaigV89LkyLpWZKXk/img.png](https://blog.kakaocdn.net/dn/bR15Za/btrhdehlVLm/NrFE3aaigV89LkyLpWZKXk/img.png)

---

# **< html-table-bootstrap >**

```html
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">

    <title>bootstrap table</title>

    <style>

    </style>
</head>
<body>

<!-- table.table>tr>th*5>lorem1^^tr*5>td*5>lorem1 --><table class="table table-dark table-hover">
        <thead>
            <tr>
                <th>Lorem.</th>
                <th>Incidunt?</th>
                <th>Exercitationem?</th>
                <th>Cupiditate!</th>
                <th>Omnis.</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Lorem.</td>
                <td>Molestiae.</td>
                <td>Odio!</td>
                <td>Autem!</td>
                <td>Quidem!</td>
            </tr>
            <tr>
                <td>Lorem.</td>
                <td>Aperiam.</td>
                <td>Deserunt!</td>
                <td>Adipisci.</td>
                <td>Aperiam.</td>
            </tr>
            <tr>
                <td>Lorem.</td>
                <td>Error.</td>
                <td>Fuga!</td>
                <td>Minus.</td>
                <td>Ea.</td>
            </tr>
            <tr>
                <td>Lorem.</td>
                <td>Quas?</td>
                <td>Provident.</td>
                <td>Voluptate?</td>
                <td>Blanditiis!</td>
            </tr>
            <tr>
                <td>Lorem.</td>
                <td>Exercitationem?</td>
                <td>Odio?</td>
                <td>Aspernatur.</td>
                <td>Iusto!</td>
            </tr>
        </tbody>
    </table>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bFxsgf/btrg95y3HRI/nFLH0Di532X3AKNQSu6wUk/img.png](https://blog.kakaocdn.net/dn/bFxsgf/btrg95y3HRI/nFLH0Di532X3AKNQSu6wUk/img.png)

---

# **<html-table-span >**

```html
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <style>
        table, td {
            border: 1px solid black;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
    </style>
</head>
<body>
    <h3>column 병합</h3>
<!-- table>tr*5>td*5>lorem1 --><table>
        <tr>
            <td colspan="2">Lorem.</td>
<!-- <td>Quam!</td> --><td>Odit.</td>
            <td colspan="2">Eaque.</td>
<!-- <td>Quis.</td> --></tr>
        <tr>
            <td>Lorem.</td>
            <td>Aspernatur.</td>
            <td>Dolore.</td>
            <td>Fugiat.</td>
            <td>Ratione!</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td colspan="4" style="text-align: center;">Unde.</td>
<!-- <td>Laborum!</td>
            <td>Asperiores.</td>
            <td>Laboriosam?</td> --></tr>
        <tr>
            <td>Lorem.</td>
            <td>Incidunt?</td>
            <td colspan="3">Aliquid.</td>
<!-- <td>Reprehenderit?</td>
            <td>Quis.</td> --></tr>
        <tr>
            <td>Lorem.</td>
            <td colspan="2">Quod!</td>
<!-- <td>Sed.</td> --><td>Dolorum?</td>
            <td>Cum.</td>
        </tr>
    </table>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/ba7rCT/btrg8XOGQrf/iVMg98dnF0GBWoPrzfHj6k/img.png](https://blog.kakaocdn.net/dn/ba7rCT/btrg8XOGQrf/iVMg98dnF0GBWoPrzfHj6k/img.png)

셀병합 연습하기, 셀병합하려면, 기존에 존재하는 자료를 날려야하기 때문에,

신중히 처리해야한다~

---

# **< html-table-span >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>rowspan</title>
    <style>
        table, td {
            border: 1px solid black;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
        .span {
            background-color: teal;
        }
    </style>
</head>
<body>
    <h3>행 병합</h3>
<!-- table>tr*10>td*5>lorem1 --><table>
        <tr>
            <td rowspan="2" class="span">Lorem.</td>
            <td>Tempore.</td>
            <td>Doloribus!</td>
            <td>Quibusdam!</td>
            <td>Hic!</td>
        </tr>
        <tr>
<!-- <td>Lorem.</td> --><td>Exercitationem.</td>
            <td>Assumenda.</td>
            <td>Totam?</td>
            <td>Deserunt?</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Architecto!</td>
            <td>Repellat!</td>
            <td>Culpa.</td>
            <td>Nihil?</td>
        </tr>
        <tr>
            <td rowspan="3" class="span">Lorem.</td>
            <td>Assumenda.</td>
            <td>Corporis!</td>
            <td>Eos!</td>
            <td>Eius!</td>
        </tr>
        <tr>
<!-- <td>Lorem.</td> --><td>Numquam?</td>
            <td>Tenetur.</td>
            <td>Repellat.</td>
            <td>Ab.</td>
        </tr>
        <tr>
<!-- <td>Lorem.</td> --><td>Dicta.</td>
            <td>Itaque.</td>
            <td>Nam!</td>
            <td>Enim!</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Molestiae!</td>
            <td>Explicabo.</td>
            <td>Natus!</td>
            <td>Earum?</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Inventore.</td>
            <td>Consectetur!</td>
            <td>Veniam.</td>
            <td>Praesentium?</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Rem!</td>
            <td>Ab!</td>
            <td>Voluptates.</td>
            <td>Eos?</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Aliquam.</td>
            <td>Maxime.</td>
            <td>Quidem.</td>
            <td>Rerum!</td>
        </tr>
    </table>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/b3ZlZN/btrhdkaJsuP/5QbzkJiqK5iPYobKRKTkNK/img.png](https://blog.kakaocdn.net/dn/b3ZlZN/btrhdkaJsuP/5QbzkJiqK5iPYobKRKTkNK/img.png)

주석 처리하는건 날 포함해서 합쳐지고 싶은칸 -1이면된다. 행이랑 열 병합할 때, 주의해야하는 점~

---

# **< html-table-span >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>병합</title>
    <style>
        table, td {
            border: 1px solid black;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
        .span {
            background-color: teal;
        }
    </style>
</head>
<body>
<!-- table>tr*10>td*5>lorem1 --><table>
        <tr>
            <td rowspan="2" colspan="2" class="span">Lorem.</td>
<!-- <td>Quis?</td> --><td>Tempore!</td>
            <td>Ipsum?</td>
            <td>Eaque.</td>
        </tr>
        <tr>
<!-- <td>Lorem.</td> --><!-- <td>Voluptas!</td> --><td>Esse.</td>
            <td>Tempora.</td>
            <td>Libero.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Repudiandae?</td>
            <td>Doloremque.</td>
            <td>Ea.</td>
            <td>Exercitationem.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td rowspan="3" colspan="3" class="span";>Repellat.</td>
<!-- <td>Tempora.</td> --><!-- <td>Tempore?</td> --><td>Cumque.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
<!-- <td>Quas.</td> --><!-- <td>Expedita?</td> --><!-- <td>Sunt!</td> --><td>Voluptate.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
<!-- <td>Saepe.</td> --><!-- <td>Autem!</td> --><!-- <td>Eaque!</td> --><td>Repudiandae?</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Ad.</td>
            <td>Fugit?</td>
            <td>Est!</td>
            <td>Sunt.</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Consequatur.</td>
            <td>A!</td>
            <td>Quaerat.</td>
            <td>Omnis!</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Quibusdam.</td>
            <td>Aperiam!</td>
            <td>Vero.</td>
            <td>Vitae!</td>
        </tr>
        <tr>
            <td>Lorem.</td>
            <td>Architecto.</td>
            <td>Iste.</td>
            <td>Explicabo.</td>
            <td>Minus!</td>
        </tr>
    </table>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/diVpGO/btrhdBDjjOU/wHSXe0HOIebefvslCYwhdK/img.png](https://blog.kakaocdn.net/dn/diVpGO/btrhdBDjjOU/wHSXe0HOIebefvslCYwhdK/img.png)

열은 날 포함하기때문에, 숫자를 -1하게 주석 처리하면 되지만

행은 뒤에있는 칸을 지워야하기때문에 rowspan="2"면 주석처리해야하는 칸도 2칸이다.
