import { SortedIntList } from './hidden/SortedIntListLibrary.js'
import { IntegerList } from './IntegerList.js'

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

class InheritanceSortedIntList extends SortedIntList {
  // Private field to track the number of elements have been added since the IntList was created
  private totalAddedNum: number

  /**
   * Constructs an empty InheritanceSortedIntList and initializes
   * the count of total added elements (totalAddedNum) to zero.
   * Calls the parent class (SortedIntList) constructor.
   */
  constructor () {
    super()
    this.totalAddedNum = 0
  }

  /**
   * Adds the specified int to the list in ascending order.
   * Keep track of the totalAddedNum.
   *
   * @param num an integer to be added to the list
   * @return true if the list is changed as a result of the call
   */
  add (num: number): boolean {
    this.totalAddedNum++
    return super.add(num)
  }

  /**
   * Adds all of the elements of the IntegerList to the list in ascending order.
   * Calls add() on each element of list.
   * Keep track of the totalAddedNum (it is already done in each call of add() since inheritance override).
   *
   * @param list IntegerList containing elements to be added to the list
   * @return true if the list changed as a result of the call
   */
  addAll (list: IntegerList): boolean {
    return super.addAll(list)
  }

  /**
   * Get the number of elements have been added since the IntList was created
   *
   * @return number of elements have been added
   */
  getTotalAdded (): number {
    return this.totalAddedNum
  }
}

export { InheritanceSortedIntList }
