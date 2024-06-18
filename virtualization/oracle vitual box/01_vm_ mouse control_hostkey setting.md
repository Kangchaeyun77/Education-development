# Oracle Vitual Box network setting

날짜: 2024년 6월 18일

```java
VirtualBox에서의 네트워크 모드는 다음에서 보이는 것처럼 총 8가지이지만, 
이 중 우리가 가상머신 활용 목적으로 많이 사용하는 **6가지 모드**에 대해 알아보고자 한다.
```

![https://blog.kakaocdn.net/dn/PBTdN/btrjmoo68eT/dffMJh6iug0OfXMfczYWI1/img.png](https://blog.kakaocdn.net/dn/PBTdN/btrjmoo68eT/dffMJh6iug0OfXMfczYWI1/img.png)

Guest PC에서의 네트워크 설정 화면

```java
1. **NAT** 모드
일반적으로 Guest OS 가 부팅되면, IP 주소를 얻기 위해 DHCP를 사용한다. 
NAT 모드에서는 **VirtualBox가 DHCP 요청을 처리**하고, 
Guest OS에게 할당된 IP주소와 라우팅을 위한 게이트웨이 주소를 알려주는데, 
이때 각각의 모든 가상머신들이 별도의 설정이 없다면 동일한 IP 주소(10.0.2.15)를 할당 받는다.

그 이유는, 
NAT 모드에서는 각각의 가상머신이 그들만의 독립된 네트워크 안에 속해있는 것으로 
가상화 되기 때문이다.
따라서, 각각의 가상머신들이 그들의 트래픽을 게이트웨이로 보내면,
 VirtualBox는 각각의 가상머신의 패킷을 Guest(나의 PC에서 작동하는 가상머신)가 아닌
  **Host(나의 PC)가 보내는 패킷처럼 재작성**하게 된다.

이는 곧, **Host의 네트워크 연결 상태 = Guest의 네트워크 연결 상태**를 의미한다. 
또한 이는 Host의 외부에서 Guest에 접근하는 것이 포트포워딩 등의 방법을 제외한
 **일반적인 방법으로는 불가**하다는 것을 의미한다. 
따라서 **포트 포워딩** 기법이 필요한 것이다.
```

![https://blog.kakaocdn.net/dn/b24URy/btr07AFYWcs/t9wL3vVszWzbS1Xf7CJw7k/img.png](https://blog.kakaocdn.net/dn/b24URy/btr07AFYWcs/t9wL3vVszWzbS1Xf7CJw7k/img.png)

```java
NAT 모드 개념
- **Guest -> Host : O**
- **Guest <- Host : 포트 포워딩**
- **Guest <-> Guest : X**
- **Guest -> 인터넷 : O**
- **Guest <- 인터넷 : 포트 포워딩**
```

```java
2. **NAT 네트워크** 모드
NAT 네트워크 모드는 NAT와 거의 동일하지만, **Guest 간에 통신이 가능하다**는 점만 다르다.
Guest를 통해 인터넷 접속은 원하지만, 
**외부로부터의 Guest에 대한 접근 차단**을 원할 때 주로 사용한다.
```

![https://blog.kakaocdn.net/dn/bb0LvJ/btr0KHNsLws/6I9hKN1RcYVk1fOY1onp00/img.png](https://blog.kakaocdn.net/dn/bb0LvJ/btr0KHNsLws/6I9hKN1RcYVk1fOY1onp00/img.png)

```java
NAT 네트워크 모드 개념
- **Guest -> Host : O**
- **Guest <- Host : 포트 포워딩**
- **Guest <-> Guest : O**
- **Guest -> 인터넷 : O**
- **Guest <- 인터넷 : 포트 포워딩**
```

```java
3. **Briedge(브릿지)** 모드
브릿지 모드는 가상머신이 **Host와 같은 네트워크에 존재**하게 하고 싶은 경우 사용하게 된다.

이 경우, 가상 NIC는 Host의 Physical NIC에 '연결'된다. 
이 때문에, ISP에서 제공하는 **Public IP(공인 IP) 주소를 많이 보유할 수 있을 경우** 사용한다. 
또한, Host가 여러 Physical NIC를 사용하는 경우, Host의 네트워크 환경이 바뀔 때마다 가상머신의 브릿지 연결도 재설정 해주어야 하는 단점이 있다.

그러나, 외부 또는 Host에서 접근할 때에 가상머신은 하나의 기기로서 작동 할 수 있기 때문에, 
포트 포워딩과 같은 별도의 설정 없이 **가상머신의 IP만으로 접근이 용이하다**는 강한 장점이 있다.
```

![https://blog.kakaocdn.net/dn/bdtYJF/btrjqqnam1e/0csd0ZLSFwxPPUWSHoW3g0/img.png](https://blog.kakaocdn.net/dn/bdtYJF/btrjqqnam1e/0csd0ZLSFwxPPUWSHoW3g0/img.png)

```java
Briedge 모드 개념
- **Guest -> Host : O**
- **Guest <- Host : O**
- **Guest <-> Guest : O**
- **Guest -> 인터넷 : O**
- **Guest <- 인터넷 : O**
```

```java
4. **호스트 전용 어댑터** 모드
Guest의 외부 네트워크와의 접근은 아예 차단되며, **Host와 Guest 간의 연결만 허용**되는 경우이다. 이러한 점 때문에,

**개발환경으로 세팅**을 한다면 사용하기 좋은 네트워크 구성이다. 
참고로, 이 네트워크 모드에서 VirtualBox는 DHCP 서버를 제공하므로, Guest마다 IP를 할당할 수 있다.
```

![https://blog.kakaocdn.net/dn/ckQ481/btrjAfxJwVa/JtvtAuKT5OlfeJpTjz4rZK/img.png](https://blog.kakaocdn.net/dn/ckQ481/btrjAfxJwVa/JtvtAuKT5OlfeJpTjz4rZK/img.png)

```java
호스트 전용 어댑터 모드 개념
- **Guest -> Host : O**
- **Guest <- Host : O**
- **Guest <-> Guest : O**
- **Guest -> 인터넷 : X**
- **Guest <- 인터넷 : X**
```

```java
5. **내부 네트워크** 모드
호스트 전용 어댑터 모드에서 Host와의 연결조차 끊긴 경우라고 생각하면 된다. 
즉, Guest 간의 통신만 가능하다.

악성코드 분석 등의 보안 분석 시스템에 활용되며, DHCP와 같은 서비스를 제공하지 않으므로, 
시스템을 정적(Static)으로 구성하거나, DHCP / Name 서비스를 제공하는 별도의 가상머신이 필요하다.
```

![https://blog.kakaocdn.net/dn/bruu9a/btrjxdUKY4g/WTZuIP2oUrtsnwCX0kcRKk/img.png](https://blog.kakaocdn.net/dn/bruu9a/btrjxdUKY4g/WTZuIP2oUrtsnwCX0kcRKk/img.png)

```java
내부 네트워크 모드 개념
- **Guest -> Host : X**
- **Guest <- Host : X**
- **Guest <-> Guest : O**
- **Guest -> 인터넷 : X**
- **Guest <- 인터넷 : X**
```

```java
6. **일반 드라이버** 모드
이 모드는 사실 거의 사용되지 않는 모드이다. 
UDP 터널 네트워킹과 VDE(Virtual Distributed Ethernet) 기능을 지원한다.
또한 이 모드는 아래 6개 종류의 이더넷 카드(LAN 카드)만 사용 가능하다.

- AMD PCNet PCI II (Am79C970A)
- AMD PCNet FAST III (Am79C973, the default)
- Intel PRO/1000 MT Desktop (82540EM)
- Intel PRO/1000 T Server (82543GC)
- Intel PRO/1000 MT Server (82545EM)
- Paravirtualized network adapter (virtio-net)
```

```java
지금까지 VirtualBox의 6가지 네트워크 모드에 대해서 알아봤다. 어떠한 시스템을 구성할 때에는, 그 시스템의 보안 사항이나 외부 또는 Host와의 접속 가능 여부 등의 요구사항을 우선 충분히 고려한 후, 해당 시스템에 맞게끔 VirtualBox의 네트워크 모드를 잘 선택하여 구성하여야 한다. 
시스템을 먼저 구성한 후에 네트워크 구성을 수정하려고 하면, 매우매우 귀찮은 상황이 생길 수 있다. 심지어는 OS를 다시 깔고 시스템을 재구성해야 하는 상황이 올지도 모른다...

**요구사항을 초기에 충분히 고려하고, 초기에 신중하게 설정하자!**
```
