# One-to-many notes

## Project setup:
### folder structure and setup
- pom.xml : add dependencies (jstl, jasper, validation)
- application.properties: WEB-INF config, connection to database, enable hidden methods
- create packages - models, repositories, services, controllers

### Models:
In MySQL, Donations will have donor_id as the foreign key. 

#### Donation Model: 
```java
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="donor_id")
    private User donor;
```
Don't forget the zero-argument constructor & getters/setters

#### User Model :   
```java
    @OneToMany(mappedBy="donor", fetch = FetchType.LAZY)
    private List<Donation> sent_donations;
```
Don't forget the zero-argument constructor & getters/setters

### Create new donation:
Creating a new donation requires the donor attached to the donation. If you want to bind the data using the jsp, make sure there is the path for donor. 

If you need to pick donor from the userList, make sure you put the userList to the model and display the option in the jsp. 
```jsp
		<form:select path="donor">
			<c:forEach var="eachUser" items="${userList }">
				<form:option value="${eachUser.id }"> ${eachUser.username } - ${eachUser.email }</form:option>
			</c:forEach>
		</form:select>
```

If the donor is the logged-in user and the userId is from the session, you can attach the user by a hidden input or in the controller. 
```jsp
		<form:hidden path="donor" value="${userId}">
```


