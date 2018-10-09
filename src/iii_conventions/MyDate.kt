package iii_conventions

import java.awt.font.NumericShaper
import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int):Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (this.year != other.year) return (this.year - other.year)
        if (this.month != other.month) return (this.month - other.month)
        return (this.dayOfMonth - other.dayOfMonth)
    }
}

operator fun MyDate.rangeTo(other: MyDate)= DateRange(this,other)
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task_1(today: MyDate): MyDate = addTimeIntervals(today,1,1)

fun task_2(today: MyDate): MyDate  = addTimeIntervals(today,2,3,15)

fun addTimeIntervals(myDate: MyDate, year:Int = 0, week: Int = 0, day:Int = 0) : MyDate {
    return myDate
            .addTimeIntervals(TimeInterval.YEAR,year)
            .addTimeIntervals(TimeInterval.WEEK,week)
            .addTimeIntervals(TimeInterval.DAY,day)
}
enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}
class DateRange(val start: MyDate, val end: MyDate):Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

    class DateIterator(val dateRange:DateRange) : Iterator<MyDate> {
        var current: MyDate = dateRange.start
        override fun next(): MyDate {
            val result = current
            //current = current.addTimeIntervals(TimeInterval.DAY,4)
            current=current.nextDay()
            println(" ==================: $current")
            return result
        }
        override fun hasNext(): Boolean = current <= dateRange.end
    }

//    operator fun contains(item: MyDate): Boolean = start <= item && item <= end


