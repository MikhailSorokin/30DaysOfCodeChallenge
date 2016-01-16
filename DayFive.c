#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void addFactorialMultiply(int a, int b, int N) {
    int totalValue = a; //start off with 5
    
    for (int iter = 0; iter < N; iter++) {
        totalValue += pow(2,iter) * b;   
        printf("%d ", totalValue);
    }
    
    printf("\n");
}

int main() {

    int numberOfTests = 0;
    scanf("%d", &numberOfTests);
    
    int a = 0, b = 0, N = 0;
    for (int i = 0; i < numberOfTests; i++) {
        scanf("%d", &a);
        scanf("%d", &b);
        scanf("%d", &N);
        addFactorialMultiply(a, b, N);
    }
      
    return 0;
}
