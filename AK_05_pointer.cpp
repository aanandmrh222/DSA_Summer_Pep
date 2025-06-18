#include<iostream>
using namespace std;

int main() {
    int a = 5;
    int *ptr = &a;
    cout<< &a<<endl;   // print adderss of a
    cout<< ptr<<endl;  // print adderss of a
    cout<< *ptr<<endl;  // print value of a, derefrencing pointer means getting value at that address

    int ref = a;
    cout << ref << endl; // print value of a using reference

    int x = 10;
    int *ptr2 = &x;
    int **ptr3 = &ptr2; // pointer to pointer
    cout <<ptr3 << endl; 
    cout << **ptr3 << endl; 
}
 
