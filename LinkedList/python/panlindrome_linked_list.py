class Solution:
    def clone(self, head):
        list = None
        while head:
            node = ListNode(head.val)
            if list is None:
                list = node
            else:
                last_node.next = node
            last_node = node
            head = head.next
        return list

    def get_reversed(self, head):
        prev = None
        current = head
        while current:
            next = current.next
            current.next = prev
            prev = current
            current = next
        return prev

    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head.next == None:
            return True

        fast_ptr = slow_ptr = head
        prev = None

        while fast_ptr and fast_ptr.next:
            prev = slow_ptr
            slow_ptr = slow_ptr.next
            fast_ptr = fast_ptr.next.next

        if fast_ptr:
            middle_element = slow_ptr
            slow_ptr = slow_ptr.next

        prev.next = None
        reveresed = self.get_reversed(slow_ptr)

        while head:
            if head.val != reveresed.val:
                return False
            head = head.next
            reveresed = reveresed.next
        return True