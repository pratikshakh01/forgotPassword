Use postman API to test this application as explained below:<br>
For Forget Password use POST Method and pass the email in form data of request body to check whether the email exists in the database or not. If the email exists the another url will be generated as response to the particular request.<br>
<img width="638" alt="image" src="https://github.com/pratikshakh01/forgotPassword/assets/55578997/d290fd72-a092-4d02-9173-9fe5bb35709d"><br><br>
Copy the url generated and create new request with PUT method and copy paste the url in the respective field. Pass the password key and value as a form data in the body to update/reset your password.<br>
<img width="636" alt="image" src="https://github.com/pratikshakh01/forgotPassword/assets/55578997/5f2eb7e5-1675-44f9-957f-e51245e57133">
<br> <br> 
You can change the databse connections in application.properties file.

