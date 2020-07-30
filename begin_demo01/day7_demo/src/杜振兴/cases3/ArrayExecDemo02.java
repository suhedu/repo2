package 杜振兴.cases3;

public class ArrayExecDemo02 {
    public static void main(String[] args) {
        int[] faceScores = {5, 333, 44444, 55};
        int maxScore = faceScores[0];
        for (int i = 1; i < faceScores.length; i++) {
            int ele = faceScores[i];
            if (ele > maxScore){
                maxScore = ele;

            }        }
        System.out.println("最高颜值是: " + maxScore);
    }
}
