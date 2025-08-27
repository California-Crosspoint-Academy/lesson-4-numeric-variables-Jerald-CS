//Auther Jerald Huang Period A
//2025-08-27

//Class notes

public class NumericVariables{
    public static void main(String[] args) {
        double x = 12.91, m = 128.12;
        System.out.println(x);
        System.out.println(m);

        int count =15;
        count = count + 3;
        System.out.println(count);

        int y = 3;
        System.out.println(++y); 

        double d = 20.3;
        double l =10.0;
        l*=d - 1;
        System.out.println(l); //193.0
        
        int q = 78;
        int p = 2 + q++;
        System.out.println("p = " + p + ", q = " + q); //p = 80, q = 79

        int w = 78;
        int u = ++w + 2;
        System.out.println("u = " + u + ", w = " + w); //u = 81, w = 79
    }
}