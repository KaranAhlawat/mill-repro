package test

import scala.scalajs.js.annotation._

@JSExportTopLevel(name = "subtract", moduleID = "b")
def subtract(a: Int, b: Int): Int =
  a - b
