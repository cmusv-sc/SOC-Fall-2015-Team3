
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,List[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*18.2*/(email: String, vfile: String, dataset: String, climateServices: List[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*18.97*/("""

"""),format.raw/*21.1*/("""

"""),_display_(Seq[Any](/*23.2*/main("Home",email)/*23.20*/ {_display_(Seq[Any](format.raw/*23.22*/("""
	<style type="text/css">
		#climateImage """),format.raw/*25.17*/("""{"""),format.raw/*25.18*/("""
			margin-top: 20px;
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
	</style>
	<div class="jumbotron">

		"""),_display_(Seq[Any](/*31.4*/if(email!= null && vfile!= null && vfile.compareTo("loginSucess")==0)/*31.73*/{_display_(Seq[Any](format.raw/*31.74*/("""
			<div class="alert alert-success fade in">
				<strong>You have been log in successfully!</strong>
				<button class="btn btn-success pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
			</div>
		""")))})),format.raw/*36.4*/("""

		"""),_display_(Seq[Any](/*38.4*/if(vfile!= null && vfile.compareTo("logfailed")==0)/*38.55*/{_display_(Seq[Any](format.raw/*38.56*/("""
			<div class="alert alert-danger fade in">
				<strong>Invalid Password or User ID!</strong>
				<button class="btn btn-danger pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
			</div>
		""")))})),format.raw/*43.4*/("""

		"""),_display_(Seq[Any](/*45.4*/if(dataset!= null && dataset.compareTo("logout")==0)/*45.56*/{_display_(Seq[Any](format.raw/*45.57*/("""
			<div class="alert alert-success fade in">
				<strong>You have been log out successfully!</strong>
				<button class="btn btn-success pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
			</div>
		""")))})),format.raw/*50.4*/("""

		<div class="row">
			<div class="col-lg-5" id="climateImage">
				<br>
				<br>
				<img src="/assets/images/iceberg.jpg" height="550" width="430" />
			</div>
			<div class="col-lg-7">
				<h2>Climate Service List</h2>
				"""),_display_(Seq[Any](/*60.6*/for(climateService <- climateServices) yield /*60.44*/{_display_(Seq[Any](format.raw/*60.45*/("""
					<div class="row">
						<div class="col-md-7"><a href = """"),_display_(Seq[Any](/*62.41*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*62.139*/(""""><font size="3">"""),_display_(Seq[Any](/*62.157*/climateService/*62.171*/.getClimateServiceName())),format.raw/*62.195*/("""</a></font></div>
						<span><div class="col-md-3 col-md-offset-2" ><input id="star"""),_display_(Seq[Any](/*63.68*/climateService/*63.82*/.getId())),format.raw/*63.90*/("""" value =""""),_display_(Seq[Any](/*63.101*/climateService/*63.115*/.getGrade)),format.raw/*63.124*/("""" class="rating-input" data-size="xs" type="number" readonly/></div></span>
					</div>
				""")))})),format.raw/*65.6*/("""

					<!-- """),_display_(Seq[Any](/*67.12*/if(!session.get("username"))/*67.40*/{_display_(Seq[Any](format.raw/*67.41*/(""" -->

				<p>
				"""),_display_(Seq[Any](/*70.6*/if(false)/*70.15*/{_display_(Seq[Any](format.raw/*70.16*/(""" <a class="btn btn-primary" href="climate/register"
				role="button">Register &raquo;</a> """)))})),format.raw/*71.41*/("""
				</p>
					<!-- """)))})),format.raw/*73.12*/(""" -->
			</div>
		</div>
	</div>
	<script>
			jQuery(document).ready(function () """),format.raw/*78.39*/("""{"""),format.raw/*78.40*/("""
				$('.rating-input').rating("""),format.raw/*79.31*/("""{"""),format.raw/*79.32*/("""
					min: 0,
					max: 5,
					step: 0.1,
					size: 'xs',
					showClear: false,
					showCaption: false,
					hoverEnabled:false,
					hoverChangeStars: false
				"""),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""");
			"""),format.raw/*89.4*/("""}"""),format.raw/*89.5*/(""");
	</script>
""")))})),format.raw/*91.2*/("""


"""))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 02 22:30:18 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/home.scala.html
                    HASH: 2647df6cad89e840ffad289aba4e3f4139379757
                    MATRIX: 3220->1205|3426->1300|3455->1319|3493->1322|3520->1340|3560->1342|3630->1384|3659->1385|3710->1409|3738->1410|3813->1450|3891->1519|3930->1520|4179->1738|4219->1743|4279->1794|4318->1795|4559->2005|4599->2010|4660->2062|4699->2063|4949->2282|5213->2511|5267->2549|5306->2550|5406->2614|5527->2712|5582->2730|5606->2744|5653->2768|5774->2853|5797->2867|5827->2875|5875->2886|5899->2900|5931->2909|6055->3002|6104->3015|6141->3043|6180->3044|6234->3063|6252->3072|6291->3073|6415->3165|6468->3186|6576->3266|6605->3267|6664->3298|6693->3299|6886->3465|6914->3466|6947->3472|6975->3473|7021->3488
                    LINES: 56->18|60->18|62->21|64->23|64->23|64->23|66->25|66->25|68->27|68->27|72->31|72->31|72->31|77->36|79->38|79->38|79->38|84->43|86->45|86->45|86->45|91->50|101->60|101->60|101->60|103->62|103->62|103->62|103->62|103->62|104->63|104->63|104->63|104->63|104->63|104->63|106->65|108->67|108->67|108->67|111->70|111->70|111->70|112->71|114->73|119->78|119->78|120->79|120->79|129->88|129->88|130->89|130->89|132->91
                    -- GENERATED --
                */
            