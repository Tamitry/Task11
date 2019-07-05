public class Main {

    public static void main(String[] args) {
    }
    static void Task11(int a, int b, int c) {
        if ((a == b) && (c == b)) System.out.println("Равны.");
        else System.out.println("Неравны.");
    }
    static void Task12(double mass) {
        System.out.println(mass*1000);
        System.out.println(mass*1e6);
        System.out.println(mass/1000);
    }
    static void Task13(double r1, double r2) {
        if(r1<=r2){
            System.out.println("Радиус внешнего кольца меньше внутреннего.");
            return;
        }
        System.out.println((Math.PI*r1*r1)-(Math.PI*r2*r2));
    }
    static void Task14(int a) {
        int prev = 0;
        while (a!=0) {
            int n=a%10;
            a/=10;
            if(prev>=n){
                System.out.println("Неверно.");
                return;
            }
            prev=n;
        }
        System.out.println("Верно.");
    }
    static void Task15(int n) {
        int i = 0;
        double mul = 1.;
        double sum = 0;
        while (n!=0){
            int t=n%10;
            n/=10;
            sum+=t;
            mul*=t;
            i++;
        }
        System.out.println();
        System.out.println(sum/i);
        System.out.println(Math.pow(mul, 1.0/i));
    }
    static void Task16(int n) {
        int v = 0;
        while (n!=0){
            int t = n%10;
            v=(v+t)*10;
            n/=10;
        }
        v/=10;
        System.out.println(v);
    }
    static void Task17(int a, int b) { //Swapper
        System.out.println("Было: a = "+a+",b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Стало: a ="+a+",b = "+b);
    }
}
