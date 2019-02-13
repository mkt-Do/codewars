package com.github.mktdo.codewars

// https://www.codewars.com/kata/simple-web-framework-number-1-create-a-basic-router/train/scala

class SimpleWebFramework {
  var routes: Map[(String, String), () => String] = Map[(String, String), () => String]()
  def bind(path: String, method: String, f: () => String): Unit = {
    routes = routes.updated((path, method), f)
  }
  def runRequest(path: String, method: String): String = routes.get((path, method)) match {
    case Some(f) => f()
    case None => "Error 404: Not Found"
  }
}
