# One-to-many notes

## Project setup:
### folder structure and setup
- pom.xml : add dependencies (jstl, jasper, validation)
- application.properties: WEB-INF config, connection to database, enable hidden methods
- create packages - models, repositories, services, controllers

### Models:
In MySQL, Donations will have donor_id as the foreign key. 
1. Follow the MVC demo to create all the neccessary fields (id, all the attributes, created_at, updated_at etc)
1. Create the relationship and don't forget the constructors & getters/setters

#### Donation Model: 
```java
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="donor_id")
    private User donor;
```

#### User Model :   
```java
    @OneToMany(mappedBy="donor", fetch = FetchType.LAZY)
    private List<Donation> sent_donations;
```
The donor in Donation Model should match with the mappedBy in User Model so that jpa could join the table for us. 

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

### Displaying joined table
When the model creates the one-to-many relationship in both sides, the tables are ALREADY JOINED. We can get the information directly from the Donation object or User Object. 

In Donation model, donor is stored as User object:
 ```java 
private User donor; 
```

In jsp, for each donation, we can have access to the whole donor (not just the id), which means... to get the donor username, we can do the following in the jsp. 
```jsp
 <c:out value="${eachDonation.donor.username}>" /> 
 ```

