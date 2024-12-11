package test

import scala.scalajs.js.annotation._

@JSExportTopLevel(name = "add", moduleID = "a")
def add(a: Int, b: Int): Int =
  a + 2
