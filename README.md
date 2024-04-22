E-Commerce System program 
Overview:
We have 8 classes ,every one of them do a specific task 

1-Product class: is the parent class which contains productId,name of the product, price and has setters and getters methods.

2- ElectronicProduct class: will inherent the Product class(subclass) , contains same  attributes in the Product and brand and warrantyPeriod,also has setters and getters. 

3- ClothingProduct Class: will also inherent the Product class(subclass) , contains same  attributes in the Product and size of the clothes and the fabric, has setters and getters.

4- BookProduct class :will also inherent the Product class(subclass) , contains same  attributes in the Product and author name of the book and the publisher, also has setters and getters. 

5- Customer class :contains CustomerId, name,address ,setters and getters. 

6-Cart class: represents a shopping cart contains CustomerId, nProducts =number of products, arry to store the products , addProduct method that will add every product when user use the add button, remove product will remove product when user wants ,calcuatePrice method will calculates the total price of the products , place order method takes an object form order class that will call printOrderInfo method 

7- Order calss: contains CustomerId, ordered, array of the products, totalPrice , in the printOrderInfo method it will print the summary of the order and show every product name and it's price, and show the total price at the end .

8- E-Commerce System is the main and demonstrates the usage of the other classes
