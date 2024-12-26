/*
    Linked list Operations
*/

class Node {
public:
	int data;
	Node* next;
	// Constructor
	Node(int data) {
		this->data = data;
		next = nullptr;
	}
};

class LinkedList {
private:
	Node* head;

public:
	LinkedList(Node* node) {
		this->head = node;
	}

	/* Function to get kth element from Linked List */
	int accessKthElement(int k) {
		int result;
		// If index is less than -1, invalid index
		if(k < 0) {
			return -1;
		}
		// Store head in temporary node
		Node* temp = this->head;
		// While k value is less than 0 and node does'nt points to null
		while(k>0 && temp != NULL) {
			temp = temp->next;
			k--;
		}
		if(temp == NULL) {
			result = -1;
		} else {
			result = temp->data;
		}
		return result;
	}

	/* Function to find "ele" in Linked List */
	bool findEle(int ele) {
		Node* temp = this->head;
		while(temp!=NULL) {
			if(temp->data == ele) {
				return true;
			}
			temp = temp->next;
		}
		return false;
	}

	/* Insert a new node at index _idx with value ele */
	Node* insertIntoLL(int ele, int _idx) {
		// If index is less than 0, element cannot be inserted
		if(_idx < 0) {
			std::cout << "Not allowed to insert at -ve index" << std::endl;
			return this->head;
		}
		Node* temp = head;
		Node* newNode = new Node(ele);
		// If index is 0, means we need to place new node before head
		if(_idx == 0) {
			newNode->next = temp;
			this->head = newNode;
			std::cout << "Element inserted in Linked List!" << std::endl;
			return this->head;
		}
		// Else at any random index _idx
		int i=0;
		while(i<_idx-1 && temp!=nullptr) {
			temp = temp->next;
			i++;
		}
		if(temp != NULL) {
			newNode->next = temp->next;
			temp->next = newNode;
			std::cout << "Element inserted in Linked List!" << std::endl;
		} else {
			std::cout << "Cannot insert at index " << _idx << ". As it is not in range of list size." << std::endl;
		}
		return this->head;
	}

	// Delete the first occurence of given Element
	Node* deleteElement(int ele) {
		// Check if head is null return the same list;
		if(head == NULL) {
			std::cout << "Empty List! Nothing to delete." << std::endl;
			return head;
		}
		// If found in head delete it
		if(head->data == ele) {
			Node* temp = head;
			head = head->next;
			std::cout << "Element " << temp->data << " deleted successfully!" << std::endl;
			free(temp);
			return head;
		}
		// If at any random position
		Node* temp = head;
		while(temp->next != NULL) {
			if(temp->next->data == ele) {
				Node* ran = temp->next;
				temp->next = temp->next->next;
				std::cout << "Element " << ran->data << " deleted successfully!" << std::endl;
				free(ran);
				return head;
			}
			temp = temp->next;
		}
		if(temp->next == NULL) {
			std::cout << "Element " << ele << " not found!!" << std::endl;
		}
		return head;
	}
	
	/* Reverse the Linked List */
	Node* reverseList(){
	    Node* h2 = NULL;
	    Node* h1 = head;
	    while(h1 != NULL){
	        Node* temp = h1;
	        h1 = h1->next;
	        temp->next = h2;
	        h2 = temp;
	    }
	    this->head = h2;
	    return head;
	}

	// Print linked List
	void printList() {
		Node* temp = head;
		std::cout << "Current Elements in List: ";
		while(temp != NULL) {
			std::cout << temp->data << " ";
			temp = temp->next;
		}
		std::cout << std::endl;
		return;
	}
};