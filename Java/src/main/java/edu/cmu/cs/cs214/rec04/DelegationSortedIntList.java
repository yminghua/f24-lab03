package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {

    // Private instance of SortedIntList for delegation
    private SortedIntList sortedIntList;
    // Private field to track the number of elements have been added since the IntList was created
    private int totalAddedNum;

    public DelegationSortedIntList() {
        sortedIntList = new SortedIntList();
        totalAddedNum = 0;
    }

    /**
     * Adds the specified int to the list in ascending order.
     * Keep track of the totalAddedNum.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        totalAddedNum++;
        return sortedIntList.add(num);
    }

    /**
     * Adds all of the elements of the IntegerList to the list in ascending order.
     * Calls add() on each element of list.
     * Keep track of the totalAddedNum (it is already done in each call of add()).
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        totalAddedNum += list.size();
        return sortedIntList.addAll(list);
    }

    /**
     * Returns the integer at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    @Override
    public int get(int index) {
        return sortedIntList.get(index);
    }

    /**
     * Removes the first occurrence of the specified element from the list,
     * if it is present (optional operation).
     *
     * @param num an integer to be removed from the list, if present
     * @return true if an element was removed as a result of this call
     */
    @Override
    public boolean remove(int num) {
        return sortedIntList.remove(num);
    }

    /**
     * Removes from the list all of its elements that are contained in the
     * specified IntegerList.
     *
     * @param list IntegerList containing elements to be removed from
     * the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean removeAll(IntegerList list) {
        return sortedIntList.removeAll(list);
    }

    /**
     * Returns the number of elements in this list. If this list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return number of elements in the list
     */
    @Override
    public int size() {
        return sortedIntList.size();
    }

    /**
     * Get the number of elements have been added since the IntList was created
     * 
     * @return number of elements have been added
     */
    public int getTotalAdded() {
        return totalAddedNum;
    }

}