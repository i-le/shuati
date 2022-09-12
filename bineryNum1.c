/******************************************************************************

STEPHEN ZHENG @ HW2 PROBLEM 3.62
Algrithm: using mathmatical operator % to get the binary numbers of integers
store each binary numbers in a int array

*******************************************************************************/
#include <stdio.h>


void decToBin(int bin[], int dec){
    
    // declare the least significant bit to binNum[7]
    int least = 7;
    // set the decimal contidtion and loop thru
    // % any integers will always get 1 or 0
    while(dec > 0){
        // find the current point of decimal
        int a = dec % 2;
        // moving into next right decimal 
        dec = dec / 2; 
        //store current decimal into bin, and move the pointer rightwards, 7 -> 6 -> 5 ..
        bin[least] = a;
        least--;
    }
}

int main() {
    // declare binary array
    int binary[8] = {0};
    // declare input decimal
    int input = 0;
    // print enter info
    printf("enter number");
    // read enter info
    scanf("%d",&input);
    decToBin(binary,input);
    //print the binary format of number
        for(int i = 0; i < 8; i++){
            printf("%d ", binary[i]);
        }
}
        

