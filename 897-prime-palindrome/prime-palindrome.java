class Solution {
    public int primePalindrome(int n) 
    {
        if (n >= 8 && n <= 11)
        {
            return 11;
        }
        else if (n >= 12 && n <= 101)
        {
            return 101;
        }   
        else if (n >= 384 && n <= 727)
        {
            return 727;
        }
        else if(n >= 9989900 && n <= 100030001)
        {
            return 100030001;
        }
        int res=0;
        int i=n;
        int temp=i;
        while(res==0)
        {
            int sum=0;
            while(i!=0)
            {
                int r=i%10;
                sum=sum*10+r;
                i=i/10;
            }
            if(temp==sum && prime(sum))
            {
                res=sum;
                break;
            }
            else
            {
                temp++;
                i=temp;
            }
        }
        return res;
    }
    public static boolean prime(int x)
    {
        if(x<=1)
        {
            return false;
        }
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
}