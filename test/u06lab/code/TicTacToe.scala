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

  // Exercise 1: find
  @Test
  def testPlaceAnyMark = {
    // Exercise 2: implement placeAnyMark such that..
    printBoards(placeAnyMark(List(), X))
    //... ... ..X ... ... .X. ... ... X..
    //... ..X ... ... .X. ... ... X.. ...
    //..X ... ... .X. ... ... X.. ... ...
    printBoards(placeAnyMark(List(Mark(0, 0, O)), X))
    //O.. O.. O.X O.. O.. OX. O.. O..
    //... ..X ... ... .X. ... ... X..
    //..X ... ... .X. ... ... X.. ...
  }
  // Exercise 3 (ADVANCED!): implement computeAnyGame such that..
  @Test
  def testPlaceAnyGame = {
    computeAnyGame(O, 4) foreach { g => printBoards(g); println() }
    //... X.. X.. X.. XO.
    //... ... O.. O.. O..
    //... ... ... X.. X..
    //              ... computes many such games (they should be 9*8*7*6 ~ 3000).. also, e.g.:
    //
    //... ... .O. XO. XOO
    //... ... ... ... ...
    //... .X. .X. .X. .X.
  }
}