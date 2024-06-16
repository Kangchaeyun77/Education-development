# Html 태그 정리

# 홈페이지 영역구분에 따른 태그

| <header> | 헤더 영역 |
| --- | --- |
| <main> | 메인 영역 |
| <section> | 콘텐츠 영역 |
| <aside> | 사이드 바 영역 |
| <footer> | 푸터 영역 |



# 문서구조

| <nav> | 내비게이션 영역,문서 내 다른 위치, 다른 문서로 연결할 때 사용 |
| --- | --- |
| <article> | 독립적인 콘텐츠를 사용할 때 |
| <section> | 콘텐츠 영역 |
| <div> | 여러 소스 묶기 |

# 텍스트 입력

| <h1>, <h2>, <h3>, <h4>, <h5>, <h6> | 제목 |
| --- | --- |
| <p> | 단락 |
| <br> | 줄 바꿈, 닫기태그 없음 |
| <blockquote> | 인용문, 들여쓰기 적용됨 |
| <strong> | 텍스트 굵게, 주로 중요한 내용일 때 |
| <b> | 텍스트 굵게, 단순히 굵게 표시할 때 |
| <em> | 텍스트 기울임, emphasis의 준말, 강조할 때 |
| <i> | 텍스트 기울임, italic의 준말, 단순히 기울여 표시할 때 |
| <u> | 텍스트 밑줄 |
| <s> | 텍스트 취소선 |
| <abbr> | 줄임말 |
| <cite> | 참고 내용 |
| <code> | 소스 코드 |
| <small> | 작은 텍스트 |
| <sub> | 아래 첨자 |
| <sup> | 위 첨자 |
| <ins> | 공동작업문서에 새로운 내용 삽입 |
| <del> | 공동작업문서에 기존 내용 삭제 |

# **목록 입력**

- **순서가 있는 목록(ol)**

```jsx
<ol>
  <li>항목 1</li>
  <li>항목 2</li>
</ol>
```

- **순서가 없는 목록(ul)**

```jsx
<ul>
  <li>항목 1</li>
  <li>항목 2</li>
</ul>
```

- **설명 목록 입력**

```jsx
<dl>
  <dt>이름</dt>
  <dd>설명</dd>
</dl>
```

# **표 입력**

```jsx
<table>
<tr>
<td>1행 1열</td>
<td>1행 2열</td>
</tr>
<tr>
<td>2행 1열</td>
<td>2행 2열</td>
</tr>
</table>
```

| table> | 테이블 만들기 |  |  |
| --- | --- | --- | --- |
|  | <caption> | 표 제목 |  |
|  | <tr> | 행 삽입 |  |
|  |  | <td> | 셀 삽입 |
|  |  | <th> | 셀 삽입(진하게 표시) |
|  | <thead> | 표 중 제목, 여러 페이지에 걸쳐 고정 가능 |  |
|  | <tbody> | 표 중 본문 |  |
|  | <tfoot> | 표 중 요약, 여러 페이지에 걸쳐 고정 가능 |  |

# <td>,<th>의 행,열 합치기 속성

| rowspan="2" | 2개의 행 합치기 |
| --- | --- |
| colspan="2" | 2개의 열 합치기 |

# 이미지 삽입

`<img src="이미지 파일 경로" alt="대체용 텍스트">`

| <img> | 이미지 삽입 |  |  |
| --- | --- | --- | --- |
|  | src= | 이미지 파일 경로 |  |
|  | alt= | 대체용 텍스트 |  |
|  | width=height= | 가로, 세로 크기 조절 |  |
|  |  | % | 브라우저 창의 크기 단위 |
|  |  | px | 픽셀 단위 |

# **오디오, 비디오 등 멀티미디어 파일 삽입**

- **<object> 기본형** - 오디오, 비디오, PDF등을 삽입할 때 사용한다.

```jsx
<object width="너비" height="높이" data="파일"></object>
```

- **<embed> 기본형** - **닫기 태그 없음,** 오디오, 비디오, 이미지 등 삽일할 때 사용한다.

```jsx
<embed src="파일 경로" width="너비" height="높이">
```

# **플러그인 필요 없이 브라우저에서 바로 재생하는 태그(html 5부터)**

```jsx
🔊 <audio> 기본형
<audio src="오디오 파일 경로"></audio>
🔊 <video> 기본형
<video src="비디오 파일 경로"></video>
```

# **<audio>, <video> 태그의 속성**

| controls= | 컨트롤 바 표시 |
| --- | --- |
| autoplay= | 자동 재생 |
| loop= | 반복 재생 |
| muted= | 음소거 |
| preload= | 로딩방법. 설정 - auto(기본값), metadata, none |
| width=, height= | 비디오 플레이어의 너비, 높이 지정 |
| poster="파일 이름" | 비디오 플레이어의 재생 전 포스터 |

```jsx
크롬 브라우저에서 비디오 자동 재생을 하려면 muted를 넣어야 한다. 
(muted autoplay loop)
```

# **하이퍼링크 삽입**

<a href="링크할 주소">텍스트 또는 이미지</a>

| <a> | 하이퍼 링크 삽입 |  |
| --- | --- | --- |
|  | href= | 링크 주소 |
|  | target="_blank" | 새 탭에서 열기 |

