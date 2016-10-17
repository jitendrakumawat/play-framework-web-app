
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/si2chip/conf/routes
// @DATE:Sat Oct 15 13:45:01 IST 2016


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
