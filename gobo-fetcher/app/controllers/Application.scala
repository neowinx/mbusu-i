package controllers

import play.api._
import play.api.mvc._
import scala.actors.Actor
import scala.actors.Actor._

object Application extends Controller {

  var list = List[String]()

  def index = Action {
    Ok(views.html.index(list))
  }

  def add = Action {
    list = list :+ "new name"
    Ok(views.html.index(list))
  }
  
}
