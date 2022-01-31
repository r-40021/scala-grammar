package io.github.r_40021.marubatsu

import io.github.r_40021.marubatsu.board.{CellState, Empty, Maru => MaruState, Batsu => BatsuState}

package object game {
  private[game] def toWinner(cellState: CellState): Winner = cellState match {
    case MaruState => game.Maru
    case BatsuState => game.Batsu
    case Empty => game.NoWinner
  }
}
