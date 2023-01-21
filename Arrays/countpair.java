
public class countpair {
    public static void main(String[] args) {
        String s="cabas";
        int n=s.length();
        String o="";
        String e="";
        for(int i=0; i<n; i++){
             o+=expand(s,i,i);
        }
        int l1

        for(int i=0; i<n-1; i++){
            ans= expand(s,i,i+1);
        }

        System.out.print(ans);
    }

    public static int expand(String s,int p1,int p2){
        while(p1>=0 && p2<s.length() && (s.charAt(p1)==s.charAt(p2)) ){
            p1--;
            p2++;
        }
        return p2-p1+1;
    }
    int n=A.length();
    String ans = "";
        for(int i=0;i<n;i++){
        int s1=i, s2=i, e1=i, e2=i+1;
        while(s1>=0 && e1<n && A.charAt(s1)==A.charAt(e1)){
            s1--; e1++;
        }
        int l1=e1-s1-1;
        while(s2>=0 && e2<n && A.charAt(s2)==A.charAt(e2)){
            s2--; e2++;
        }
        int l2=e2-s2-1;
        if(ans.length()<l1 || ans.length()<l2){
            if(l1<l2){
                ans=A.substring(s2+1,e2);
            }else{
                ans=A.substring(s1+1,e1);
            }
        }
    }
     return ans;

}


