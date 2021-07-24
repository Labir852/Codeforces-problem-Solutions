#include<stdio.h>
#include<string.h>
int main()
{
    int n,i,countA=0,countD=0;
    scanf("%d",&n);
    char a[n];
    for(i=0;i<n;i++)
    {
        scanf(" %c",&a[i]);
        if(a[i]=='A')
            countA++;
        else if(a[i]=='D')
            countD++;
    }

    if(countA>countD)
        printf("Anton");
    else if(countD>countA)
        printf("Danik");
    else
        printf("Friendship");
    
    return 0;
}