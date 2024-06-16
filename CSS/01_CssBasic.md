# Css 01. 기초이론

# **< css이론 >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>css</title>
</head>
<body>
<h1>css</h1>
<ul>
    <li>Cascading Style Sheets 약자</li>
    <li>HTML 요소들이 어떻게 출력되어야 하는 지 작성된 코드</li>
    <li>여러 웹페이지를 한 번에 작업할 수 있음</li>
    <li>외부 CSS 파일로 저장될 수 있음</li>
</ul>
<p>HTML은 문서의 구조를 결정하는 코드</p>
<p>CSS 문서의 스타일을 결정하는 코드</p>
</body>
</html>
```

Declaration =rule (규칙)

선언이라고 하던, 규칙이라 하던 같은 아이!

---

# **< css >**

```html
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <style>
        h1{
            color:blue;
            background-color:yellow;
        }
        p{
            color: red;
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>Lorem, ipsum dolor.</h1>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Minima fugit, hic dolorem pariatur delectus maxime sequi voluptatibus quia magni quas non accusantium! Earum provident quod asperiores quidem explicabo soluta quis?</p>
    <h1>Soluta, totam vel.</h1>
    <p>Voluptas odit maxime quidem maiores sequi a non ab sint cupiditate saepe iure quo quasi ad, itaque harum numquam sapiente fugiat. Nihil, dolor hic. Rerum atque cupiditate quaerat porro itaque!</p>
    <h1>Iure, excepturi dicta!</h1>
    <p>Veniam quibusdam placeat porro quo, fugiat vel natus quis incidunt aperiam quos aliquid corporis, inventore ipsum alias doloremque mollitia culpa officia animi beatae, repellat repellendus neque. Sed iure dolor voluptatum?</p>
</body>
</html>
```

---

# **< css주석>**

```html
<!DOCTYPE html>
<html>
<head>
    <title>css comment</title>
    <style>
/* css 주석 *//* // css 주석 아님 *//* 단축키 ctrl+/ *//* 주의: 페이지 소스 보기 하면 보임 *//* 중요한 내용 작성 금지!! */
    </style>
</head>
<body>
<!-- html 주석 --><!-- /* html 주석 아님 */ --></body>
</html>
```

style의 주석과 html의 주석의 모양이 다르니까 유의할 것.

---

# **< selector-element⇒  선택자>**

```html
<!DOCTYPE html>
<html>
<head>
    <title>element selector</title>
    <style>
        span{
            color:skyblue;
            font-size: x-large;
        }
        h1{
            background-color: tomato;
            color: wheat;
            text-align: center;
        }
        p{
            background-color: wheat;
            color: green;
        }
    </style>
</head>
<body>
    <h1>element 선택자</h1>
    <p>tag name으로 요소 선택</p>

<h1>Lorem, ipsum dolor.</h1>
<p>Lorem, ipsum dolor.<span>Lorem.</span></p>
<h1>Expedita, nemo non?</h1>
<p>Provident, optio quaerat!<span>Aliquam.</span></p>
<h1>Beatae, molestiae eum.</h1>
<p>Doloribus, placeat mollitia.<span>Cupiditate.</span></p>

</body>
</html>
```

![https://blog.kakaocdn.net/dn/E8zBL/btrgV8vqKRV/rIKiJoPOP2zCxXb2i2kAQ1/img.png](https://blog.kakaocdn.net/dn/E8zBL/btrgV8vqKRV/rIKiJoPOP2zCxXb2i2kAQ1/img.png)

---

# **< selector-class >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>class selector</title>
    <style>
        .memo {
            background-color: yellowgreen;
        }
        .error {
            background-color: red;
            color: white;
        }
/* note 클래스 속성값을 가진 요소들의 color: white,bgcolor:blue */.note{
            color:white;
            background-color: blue;
        }
    </style>
</head>
<body>
    <h1>class 선택자</h1>
    <p>class attribute의 값으로 요소 선택</p>
<!-- (h1>lorem3^p>lorem)*3 --><h1 class="memo">Lorem, ipsum dolor.</h1>
    <p class="memo">Lorem ipsum dolor sit amet consectetur adipisicing elit. Recusandae quibusdam nesciunt doloribus reprehenderit voluptas nobis sint eum fugiat laborum, eius magnam culpa molestias nemo accusamus dolorum obcaecati, repudiandae itaque omnis?</p>
    <h1 class="error">Cum, ex et?</h1>
    <p class="error">Molestiae, dolorum eaque dolorem esse porro debitis tempora est? Animi labore eaque ab consectetur voluptatibus soluta ipsam iure commodi magni libero quod, nesciunt adipisci et dolorem, sit omnis, quo illo.</p>
    <h1 class="note">Nam, ut ex.</h1>
    <p class="memo">Aliquam sunt unde iste ad amet totam voluptatibus quo, veritatis aperiam voluptate dolor obcaecati dolores necessitatibus! Cumque consectetur labore ullam aperiam atque quam dolor porro, dignissimos, dolores illo, recusandae omnis.</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bdoOkV/btrg2MRQnzp/mGsrptJLaKQifJ1hnPySP1/img.png](https://blog.kakaocdn.net/dn/bdoOkV/btrg2MRQnzp/mGsrptJLaKQifJ1hnPySP1/img.png)

---

# **< selector-class >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>class 선택자</title>
    <style>
        .memo{
            background-color: yellowgreen;
        }
        .error{
            color: teal;
        }
    </style>
</head>
<body>
    <h1>class 속성(attribute)</h1>
    <p>class 속성은 하나의 요소가 여러 값을 가질 수 있다</p>

<h1>Lorem, ipsum dolor.</h1>
<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Cumque, veniam delectus provident, excepturi accusamus ducimus beatae deleniti quae sunt velit tempore voluptatum, iusto debitis. Reiciendis nulla fuga architecto nobis rem.</p>
<h1 class="memo">Eius, esse cumque.</h1>
<p class="memo error">Quae a, harum consequuntur veniam quisquam doloremque est culpa vel, sapiente architecto ullam in explicabo. Officiis accusantium officia eum cupiditate cumque laboriosam incidunt, magnam deleniti id, laudantium nisi exercitationem. Fugit!</p>
<h1 class="error">Velit, consequuntur consequatur.</h1>
<p>A deleniti vero voluptatem consectetur libero quisquam reprehenderit ipsum quis perferendis in nesciunt possimus blanditiis, quia autem adipisci tempore voluptatum voluptates rerum neque! Asperiores quis rem reiciendis suscipit, quas debitis!</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/Yudoj/btrgUpxPWBl/b3KOnoM6wq5qRDvYIVh9q0/img.png](https://blog.kakaocdn.net/dn/Yudoj/btrgUpxPWBl/b3KOnoM6wq5qRDvYIVh9q0/img.png)

---

# **< selector-id >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>id selector</title>
    <style>
        #myheader{
        color: blue;
        }
        #mypara{
            color: yellowgreen;
    background-color: teal;
        }
    </style>
</head>
<body>
    <h1>id selector</h1>
    <p>id 속성(attribute)의 값으로 요소 선택</p>
    <h1>id 속성(attribute) 작성 규칙</h1>
    <p>한 페이지 내에서 여러 요소가 같은 id를 가질 수 없음</p>
    <p>영문대소문자, 숫자 조합. 숫자가 앞에 오면 안된다.</p>
    <h1 id="myheader">Lorem, ipsum dolor.</h1>
<p id="mypara">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Animi veritatis, corrupti tenetur facere neque consectetur velit totam quod voluptatem consequuntur dolorum et? Similique numquam voluptate nulla voluptatibus, in eaque officia.</p>
<h1>Dolorum, fugit explicabo.</h1>
<p>Aspernatur id modi illo assumenda non quidem accusamus quasi expedita eligendi commodi aut minus dicta veritatis ipsam recusandae voluptatem incidunt dolore impedit consectetur, rerum eius ut saepe magni? Libero, enim.</p>
<h1>Iusto, magni libero!</h1>
<p>Quod, ad illo? Soluta eos accusantium esse saepe quidem labore obcaecati sequi sapiente ipsa aliquid. Vitae cumque cupiditate quod saepe deleniti. Quaerat culpa, inventore sint earum quas laborum natus aliquid.</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/cTH5Bb/btrgYKgpm7J/4oZsWvTmtmXTEnIaAxIG40/img.png](https://blog.kakaocdn.net/dn/cTH5Bb/btrgYKgpm7J/4oZsWvTmtmXTEnIaAxIG40/img.png)

# **= class와 id의 차이 =**

```jsx
class : 한 요소가 여러 값의 속성을 가질 수 있기에, 
중복으로 설정이 가능하다.
id : 한 페이지 내에서, id는 하나의 속성만 가질 수 있다.
```

---

# **< selector-group >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>group selector</title>
    <style>
/* h1 {color: yellow; }
        p {color: yellow;} */

        [한번에 표시하려면]
        h1, p {
            color:gold;
        }
        #myheader, #mypara {
            background-color: black;
        }
        #mypara {
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>그룹 선택자</h1>
    <p>,로 여러 선택자를 작성할 수 있음</p>
<!-- (h1>lorem3^p>lorem)*3 --><h1 id="myheader">Lorem, ipsum dolor.</h1>
    <p id="mypara">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod explicabo cupiditate et natus vel recusandae eveniet aliquam facere praesentium commodi quam officiis dolorem porro, a nulla cumque hic magni! Vero.</p>
    <h1>Dolore, accusamus quia.</h1>
    <p>Molestias totam reprehenderit, cumque quod aperiam recusandae quasi neque quia, optio, quibusdam officiis ea aliquid similique molestiae ducimus voluptate iure. Quae vero temporibus autem architecto eos nostrum. Neque, inventore natus!</p>
    <h1>Cum, labore placeat?</h1>
    <p>Qui deleniti recusandae accusamus exercitationem, optio ipsa quaerat molestiae delectus vero eius libero illum animi! Tempora corrupti nesciunt veritatis vel maiores quibusdam alias, sunt, quia accusamus illum nulla ipsa porro?</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/bUezhb/btrgV6Lhhtn/szjjIFNvpigOtSzosloqc0/img.png](https://blog.kakaocdn.net/dn/bUezhb/btrgV6Lhhtn/szjjIFNvpigOtSzosloqc0/img.png)
