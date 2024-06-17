# html [기초] 01 개념

# **< html >**

```jsx
1. HTML은 Hyper Text Markup Language의 약자다.

2. HTML은 웹 페이지를 만드는 표준 마크업 언어다.

3. HTML은 웹 페이지의 구조를 명시한다.

4. HTML은 element(요소)들로 이루어져 있다.

5. HTML element는 컨텐트를 어떻게 표시해야 하는 지

브라우저에게 알려준다.

6. HTML element는 컨텐트를 '이 것은 제목이다.',

'이 것은 문단이다.', '이 것은 링크다.'라고 표시한다.
```

---

# **< element >**

```jsx
#요소
1. element(요소)는 시작태그, 컨텐트, 종료태그로 이루어져 있다.

2. element(요소)는 브라우저에게 컨텐트가 어떻게 출력되어야 하는 지 알려준다.

#태그

1. 삼각괄호 안에 태그명 작성 : <태그명>

2. 삼각괄호 안에 태그명이 /로 시작하면 종료태그, 그렇지 않으면 시작태그

3. 태그는 항상 시작태그와 종료태그가 같은 이름으로 쌍이 맞아야 함.

#빈 요소(empty element)

1. 시작태그만으로 요소완성

2. 빈요소는 /가 시작 태그 끝에 작성되는 경우도 있음.

#주의할 내용

1. 요소(element)를 태그(tag)로 지칭하는 경우가 많음.

2. 빈 요소가 아닐 경우 종료태그 생략 하지 않기

3. 각 요소가 섞이면 안됨

ex) <h1>제목 제목 제목<p> 제목</h1> 문단 문단 문단 </p>

4. 태그명은 대소문자 구분이 없음.

ex) <H1>제목 제목</H1> <P>문단 문단</P>
```

---

# **<heading >**

```html
<!DOCTYPE html>
<html>
<head>
    <title>제목 연습</title>
</head>
    <h1>first heading</h1>
    <h2>second heading</h2>
    <h3>third heading</h3>
    <h4>fourth heading</h4>
    <h5>fifth heading</h5>
    <h6>sixth heading</h6>
    <p>paragraph!!!!</p>
</html>
```

