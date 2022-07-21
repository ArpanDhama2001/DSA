#include<iostream>
using namespace std;

struct Node {
  int data;
  Node *next;
  Node(int val = 0) {
    data = val;
    next = NULL;
  }
};

class LinkedList {
  Node *head;
public:

  LinkedList() {
    head = NULL;
  }

  void insertAtEnd(int data) {
    Node *newNode = new Node(data);
    if(head == NULL) {
      head = newNode;
      return;
    }
    Node *temp = head;
    while(temp->next != NULL) {
      temp = temp->next;
    }
    temp->next = newNode;
  }

  void insertAtBeginning(int data) {
    Node *newNode = new Node(data);

    if(head == NULL) {
      head = newNode;
      return;
    }
    newNode->next = head;
    head = newNode;
    return;
  }

  void insetAtKth(int k, int data) {
     Node *newNode = new Node(data);
     if(head == NULL) {
        head = newNode;
        return;
     }
     if(k == 0) {
       newNode->next = head;
       head = newNode;
       return;
     }
     Node *temp = head;
     while(temp->next != NULL && --k) {
       temp = temp->next;
     }
     newNode->next = temp->next;
     temp->next = newNode;
     return;
  }

  Node *middle() {
    Node *slow = head, *fast = head;
    while(fast != NULL && fast->next != NULL) {
      fast = fast->next->next;
      slow = slow->next;
    }
    return slow;
  }

  Node *kthFromLast(int k) {
     Node *fast = head, *slow = head;
     while(fast->next != NULL && --k) {
       fast = fast->next;
     }
     if(k > 1) return NULL;
     while(fast->next != NULL) {
       slow = slow->next;
       fast = fast->next;
     }
     return slow;
  }

  void length() {
    Node *temp = head;
    int len = 0;
    while(temp != NULL) {
      temp = temp->next;
      len++;
    }
    cout << len << endl;
    return;
  }

  void print() {
    if(head == NULL) {
      cout << "\nList is empty\n";
      return;
    }
    Node *temp = head;
    while(temp != NULL) {
      cout << temp->data << "->";
      temp = temp->next;
    }
    cout << "NULL" << endl;
    return;
  }

};

int main() {
  LinkedList ll;

  ll.insertAtEnd(10);
  ll.insertAtEnd(20);
  ll.insertAtEnd(30);
  ll.insertAtEnd(40);
  ll.insertAtEnd(50);
  ll.print();

  ll.length();

  return 0;
}

