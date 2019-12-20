# androidAttendanceApp
The aim of the project is to create an Android mobileapplication for attendance system that can be used by all teachers for their respective courses. This application fetches the details of the courses allotted to the respective faculty and the student enrolled in the courses from the server using the internet connection and stores it in the mobile database. 

This application stores the attendance in the mobile internal database and the faculty can view and update the attendance whenever required. At the end of the month, when the faculty is needed to upload the attendance, they can directly upload it from their mobile in the server provided the internet connection is available. This application uses Android application development toolkit.

This system objective is to design a user-friendly application for the use of faculty.

# Functional Requirements of the System
The functional requirements discuss the functional behaviour that should be possessed by the system. Each requirement maps to a high level function: 

(i) That transforms the given set of input data 

(ii) Into output data 

(iii) Different functional requirements possessed by the system are:-

# R.1 Login
Description: The faculty will login into the application with the given user ID and password. If the user ID and password is correct, user will be prompt to the proceed option else error message will be displayed. 

Input: User ID and Password 

Output: Prompt to ”Proceed” option

# R.2 View Course Taken
Description: After login, the faculty can view the list of courses taken by him during the semester and then he can get the list of student enrolled in that course. 

Input: Select the display option 

Output: List of courses taken

# R.2.1 View Details of Enrolled Students
Description: The faculty can view the list of student enrolled in a particular course. 

Input: Select a course and select option to display student list 

Output: Enrolled student list

# R.2.2 Take Attendance
Description: Faculty take attendance on a particular day by swiping over a student name to mark him absent. 

Input: Mark student absent 

Output: Confirmation message

# R.3 Synchronize Database
Description: At the end of the month or at any time when faculty wishes, he can upload the attendance details of a particular subject in the Online Server 

Input: Select Sync button 

Output: Confirmation message
