package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {

    // Private field to track the number of elements have been added since the IntList was created
    private int totalAddedNum;

    /**
     * Constructs an empty InheritanceSortedIntList and initializes
     * the count of total added elements (totalAddedNum) to zero.
     * Calls the parent class (SortedIntList) constructor.
     */
    public InheritanceSortedIntList() {
        super();
        this.totalAddedNum = 0;
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
        return super.add(num);
    }

    /**
     * Adds all of the elements of the IntegerList to the list in ascending order.
     * Calls add() on each element of list.
     * Keep track of the totalAddedNum (it is already done in each call of add() since inheritance override).
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
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