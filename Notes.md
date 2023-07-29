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



