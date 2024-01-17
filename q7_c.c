#include <stdio.h>

int main() {
    int a = 1, b = 0;
    printf("a = %d\nb = %d\n\n", a, b);

    printf("exemplo 1\n");
    printf("(a^b): %d\n\n", (a && b)); 

    printf("exemplo 2\n");
    printf("(a ˅ b): %d\n", (a || b)); 

    return 0;
}
