package u06lab.code

object TicTacToe extends App{
  val boardSize: Int = 3
  sealed trait Player{
    def other: Player = this match {case X => O; case _ => X}
    override def toString: String = this match {case X => "X"; case _ => "O"}
  }

  case object X extends Player
  case object O extends Player

  case class Mark(x: Int, y: Int, player: Player)
  type Board = List[Mark]
  type Game = List[Board]
  // Exercise 1
  def find(board: Board, x: Int, y: Int): Option[Player] = board.find(m=> m.x==x && m.y==y).map(_.player)


  // Exercise 2
  def placeAnyMark(board: Board, player: Player): Seq[Board] = {
    for {
      y <- 0 until boardSize
      x <- 0 until boardSize
      if find(board, x, y).isEmpty
    } yield Mark(x, y, player) :: board
  }
  /*
   * :: Adds an element at the beginning of this list.
   * to iterate until the last number of the sequence, on the other hand until does not (it stops at last number-1)
   *
   * if statement act as a filter since it allows the mark to be added to a board only if there is not another mark already placed in that position
   */

  //Exercise 3
  def computeAnyGame(player: Player, moves: Int): Stream[Game] = ???

  def printBoards(game: Seq[Board]): Unit =
    for (y <- 0 to 2; board <- game.reverse; x <- 0 to 2) {
      print(find(board, x, y) map (_.toString) getOrElse ("."))
      if (x == 2) { print(" "); if (board == game.head) println()}
    }

  // Exercise 4 (VERY ADVANCED!) -- modify the above one so as to stop each game when someone won!!
}
