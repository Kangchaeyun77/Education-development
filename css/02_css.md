# css 02

# **< selector-combinator >**

```html
<!DOCTYPE html> 
<html> 
<head> 
<title>선택자 조합</title> 
<style> h1{ color: aqua; } .error{ background-color: wheat; } h1.error{ text-decoration: line-through; } h1.note{ font-size: 50px; } h1.note.error{ font-style: italic; } p.error{ font-family: D2coding; } .error.note{ border-style: solid; } #para1{ text-align: right; } p#para1{ border-style: dotted; } 
</style> 
</head> 
 <body> <h1 class="note">Lorem, ipsum dolor.</h1> <p id="para1">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Debitis impedit, placeat iusto consequuntur ipsam cupiditate quidem qui doloremque totam quia, nobis iure nemo, modi eius pariatur dignissimos. A, nihil beatae?</p> <h1 class="error note">Laborum, repudiandae aliquid.</h1> <p>Repellendus qui cumque reprehenderit, laboriosam debitis praesentium dolore quis beatae molestiae eum dicta totam unde quibusdam optio vel amet eveniet, id labore expedita sint impedit nobis error a. Deleniti, labore.</p> <h1 class="error">Unde, quos fuga?</h1> <p class="error">Voluptas enim amet deleniti in rem accusantium itaque corrupti, fugiat, reiciendis doloremque maxime, neque officiis soluta consectetur. Obcaecati molestiae, aperiam veniam, a dolorem adipisci iusto aliquam porro, provident repellat officiis.</p> 
 </body> 
 </html>
```

