#include<stdio.h>
int main()
{
    int i,j,count=0,n;
    char string1[100];
    int string2[125];
    for(i=0;i<125;i++)
    {
        string2[i]=0;
    }

    scanf("%s",&string1);
    n = strlen(string1);

    for (i=0;i<n;i++)
    {
        for(j=0;j<125;j++)
        {
            if((string1[i]>='a'&& string1[i]<='z'))
            {
                string2[string1[i]]=1;
                break;
            }
        }
    }
    for(j=0;j<125;j++)
    {

        if(string2[j]!=0)
        {
            count++;
        }
    }
    if(count%2==0)
    {
        printf("CHAT WITH HER!");
    }
    else
    {
        printf("IGNORE HIM!");
    }
    return 0;
}
