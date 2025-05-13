Spring Dependency Injection: Constructor vs Setter (Primitive Types)
Welcome to this project that explores Spring Dependency Injection (DI) using both Constructor-based and Setter-based approaches with primitive types. Dive into understanding how Spring manages dependency injection in these two different styles and see how each approach works with primitive data types.

🎯 Project Overview
This repository consists of two distinct projects to demonstrate the different styles of dependency injection in Spring:

1. Constructor-based Dependency Injection (Primitive Types)
This project demonstrates how Spring injects primitive values into a class through its constructor. Learn how to use the DI container to inject values such as integers, strings, and booleans via constructor-based injection.

2. Setter-based Dependency Injection (Primitive Types)
This project highlights setter-based injection, where Spring calls setter methods to inject primitive values into a bean's properties. Discover how to configure and manage dependencies using setter methods in this setup.

🚀 Getting Started
Follow these simple steps to get up and running with the project:

1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/repository-name.git
2. Import into IDE
Eclipse/STS: Import as a Spring-based Maven project.

IntelliJ IDEA: Open the project folder directly.

3. Add Dependencies
Ensure the required dependencies are added in your pom.xml:

xml
Copy
Edit
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
4. Run the Project
Run the Test.java class in each project. Spring will automatically manage bean creation and dependency injection based on the configuration.

💡 Key Concepts
🔑 Constructor-based Dependency Injection
Spring uses the constructor to inject the necessary primitive values into the bean at the time of creation.

Preferred for required dependencies because it enforces immutability.

Example:
java
Copy
Edit
public class Student {
    private int studentId;

    public Student(int studentId) {
        this.studentId = studentId;
    }
}
🔑 Setter-based Dependency Injection
Spring uses setter methods to inject primitive values into a bean's properties.

Useful for optional dependencies where you can set values after the object creation.

Example:
java
Copy
Edit
public class Student {
    private int studentId;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
🗂️ Project Structure
plaintext
Copy
Edit
src/
│
├── com/
│   └── sit/
│       └── client/
│           └── Test.java
│       └── model/
│           ├── Student.java
│           └── beans.xml
├── Spring_Jar/
│   ├── spring-beans-5.3.18.jar
│   ├── spring-context-5.3.18.jar
│   ├── spring-core-5.3.18.jar
└── FirstSpringProject/
    └── FirstHibernate.xmlBase
⚡ How to Test
Constructor-based Injection:
Test Case: Inject an integer value (e.g., studentId) via the constructor.

Expected Outcome: Spring injects the primitive type and initializes the bean.

Setter-based Injection:
Test Case: Use setter methods to inject values into properties like studentId.

Expected Outcome: Spring invokes setter methods to assign values after bean instantiation.

🔍 Conclusion
This project provides a simple yet effective comparison of constructor-based vs setter-based dependency injection in Spring, specifically for primitive data types. Constructor-based injection is often more desirable for mandatory dependencies, as it ensures immutability of the object. However, setter-based injection is more flexible and suitable for optional dependencies.

Feel free to explore both approaches and enhance your understanding of Spring DI with this hands-on demonstration.
