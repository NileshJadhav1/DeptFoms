package schedule

import Faculty._

import Aug2016._

import Aug2016Scheduler._

object FindSchedule {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  bestKeys                                        //> res0: (Int, Int) = (1,7)
	
	bestSchedules.size                        //> res1: Int = 25
	
	bestSchedules.map((t) => clashes(t).size) //> res2: List[Int] = List(4, 8, 4, 6, 4, 6, 10, 6, 6, 6, 8, 14, 8, 8, 8, 6, 8, 
                                                  //| 4, 4, 4, 4, 8, 4, 4, 4)
	
}