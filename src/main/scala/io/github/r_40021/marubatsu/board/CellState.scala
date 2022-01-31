package io.github.r_40021.marubatsu.board

private[marubatsu] sealed abstract class CellState
private[marubatsu] case object Empty extends CellState
private[marubatsu] case object Maru extends CellState
private[marubatsu] case object Batsu extends CellState