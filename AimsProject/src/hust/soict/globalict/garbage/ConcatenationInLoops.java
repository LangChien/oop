package hust.soict.globalict.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        long startTime, endTime;
        int n = 10000;

        // Using + operator
        startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time using + operator: " + (endTime - startTime) + " ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time using StringBuffer: " + (endTime - startTime) + " ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time using StringBuilder: " + (endTime - startTime) + " ms");
    }
}