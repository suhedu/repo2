package practices;

import java.util.Scanner;

/*
    【Demo-09】
	提示用户录入一串字符串，要求字符串中必须存在字母（需要判断）
		不符合要求：提示用户重新录入
		符合要求：判断字符串中大写字母出现次数并打印
		示例：
			请录入带字母的字符串：
			道北無彦祖666
			录入有误！请重新录入带字母的字符串：
			itheima666
			录入的字符串中包含大写字母0个
*/
public class Practice_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       do{
           System.out.print("请输入一个带有字母的字符串： ");
           String s = sc.nextLine();
           int count = 0;
           int count01 = 0;
           for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i);
            if((j > 96 && j < 123) || (j > 64 && j < 91)){
                count ++;
            }
            if (j > 64 && j < 91){
                count01 ++;
            }
        }
           switch (count){
               case 0:
                   System.out.println("录入有误！请重新录入带字母的字符串：");
                   continue;
               default:
                   System.out.println("录入的字符串中包含大写字母" + count01 + "个");
                   break;
           }
       }while (true);
    }
}
