bool isPalindrome(int x) {
    long long sum=0;
    int num=x;
    int digit;
    while(num>0)
    {
        digit=num%10;
        sum=sum*10+digit;
        num=num/10;
    }
    if(x==sum)
    return true;
    else
    return false;
    
}