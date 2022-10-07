# Full Spring notes 
#### Checklist: [Full Spring Checklist](#Full-Spring-Checklist) 
#### Exam Details: [Exam](#Exam) 
#### Reference:
- one-to-many demo repo : 
[notes](https://github.com/heidi1105/JAVA-OCT2022/tree/main/Java3Spring/mvc-one-to-many-demo#One-to-many-notes) |
[models-controllers-service-repo](https://github.com/heidi1105/JAVA-OCT2022/tree/main/Java3Spring/mvc-one-to-many-demo/src/main/java/com/heidichen/onetomanydemo) | [jsp files](https://github.com/heidi1105/JAVA-OCT2022/tree/main/Java3Spring/mvc-one-to-many-demo/src/main/webapp/WEB-INF)
- MVC demo repo: 
[models-controllers-service-repo](https://github.com/heidi1105/JAVA-OCT2022/tree/main/Java3Spring/mvc-demo/src/main/java/com/heidichen/mvcdemo) | [jsp files](https://github.com/heidi1105/JAVA-OCT2022/tree/main/Java3Spring/mvc-demo/src/main/webapp/WEB-INF)

## Project Setup
#### Models: 
Create the one-to-many relationship between User & Donation

Refer to [platform](https://login.codingdojo.com/m/315/9534/64315)
&  [one-to-many notes](https://github.com/heidi1105/JAVA-OCT2022/tree/main/Java3Spring/mvc-one-to-many-demo)


## Create - refer to 1:n Create notes
Refer to one-to-many notes: [Inserting 1:n in form:form](https://github.com/heidi1105/JAVA-OCT2022/tree/main/Java3Spring/mvc-one-to-many-demo#CRUD) & [MVC CreateBinding jsp](https://github.com/heidi1105/JAVA-OCT2022/blob/main/Java3Spring/mvc-demo/src/main/webapp/WEB-INF/createDonationBinding.jsp)
- Make sure you attach the userId from session to create the 1:n in Donation (refer to hidden input in the notes)
- (can be done in form:hidden OR in controller)

## Dashboard - refer to 1:n Dashboard

- The dashboard will look like fruity loops 
- Donor is a User object. To display the userName, need to get it from the donor object
- Refer to one-to-many dashboard

## FindOne - refer to 1:n oneDonation
- get id from path variables
- get the donation and put it in model to display in jsp
- refer to MVC demo

## Edit - refer to 1:n Edit
Refer to one-to-many Edit
- Create is similar to Edit, make sure you attached the userId as the donor
- If you want the donor will be changed to the logged in user, what should you do?
- If you want the donor to stay the same, what should you do?

## Delete
Refer to MVC delete. 

- Controller method: @DeleteMapping
- In order to direct to Delete Route, it has to be form with hidden method. 



## Full Spring Checklist
**1. Auth & Validations (log & reg)**
- validation (empty form & database check)
- successful login & register
- Session check for logged in users to grant access to pages
- being able to logout

**2. Models & Relations**
- Model validations
- Correctly joined 1:n tables

**3. Full CRUD**
- Follow RESTful routing  (Get, Post, Put, Delete)
- Create, Read All, Read one, Edit, Delete
- Form Validation
- Able to create with 1:n relationship
- Edit without losing the 1:n relationship

**4. Achieving Mastery**
- More sophisticated model & logic
- More sophisticated use of session
- Demonstrate more querying capabilities/ using a datatype that is not taught
- Preventing non-owning users from altering data
- custom validations

## Exam

### Requirements & Details
1. completed & submitted 90% of core assignments (9/10)
2. Offical exam day: Week 3 Day 3. (No algo on that day)
3. If you are taking the exam on other dates, you have to attend the algo session first. 
3. Last day of exam: Week 4 Day 3 (Next Wednesday)

### NO CHEATING 
1. Zero-tolerance in cheating. *Students who are found cheating may be expelled from the program immediately*
2. DO NOT find exam on Google/Github 
3. DO NOT communicate with your cohort during the exam

### Available Resources
1. Your own code
2. Platform
3. StackOverflow /Google
4. my github

### Preparations
1. Having a cheatsheet for everything (CRUD)
2. Having a log/reg setup before you get started (log/reg won't accept other tables in most cases)
3. TIPS: DO NOT PRE-BUILD EVERYTHING BEFORE THE EXAM

### During the exam
1. Wireframe will be explained in the wireframe room.
2. WIREFRAME ROOM --- when you have seen the wireframe, you have 30 mins to start the exam
2. Stay in your own room on Zoom by yourself
3. If you want to ask for help/grading, send a message on discord in our channel tag @dojo_Heidi_Chen, @dojo_Emilie_Wu

### Getting graded
1. Live grading
2. Finished all Red belt features and get it graded first, then work on the black belt features. 
3. <a href="https://login.codingdojo.com/m/315/9537/81392"> Rubrics </a>

### Red Belt
1. Full CRUD (Create, Read, Update, Delete)
2. One-to-many relationship
3. Login & Registration


### Black Belt: (advanced features) 
1. We don't talk about black belt features 
2. 24 hours to deploy it (dm me with your URL/IP)


