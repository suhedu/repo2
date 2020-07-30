# Day09作业题干

## 选择题

### 题目1(单选): 

​	有关方法重载下列描述正确的是（C ） 

#### 选项 : 

​	A:  在多个类中，两个或者两个以上方法的名称一样，参数列表不一样，返回值必须一样，这些方法称之为重载 

  	B: 在同一个类中，两个或者两个以上方法的名称一样，参数列表不一样，返回值必须相同，这些方法称之为重载 

​	C:  在同一个类中，两个或者两个以上方法的名称一样，参数列表不一样，和返回值无关，这些方法称之为重载 

​	D:  在多个类中，两个或者两个以上方法的名称一样，参数列表必须一样，和返回值无关，这些方法称之为重载 



------

### 题目2(单选): 

​	下面关于方法的重载，描述错误的是（A ） 

#### 选项 : 

​	A:    方法重载，是指方法的名称相同，参数列表也相同的多个方法 

  	B:   方法重载，可以减少对方法名称的命名次数 

​	C:   方法重载，只能在同一个java类当中 

​	D:   方法重载，返回值类型可以不相同 



------

### 题目3(单选): 

​	下面关于方法的参数传递正确的是( C） 

#### 选项 : 

​	A:  方法的参数是基本数据类型, 形参的改变直接影响实参的值

  	B:  方法的参数是引用数据类型, 形参的改变不影响实参的值

​	C:  方法的参数是基本数据类型, 形参的改变不影响实参的值

​	D:  方法的参数是基本数据类型,传递的是地址值.方法的参数是引用数据类型, 传递的是数据值



------

### 题目4(单选): 

​	以下选项中，不属于方法重载的是（BC ） 

```java
A:
public class Demo{
  public int getSum(int a,byte b){
    return a + b;
  }
  
  public int getSum(int a,int b){
    return a + b;
  }
}

B：
public class Demo{
  public int getSum(int b,int a){
    return a + b;
  }
  
  public void getSum(int a,int b){
    System.out.println(a + b);
  }
}

C:
public class Demo{
  public long getSum(long a,int b){
    return a + b;
  }
  
  public long getSum(int a,long b){
    return a + b;
  }
}

D:
public class Demo{
  public void getSum(int a,int b){
    System.out.println(a + b);
  }
  
  public int getSum(int a,int b,int c){
    return a + b + c;
  }
}
```



------

### 题目5(单选): 

​	观察下面代码，最终在控制台显示 33 正确的方法调用格式是（C ） 

```java
public static void main(String[] args){
    //此处需要调用下面的某个方法，在控制台当中显示33
}

public static void printData(int a,int b){
    System.out.println(11); 
}

public static void printData(int a){
    System.out.println(22); 
}

public static void printData(boolean b){
    System.out.println(33); 
}

public static void printData(){
    System.out.println(44); 
}
```

#### 选项 : 

​	A:  printData(10,20);

  	B:  printData(333);

​	C:  printData(true)

​	D:  printData();



------

### 题目6(单选): 

​	下面代码执行之后，控制台显示的结果是（A ） 

```java
public static void main(String[] args){
    int[] arr = { 11,22,33,44,55 };
    method(arr);
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
}

public static void method(int[] arr){
    for(int i = 0 ; i < arr.length ; i++){
        if( i % 2 == 0 ){
            arr[i] += 100;
        }
    }
}
```

#### 选项 : 

​	A:  11    122   33   144  55 

  	B:  111    22   133   44   155 

​	C:  11    22    33    44    55 

​	D:  111   122    133   144   155 



------

### 题目7(单选): 

下列代码的运行结果是（B ） 

```java
public static void main(String[] args) {
    int arr[] = {1, 3, 5, 7, 9};
    int num = 10;
    showArray(arr, num);
    System.out.println("arr[2]的结果是:"+arr[2]);
    System.out.println("num的结果是："+num);
}
private static void showArray(int[] arr, int num) {
    arr[2] = 6;
    num = 1;
}
```

#### 选项 : 

​	A:     arr[2]的结果是：6 

​		num的结果是：1  

  	B:     arr[2]的结果是：6 

​		num的结果是：10  

​	C:     arr[2]的结果是：5

​		 num的结果是：1  

​	D:    arr[2]的结果是：5

​		num的结果是：10 



------

### 题目8(单选): 

​	下列代码的运行结果是（C  ） 

```java
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    changeArr(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+",");
    }
}

public static void changeArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2==1) {
            arr[i] = 10;
        }
    }
}
```

#### 选项 : 

​	A:  1，2，3，4，5， 

  	B:   1，10，3，10，5， 

​	C:   10，2，10，4，10， 

​	D:  10，10，10，10，10， 



------

## 代码题

### 题目9:

请定义一个方法，该方法可以实现对int类型的数组进行遍历，在控制台打印所有元素。实现方法后，请在主方法中调用方法，查看结果。例如，数组为{11, 22, 33}，打印格式为：[11, 22, 33] 

### 训练提示

1、首先明确方法的返回值和参数列表，该方法只需要在控制台输出，f返回值类型为void.要实现打印数组元素的功能，需要方法的调用者把想打印的数组传递过来，所以参数列表是int[] arr

2、方法实现之后，不调用的话会执行吗？该怎样调用？

### 操作步骤

1、定义方法，返回值类型为void，参数列表为int[] arr

2、在方法中，遍历数组，判断是否是最后一个元素，并且根据不同的情况输出不同的格式。

3、在主方法中定义一个数组，调用方法，将数组作为参数传递，查看运行结果。

### 参考代码



------

### 题目10:

请定义一个方法，实现交换整数数组中两个索引上的元素值。并调用方法，查看运行效果。

例如，数组为{11, 22, 33, 44, 55, 66}，交换索引1和索引5位置上的元素，结果为{11, 66, 33, 44, 55, 22}

### 训练提示

1、首先明确方法的返回值和参数列表，交换元素, 不需要具体返回值.我们要操作哪个数组，要交换哪两个索引上的元素，所以参数列表应该接收一个数组,和两个变量(代表的要交换的索引)

2、在方法中，如果交换两个数组中的元素, 需要根据索引进行交换

3、在主方法中，用void修饰的方法,如何调用？

### 操作步骤

1、定义方法，返回值void，参数列表 int[] arr, int index1, int index2。

2、在方法中，定义临时变量，交换两个索引上的元素值。

3、在主方法中，创建一个int数组，调用方法，将数组作为参数传递。然后遍历数组查看结果

### 参考代码



