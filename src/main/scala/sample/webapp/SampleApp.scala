package sample.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

object SampleApp extends JSApp {
  
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI() = {
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
  }

  def addClickedMessage() = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }

}