![https://blog.kakaocdn.net/dn/SjdFW/btrgQz03rM1/kNe2hiFhGrTBHQwCxhgGY0/img.png](https://blog.kakaocdn.net/dn/SjdFW/btrgQz03rM1/kNe2hiFhGrTBHQwCxhgGY0/img.png)

---

# **< paragragh >**

```html
<!DOCTYPE html>
<html>
    <head>
        <title>문단 연습</title>
    </head>
    <body>
     <h1>
            문단 연습 파일
     </h1>
        <p>가나다라 마바사 ~~!~!~!</p>
        <p>새로운 문단 가나다라 마바사</p>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
        Earum possimus beatae rerum dolor,
        minus repellendus et minima perferendis nam necessitatibus
        saepe nesciunt quisquam! Nesciunt saepe placeat quidem, esse dolorem autem!</p>
        <p>Lorem ipsum dolor sit amet.</p>
        <p>Lorem.</p>
    </body>
</html>
```

![https://blog.kakaocdn.net/dn/buqZ9U/btrgOtzYG27/KxA7vXyR5zRialh2jskDb1/img.png](https://blog.kakaocdn.net/dn/buqZ9U/btrgOtzYG27/KxA7vXyR5zRialh2jskDb1/img.png)

---

# **< hr >구분 선**

```html
<!DOCTYPE html>

<html>
 <head>
        <title>수평자 연습</title>
 </head>
 <body>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolor nemo facere et. Quae deserunt, culpa minima non accusamus debitis eius quos, suscipit pariatur adipisci neque, doloribus aperiam quis inventore quidem.</p>
        <hr>
        <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Mollitia, nostrum nam odio numquam accusantium, cumque rerum atque at laudantium itaque repudiandae et soluta tenetur eaque maiores beatae harum, dolore incidunt?</p>
 </body>
</html>
```

![https://blog.kakaocdn.net/dn/cDqN3X/btrgOueGf4c/WN0BVECnGKQ2QPD5k9KQq0/img.png](https://blog.kakaocdn.net/dn/cDqN3X/btrgOueGf4c/WN0BVECnGKQ2QPD5k9KQq0/img.png)

---

# **< text >**

```html
<!DOCTYPE html>
<html>
    <head>
        <title>
            텍스트 연습
        </title>
    </head>
    <body>
        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Sapiente, dolorem. Incidunt quis exercitationem, autem nesciunt similique eos explicabo officiis hic beatae maiores aperiam voluptates commodi sed recusandae? Id, corrupti natus.
        <br>Lorem ipsum dolor sit amet consectetur adipisicing elit. Inventore ea expedita deserunt in ad. Incidunt excepturi veniam dolore quibusdam itaque, ullam tempora eum explicabo libero ipsa odit, odio officia ad!
        <p>
            브라우저는 텍스트의 엔터 무시
            여러 스페이스는 하나의       스페이스로 만듬
        </p>

        <h1>
            새로운 줄을 표현하는 요소 br
        </h1>
        <p>
            브라우저는 텍스트의 엔터 무시<br>
            여러 스페이스는 하나로
        </p>
        <p>
            여러 스페이스는 &nbsp;&nbsp;&nbsp;로 작성
        </p>
    </body>
</html>
```

![https://blog.kakaocdn.net/dn/bdfF1o/btrgRS65GN0/boVIogU0vIeYVF90rqDMM1/img.png](https://blog.kakaocdn.net/dn/bdfF1o/btrgRS65GN0/boVIogU0vIeYVF90rqDMM1/img.png)

---

# **< pre >**

```html
<!DOCTYPE html>
<html>
    <head>
        <title>
            pre 태그 연습
        </title>
    </head>
    <body>
        <h1>preformatted 태그</h1>
        <p>
            Lorem ipsum dolor sit amet.
            Eos esse dolore est corrupti.
            Incidunt consequatur ullam dolor repudiandae.
        </p>
        <pre>
            Lorem        ipsum dolor sit amet.
            Ducimus iste cum aspernatur porro?
            Eligendi vitae aliquam repudiandae magni?
        </pre>
    </body>
</html>
```

![https://blog.kakaocdn.net/dn/0A3jB/btrgVSedxNN/yuWtRYUgQZ4O298oB5r0uK/img.png](https://blog.kakaocdn.net/dn/0A3jB/btrgVSedxNN/yuWtRYUgQZ4O298oB5r0uK/img.png)

```jsx
HTML에서 <pre> 태그는 "preformatted text"를 정의합니다. 
이 태그 내의 텍스트는 원본 코드 그대로 표시됩니다. 
이는 일반적인 텍스트와 달리 여러 줄의 공백이나 줄 바꿈, 탭 등이 그대로 유지되며, 
원본 코드의 형식을 그대로 보존합니다.
주로 프로그래밍 코드나 시스템 로그 같은 형식을 유지하고자 할 때 사용됩니다.
```

---

**< emmet1 >**

```html
<!DOCTYPE html>
<!-- html>head>title^body --><html>
<head>
    <title>emmet 연습1</title>
</head>
<body>
    <h3>여러 요소 : *n </h3>
<!-- p*3 --><p>hello</p>
    <p>world</p>
    <p>html</p>

    <h3>요소안의 요소 : 태그명>태그명</h3>
<!-- p>span --><p><span></span></p>

    <h3>주석은 ctrl + /</h3>

    <hr>
    <h3>lorem을 갖는 3개의 p 요소를 만들기</h3>
<!-- p*3>lorem --><p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto dolores minima perferendis error, beatae vitae quibusdam numquam nihil natus fuga tenetur dolorum corrupti doloremque nam temporibus, quaerat sapiente nobis cupiditate.</p>
    <p>Perspiciatis, sed. Nisi quod aliquid laborum! Sit, atque quae nam iure ducimus minus nostrum totam est excepturi reprehenderit vero voluptatem maiores similique cupiditate a doloribus libero repudiandae aliquid! Nisi, saepe?</p>
    <p>Blanditiis repudiandae dolorum consequuntur quidem, excepturi amet illum iusto, minus ad beatae molestiae laborum molestias cum. Maiores, magni ab praesentium, nobis facilis earum repellendus consectetur reiciendis a esse asperiores nihil!</p>
</body>
</html>
```

![https://blog.kakaocdn.net/dn/dtchiE/btrgU1WLIbq/LGZBivR627ysjJKooet0M0/img.png](https://blog.kakaocdn.net/dn/dtchiE/btrgU1WLIbq/LGZBivR627ysjJKooet0M0/img.png)

```jsx
`<span>` 태그는 HTML 문서 내에서 특정 부분을 그룹화하거나 스타일링하기 위해 사용됩니다.
 이 태그는 일반적으로 다른 요소들의 스타일을 적용하거나, 
 스크립트를 사용하여 특정 부분을 조작할 때 유용하게 활용됩니다. 
 그 자체로는 시각적인 변화를 주지 않고, 
 스타일이나 스크립트를 통해 시각적인 효과를 부여할 수 있습니다.
```

---

# **<comment >**

```html
<!DOCTYPE html>
<!-- html>head>title^body --><html>
<head>
    <title>주석 연습</title>
</head>
<body>
<!-- h1>lorem3 --><h1>Lorem, ipsum dolor.</h1>
    <p>주석은<!-- -->에 작성</p>
    <p>단축키는 ctrl + / </p>
    <p>코드보기하면 보이므로 중요한 내용을 작성하지 말 것</p>

<!-- 우리집 비밀번호 9999 --></body>
</html>
```

![https://blog.kakaocdn.net/dn/J7TrR/btrgWDVayYL/jPRtDjHoY7KCgNLkKcYhK0/img.png](https://blog.kakaocdn.net/dn/J7TrR/btrgWDVayYL/jPRtDjHoY7KCgNLkKcYhK0/img.png)

```jsx
일반적으로 빈 <span> 태그를 <p> 안에 포함하는 것은 의미적으로는 이상하지만, 
기술적으로는 유효한 HTML입니다. 
HTML은 중첩된 요소를 허용하므로 <span>은 <p> 안에 사용될 수 있습니다.

하지만 실제로 빈 <span>을 <p> 안에 넣는 것은 대부분의 경우에는 불필요한 것입니다. 
<span>은 주로 텍스트나 인라인 요소를 그룹화하거나 스타일링하기 위해 사용되며, 
<p>는 단락을 나타내기 위한 요소입니다. 
보통 단락 안에는 텍스트나 이미지 등의 컨텐츠가 들어가므로, 
빈 <span>을 사용하는 것은 보통 불필요합니다.
```

---

# **< body >**

```html
<!DOCTYPE html>
<!-- html>head>title^body --><html>
<head>
    <title>
        body 요소
    </title>
    <p>문단이 여기 있으면 안됨</p>
</head>
<p>Lorem, ipsum dolor.</p>
<body>
    <h1>body 요소</h1>
    <p>브라우저에 표시되는 내용 제목(h1~h6), 문단(p), 표(table) 등을 작성하는 요소</p>
    <p>하나만 있으면 됨</p>
    <p>만약에 생략하면 자동으로 하나 생김

</body>
</html>
<p>Lorem ipsum dolor sit amet.</p>
```

![https://blog.kakaocdn.net/dn/bh97Ca/btrgQAlrpJw/ZJBzSGAkLdmwK4uDSAbHH0/img.png](https://blog.kakaocdn.net/dn/bh97Ca/btrgQAlrpJw/ZJBzSGAkLdmwK4uDSAbHH0/img.png)
