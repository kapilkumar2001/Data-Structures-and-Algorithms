class Solution:
    def __init__(self):
        self.arr = []

    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if root:
            self.inorderTraversal(root.left)
            self.arr.append(root.val)
            print(root.val)
            self.inorderTraversal(root.right)
            return self.arr