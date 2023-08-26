- What is Full Stack?
- What is client?
- What is Server?
- How they communicate?
- TCP/UDP

- S/W Installation 
- Different startegies of Load Balancing
- Try out commands
- Read about
	1) Latency
	2) High availability
	3) Scaling
- Usage of cookies
- Protocols : HTTP, FTP, SMTP, Telnet, SNMP, VoIP, SIP, TCP, UDP, DNS
- Refreshing basic HTML tags

- Developer tools
	1) Network (HTTP request/response, js, css, images)
	2) Elements tab - To look at HTML tags/CSS of specific component
	3) Sources - We can browse our source code and debug by adding breakpoints
	4) console - We can try out few things programmatically
	
- HAR file (File used for troubleshooting API calls)
- Networking Throttling (We can try out our application on differnet network speed)

- Types of requests from browser:
	a) HTTP requets (Synchronous) - Blocking API calls (Waiting is there). Sequential execution
	b) AJAX request (Ayscnronous) - Non-Blocking API calls (No waiting). Parallel execution
	
	AJAX - Aysnchrounous JavaScript And XML
		- Ajax requests goes based on some events (e.g. Google search - whatever you type in background Ajax request goes)
		- Another example of Ajax - Email Registeration. If you use some email which is already used, you immediately
		get an error without submitting the form.
		
- API (Application Programming Interface)

**CRUD operations:
**	C - Create
	R - Retrieve
	U - Update
	D - Delete

GET - Retrieve
PUT - Update
POST - Create
DELETE - Delete

**REST APIs**
1) Creating student
POST https://pga.com/full-stack-batch/students/1
{
	"id": "1",
	"name": "abc"
}

2) Creating teacher
POST https://pga.com/full-stack-batch/teachers/101
{
	"id": "101",
	"name": "pqr"
}

3) Getting student with ID 1
GET https://pga.com/full-stack-batch/students/1

4) Deleting student with ID 1
Delete https://pga.com/full-stack-batch/students/1

More about API's - https://medium.com/star-gazers/understanding-apis-everything-you-need-to-know-about-apis-b0bf53db6adf

- Different between GET and POST

https://developer.mozilla.org/


<p id='para1' class='content' style="attr1:value1">

There are 4 ways of defining CSS:
1) Tag based CSS selector
	p {} 

2) ID based CSS selector
	#para1 {}

3) Class based CSS selector
	.content {}

4) Inline css using style attribute

Prirority order:
	inline -> id -> class -> Tag

While CSS rule should get executed is dervied based on concept called as
"CSS Specificity"

**WordPress**
- Download Wordpress (Download wordpress project)
- Save that package under PHP Server (XAMPP)
- Run XAMPP server and load the project created
- We can develop static content for our website (Theme, Navigation, Content, Header, Footer)



Install node 
node -v 
npm -v

npm install -g @angular/cli

ng new demo1

cd demo1
ng serve


.css (styling)
.html (template)
.ts (buisiness logic)


1.ts -> 1.html (Selector)

ng new demo-angular
ng serve
app.component.ts -> ngOniint() 

ng generate service <> (httpClient)


angular-project
  |- angular.json (config of project) 
  |- package.json (All dependencies)
  |- styles.scss (Global CSS)
  |- node_modules - Folder where all distribution packages are extracted(3rd party)
  |- app
  	|-src
		|- app.module.ts
 


Install express:
npm install express
Create one folder (project)
Create file main.js
Update package.json by adding following:
{
  "scripts": {
    "start": "node main.js"
  },
  "dependencies": {
    "express": "^4.18.2"
  }
}

Installing nodemon
npm i nodemon -D

npm install mysql

**Steps to create Web application for Java 
**

- Download Apache Tomcat (core->zip)
- Extract .zip file
- Go to bin
- Run startup.bat (or .sh)
- Open localhost:8080 to check tomcat is running from browser
- 2 issues might come in above
	a) Port number issue - If Yes, change port number in /conf/server.xml
	b) Java is NOT install. Install JDK

Creating web project in Eclipse:
- Install Eclipse for Java EE
- Open Eclipse -> Change perspective (right top corner) -> Set prespective as Java EE
- Create new Project (Dynamic Web project)
- Click Next -> Next -> Tick option of Generating Web Deployment Desciptor file (web.xml)
- Right click project -> add HTML file
- Right click project -> Add Servlet 
	a) Give class name for Servlet
	b) Give appropriate URL
	c) Select appropriate method (doGet or doPost)
- If you see error in Servlet code about import package. You need to add lib(servlet-api.jar)
	servlet-api.jar can be copied from Tomcat/lib folder
	Right click project -> Build path -> module path -> Add external Jar file


page
request
session
application

How to define servlet mapping in web.xml?
  <servlet>
  	<servlet-name>cube</servlet-name>
  	<servlet-class>com.pga.CubeServlet</servlet-class>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>cube</servlet-name>
  	<url-pattern>/getCube</url-pattern>
  </servlet-mapping>






























