public class Main {

    public static void main(String[] args) {

    }
    void Task11(int a, int b, int c) {
        if ((a == b) && (c == b)) System.out.println("Равны.");
        else System.out.println("Неравны.");
    }
    void Task12(double m) {
        System.out.println(m*1000);
        System.out.println(m*10e6);
        System.out.println(m/1000);
    }
    void Task13(double r1, double r2) {
        if(r1<=r2){
            System.out.println("Радиус внешнего кольца меньше внутреннего.");
            return;
        }
        System.out.println((Math.PI*r1*r1/2)-(Math.PI*r2*r2/2));
    }
    void Task14(int a)
    {
        int []b = new int[4];
        for(int i=0;i<4;i++){
            b[i] = a%10;
            a/=10;
        }
        for(int i=0;i<3;i++){
            if(b[i]<=b[i+1]){
                System.out.println("Неверно.");
                return;
            }
            System.out.println("Верно.");
        }
    }
    void Task151(int n){
        int temp = n;
        int i = 0;
        double sum = 0;
        while (temp!=0){
            temp/=10;
            i++;
        }
        int b[] = new int[i];
        for(int j=0;j<i;j++){
            b[j]=n%10;
            n/=10;
        }
        for(int t:b){
            sum+=t;
        }
        System.out.println(sum/i);
    }
    void Task152(int n)
    {
        int temp = n;
        int i = 0;
        double mul = 0;
        while (temp!=0){
            temp/=10;
            i++;
        }
        int b[] = new int[i];
        for(int j=0;j<i;j++){
            b[j]=n%10;
            n/=10;
        }
        for(int t:b){
            mul*=t;
        }
        System.out.println(Math.pow(mul, 1.0/i));
    }
    void Task16(int n){
        int temp = n;
        int i = 0;
        int v = 0;
        double mul = 0;
        while (temp!=0){
            temp/=10;
            i++;
        }
        int b[] = new int[i];
        for(int j=0;j<i;j++){
            b[j]=n%10;
            n/=10;
        }
        for(int j=0;j<i;j++){
            v=v*10+b[j];
        }
        System.out.println(v);
    }
    void Task17(int a, int b){ //Swapper
        a=a+b;
        b=a-b;
        a=a-b;
    }

}
