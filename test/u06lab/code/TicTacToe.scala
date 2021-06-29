package u06lab.code

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u06lab.code.TicTacToe._

class TicTacToeTest {
  // Exercise 1: find
  @Test
  def testFind = {
    assertEquals(Some(X), find(List(Mark(0,0,X)), 0, 0))// Some(X)
    assertEquals(Some(O), find(List(Mark(0,0,X),Mark(0,1,O),Mark(0,2,X)), 0, 1)) // Some(O)
    assertEquals(None, find(List(Mark(0,0,X),Mark(0,1,O),Mark(0,2,X)), 1, 1)) // None
    printBoards(Seq(List()))
  }

}