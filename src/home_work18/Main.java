package home_work18;

public class Main {
    public static void main(String[] args){

        /*Գտնել սխալը  եւ ուղղել.
         long max = 3123456789;
           double d = 1000_.00;
            char i =’i’; char j=’j’; char ij = i +j;
             int 7a = 8;
              long h = h  + 8;
               int n, m = 11; m = n;  */
        double d = 1000_00;
        char i ='i';
        char j= 'j';
        char ij = (char) (i+j);
        int a = 9; //we can't use a number in type (int)
        long h = (long) +8;
        int n = 11;
        int m = n;

        System.out.println(d);
        System.out.println(ij);
        System.out.println(a);
        System.out.println(h);
        System.out.println(m);


    }
}
