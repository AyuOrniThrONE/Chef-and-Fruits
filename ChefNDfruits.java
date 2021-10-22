import java.util.*;

public class ChefNDfruits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        if (1<=t && t<=100) {
            for (int i = 0; i < t; i++) {
                int n=sc.nextInt();
                int m=sc.nextInt();
                int k=sc.nextInt();
                int diff=0;
                int instance=0;
                if (1<=n && n<=100 && 1<=m && m<=100 && 1<=k && k<=100) {
                    if (n>m) {
                        if (k==n || k==m) {
                            diff=0;
                        }else{
                        instance=n-k;
                        diff=instance-m;
                        }
                    }
                    else if(m>n){
                        if (k==n || k==m) {
                            diff=0;
                        }else{
                        instance=m-k;
                        diff= instance-n;
                        }
                    }
                }
                System.out.println(diff);
            }

        }
    }
}
