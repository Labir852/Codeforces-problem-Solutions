#include<stdio.h>
int main()
{
    int i,j,count=1;
    char input[100];
    scanf("%s",input);
    for(i=0;i<strlen(input);)
    {
        for(j=i+1;j<strlen(input);j++)
        {
            if(input[i]!=input[j])
            {
                if(count<7)
                {
                    count = 1;
                }
                break;
            }
            else if(input[i] == input[j])
            {
                count++;
            }
        }
        i=j;
    }
    if(count>=7)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }

}
