#include <stdio.h>

int main() {
    int A[1001] = { 1,1 };
    int n;
    for (int i = 2; i < 1001; i++) {
        int value = 1;
        while (1) {
            A[i] = value;
            int k = 1;
            for (k = 1; 2 * k <= i; k++) {
                if (A[i] - A[i - k] == A[i - k] - A[i - 2 * k]) break;
            }
            if (i - 2 * k < 0)
                break; 
            else
              value++;
        }
    }
    printf("Type integer n: ");
    scanf_s("%d", &n);
    printf("%d\n", A[n]);
    return 0;
}
