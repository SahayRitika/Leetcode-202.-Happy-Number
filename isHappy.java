class Solution {
    public boolean isHappy(int n) {
        int d,sum=0;
        if(n==1 || n==7){
            return true;
        }
        while(n>9){
            while(n>0){
                d=n%10;
                sum+=(int)Math.pow(d,2);
                n/=10;
            }
          n=sum;
          //System.out.println(sum);  
          sum=0; 
        }
        if(n==1 || n==7)
        return true;
        else
        return false;
    }
}
