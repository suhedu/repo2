package practices;
/*【Demo-02】分析并完成以下需求:
1.打印[1,1000]的整数，但数字中包含5，或者是5的倍数的数字要跳过
2.要求控制台每行打印6个满足条件的数，之间用空格分隔
例如:
1 2 3 4 6 7
8 9 11 12 13 14
16 17 18 19 21 22
...
*/
public class Practice_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if(i % 5 ==0){
                continue;
            }
            System.out.print(i + " ");
            count ++;
            if (count % 6 ==0){
                System.out.println();
            }
        }
    }
}
