package uk.co.codevineyard

import org.scalatest.flatspec.AnyFlatSpec

import scala.reflect.runtime.universe._

class MainSpec extends AnyFlatSpec {

  def getTypeTag[T: TypeTag](obj: T): TypeTag[T] = typeTag[T]

  "double" should "return an Int" taggedAs ExcludeFromCoverage in {
    assertResult("Int")(getTypeTag(Main.double(1)).tpe.toString)
  }

}
