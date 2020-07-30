package practices;

import java.util.Scanner;

/*【Demo-08】
	1.提示用户键盘录入一个包含数字和字母的字符串（不用做是否包含数字和字母的判断），
	2.遍历字符串分别筛选出数字和字母，按照数字在前字母在后的规则，组成一个新的字符串，并将新字符串打印在控制台
*/
public class Practice_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个包含数字和字母的字符串:" );
        String s = sc.nextLine();
        int lenght = s.length();
        char[] numLetter = new char[lenght];
        for (int i = 0; i < lenght;i ++) {
            int j = s.charAt(i);
            if((j > 47 && j < 58) || (j > 96 && j < 123) || (j > 64 && j < 91)){
                numLetter[i] = s.charAt(i);
            }
        }
        for (int j = 0; j < lenght; j++) {
            int k = numLetter[j];
            if (k < 58 && k > 0){
                System.out.print(numLetter[j]);
            }
        }
        for (int j = 0; j < lenght; j++) {
            int k = numLetter[j];
            if(k > 58){
                System.out.print(numLetter[j]);
            }
        }
    }
}
