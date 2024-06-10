![Screenshot 2024-06-10 143055](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/8ccdaa79-30f8-4dcc-b3c3-dbd69922c96a)
![Screenshot 2024-06-10 143026](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/3abcbd2b-07c0-48ac-a151-3b313fcebb68)
![Screenshot 2024-06-10 143002](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/436b4dcd-ceee-41fb-a9de-880d9fd7ebfa)
![Screenshot 2024-06-10 142930](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/2feca5f1-eea5-4148-9854-e92babb8e828)
![Screenshot 2024-06-10 140755](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/101c3144-5846-4ff0-8465-bc49b9bfb8bb)
Name: Zaahid Ismail
Student Number: ST10441406
Welcome to the Weather App. This Android application allows users to input weather data and display it across a specific screen whihc is the detaled views screen, the app consists of the following screens: the Splash Screen, the Main Screen, and the Detailed View Screen. The app provides detailed weather results and calculates the average temperature.

Features
Splash Screen: The introductory screen that appears when the app is launched.
Main Screen: The primary interface where users can input weather data.
Detailed View Screen: Displays the inputted weather data along with the calculated average temperature.

Screens
1. Splash Screen
Description: The splash screen serves as the introductory interface of the app. It is displayed for a few seconds when the app is launched.
Functionality: Sets the initial impression and loads the necessary resources for the app.
2. Main Screen
Description: The main interface where users can input weather data such as temperature, humidity, and other relevant information.
Functionality:
Input fields for weather data.
An add button to save the data and navigate to the detailed view screen.
3. Detailed View Screen
Description: This screen displays the detailed weather data entered by the user.

Functionality:
Displays the inputted weather data.
Calculates and shows the average temperature based on the inputted data.

How to Use
Launch the App: The splash screen will appear, providing a welcoming interface.
Input Weather Data: On the main screen, fill in the necessary weather data such as temperature, humidity, etc.
Submit Data: Press the submit button to save the data and navigate to the detailed view screen.
View Detailed Data: On the detailed view screen, review the entered data and see the calculated average temperature.

To access the repository, click on this link: https://github.com/ST10441406-ZaahidIsmail/myWeatherApp

Psuedocode of the Application:
start
SplashActivity:
 Display Splash Screen with app name, my name, student number, and logo
 If Start button clicked:
 Navigate to MainActivity
 If Exit button clicked:
 Close the app

MainActivity:
 Initialize days as ArrayList<String>
 Initialize minTemp as ArrayList<Int>
 Initialize maxTemp as ArrayList<Int>
 Initialize weatherNotes as ArrayList<String>
 
 Initialize dayEditText
 Initialize minTempEditTxt
 Initialize maxTempEditText
 Initialize weatherNotesEditText
 Initialize addButton
 Initialize clearButton
 Initialize detailedViewButton
 Initialize exitButton2
 On exitbutton2 click:
 Close the app
 On addButton click:
 Retrieve date from dayEditText
 Retrieve minTemp from minTempEditText
 Retrieve maxTemp from maxTempEditText
 Retrieve weatherNotes from weatherNotesEditText

 If all inputs are valid:
 Add day to days
 Add minTemp to minTemps
 Add maxTemps to maxTemps
 Add weatherType to weatherNotes

 Clear input fields
 Show success message
 Else:
 Show error message
 On clearButton click:
 Clear days
 Clear minTemps
 Clear maxTemps
 Clear WeatherNotes
 Show data cleared message
 On detailedViewButton click:
 Create Intent to navigate to DetailedViewActivity
 Pass days, minTemps, maxTemps, weatherNotes to DetailedViewActivity
 Start DetailedViewActivity

DetailedViewActivity:
 Initialize weatherDetailsTextView
 Initialize averageTempTextView
 Retrieve days from Intent
 Retrieve minTemps from Intent
 Retrieve maxTemps from Intent
 Retrieve weatherNotes from Intent
 Initialize weatherDetails as StringBuilder
 Initialize totalTemp as 0

 For each date in dates:
 Append date, minTemp, maxTemp, and weatherType to averageDetails
 Add minTemp and maxTemp to totalTemp
 If dates is not empty:
 Calculate averageTemp as totalTemp / number of days
 Else:
 Set averageTemp to 0
 Display weatherDetails in weatherDetailsTextView
 Display averageTemp in averageTextView
 On backButton click:
 Finish current activity and navigate back to MainActivity
stop
Below are images of the application with error messages
![Screenshot 2024-06-10 143055](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/8ccdaa79-30f8-4dcc-b3c3-dbd69922c96a)
![Screenshot 2024-06-10 143026](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/3abcbd2b-07c0-48ac-a151-3b313fcebb68)
![Screenshot 2024-06-10 143002](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/436b4dcd-ceee-41fb-a9de-880d9fd7ebfa)
![Screenshot 2024-06-10 142930](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/2feca5f1-eea5-4148-9854-e92babb8e828)
![Screenshot 2024-06-10 140755](https://github.com/ST10441406-ZaahidIsmail/myWeatherApp/assets/164514640/101c3144-5846-4ff0-8465-bc49b9bfb8bb)
