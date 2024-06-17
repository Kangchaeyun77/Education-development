# 0611 jquery 이벤트, 비동기 방식 연동

# javascript 동적 기능 확인(웹)

```jsx
자바스크립트의 동적인 기능은 elements에서 볼 수 있고, 나머지 코드는 소스에서 확인 가능
```

# 자주 쓰는  jquery 이벤트

```jsx
hover()=>마우스가 요소에 오버되었을때 첫번째 함수가 실행되고,
 마우스가 요소를 떠날때 두번째 함수가 실행된다.
        / $("#p1").hover(function(event){
				// 마우스가 오버되었을때 함수 실행 },
				 function(){// 마우스가 떠날때 함수 실행});
focus()=>.focus() : 해당 요소에 포커스를 받았을 때 실행되는 함수
.focusin() : focus() 의 업그레이드(1.4)
change()=>.change() : <input />, <textarea />, <select /> 요소의 값 변경시 실행
키보드이벤트
```

# **e.preventDefault( );** , event.isDefaultPrevented();

```html
  <head>
	$(function( ) {
	$(".btn1").on("click", function(e){
		**e.preventDefault( ); //이벤트의 발생을 막는 키워드**
		$(".txt1")
		.css({"background-color":"#ff0"});
	});
	</heand>
	<body>
	<p><a href="http://www.easyspub.co.kr/" class="btn1">버튼1</a></p>
	<p class="txt1">내용1</p>
	</body>
	
	//event.isDefaultPrevented() : event.preventDefault() 상태인지 체크 true / false
```

# focus in function

```jsx
<script>
$(function(){
$("#user_id_1, #user_pw_1").on("focus",
function(){
$(this)
.css({"background-color":"pink"});
});
</script>
<body>
<h1>focus / blur</h1>
<form action="#">
<p>
<label for="user_id_1">ID</label>
<input type="text"
name="user_id_1" id="user_id_1">
</p>
</form>
</body>
```

# change function

```jsx
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> 이벤트 </title>  
<script src="js/jquery.js"></script>
<script>
$(function(){
	$("#rel_site").on("change", function(){
		$(".txt").text($(this).val());
	});
});
</script>
</head>
<body>
<select id="rel_site">
		<option value="">사이트 선택</option>
		<option value="www.google.com">구글</option>
		<option value="www.naver.com">네이버</option>
		<option value="www.daum.net">다음</option>
</select>
<p class="txt"></p>
</body>
</html>
```

# keydown function

```jsx
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> 이벤트 </title>
<script src="js/jquery.js"></script>
<script>
$(function(){
$(document).on("keydown", keyEventFnc);
function keyEventFnc(e) {
var direct = "";
switch(e.keyCode){
	case 37: direct = "LEFT";
	break;
	case 38: direct = "TOP";
	break;
	case 39: direct = "RIGHT";
	break;
	case 40: direct = "BOTTOM";
	break;
}

if(direct)
$("#user_id").val(direct);

}
});
</script>
</head>
<body>
<p><input type="text" name="user_id" id="user_id"></p>
</body>
</html>
```

# keypress vs keydown

```jsx

ChatGPT
키프레스(keypress)와 키다운(keydown) 이벤트는 
모두 사용자가 키보드의 키를 누를 때 발생합니다. 
그러나 두 이벤트의 특성은 약간 다릅니다.

키프레스(keypress):

키프레스 이벤트는 키를 누르고 글자가 입력되는 순간 발생합니다.
 이 이벤트는 키가 눌리고 글자가 입력되는 순간에만 발생하며, 
 키가 눌리고 있을 때는 발생하지 않습니다.
주로 텍스트 입력 관련 작업에 사용됩니다. 
예를 들어, 사용자가 입력한 키를 검사하여 특정 동작을 수행하거나 
입력 제한을 구현할 때 사용됩니다.
input 요소에만 적용됩니다.

키다운(keydown):

키다운 이벤트는 키를 누를 때 발생합니다. 
키가 눌렸을 때 발생하며, 사용자가 키를 누르고 있을 때도 계속해서
 발생합니다.
주로 게임이나 단축키 등의 구현에 사용됩니다. 
키가 눌렸을 때 특정 동작을 수행하거나,
 키를 누르고 있는 동안 지속적으로 어떤 동작을 수행해야 할 때 사용됩니다.
input, textarea 등 모든 요소에 적용됩니다.
따라서, 텍스트 입력과 관련된 동작을 구현할 때는 
주로 키프레스 이벤트를 사용하고, 
단축키나 게임 등에서는 키다운 이벤트를 사용합니다.
```

