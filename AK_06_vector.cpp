#include<iostream>
#include<vector>
using namespace std; 

int main() {
    vector<int> v1;

    v1.push_back(10);
    v1.push_back(20);
    v1.push_back(30);
    v1.push_back(40);
    v1.push_back(50);

    cout << "Size of vector: " << v1.size() << endl;

    cout << "Capacity of vector: " << v1.capacity() << endl;
    cout << v1[0] << endl; 
    cout << v1.at(1) << endl;

    for(int i=0; i<v1.size(); i++) {
        cout << v1[i] << " "; 
    }
    cout << endl;

    for(int i : v1) {
        cout << i << " ";
    }
}