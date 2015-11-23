package sun.bob.learnkt

/**
 * Created by bob.sun on 15/11/23.
 */

//todo Extensions allow you to extend a class without inherit all of its functions.
class ExtClass{
    // Below functions added a swap function to MutableList
    fun MutableList<Int>.swap(idx1 :Int, idx2 :Int){
        var tmp = this[idx1]
        this[idx1] = this[idx2]
        this[idx2] = tmp
    }
}