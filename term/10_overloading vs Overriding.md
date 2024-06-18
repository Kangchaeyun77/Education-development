# 자바 생성자 오버로딩 vs 생성자 오버라이딩

```java
생성자 오버로딩 (overloading)
외부에서 제공되는 다양한 데이터들을 이용해 객체를 초기화하려면, 
생성자도 다양화될 필요가 있습니다. 
그래서 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공합니다.
생성자 오버로딩이란 간단하게 말하면 매개 변수를 달리하는 생성자 여러개를 선언하는 것입니다.
```

```java
public class Car {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자
    Car() {
    }

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

```

```java
public class CarExample {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.company : 		" + car1.company);
        System.out.println("car1.company :		" + car1.company);
        System.out.println("car1.model 	 : 		" + car1.model);
        System.out.println("car1.color 	:		" + car1.color);
        System.out.println("car1.maxSpeed : 	" + car1.maxSpeed);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("car2.company :		" + car2.company);
        System.out.println("car2.company :		" + car2.company);
        System.out.println("car2.model 	 : 		" + car2.model);
        System.out.println("car2.color 	:		" + car2.color);
        System.out.println("car2.maxSpeed : 	" + car2.maxSpeed);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : 		" + car3.company);
        System.out.println("car3.model : 		" + car3.model);
        System.out.println("car3.color : 		" + car3.color);
        System.out.println("car3.maxSpeed : 	" + car3.maxSpeed);
        System.out.println();

        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company : 		" + car4.company);
        System.out.println("car4.model : 		" + car4.model);
        System.out.println("car4.color : 		" + car4.color);
        System.out.println("car4.maxSpeed : 	" + car4.maxSpeed);
    }
}

```

```java
생성자 오버로딩과 생성자 오버라이딩은 객체 지향 프로그래밍에서 중요한 개념이지만, 
서로 다른 용도로 사용됩니다. 각각의 차이를 아래에서 설명하겠습니다.
### 생성자 오버로딩 (Constructor Overloading)

생성자 오버로딩은 동일한 클래스 내에서 매개변수가 다른 여러 개의 생성자를 정의하는 것을 
의미합니다. 자바나 C++ 같은 언어에서 지원합니다.

- **목적**: 다양한 방법으로 객체를 초기화할 수 있게 하기 위해.
- **방법**: 동일한 이름의 생성자를 여러 개 정의하되, 각 생성자가 서로 다른 매개변수 목록을 가집니다.
```

- **예제 (자바)**:
    
    ```java
    public class Person {
        private String name;
        private int age;
    
        // 기본 생성자
        public Person() {
            this.name = "Unknown";
            this.age = 0;
        }
    
        // 매개변수가 하나인 생성자
        public Person(String name) {
            this.name = name;
            this.age = 0;
        }
    
        // 매개변수가 두 개인 생성자
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    
    ```
    
    ```java
    생성자 오버라이딩 (Constructor Overriding)
    생성자 오버라이딩은 엄밀히 말하면 존재하지 않는 개념입니다. 
    생성자는 클래스가 인스턴스화될 때 호출되며, 
    상속받은 클래스에서 부모 클래스의 생성자를 동일한 형태로 재정의할 수 없습니다. 
    대신, 상속받은 클래스에서 부모 클래스의 생성자를 호출하거나 
    추가적인 초기화 작업을 수행할 수 있습니다. 이를 위해 `super` 키워드를 사용합니다.
    
    - **목적**: 부모 클래스의 생성자를 호출하고 추가적인 초기화를 수행하기 위해.
    - **방법**: 자식 클래스에서 부모 클래스의 생성자를 호출한 후, 
    						자식 클래스만의 초기화를 추가합니다.
    ```
    
- **예제 (자바)**:
    
    ```java
    public class Parent {
        protected String name;
    
        public Parent(String name) {
            this.name = name;
        }
    }
    
    public class Child extends Parent {
        private int age;
    
        public Child(String name, int age) {
            super(name); // 부모 클래스의 생성자를 호출
            this.age = age; // 추가적인 초기화 작업
        }
    }
    
    ```
    
    ```java
    요약
    - **생성자 오버로딩**: 같은 클래스 내에서 매개변수가 다른 여러 생성자를 정의하여 
    											객체를 다양한 방법으로 초기화.
    - **생성자 오버라이딩**: 존재하지 않는 개념. 대신 상속 관계에서 자식 클래스가 
    												부모 클래스의 생성자를 호출하고 추가적인 초기화를 수행하는 것.
    
    이 두 개념은 혼동하기 쉽지만, 각자의 목적과 사용 방법이 다릅니다. 
    오버로딩은 다양한 초기화 방법을 제공하고, 
    오버라이딩은 상속 구조에서 부모 클래스의 초기화 메커니즘을 활용하면서 
    확장된 기능을 추가하는 데 사용됩니다.
    ```
