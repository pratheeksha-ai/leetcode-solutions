int numvalue(int c)
{
    switch(c)
    {
        case 'I':return 1;
                break;
        case 'V':return 5;
            break;
        case 'X':return 10;
                break;
        case 'L':return 50;
                break;
        case 'C':return 100;
                break;
        case 'D':return 500;
                break;
        case 'M':return 1000;
                break;
            
    }  
    return c;  
}
int romanToInt(char* s) {
    int total=0;
    for(int i=0;s[i]!='\0';i++)
    {
        int curr=numvalue(s[i]);
        int next=numvalue(s[i+1]);
        if(next>curr)
        {
            total-=curr;

        }
        else
        {
            total+=curr;
        }

    }
    return total;
}