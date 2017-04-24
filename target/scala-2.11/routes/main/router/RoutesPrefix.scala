
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/project2017/conf/routes
// @DATE:Mon Apr 24 10:47:52 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
