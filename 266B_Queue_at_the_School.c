#include<stdio.h>
int main()
{
    int n, t,i,x,temp;
    scanf("%d %d",&n,&t);
    x=t;
    char queue[n];
    for(i=0;i<n;i++)
    {
        scanf(" %c",&queue[i]);
    }

    while(x!=0)
    {
        for(i=0;i<n;i++)
        {
            if(queue[i+1] == 'G' && queue[i] == 'B')
            {
                temp = queue[i];
                queue[i] = queue[i+1];
                queue[i+1] = temp;
                i++;
            }
        }
        x--;
    }
    for(i=0;i<n;i++)
    {
        printf("%c",queue[i]);
    }

    return 0;
}
