# spring-pageable-example
Project to show how to return a pageable content

In this project I've implemented a way to return paginated objects using PagingAndSortingRepository interface in Spring Boot.

This project was built as a tutorial that you can find in this article:

https://dev.to/brunbs/how-to-return-paginated-data-in-spring-boot-11cm

At some point in your journey as a back end developer you will certainly come across a demand related to pagination.

We will often have a LOT of data persisted in databases and it would be impossible to present them all to the user. When we enter a virtual store, we are not presented with all the products at once, but rather in parts, using controllable filters and being able to advance pages to see the next products.

At first it may seem hopeless as you may try to go through the arduous path of counting elements, making divisions to determine the number of pages, filtering lists, etc.

However, we have a very practical, easy and quick-to-implement solution for us Java Spring developers, which is to use PagingAndSortingRepository passing a Pageable to the method.

Let's create a small project (based on a previous project used in other posts) to persist and return student data. The data used will be very basic, being: registration number, name and last name.
Very simple so we don't lose focus.

The project was created in Java 21 with spring boot version 3.1.5

Dependencies used:
Lombok - to reduce boilerplate code
Mapstruct - facilitates object mapping
H2 - so we don't waste time configuring databases
JPA - since we will work with persistence
OpenAi - we will use a swagger so that you can run and use it without needing postman or another tool