# input 에 숫자만 입력하도록 설정하는 4가지

[https://hianna.tistory.com/413](https://hianna.tistory.com/413) , [https://daily-struggle.tistory.com/41#google_vignette](https://daily-struggle.tistory.com/41#google_vignette)

```jsx
input에 숫자만 넣고 싶을 때 사용되는 정규식

<input type="text" 
    oninput="this.value = this.value.replace(/[^0-9.]/g, '')
    .replace(/(\..*)\./g, '$1');" />
    
'oninput' 이벤트는 input form의 값이 바뀌면 발생합니다.
oninput 이벤트가 발생했을 때, 숫자만 입력할 수 있는 정규식을 적용하여,
숫자가 아닌 다른 값이 입력되면 replace() 함수를 이용하여 값을 대체하도록 하였습니다.

```

```jsx
<tr>
		<th>주소(*)</th>
		<td><input type="text" maxlength="5" 
		style="text-align:center" 50px; o**ninput="this
		.value = this.value.replace(/[^0-9.]/g, '')
		.replace(/(\..*)\./g, '$1');" />**  
		도로명<input type="text" size="40" /> 
		상세<input type="text" placeholder="상세 주소" /> 
		<input type="button" value="우편번호 찾기" id="postcode" size="5" 
		style="width:100px" /></td>
</tr>
```

# javascript 정규식

[https://inpa.tistory.com/entry/JS-📚-정규식-RegExp-누구나-이해하기-쉽게-정리](https://inpa.tistory.com/entry/JS-%F0%9F%93%9A-%EC%A0%95%EA%B7%9C%EC%8B%9D-RegExp-%EB%88%84%EA%B5%AC%EB%82%98-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0-%EC%89%BD%EA%B2%8C-%EC%A0%95%EB%A6%AC)

# effect 및 애니메이션(animate) method

```jsx
$(요소선택).fade to ();
```

`slid up, fade in, fade to`

```jsx
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> 효과와 애니메이션 </title>  
<script src="js/jquery.js"></script>
<script>
$(function( ) {
	$(".btn2").hide();

	$(".btn1").on("click", function( ) {
		$(".box").slideUp(1000, "linear", 
		function( ) {
			$(".btn1").hide( );
			$(".btn2").show( );
		});
	});

	$(".btn2").on("click", function( ) {
		$(".box").fadeIn(1000, "swing", 
		function( ) {
			$(".btn2").hide( );
			$(".btn1").show( );
		});
	});

	$(".btn3").on("click", function( ) {
		$(".box").slideToggle(1000, "linear");
	});

	$(".btn4").on("click", function( ) {
		$(".box").fadeTo("fast", 0.3);
	});

	$(".btn5").on("click", function( ) {
		$(".box").fadeTo("fast", 1);
	});

});
</script>
<style>
	.content{
		width:400px;
		background-color: #eee;
	}
</style>
</head>
<body>
	<p>
		<button class="btn1">slideUp</button>
		<button class="btn2">fadeIn</button>
	</p>
	
	<p>
		<button class="btn3">toggleSide</button>
	</p> 
	
	<p>
		<button class="btn4">fadeTo(0.3)</button>
		<button class="btn5">fadeTo(1)</button>
	</p>  
	
	<div class="box">
		<div class="content">
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas feugiat consectetur nibh, ut luctus urna placerat non. Phasellus consectetur nunc nec mi feugiat egestas. Pellentesque et consectetur mauris, sed rutrum est. Etiam odio nunc, ornare quis urna sed, fermentum fermentum augue. Nam imperdiet vestibulum ipsum quis feugiat. Nunc non pellentesque diam, nec tempor nibh. Ut consequat sem sit amet ullamcorper sodales.
		</div>
	</div>
</body>
</html>
```

`on"click" function - .txt animate`

```jsx
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> 효과와 애니메이션 </title>  
<script src="js/jquery.js"></script>
<script>
$(function(){
	$(".btn1").on("click", function( ) {
		$(".txt1").animate({
			marginLeft:"500px",
			fontSize:"30px"
		},
		2000, "linear", function( ) {
			alert("모션 완료!"); //2000 =2초
		});
	});
	
	$(".btn2").on("click", function( ) {
		$(".txt2").animate({
			marginLeft:"+=50px"
		},1000);//1000 =1초
	}); 
});
</script>
<style>
	.txt1{background-color: aqua;}
	.txt2{background-color: pink;}
</style>
</head>
<body>
	<p><button class="btn1">버튼1</button></p>
	<span class="txt1">"500px" 이동</span>
	
	<p><button class="btn2">버튼2</button></p>
	<span class="txt2">"50px"씩 이동</span>
</body>
</html>
```

# jquery 비동기 방식 연동

```jsx
Ajax 메서드를 사용해서 현재 페이지가 아닌 외부에서 제공하는
,xml, json파일의 데이터를 불러오는 것

XML  =>확장 가능한 언어로, 태그명을 사용자가 임의로 작성할 수 있어 지식이 없어도 
사용가능하며 데이터 가공이 편하고 주로 데이터를 배포하기 위해 만듦
JSON =>자바스크립트의 객체표기법, 속성(Key)과 값(value)이 하나의 쌍을 이룸
```

```jsx
웹서버와 호스팅? : www. =>웹컨텐츠를 제공하는 서버
호스팅: 카페24,후이즈.. =>이미 서버가 구축된 외부컴퓨터를 요금내고 호스팅받아 서버 사용
```

```jsx
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> Ajax </title>
<script type="text/javascript" src="/js/jquery-3.7.1.min.js"></script>
<script>
	$(function() {
		$.ajax({
			url:"js/MOCK_DATA.json",
			dataType:"json",
			success:function(data) {
				if(data.length > 0) {
					var tb = $("<table />");
					for(var i in data) {
						var $id = data[i].id;
						var $first_name = data[i].first_name;
						var $last_name = data[i].last_name;
						var $email = data[i].email;
						var $gender = data[i].gender;

						var row = $("<tr />").append(
							$("<td />").text($id),
							$("<td />").text($first_name),
							$("<td />").text($last_name),
							$("<td />").text($email),
							$("<td />").text($gender)
						);

						tb.append(row);
					}
					$(".wrap").append(tb);
				}
			}
		});
	});
</script>
</head>
<body>
  <div class="wrap"></div>
</body>
</html>
```

```jsx
경로, 타입 확인, 정상적인 데이터를 가져오면 아래의 정보가 실행success:function(data) {}
			url:"js/MOCK_DATA.json",= success:function(data)의 데이터
			
						var tb = $("<table />"); => <table>
						                            <tr>
						                            <td></td>
						                            </tr>
						                            </table>
						                            
				$(".wrap").append(tb); =>붙이다.<div class="wrap"></div>에
				
				error:function(){} =>실패하면 실행할 코드
```

```jsx
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> Ajax </title>
<script type="text/javascript" src="/js/jquery-3.7.1.min.js"></script>
<script>
	$(function() {
			$("#loading").click(function() {
			$.ajax({
			url:"/js/MOCK_DATA.json",
			dataType:"json",
			success:function(data) {
				if(data.length > 0) {
					var tb = $("<table />");
					for(var i in data) {
						var $id = data[i].id;
						var $first_name = data[i].first_name;
						var $last_name = data[i].last_name;
						var $email = data[i].email;
						var $gender = data[i].gender;

						var row = $("<tr />").append(
							$("<td />").text($id),
							$("<td />").text($first_name),
							$("<td />").text($last_name),
							$("<td />").text($email),
							$("<td />").text($gender)
						);

						tb.append(row);
					}
					$(".wrap").append(tb);
				}
			}
		});
		})
	});
</script>
</head>
<body>
	<button id="loading">로딩 시작</button>
  <div class="wrap">대기중</div>
</body>
</html>
```

```jsx
자바스크립트의 보안 정책과 외부 데이터 바인딩

동일출처의 원칙 : 자신의 서버가 아니면 Ajax 서버 요청을 금지했었음
다른 방법을 사용해야함.

JSONP로 교차 도메인 데이터(XML) 불러오기 도 존재함. //(확인해보자)
```

```html
<script>
		$(function() {
			var $frm = $("#frmMain");
			
			$frm.on("submit", function(e) {
				
				if ($("#email").val().length <=7 || $("#passwd").val().length <= 7){
				alert("이메일/아이디와 비밀번호는 8자리 이상을 입력하세요.");
				return false;
				}
				
				e.preventDefault();
				var myData = $frm.serialize();
				alert(myData);
				
				$.ajax({
					type: "POST",
					url: $frm.attr("action"),
					data: myData,
					success:function(respond) {
						if(res) {
							var jsonData = JSON.parse(respond);
							//alert(jsonData);
							
							var message = "";
							alert("[" + jsonData.name + "]");
							
							if (jsonData.name != "") {
								message = jsonData.name
										+ "(" + jsonData.email
										+ ")" + "님 반갑습니다.";
							}
							else {
								message = jsonData.email
										+ ", 너 누구냐?";
							}
							
							$(".container").html(message);
						}
					}
				});
			});
		});
	</script>
```
