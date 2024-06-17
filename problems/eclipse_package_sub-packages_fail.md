# 자바 하위 패키지 만들기 (1)

```java
문제 해결 방법
Eclipse 프로젝트 새로 고침 (Refresh):

프로젝트 탐색기에서 해당 프로젝트를 선택합니다.
마우스 오른쪽 버튼 클릭 -> Refresh를 선택합니다. (또는 F5 키를 누릅니다)
Build Path 확인 및 수정:

프로젝트 탐색기에서 src 폴더를 마우스 오른쪽 버튼 클릭합니다.
Build Path -> Configure Build Path를 선택합니다.
Source 탭에서 src 폴더가 Source Folder로 설정되어 있는지 확인합니다. 만약 설정되어 있지 않다면, Add Folder를 클릭하여 src 폴더를 Source로 추가합니다.
패키지로 전환:

만약 폴더 구조가 이미 존재하지만 패키지로 인식되지 않는다면, 패키지 이름을 변경하거나 새 패키지를 만들어 폴더로 이동할 수 있습니다.
프로젝트 탐색기에서 src 폴더를 마우스 오른쪽 버튼 클릭 -> New -> Package를 선택합니다.
kr.co.himedia.ecommerce.front.login.controller.service 패키지 이름을 입력하고 Finish를 클릭합니다.
이미 존재하는 폴더 내의 파일들을 새로 생성된 패키지로 드래그 앤 드롭합니다.
클린 및 빌드:

프로젝트 탐색기에서 프로젝트를 마우스 오른쪽 버튼 클릭 -> Project -> Clean을 선택합니다.
Clean 후 프로젝트를 다시 빌드(Build)합니다.
Eclipse 재시작:

위의 방법들이 모두 효과가 없다면 Eclipse를 재시작해 보세요.
예시
패키지 생성 예시
프로젝트 탐색기에서 src 폴더를 마우스 오른쪽 버튼 클릭 -> New -> Package를 선택합니다.
kr.co.himedia.ecommerce.front.login.controller.service 패키지 이름을 입력하고 Finish를 클릭합니다.
폴더에서 패키지로 전환 예시
프로젝트 탐색기에서 src/kr/co/himedia/ecommerce/front/login/controller/service 폴더를 마우스 오른쪽 버튼 클릭 -> Refactor -> Rename을 선택합니다.
패키지로 전환하고자 하는 이름을 입력합니다.
이 과정을 따라 하면 Eclipse가 해당 폴더를 패키지로 인식할 수 있도록 설정할 수 있습니다. 추가적인 문제가 발생하면 더 구체적인 오류 메시지나 상황을 공유해 주세요.
```

```java
패키지의 개념에서 
같은 레벨의 패키지를 하위로 넣을 경우 제대로 생성되지 않는다..

D:\Business\Eclipse\kr.co.himedia.sn.ecommerce7th.earth\src\kr\co\himedia\ecommerce\backoffice\product\controller
D:\Business\Eclipse\kr.co.himedia.sn.ecommerce7th.earth\src\kr\co\himedia\ecommerce\backoffice\product\dto
D:\Business\Eclipse\kr.co.himedia.sn.ecommerce7th.earth\src\kr\co\himedia\ecommerce\front\login\controller
```

```java
어렵게 생각할 필요없이 패키지는 곧 업무를 나눠 표기한 것이라고 이해하면 되고
이클립스 자체에서 생성하기 보다는 파일탐색기에서 폴더를 생성하면 그게 패키지가 된다.
혹시 폴더가 된다면 이클립스가 인식하지 못하는 띄어쓰기 및 특수문자가 들어간게 아닌가 생각해야함
```
