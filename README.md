
# Spring Dependency Injection: Constructor vs Setter (Primitive Types)

This repository demonstrates how to implement **Dependency Injection (DI)** in Spring Framework using **primitive types** through two different approaches: **constructor-based** and **setter-based** injection.

---

## 📁 Projects Overview

### 🔹 1. `Fifth_Dependency_Injection_constructorbase_primivetype`
- Demonstrates **constructor-based** injection.
- Injects primitive values like `int`, `String`, and `boolean` using class constructors.
- Uses Spring's XML configuration (`beans.xml`) to wire the values at bean instantiation.

### 🔹 2. `FourthSpring_Dependency_Injection_setterbase`
- Demonstrates **setter-based** injection.
- Injects primitive values through setter methods.
- Values are configured in the `beans.xml` and injected after bean instantiation.

---

## 🧰 Prerequisites

Make sure the following are installed:

- Java 8 or higher  
- Spring Framework 5.x  
- Maven  
- IDE like IntelliJ IDEA or Eclipse  

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/your-repo-name.git
````

### 2. Import into IDE

* Open as a Maven project.
* Let the IDE resolve dependencies.

### 3. Add Spring Dependencies (`pom.xml`)

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.18</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <version>5.3.18</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.3.18</version>
    </dependency>
</dependencies>
```

### 4. Run the Application

* Navigate to the `Test.java` class in each project.
* Right-click and run it as a Java Application.

---

## 📚 Key Concepts

### ✅ Constructor-based Injection

Spring injects values through the class constructor.

```java
public class Student {
    private int studentId;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}
```

### ✅ Setter-based Injection

Spring injects values via setter methods after bean creation.

```java
public class Student {
    private int studentId;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}
```

---

## 🗂 Project Structure

```
src/
├── com/sit/client/
│   └── Test.java
├── com/sit/model/
│   ├── Student.java
│   └── beans.xml
Spring_Jar/
├── spring-beans-5.3.18.jar
├── spring-context-5.3.18.jar
└── spring-core-5.3.18.jar
```

---

## 🧪 How to Test

### 🔹 Constructor Injection

* Set primitive values in `beans.xml` under constructor-arg tags.
* Run `Test.java` and observe the values injected into the bean constructor.

### 🔹 Setter Injection

* Set primitive values in `beans.xml` using property tags.
* Run `Test.java` and check the setter methods being invoked.

---

## ✅ Conclusion

This mini-project offers a hands-on comparison between:

* **Constructor-based DI** – Best for required values, promotes immutability.
* **Setter-based DI** – More flexible, allows optional value injection.

Both are valid Spring DI techniques. Explore both to understand where and when to apply them!

---

> 📌 *Feel free to fork this repo, play with the configuration, and extend it to include object-type injections or annotations-based DI!*

`
