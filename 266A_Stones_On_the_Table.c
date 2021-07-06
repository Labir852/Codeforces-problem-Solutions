#include<stdio.h>
int main()
{
    int n,i,count=0;
    scanf("%d",&n);
    char stone[n];
    scanf("%s",&stone);
    for(i=0;i<n;i++)
    {
        if(stone[i]==stone[i+1])
        {
            count++;
        }
    }
    printf("%d", count);



}