![https://blog.kakaocdn.net/dn/A2hZG/btrg4JVrrNE/qkWKpgENzk9xCVlnJuD05k/img.png](https://blog.kakaocdn.net/dn/A2hZG/btrg4JVrrNE/qkWKpgENzk9xCVlnJuD05k/img.png)

---

# **< selector-priority ⇒ 선택자 우선순위>**

```html
<!DOCTYPE html> 
<html> 
<head> 
<title></title> 
<style> h1.note { color: blue; } .error { color: red; } #head1 { color: gold; } </style> 
</head> 
<body> <h1>선택자 우선순위</h1> <p>id 선택자가 많을 수록 높음</p> <p>id 선택자 수가 같으면 class 선택자가 많을 수록 높음</p> <p>class 선택자 수가 같으면 element 선택자가 많을 수록 높음</p> <p>단, style attribute로 작성된 것이 가장 높음</p> <!-- h1*3>lorem3 --> <h1 class="error">Lorem, ipsum dolor.</h1> <h1 class="error note">Lorem, ipsum dolor.</h1> <h1 class="error note" style="color: yellow;">Nihil, quibusdam distinctio.</h1> <h1 class="note" id="head1">Earum, molestias animi!</h1> 
</body> 

</html>
```

![https://blog.kakaocdn.net/dn/0P24K/btrgYkb316L/kQTwEQyuqlNVEjsmR2rBQ0/img.png](https://blog.kakaocdn.net/dn/0P24K/btrgYkb316L/kQTwEQyuqlNVEjsmR2rBQ0/img.png)

---

# **< emmet2 >**

```html
<!DOCTYPE html> <html> <head> <title></title> <style> </style> </head> <body> <h3>부모 요소로 이동(한단계 위로) ^</h3> <!-- div>h1>lorem3^p --> <div> <h1>Lorem, ipsum dolor.</h1> <p></p> </div> <!-- div>div>div>div^^p --> <div> <div> <div> <div></div> </div> </div> <p></p> </div> <h3>컨텐트 작성 {}</h3> <!-- p{hello world} --> <p>hello world</p> <h3>attribue 작성 []</h3> <!-- p[class] --> <p class=""></p> <!-- p[class id] --> <p class="" id=""></p> <!-- p[class id]>lorem --> <p class="" id="">Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptate natus illo harum quod corporis id, animi at doloremque. Itaque ducimus accusantium possimus nam, cumque voluptate quos nulla esse quia sapiente.</p> <!-- p[id="para1"] --> <p id="para1"></p> <!-- p[class="note" id="para2"] --> <p class="note" id="para2"></p> </body> </html>
```



---

# **< emmet3 >**

```html
<!DOCTYPE html> <html> <head> <title>emmet 3</title> <style> </style> </head> <body> <h3>class 선택자</h3> <!-- h1.error --> <h1 class="error"></h1> <!-- h1.error.note --> <h1 class="error note"></h1> <h3>id 선택자</h3> <!-- h1#head1 --> <h1 id="head1"></h1> <!-- h1#head2.error.note --> <h1 id="head2" class="error note"></h1> <h3>numbring</h3> <!-- p*3#para$ --> <!-- p#para$*3 --> <p id="para1"></p> <p id="para2"></p> <p id="para3"></p> <!-- p*3#para$@4 --> <!-- p#para$@4*3 --> <p id="para4"></p> <p id="para5"></p> <p id="para6"></p> <h3>형제 요소 +</h3> <!-- h3+p+h2 --> <h3></h3> <p></p> <h2></h2> <!-- h1>lorem3+sub>lorem2 --> <h1>Lorem, ipsum dolor.<sub>Lorem, ipsum.</sub></h1> <h3>태그명 생략하면 div</h3> <!-- h1.error --> <h1 class="error"></h1> <!-- div.error --> <!-- .error --> <div class="error"></div> </body> </html>
```



---

# **< boxmodel-border >**

```html
<!DOCTYPE html> 
<html> 
<head> 
 <title></title> 
  <style> div { height: 100px; width: 200px; } #div1 { border-style: solid; } #div2 { border-style: dotted; } #div3 { border-style: double; } #div4 { border-style: solid dotted double groove; /* 위 오른쪽 아래 왼쪽 */ } #div5 { border-style: solid dotted double; /* 위 좌우 아래 */ } #div6 { border-style: solid dotted; /* 상하 좌우 */ } #div7 { border-style: dotted; /* 4면 */ } #div8 { border-top-style: solid; border-right-style: double; border-bottom-style: dotted; border-left-style: solid; } 
  </style> 
  </head> 
   <body> <div id="div1">Lorem, ipsum dolor.</div> <div id="div2">Porro, voluptas vel.</div> <div id="div3">Veritatis, quaerat quod.</div> <div id="div4">Lorem, ipsum dolor.</div> <!-- div#div$@5*3>lorem3 --> <div id="div5">Lorem, ipsum dolor.</div> <div id="div6">Possimus, in consectetur!</div> <div id="div7">Ipsa, impedit libero.</div> <!-- #div8>lorem3 --> <div id="div8">Lorem, ipsum dolor.</div> 
   </body> 
 
 </html>
```

![https://blog.kakaocdn.net/dn/cd8mh5/btrg1LNJSpr/z1PqrTpktllVY47FECeJ31/img.png](https://blog.kakaocdn.net/dn/cd8mh5/btrg1LNJSpr/z1PqrTpktllVY47FECeJ31/img.png)

---

# **< boxmodel-border-width >**

```html
<!DOCTYPE html> 
<html> 
<head> 
<title>border width</title>
 <style> div { height: 50px; width: 200px; border-style: solid; margin: 10px; } #div1 { border-width: 10px; } #div2 { border-width: 10px 5px 2px 1px; /* 상 우 하 좌 */ } #div3 { border-width: 20px 10px 1px; /* 상 좌우 하 */ } #div4 { border-width: 20px 1px; /* 상하 좌우 */ } #div5 { border-width: 5px; /* 4면 */ } #div6 { border-top-width: 10px; border-right-width: 20px; border-bottom-width: 30px; border-left-width: 5px; } 
 </style> 
 </head> 
 <body> <!-- div#div$*7>lorem3 --> <div id="div1">Lorem, ipsum dolor.</div> <div id="div2">Perspiciatis, asperiores et.</div> <div id="div3">Voluptatibus, eaque dolore.</div> <div id="div4">Nihil, provident dolor.</div> <div id="div5">Illum, modi molestiae.</div> <div id="div6">Mollitia, porro repellendus?</div> <div id="div7">Animi, doloribus id.</div> 
 </body> 
 </html>
```

![https://blog.kakaocdn.net/dn/yWPp1/btrg4J8ZLn1/Ktg5xeT8aI0sTFtxFcAVO1/img.png](https://blog.kakaocdn.net/dn/yWPp1/btrg4J8ZLn1/Ktg5xeT8aI0sTFtxFcAVO1/img.png)

---

# **< boxmodel-border-color >**

```html
<!DOCTYPE html>
 <html>
  <head> 
  <title>border color</title> <style> div { width: 200px; height: 50px; margin: 10px; border-style: solid; border-width: 10px; } #div1 { border-color: green; } #div2 {/* 상 우 하 좌 */ border-color: green yellow red blue; } #div3 {/* 상 좌우 하 */ border-color: green yellow red; } #div4 {/* 상하 좌우 */ border-color: green yellow; } #div5 { /* 4면 */ border-color: green; } #div6 { border-top-color: seagreen; border-right-color: silver; border-bottom-color: tomato; border-left-color: blue; } 
  </style> 
  </head> 
  <body> <!-- div#div$*7>lorem1 --> <!-- #div$*7>lorem1 --> <div id="div1">Lorem.</div> <div id="div2">Modi.</div> <div id="div3">Nemo.</div> <div id="div4">Sequi?</div> <div id="div5">Ipsa.</div> <div id="div6">Voluptate.</div> <div id="div7">A.</div> 
  </body> 
  </html>
```

![https://blog.kakaocdn.net/dn/bFLsyJ/btrgXp5iMOR/CS0NusSesyrzK5okE9bKu1/img.png](https://blog.kakaocdn.net/dn/bFLsyJ/btrgXp5iMOR/CS0NusSesyrzK5okE9bKu1/img.png)

---

# **< 16boxmodel-border >**

```html
<!DOCTYPE html>
 <html> 
 <head> 
 <title>border</title> 
 <style> div { width: 200px; height: 50px; margin: 10px; } #div1 { border-width: 10px; border-style: dotted; border-color: green; } #div2 { border: 10px dotted green; } #div3 { border-top: 5px solid red; border-right: 10px dotted blue; border-bottom: 20px double yellow; border-left: 1px solid skyblue; } #div4 { border-bottom: 10px solid salmon; } 
 </style> 
 </head> 
 <body> <!-- #div$*5>lorem1 --> <div id="div1">Lorem.</div> <div id="div2">Odit.</div> <div id="div3">Sit.</div> <div id="div4">Delectus?</div> <div id="div5">Quos?</div> 
 </body> 
 </html>
```

![https://blog.kakaocdn.net/dn/ygTqH/btrg2MZtHXF/AWrOMy7XIGc6K0edHKfYyK/img.png](https://blog.kakaocdn.net/dn/ygTqH/btrg2MZtHXF/AWrOMy7XIGc6K0edHKfYyK/img.png)

---

# **< boxmodel-margin >**

```html
<!DOCTYPE html> 
<html>
 <head> 
 <title>margin</title> 
 <style> .container { border: 5px solid red; } .item { border: 5px solid blue; width: 200px; height: 50px; } #div1 { margin: 5px; } #div2 { margin-top: 10px; margin-bottom: 20px; margin-right: 30px; margin-left: 40px; } #div3 {/* 상 우 하 좌 */ margin: 10px 30px 20px 40px; } #div4 {/* 상 좌우 하 */ margin: 10px 30px 20px; } #div5 {/* 상하 좌우 */ margin: 30px 20px; } #div6 { margin: auto; } #div7 { margin: 50px; } #div8 { margin: 30px; } 
 </style> 
 </head> 
 <body> <!-- .container>.item#div$*5{$} --> <div class="container"> <div class="item" id="div1">1</div> <div class="item" id="div2">2</div> <div class="item" id="div3">3</div> <div class="item" id="div4">4</div> <div class="item" id="div5">5</div> </div> <hr> <h1>block 요소 가운데 배치</h1> <!-- .container>.item#div6{center} --> <div class="container"> <div class="item" id="div6">center</div> </div> <hr> <h1>위 아래 margin은 겹쳐진다.</h1> <!-- .container>.item*2#div$@7{$@7} --> <div class="container"> <div class="item" id="div7">7</div> <div class="item" id="div8">8</div> </div> 
 </body> 
 </html>
```

![https://blog.kakaocdn.net/dn/cGDgEL/btrg0o6p4V3/q373xCKagIz3faOBY2Xku0/img.png](https://blog.kakaocdn.net/dn/cGDgEL/btrg0o6p4V3/q373xCKagIz3faOBY2Xku0/img.png)

![https://blog.kakaocdn.net/dn/bH2Sb2/btrg1Y69HqM/QaFHrNUW5EPuZLr4NpOFy0/img.png](https://blog.kakaocdn.net/dn/bH2Sb2/btrg1Y69HqM/QaFHrNUW5EPuZLr4NpOFy0/img.png)

```jsx
f12눌러서, 마진이 어떻게 구성되어있나 확인이 가능하고,
박스 위에 색깔별로 커서를 움직이면, 어디에 해당하는 내용인지 확인이 가능하니 참고할 것!
```
