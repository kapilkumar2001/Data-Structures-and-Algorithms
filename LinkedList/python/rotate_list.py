class Solution:
    def get_count(self, head):
        count = 0
        while head:
            count += 1
            head = head.next
        return count

    def get_last_node(self, head):
        prev = fast_ptr = slow_ptr = head

        while fast_ptr and fast_ptr.next:
            slow_ptr = slow_ptr.next
            prev = fast_ptr.next
            fast_ptr = fast_ptr.next.next

        if fast_ptr:
            return fast_ptr
        else:
            return prev

    def get_node_point_to_rotate(self, head, count):
        while count >= 0:
            prev = head
            head = head.next
            count -= 1

        return prev, head



    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        _len = self.get_count(head)
        if _len == 0 or _len == 1 or k == 0:
            return head
        rotate_times = k % _len

        if rotate_times == 0:
            return head


        last_node = self.get_last_node(head)
        last_before_node, node_to_be_first = self.get_node_point_to_rotate(head, _len - rotate_times - 1)
        last_before_node.next = None
        last_node.next = head

        return node_to_be_first

