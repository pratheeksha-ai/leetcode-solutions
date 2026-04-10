bool checkIfPangram(char* sentence) {
    int count[26]={0};
    for(int i=0;sentence[i]!='\0';i++)
    {
        int ch=sentence[i];
        if(isalpha(ch))
        {
            ch=tolower(ch);
            count[ch-'a']=1;
        }
    }
    for(int i=0;i<26;i++)
    {
        if(count[i]==0)
        {
            return false;
        }
    }
    return true;

    
}