#include <stdio.h>

int main()
{
    int xa, ya, xb, yb ,a ,b, length;
    printf("xa = ");
    scanf("%d", &xa);
    printf("ya ");
    scanf("%d", &ya);
    printf("xb = ");
    scanf("%d", &xb);
    printf("yb = ");
    scanf("%d", &yb);

    a = xa + ya;
    b = xb + yb;
    
    length = abs(a - b);
    printf("Length = %d", length);
}