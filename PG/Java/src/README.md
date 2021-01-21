### **Objective Oriented Programming (OOP)**
Created: January 21, 2021
#

**What is Object Oriented Programming (OOP) ?**<br>

OOP is based on the concept of **OBJECTS**.<br>
Objects can contain a:
- Data (Attributes or Properties)
- Actions (Forms or Methods)

Example: **A computer monitor**<br>
Properties:  
- Size (27' Monitor)
- Resolution (1920x1080)
- Refresh rate (144Hz)

Methods:
- Increasing or decreasing brightness
- Turning on/off

**The Four Pillars of OOP**
1. Abstraction
2. Inheritance
3. Polymorphism
4. Encapsulation

#
**1. ABSTRACTION**<br>
To only show the necessary details to the user of the object.<br>

```java
// Enemy.java

public class Enemy {
    int health;
    public void Talk() {
        System.out.println("I'm an enemy, you better run!")
    }
}
```

```java
// Main.java
// From a User's Persepective

class Main {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        enemy.Talk();
    }
}

// I'm an enemy, you better run!
```

The method `Talk()` is hidden from the User's Perspective.<br> 
The user only care about calling the method `Talk()` and does not care about the underlying implementation.

# 
**2. INHERITANCE**<br>
The process where one class acquires the properties of another.<br>

The class which inherits the properties of other is known as **subclass** (derived class, child class)<br>
The class whose properties are inherited is known as **superclass** (base class, parent class).

```java
// Enemy.java

public class Enemy {
    int health;
    public void Talk() {
        System.out.println("I'm an enemy, you better run!")
    }
}
```

```java
// Main.java

class Main {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        enemy.Talk();
    }
}

// I'm an enemy, you better run!
```

A new enemy appeared called Vampire!<br>
For the Vampire to be a proper enemy, it must inherit the attributes of the `Enemy()` class.<br>
**extends** is the keyword used to inherit the property of a class. 

```java
// Vampire.java

public class Vampire extends Enemy {
    // Completely empty class
}
```

```java
// Main.java

class Main {
    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        vampire.Talk();
    }
}

// I'm an enemy, you better run!
```

Even though the `Vampire()` class is empty, it has inherited the method `Talk()` from the `Enemy()` class thus, the ouput `"I'm an enemy, you better run!"`.<br>

**An example of Overriding a method**
```java
// Vampire.java

public class Vampire extends Enemy {
    int health;
    // Overriding Talk() from superclass
    public void Talk() {
        System.out.println("Lemme suck your blood!");
    }
}
```

```java
// Main.java

class Main {
    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        vampire.Talk();
    }
}

// Lemme suck your blood!
```

The `Vampire()` class will inherit the `Talk()` method from `Enemy()` class, however, since it has implemented it's own `Talk()` method, it will **override** the method from `Enemy()` class.

#
**3. POLYMORPHISM**<br>
Polymorphism is the ability of an object to take on many forms.<br>
Occurs when a parent class reference is used to refer to a child class object.

A friend of Vampire called Warewolf also wants to be a proper enemy. So, the Warewolf inherited the attributes of `Enemy()` class. A new enemy has appeared again!

```java
// Warewolf.java

public class Warewolf extends Enemy {
    int health;
    // Overriding Talk() from superclass
    public void Talk() {
        System.out.println("Awooooo!")
    }
}
```

```java
// Vampire.java

public class Vampire extends Enemy {
    int health;
    // Overriding Talk() from superclass
    public void Talk() {
        System.out.println("Lemme suck your blood!");
    }
}
```

`Enemy()` class as the parent class.<br>
`Vampire()` and `Warewolf()` classes are both child classes.

**Upcasting in Java**<br>
When **parent class** reference variable refers to **child class** object.

```java
// Main.java

class Main {
    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        Warewolf warewolf = new Warewolf();

        // Upcasting
        // enemy as reference, warewolf as object
        Enemy enemy = warewolf;
        enemy.Talk();
    }
}

// Awooooo!
```

When an overridden method is called by a reference, java determines which version of that method to execute based on the type of object it refer to. In simple words the type of object which it referred determines which version of overridden method will be called.

```java
// Main.java

class Main {
    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        Warewolf warewolf = new Warewolf();

        Enemy[] enemies = {vampire, warewolf};
        enemies[0].Talk();
        enemies[1].Talk();
    }
}

// Lemme suck your blood!
// Awooooo!
```

#
**4. ENCAPSULATION**<br>
In the process of gathering all my strength to learn this 4th pillar...

#
**Sources**<br>
- [Object Oriented Programming - The Four Pillars of OOP](https://youtu.be/1ONhXmQuWP8) by Keep On Coding
- [LEARN JAVA PROGRAMMING](https://www.tutorialspoint.com/java/index.htm)
- [What is OOPS](https://www.studytonight.com/java/object-and-classes.php) by Abhishek Ahlawat