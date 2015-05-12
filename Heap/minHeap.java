/*

  min Heap (could also have a max heap)
  - binary tree
  - parent < children
  - full as possible, left to right
  - find min: O(1)
    removeMin O(lg(n))
    pushdown  O(lg(n))
    heapSort  O(n lg(n))
    insert    O(lg(n))

  insert
    add the least leftmost node and shift up

  removeMin
  1) remove min (root)
  2) replace w/ least, rightmost value
  3) pushdown
     swap the root with its smaller child and
     continue down until it complies with the
     properties of the min Heap
  a


 */
