use personaltrainer;

--Activity 1

select * from exercise;

--Activity 2

select * from client;

--Activity 3

select * from client 
	where City = 'Metairie';

--Activity 4

select * from client 
	where ClientId =  '818u7faf-7b4b-48a2-bf12-7a26c92de20c';

--Activity 5

select * from goal;

--Activity 6

select Name, LevelId from workout;

--Activity 7

select Name, LevelId, Notes from workout
	where LevelId = 2;

--Activity 8

select FirstName, LastName, City from Client 
	where City = 'Metairie'
    OR City = 'Kenner'
    OR City = 'Gretna';

--Activity 9

select FirstName, LastName, BirthDate from Client 
	where BirthDate between '1980-1-1' and '1989-12-31';

--Activity 10

select FirstName, LastName, BirthDate from Client 
	where BirthDate > '1980-1-1' and BirthDate < '1989-12-31';

--Activity 11

select * from login
	where EmailAddress like '%.gov';

--Activity 12

select * from login
	where EmailAddress not like	'%.com';

--Activity 13

select FirstName, Lastname from client
	where BirthDate is null;

--Activity 14

select Name from exercisecategory
	where ParentCategoryId is not null;

--Activity 15

select Name, Notes from workout
	where notes like '% you %';

--Activity 16

select FirstName, LastName, City from Client 
	where City = 'LaPlace'
    and LastName like 'L%'
    OR City = 'LaPlace'
    and LastName like 'M%'
    OR City = 'LaPlace'
    and LastName like 'N%';

--Activity 17

select InvoiceId, Description, Price, Quantity, ServiceDate,
	line_item_total from (
		select InvoiceId, Description, Price, Quantity, ServiceDate, Price * Quantity AS line_item_total 
    from invoicelineitem) tbl
	
    where line_item_total between 15 and 25;

--Activity 18

select * from login
	where ClientId = ( select ClientId from client 
						where FirstName = 'Estrella'
                        and LastName = 'Bazely');

--Activity 19

select name from Goal
	where GoalId in ( select GoalId from workoutgoal
						where WorkoutId = ( select WorkoutId from workout
												where Name = 'This is Parkour')
                                                );