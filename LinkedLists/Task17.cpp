#include <stdio.h>
#include <iostream>
using namespace std;

int main() {
    int x = 10;
    int* p = &x;  // p holds the address of x

    cout << "x = " << x << "\n";             // value: 10
    cout << "p (address of x) = " << p << "\n";  // e.g. 0x7ffee...
    cout << "*p (value at that address) = " << *p << "\n"; // also 10

    *p = 50;  // modifies x through the pointer
    cout << "Now x = " << x << "\n";         // prints 50

    return 0;
}
