# Day08作业题干

## 选择题

### 题目1(多选): 

​	下面关于方法的概述描述，正确的是（AB D） 

#### 选项 : 

​	A:  方法定义的先后顺序无所谓 

  	B:  方法的定义不能产生嵌套包含关系。 

​	C:  方法可以让程序的执行效率更高 

​	D:  方法定义好了之后，不会执行的，如果要想执行，一定要进行方法的调用 



------

### 题目2(多选): 

​	以下选项中，关于方法定义的参数或返回值描述正确的是（ABD ） 

#### 选项 : 

​	A:  方法的参数可以有，可以没有，也可以有多个 

  	B:  方法的参数就是定义一些变量，当方法被调用的时候，用来接收数据使用的 

​	C:  一个方法执行完成之后可以有一个返回值 ,也可以有多个返回值

​	D:  方法的返回值是方法执行完成之后得到的结果 



------

### 题目3(多选): 

​	关于对方法的调用，正确的是（AD ） 

#### 选项 : 

​	A:  有具体返回值的方法, 可以直接调用, 赋值调用以及输出调用

  	B:  无具体返回值的方法, 可以直接调用和输出调用

​	C:  有具体返回值的方法, 只能赋值调用和输出调用

​	D:  无具体返回值的方法, 只能直接调用



------

### 题目4(单选): 

代码如下：

```java
public static void main(String[] args){
   ________________________________
}

public static void method(){
    System.out.println("我是黑马程序员");
}
```

​	运行结果是：

​	我是黑马程序员

​	横线处应该填写的正确代码是（ C）

#### 选项 : 

​	A:  method;

  	B:  void v = method();

​	C:  method();

​	D:  method("我是黑马程序员");



------

### 题目5(多选): 

​	请观察以下代码，分别为第三行和第六行选出正确选项，保证可以在控制台上输出 

```java
public class Test08 {
    public static void main(String[] args){
	    _____①_____
    }

    public _____②_____ print() {	
        System.out.println("wo ai java");
    }
}
```

​	运行结果是：

​	wo ai java

​	横线处应该填写的正确代码是（B）

#### 选项 : 

​	A:  ①  void v = print();		②  static void	

  	B:  ①  print();				②  static void    

​	C:  ①  int v = print();		②  static int	

​	D:  ①  print();			②  static	



------

### 题目6(单选): 

​	下列方法定义格式正确的是（ B） 

```java
A:
public static void method1(){
    public static void method2(){
    }
}

B:
public static void method1(){
}

C:
public static void method1(){
   return 10;
}

D:
public static boolean method1(int n){
    if(n < 10){
        return false;
    }else if(n > 10){
		return true;
	}
}
```

#### 选项 : 

​	A:  选择A

  	B:  选择B

​	C:  选择C

​	D:  选择D



------

### 题目7(单选): 

观察以下代码，请选出方法调用过程的正确顺序（D ）

```java
public static void main(String[] args) {
    System.out.println("开始执行");	   //1
    int a = print(10);                //2
    System.out.println(a);		     //3
}
public static int print(int n){    	 //4
    n += 10;                         //5
    return n;          			    //6
}
```

#### 选项 : 

​	A:  1，2，3，4，5，6  

  	B:  1，2，4，6，5，3 

​	C:  1，4，5，6，2，3 

​	D:  1，2，4，5，6，3  



------

### 题目8: 

​	以下选项中，关于方法的调用过程描述正确的是 ( A) 

```java
public class Demo{
  public static void main(String[] args) {
     int a = 10;
     int b = 20;
     int sum = getSum(a,b);
     System.out.println(sum);
     isEquals(a, b);
  }

  public static int getSum(int a,int b){
     int sum = a + b;
     return sum;
  }
  
  public static void isEquals(int a,int b){
    boolean c = a == b;
    System.out.println(c);
  }
}
```

#### 选项 : 

​	A:  由java虚拟机调用main方法，main方法先执行 

  	B:  在main方法执行中，会定义a和b变量，并分别赋值10和20，然后先调用isEquals方法，再调用getSum方		 		法并输出结果 

​	C:  调用getSum方法时，要先传入两个整数，否则编译失败。然后执行getSum方法内的代码，执行完成之后，将结果返回赋值给int类型的变量sum 

​	D:  调用isEquals方法时，要先传入两个整数，否则编译失败。然后执行isEquals方法内的代码，执行完成之后，没有结果返回 



------

## 代码题

### 题目9:

数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试 

### 训练提示

1. 根据方法的功能描述，方法的参数应该接收一个double类型数据。
2. 小数的绝对值也是double，所以返回值类型也是double类型。

### 操作步骤

1. 定义一个小数变量num。

2. 定义获取绝对值的方法，方法的参数是一个double类型，返回值类型是double。

3. 在方法内部使用if..else..判断。

   3.1. 如果是负数则对负数取反并返回。

   3.2. 如果不是负数则直接返回数字本身。

4. 在主方法中调用绝对值方法，传入参数num,并接受返回值。

5. 打印返回的结果。

### 参考代码



------

### 题目10:

定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。

### 训练提示

1. 根据题意，方法中需要使用三个整数，所以方法参数应该是三个整数类型。
2. 方法需要有返回值，返回值的类型也是整数类型。

### 解题方案

### 操作步骤

1. 定义方法getMax()，方法的参数是三个int类型变量a,b,c，方法的返回值是int类型。
2. 在方法中使用多分支if...else...判断出最大值并返回。
3. 在主方法中调用getMax()方法并接受返回值。
4. 在主方法中打印结果。

### 参考代码
