GM OnStar App Test Automation Project's README

Pre-requisites
Modules that need instrumentation
	WI-FI Hotspot
	Social Media
	Dashboard Smoke
	Remote commands regression test
	ECN
	At Your Service

Parameter to be addded for instrumentation in testng.xml
		<parameter name="perfecto.capabilities.app.instrument" value="true" />
			
Social Media Regression:
	1.	For other this test cases Facebook, Instagram, Twitter or YouTube 	applications should be disabled or uninstalled and uninstall.all.app=true.  
	2.	269415,269416,269417,269418 Native application related test cases can only be 	executed on Devices which has Facebook, Instagram, Twitter or YouTube 	applications installed and following property to be false
	uninstall.all.app=false	
	
Sample Maven to Execute: 
mvn clean test -DtestngXmlFile=regression/legal_terms.xml -DperfectoUserName=<Your Perfecto ID> -DperfectoPassword=<Your Perfecto Password> -Dlocale=en_US -Dapplication=<Brand App Name - e.g myGMC> -Dplatform=ios -DperfectoDeviceName=<Perfecto Device Name>

Options
-Dlocale = en_US
–Dapplication = myGMC/myCadillac/myBuick/myChevrolet/myOpel/myVauxhall
-Dplatfrom = android/ios

Sample Maven command to Execute:
For Android execution [Device added] 
mvn clean test -DtestngXmlFile=testng_android_remotecommands_smoke.xml -DperfectoUserName=<Your Perfecto ID> -DperfectoPassword=<Your Perfecto Password> -Dlocale=en_US -Dapplication=<Brand App Name - e.g myGMC> -Dplatform=android -DperfectoDeviceName=<Perfecto Device Name>

For iOS execution [Device added] 
mvn clean test -DtestngXmlFile=testng_ios_remotecommands_smoke.xml -DperfectoUserName=<Your Perfecto ID> -DperfectoPassword=<Your Perfecto Password> -Dlocale=en_US -Dapplication=<Brand App Name - e.g myGMC> -Dplatform=ios -DperfectoDeviceName=<Perfecto Device Name>	

Deliveries:-
#####Delivery: 04/13#####
Assumptions:
Legal Terms Regression: All the 7 scripts included here are stand alone. They do not need any environment to be connected.

Out of Scope Test cases:
Out of #16, #7 Automated, #9 Out Of Scope [We expect feedback and will plan accordingly - as the process is still in progress]
272690, 272693, 272694, 272695, 272696, 272697, 272698, 272699, 272700.
Reason: All hovers around changing locale in between  the test flow OR flow not feasible to automate.

#####Delivery: 04/16#####

Remote command smoke 
6/6 completed

#####Delivery: 04/19#####
Accounts Regression - 9/10
Navigation Smoke - 6/6

#####Delivery: 04/21#####
Remote commands Prod- 11
App Info- 271706, 271708

#####Delivery: 04/22#####
Vehicle Status smoke Prod – 3/3 [config/smoke/gm_vehiclestatus.xml]
Navigation regression Prod – 5/5 [config/regression/gm_navigation_regression.xml]
Remote Command Regression – 18/25 [config/prod/gm_remote_commands_regression_prod.xml]


#####Delivery: 04/24#####
At Your service-Production – 8/8   [config/prod/gm_AYS_prod.xml]
Edit Dashboard Prod –1/1           [config/prod/gm_dashboard_prod.xml]
Unauth regression – 5/5            [config/regression/gm_unauth_regression.xml]
RoadSide Assistance Regression-4/4 [config/regression/gm_unauth_regression.xml]

#######Delivery: 04/25#####
Garage Regression[6]
BVT Smoke[2]
Remote Commands Error codes[7]
Login[9]

#######Delivery: 05/01#####
Hands Free calling[11]
Wi Fi hotspot[7]
BEV vehicle status[23]
Dashboard [15]

#######Delivery: 05/04#####
EV Notification[21] 

#######Delivery: 05/07#####
Dashboard Regression[8]
Assistance Regression[20]
Social Media Regression[17]
Vehicle Status ICE Regression[20]

#######Delivery: 05/08#####
Owner Manual Regression[4]
At Your Service[35]

Assumptions:
At Your Service
1.	Refer AYS sheet in Delivery-List.xlsx for failure comments.
2.	272740, 274304, 272741, 273770, 274296 :Out of scope
3.	6 test cases for iPhone execution skipped, because device was unable to reset/Uninstall the application during execution. We have raised a Perfecto Case #01683527.

#######Delivery: 05/09#####
Region and Country Picker[12]
Find Preferred Dealer Regression[10]
Navigation Regression[33]
Wi-fi Regression[30]

Assumptions
Please refer Delivery - List.xlsx. 

#######Delivery: 05/10#####
App Info Regression[34]
Vehicle Status Erev Regression[15]
Parked Location[9]

Assumptions
App Info Regression
1.	272381 test case is pending
Parked Location
1.	Merged 275302, 275281
2.	275306:Out of scope
3.	275280:Inside Map content is not detectable
4.	275279:Waiting for confirmation

######Delivery: 05/12#####
ECN Regression[34]
Schedule Services[6]

######Delivery: 05/14#####
Upgrade[13]

