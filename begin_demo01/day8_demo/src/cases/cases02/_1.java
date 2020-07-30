package cases.cases02;
/*
    目标：实现指定次数打印HelloWorld。

    需求：定义一个方法封装该功能完成:实现指定次数打印HelloWorld

    方法的格式：
        public static 返回值类型 方法名称(形参列表){
            方法体代码;
        }

    分析步骤：
        定义方法的两个明确：
        1.方法是否需要返回值类型申明：
            -- 不需要的，因为是直接输出！
        2.方法是否需要申明形参列表：
            -- 需要的，指定打印的次数：int n*/
public class _1 {
    public static void main(String[] args) {
        printHelloWorid(5);
        System.out.println("------------");
        printHelloWorid(2);
    }

    public static void printHelloWorid(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("HelloWorld");
        }
    }
}
