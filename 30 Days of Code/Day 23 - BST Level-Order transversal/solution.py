mport sys

class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root


    def levelOrder(self,root):
        #Write your code here
        my_list = []
        if root:
            queue = [root]
            while queue:
                node = queue.pop()
                my_list.append(node.data)
                if node.left:
                    queue.insert(0, node.left)
                if node.right:
                    queue.insert(0, node.right)
        print(*my_list, sep=' ')





### Run code ###
T=int(input())
myTree=Solution()
root=None
for i in range(T):
    data=int(input())
    root=myTree.insert(root,data)
myTree.levelOrder(root)

