
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
//    .exec(
//      http("home page")
//        .get(baseurl)
//        .check(status.is(200)))

    /*.exec(
      http("facebook login")
        .post(baseurl + "/login")
        .formParam("email", "payalvashist13@gmail.com")
        .formParam("pass", "@678")
        .check(status.is(200)))*/

  /* .exec(
      http("facebook login fail response")
        .post(baseurl + "/login")
        .formParam("email", "swati.rao@knoldus.com")
        .formParam("pass", "232313")
        .check(status.is(400)))

  

  setUp(scn.inject(atOnceUsers(10))).protocols(httpConf)

}*/


    
        
           
 
          
     
  
