/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package usafacts.galactic.spending.utilities

import usafacts.galactic.spending.list.LinkedList

class StringUtils {
    companion object {
        fun join(source: LinkedList): String {
            return JoinUtils.join(source)
        }

        fun split(source: String): LinkedList {
            return SplitUtils.split(source)
        }
    }
}