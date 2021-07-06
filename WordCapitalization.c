#include<stdio.h>
int main()
{
    char array[1000];
    scanf("%s",&array);
    int i,n;

    if (array[0]>= 'a' && array[0] <= 'z')
      {
         array[0] = array[0] - 32;
      }
    printf("%s",array);
}
