#include <stdio.h>

int main() {
    float r, a;
    
    printf("Enter a number: ");
    scanf("%f", &r);
    
    a = 3.14 * (r * r);

    printf("The area is %f\n", a);

    return 0;
}
