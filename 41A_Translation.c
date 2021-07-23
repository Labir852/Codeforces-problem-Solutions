
#include<stdio.h>
#include<string.h>
int main()
{
    char word[100], trans[100],rev[100];
    scanf("%[^\n]%*c",&word);

    scanf("%[^\n]%*c",&trans);

    int i =0,count=0,n=0;
    while(word[count]!=0)
    {
        count++;
    }
    for(i=0;i<count;i++)
    {
        rev[i] = word[count-i-1];
    }
    rev[i] = '\0';


    for(i=0;i<count;i++)
    {
        if(rev[i] == trans[i])
        {
            n++;
        }
    }
    if (count == n)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }



    return 0;
}
