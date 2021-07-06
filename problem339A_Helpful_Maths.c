
#include <stdio.h>
#include<string.h>
int main()
{
    int n, c, d, swap;
    char array[100];



scanf("%s", array);

n = strlen(array);

  for (c = 0 ; c < n - 1; c++)
  {
    for (d = 0 ; d < n - c - 1; d++)
    {
      if(d%2==0)
        {
            if (array[d] > array[d+2])
            {
                swap       = array[d];
                array[d]   = array[d+2];
                array[d+2] = swap;
            }
        }
    }
  }

  puts(array);

    return 0;
}
