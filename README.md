
### **Simple Junit Mockito app**

Step 1)
Download Code coverage metrics tool - Sonarqube 

Step 2)
Build the app  ->
 `gradle clean build`

Step 3)
-go to the sonarqube directory(sonarqube/bin/{select your os})
 
 run -> `./sonar.sh start`

-  Starts sonarqube(starts at _localhost:9000_)

Step 4)
run the gradle task with command : 
`gradle quality`

