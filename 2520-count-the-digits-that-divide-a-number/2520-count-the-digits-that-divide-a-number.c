int countDigits(int num) {
    int digit=0,count=0;
    int originalnum=num;
    while(num>0)
    {
        digit=num%10;
        if(originalnum%digit==0)
        {
            count=count+1;
        }
        num=num/10;
    }
    return count;
    
}