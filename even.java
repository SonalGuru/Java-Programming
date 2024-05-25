import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int sum =  0;
        for(int i=0;i<=n;i++){
            if(i % 2 == 0){
                sum = sum+i;
            }
            System.out.println(sum);
        }
    }
    
}
