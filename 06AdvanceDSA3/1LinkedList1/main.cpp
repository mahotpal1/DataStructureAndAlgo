#include <stdio.h>
#include <iostream>

#include "LinkedListOp.hpp"
int main()
{
    std::cout << "--------------------------- Linked List Operations -------------------------" << std::endl;
    Node* node = new Node(21);
    node->next = new Node(2);
    node->next->next = new Node(32);
    node->next->next->next = new Node(4);
    LinkedList* op = new LinkedList(node);
    {
        std::cout << "-------------Get Kth element Tester -------------" << std::endl;
        // Get kth element from LL tester
        // Index starts from 0
        std::cout << "Access 1st element: " << op->accessKthElement(0) << std::endl;
        std::cout << "Access -21 element: " << op->accessKthElement(-21) << std::endl;
        std::cout << "Access 4th element: " << op->accessKthElement(3) << std::endl;
        std::cout << "Access 11th element: " << op->accessKthElement(11) << std::endl;
        std::cout << "-------------------------------------------------" << std::endl;
        std::cout << std::endl;
    }
    {
        std::cout << "-------------Find ele element Tester -------------" << std::endl;
        // Find element "ele" in LL tester
        std::cout << "Find Element 32 in LL: " << (op->findEle(32)?"Found":"Not Found") << std::endl;
        std::cout << "Find Element 21 in LL: " << (op->findEle(21)?"Found":"Not Found") << std::endl;
        std::cout << "Find Element -1 in LL: " << (op->findEle(-1)?"Found":"Not Found") << std::endl;
        std::cout << "Find Element 4 in LL: " << (op->findEle(4)?"Found":"Not Found") << std::endl;
        std::cout << "Find Element 67 in LL: " << (op->findEle(67)?"Found":"Not Found") << std::endl;
        std::cout << "--------------------------------------------------" << std::endl;
        std::cout << std::endl;
    }
    {
        std::cout << "------------- Insert into LinkedList Tester -------------" << std::endl;
        // Insert a new node into linked list Tester
        // Insert at -ve index
        node = op->insertIntoLL(45, -1);
        // Insert at head
        node = op->insertIntoLL(34, 0);
        // Insert at random location in list say 2, 5
        node = op->insertIntoLL(100, 2);
        node = op->insertIntoLL(300, 5);
        // Insert at last
        node = op->insertIntoLL(200, 7);
        // Insert at position more than list size
        node = op->insertIntoLL(1111, 9);
        op->printList();
        std::cout << "---------------------------------------------------------" << std::endl;
    }
    {
        std::cout << "-------------- Delete the first occurence of given element Tester ------------- " << std::endl;
        // Deleting element at head!
        node = op->deleteElement(34);
        // Deleting random element!
        node = op->deleteElement(300);
        // Delete last element
        node = op->deleteElement(200);
        // Try deleting out of range element 
        node = op->deleteElement(344);
        op->printList();
    }
    {
        std::cout << "-------------- Reverse the linked list Tester ------------------" << std::endl;
        node = op->reverseList();
        op->printList();
    }
    return 0;
}