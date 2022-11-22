class MaxNumber{
    public static void main(String[] args) {
        int num = 9999;
        System.out.println(maxNum(num));
    }
    public static int maxNum(int n){
        int ans=0;
        if(n>0){
            // first 6 -> 9 or if no 6 is present then last 9 -> 6
           int placeValue =  placeValue(n, 6);
           if(placeValue==0) ans = n-3;
           else ans=n + (int)(3*Math.pow(10, placeValue));
        }
        else{
            // first 9 -> 6 or if no 9 is present then last 6 -> 9
            int placeValue =  placeValue(n, 9);
            if(placeValue==0) ans = n-3;
            else ans=n + (int)(3*Math.pow(10, placeValue));
        }
        return ans;
    }
    public static int placeValue(int n,int digit){
        int count=0,ans=0;
        n=Math.abs(n);
        while(n!=0){
            if(n%10==digit) ans=count;
            n/=10;
            count++;
        }
        return ans;
    }

}