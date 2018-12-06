package FibbonaciWord;

public class Main {
    static String n1="0",n2="1",n3="",n4="";

    public static void main(String[] args) {
        int count=10;
        printFibo(count);
    }

    static void printFibo(int count){
        if(count>0){
            System.out.println(n1);
            n3 = n1;
            n1 += n2;
            n2 = n3;
            printFibo(count-1);
        }
    }
}
