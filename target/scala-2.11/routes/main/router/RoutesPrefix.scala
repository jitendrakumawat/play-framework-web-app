
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/test/si2chip1/si2chip/conf/routes
// @DATE:Fri Oct 07 12:57:05 IST 2016


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
