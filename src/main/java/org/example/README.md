<h1><u>Welcome to ZOOtopia</u></h1>
<hr>

<h3><u>Project Description:</u></h3>

The ZOO Management System is a Java-based console application which uses OOP principles including interfaces, abstract classes and polymorphism that allows the admin and vistor to manage their functionalities.
<br />Admins can manage attractions and animals, schedule the attractions, set discounts and special deals, view visitor stats and also view the feedbacks provided by the visitors.
<br />Visitors must first buy a membership and a ticket, then can explore the zoo, use discounts and special deals, visit the animals and attractions and also provide a feedback.
<br />
<hr />

<h4><u>Admin Class:</u></h4>
The Admin class represents the system for managing the attractions and animals.
<br />It allows the addition and removal of animals, attractions, visitors, discounts, special deals, and the listing of various components.
<br/>Admin class contains arraylists to store the list of animas, attractions, visitors, feedbacks, discounts, deals and also visited attractions.
<hr />

<h4><u>Visitor Class:</u></h4>
The Visitor class represents visitors who interact with the system.
<br/>Visitors must be first registered and have various attributes associated with them, such as their name, email, password, membership type, balance, and more.
<br/>This class is designed to manage visitor information and their interactions within an attraction system.
<br/>Visitor class contains arraylists to store the purchased attractions (to keep track of most visited attraction).
<hr/>

<h4><u>Discount Class and Special Deals Class:</u></h4>
Discount class takes input of the category, discount percentage and description of the discount.
<br/>Special Deals class takes input of minimum attractions and discount percentage for creating a special deal.
<br/>It generates a discount/special deal code using setCode() function. This code can be applied by the basic visitors while buying the tickets.
<hr/>

<h4><u>Main Class:</u></h4>
All the functionalities and the menu-driven code lies here.
<br/>The program runs in a loop and Admin-Menu and Visitor-Menu with their functionalities are executed.
<br/>Exception an error handling is taken care of in the Main class.
<hr/>

<h5><u>Assumptions: </u></h5>
<ul>
The username and password for the admin is assumed to be "swara" and "swara123" respectively.
</ul>
<ul>
Except for the login details(usernames and passwords of both admin and visitors), all the other String inputs are not case-sensitive.
</ul>
<ul>
There are 6 predefined animals, 2 in each category; mammals, amphibians and reptiles. Admin can add or remove animals.
<br/>Animals can be removed only if there are 2 animals in each category.
</ul>
<ul>
There are 3 hardcoded attractions which are default set to closed.
<br/>Admin has to schedule the attractions to open from the Schedule Attractions in the Admin menu, where they can also change the price for each attraction.
</ul>
<ul>
The visitor has already registered before logging in along with all the necessary details.
</ul>
<ul>
The visitor does not have any membership by default. Visitor has to decide and buy a membership after registering(basic/premium).
</ul>
<ul>
There are no predefined discounts and special deals. Admin has to add them. However, there are functionalities to remove he discounts.
</ul>
<ul>
While buying tickets,prompt asks for number of tickets that a user would want to buy and then during the visit attractions, if the visitor has bought multiple tickets for the same attraction, all of them will be used at once.
</ul>
<hr/>
