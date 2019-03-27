Simple Junit Mockito app

Step 1)
Download Code coverage metrics tool - Sonarqube

Step 2)
Build the app 
** gradle clean build

Step 3)
-go to the sonarqube directory(sonarqube/bin/<select your os>)
- run command: ./sonar.sh start

Starts sonarqube(starts at localhost:9000)

Step 4)
run the gradle task with command : gradle quality

