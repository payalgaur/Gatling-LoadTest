
package scala.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

/**
 * @author payal
 */
class TestScript extends Simulation {
  val baseurl = "http://www.scalajobz.com/findAllJobs"
  val httpConf = http.baseURL(baseurl)

  val scn = scenario("login")
  .exec(
      http("Test login")
      
        .get (baseurl)
        .check(status.is(200)))
        
        
          setUp(scn.inject(atOnceUsers(5))).protocols(httpConf)
}


    
        
           
 
          
     
  
