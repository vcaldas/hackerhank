class Node:
    def __init__(self,data):
        self.data = data
        self.next = None 

class Solution: 
    def display(self,head):
        current = head
        while current:
            print(current.data,end=' ')
            current = current.next
       
    #Complete this method
    def insert(self,head,data): 
        node = Node(data)
        
        if head == None:
            head = node
            return head
        
        temp = head
        while temp.next != None:
            temp = temp.next
        temp.next = node
        
        return head 
  

  mylist= Solution()
T=int(input())
head=None
for i in range(T):
    data=int(input())
    head=mylist.insert(head,data)    
mylist.display(head); 	 