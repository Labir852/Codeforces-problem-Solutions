#include<stdio.h>
int main()
{
    int x,step;
    scanf("%d",&x);

    step = (x/5);
    if(x%5<=5 && x%5 >0)
    {
        step += 1;
    }
    else if(x%5 >5 && x%5<=10)
    {
        step += 2;
    }
    printf("%d",step);
}
