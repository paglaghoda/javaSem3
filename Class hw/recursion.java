public class recursion {
    
    public static int fibonum(int num){
        if (num==0){
            return 0;
        }
        else if (num==1){
            return 1;
        }  else {
            return fibonum(num-1)+fibonum(num-2);
        }
    }

    public static void main(String args[]){
        int num=10;

        for (int i=0; i<=num; i++) {
            System.out.print(fibonum(i)+" ");
            
        }
    }
    
}
