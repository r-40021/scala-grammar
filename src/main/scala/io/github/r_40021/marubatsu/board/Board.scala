package io.github.r_40021.marubatsu.board

private[marubatsu] class Board(val cells: Map[(Int, Int), CellState], val next: CellState) {
  private[marubatsu] def put(row: Int, column: Int): Board = {
    new Board(cells + ((row, column) -> next), getNext(next))
  }

  private[this] def getNext(current: CellState): CellState = {
    current match {
      case Empty => Empty
      case Maru => Batsu
      case Batsu => Maru
    }
  }

  def canPut(row: Int, column: Int): Boolean = cells((row, column)) == Empty


  override def toString = s"Board($cells, $next)"
}

object Board {
  def apply(): Board = {
    val keyValues = for (row <- 0 to 2; column <- 0 to 2) yield (row, column) -> Empty
    new Board(keyValues.toMap, Maru)
  }
}
