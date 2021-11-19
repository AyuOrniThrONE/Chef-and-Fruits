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
                int ans=Math.abs(n-m);

                if (1<=n && n<=100 && 1<=m && m<=100 && 1<=k && k<=100) {
                    ans-=k;
                    if (ans<=0) {
                        ans=0;
                    }    
                }
                System.out.println(ans);
            }

        }
    }
}