# **폼 입력**

```jsx
<form [속성="속성값"]>여러 폼 요소</form>
```

```jsx
<form>
method=get사용자 입력 내용이 **드러나게** 서버로 넘겨줌

post사용자 입력 내용이 **드러나지 않게** 서버로 넘겨줌

name=자바스크립트로 폼 이름 지정

action=서버 프로그램 지정

target=열어볼 파일 위치 지정

autocomplete=자동 완성 기능 지정(**기본값 on**)

**<fieldset>**폼 내부에서**구역**을 나눔

**<legend>구역 제목**붙이기
```

# **<label>**

```jsx
🔊 기본형 - <label>안으로 폼 요소 넣기 
<label>
	레이블명
	<input>
</label>

🔊 기본형 - for속성과 폼 요소의 id를 일치시키기(연결시키기)
<label for="id명">
	레이블명
    <input id="id명">
</label> 
```

# **<input> type 속성 값들**

| type= | text | 한 줄 텍스트 |
| --- | --- | --- |
|  | password | 비밀번호 |
|  | search | 검색 |
|  | url | url |
|  | email | 이메일 주소 |
|  | tel | 전화번호 |
|  | checkbox | 체크박스 (중복 체크) |
|  | radio | 라디오 버튼 (unique 체크) |
|  | number | 숫자 스핀 박스(버튼으로 숫자 조절) |
|  | range | 숫자 슬라이드 막대 |
|  | date | local - 연, 월, 일 |
|  | month | local - 연, 월 |
|  | week | local - 연, 주 |
|  | time | local - 시, 분, 초, 분할 초 |
|  | datetime | UTC - 연, 월, 일, 시, 분, 초, 분할 초 |
|  | datetime-local | local - 연, 월, 일, 시, 분, 초, 분할 초 |
|  | submit | 전송 버튼 |
|  | reset | 리셋 버튼 |
|  | image | submit 버튼 이미지 |
|  | button | 일반 버튼 |
|  | file | 파일 첨부 버튼 |
|  | hidden | 사용자에게 보이지 않는 값 필드 |

# **text, password와 같이 쓰이는 속성**

| size= | 화면에 출력할 글자 수 |
| --- | --- |
| value= | text 필드에 보여줄 내용. password에서 사용 안함 |
| maxlength= | 최대 입력 가능한 글자 수 |

# **checkbox, radio와 같이 쓰이는 속성**

| value= | 서버에 전달될 값 |
| --- | --- |
| checked= | 기본으로 선택하고 싶은 항목 |
| name= | radio 전용, 여러 옵션의 공통 이름 |

# **number, range와 같이 쓰이는 속성**

| min= | 최소값(기본값 0) |
| --- | --- |
| max= | 최대값(기본값 100) |
| step= | 조정할 단위값(기본값 1) |
| value= | 초기값 |

# **submit, reset와 같이 쓰이는 속성(버튼)**

| value= | 버튼에 표시할 내용 |
| --- | --- |

# **image와 같이 쓰이는 속성**

| src= | 이미지 경로 |
| --- | --- |
| alt= | 대체 텍스트 |

# **<input>의 다른 주요 속성들**

| autofocus= | 페이지를 불러오자마자 마우스 포인터가 표시예) autofocus |
| --- | --- |
| placeholder= | 힌트를 표시, 내용을 입력하면 사라짐예) 아이디를 입력하세요. |
| readonly= | 읽기 전용예) readonly="readonly"readonly="true" |
| required= | 필수 입력 필드예) required="required"required |

# **<input> 이외의 주요 태그들**

| <textarea> | 여러 줄의 텍스트 입력 영역 |  |  |
| --- | --- | --- | --- |
|  | rows= | 세로 줄 수, 길 경우 스크롤 막대가 생성됩니다. |  |
|  | cols= | 가로 너비(문자 단위) |  |

| <select> | 드롭다운 목록 생성 |  |  |
| --- | --- | --- | --- |
|  | size= | 항목 개수 |  |
|  | multiple= | 둘 이상의 항목을 선택 |  |
|  | <option> | 옵션 |  |
|  |  | value= | 서버에 전달될 값 |
|  |  | selected= | 기본 선택 항목 |

| <datalist> | 미리 입력된 데이터 목록 |  |  |
| --- | --- | --- | --- |
|  | <option> | value= | 서버에 전달될 값 |

| <button> | 버튼 |  |  |
| --- | --- | --- | --- |
|  | type="submit" | 폼을 서버로 전송 |  |
|  | type="reset" | 폼 초기화 |  |
|  | type="button" | 일반 버튼, <input type="button">과 같음 |  |

# Internet Explorer 브라우저의 최신 버전(Edge 모드)
에서 렌더링되도록 지시하는 역할 코드

```jsx
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
이 코드는 웹 페이지가 Internet Explorer 브라우저의 최신 버전(Edge 모드)
에서 렌더링되도록 지시하는 역할을 합니다. 
이렇게 함으로써, 웹 페이지가 더욱 일관되게 표시되고 
브라우저와의 호환성이 향상됩니다.
```

# html에서 캐시 없애는 태그

```jsx
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="expires" content="0" />\
```
