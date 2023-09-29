create database sanjib_db;

use sanjib_db;

create table Note(note_id int primary key,
				  note_title varchar(50),
                  note_content varchar(200),
                  note_status varchar(20),
                  note_creation_date date);
                  
desc Note;


create table User(user_id int primary key,
				  user_name varchar(30),
                  user_added_date date,
                  user_password varchar(20),
                  user_mobile numeric(10));
                  
create table Category(category_id int primary key,
				  category_name varchar(30),
                  category_descr varchar(80),
                  category_creation_date date,
                  category_creator varchar(20));
                  
create table Reminder(reminder_id int primary key,
				  reminder_name varchar(30),
                  reminder_descr varchar(80),
                 remainder_type varchar(20),
                  remainder_creation_date date,
                  reaminder_creator varchar(20));
				
create table NoteCategory(notecategory_id int primary key,
						 note_id int,
						category_id int,
                        foreign key (note_id) references Note(note_id),
                        foreign key (category_id) references Category(category_id));
                        
desc NoteCategory;

create table NoteReminder(notereminder_id int primary key,
						  note_id int,
                          reminder_id int,
                          foreign key (note_id) references Note(note_id),
                          foreign key (reminder_id) references Reminder(reminder_id));
                          
create table UserNote(usernote_id int primary key,
					  user_id int,
                      note_id int,
                      foreign key (user_id) references User(user_id),
                      foreign key (note_id) references Note(note_id));
                      
                      
show tables;


 insert into User values(1001,'vaibhav', '2020-05-20','vai543',7252722345);
 insert into User values(1002,'rohit', '2020-05-03','roh9211',9754861234);
 insert into User values(1003,'sabjib', '2021-04-07','san852',9898755214);
 insert into User values(1004,'himanshu', '2020-07-15','him6364',6354725819);
 insert into User values(1005,'suraj', '2021-11-19','suj847',8467471274);
 
 select * from User;
 
 
 Insert into Note values(1, 'cricket','ipl is starting', 'active','2020-07-20');
 Insert into Note values(4, 'Assignment','pending Assignment', 'completed','2021-01-25');
 Insert into Note values(3, 'Events','upcoming events', 'active','2022-08-20');
 Insert into Note values(25, 'meetings','upcoming meetings', 'pending','2020-04-15');
 Insert into Note values(42, 'java','high level langusge', 'active','2020-06-25');
 Insert into Note values(23, 'selenium','testing Suite', 'active','2021-02-09');
 Insert into Note values(87, 'Docker','container management', 'active','2022-02-09');
 select * from Note;
 
 Insert into Category values(1, 'personal', 'personal note','2020-05-24','rohit');
 Insert into Category values(3, 'professional', 'professional note','2020-08-04','sanjib');
 Insert into Category values(6, 'educational', 'educational note','2020-06-14','suraj');
 
 select * from Category;
 
 
 Insert into Reminder values(1,'match remainder', 'reminder of upcoming match', 'urgent','2021-04-21','rohit');
 Insert into Reminder values(54,'meeting remainder', 'reminder of upcoming match', 'urgent','2021-07-01','vaibhav');
 Insert into Reminder values(21,'assignment remainder', 'reminder of upcoming match', 'urgent','2021-09-08','suraj');
 Insert into Reminder values(44,'events remainder', 'reminder of upcoming match', 'urgent','2021-01-01','sanjib');
 
select * from Reminder;

Insert into NoteCategory values(45,25,3);
Insert into NoteCategory values(41,4,1);
Insert into NoteCategory values(236,23,6);

select * from NoteCategory;

insert into NoteReminder values(11,1,1);
insert into NoteReminder values(2554,25,54);
insert into NoteReminder values(421,4,21);


select * from NoteReminder;


insert into UserNote values(10014,1001,4);
insert into UserNote values(10041,1004,1);
insert into UserNote values(100523,1005,23);
insert into UserNote values(100487,1004,87);

select * from UserNote;

-- Fetch the row from User table based on Id and Password.
select * from User where user_id = 1004 && user_password = 'him6364';

-- Fetch all the rows from Note table based on the field note_creation_date.
select * from Note where note_creation_date = '2020-04-15';

-- Fetch all the Categories created after the particular Date.
select * from Category where category_creation_date > '2020-06-15';

-- Fetch all the Note ID from UserNote table for a given User.
select note_id from UserNote where user_id = 1004; 

-- Write Update query to modify particular Note for the given note Id.
update Note set note_title= 'football' where note_id = 1;

-- Fetch all the Notes from the Note table by a particular User.
select Note.note_title from Note join UserNote on Note.note_id = UserNote.note_id join User on UserNote.user_id = User.user_id where User.user_id=1005;

-- Fetch all the Notes from the Note table for a particular Category.
select Note.note_title from Note join NoteCategory on Note.note_id = NoteCategory.note_id join Category on NoteCategory.category_id = Category.category_id where Category.category_id=1;


-- Fetch all the reminder details for a given note id.
select * from Reminder join NoteReminder on Reminder.reminder_id=NoteReminder.reminder_id join Note on NoteReminder.note_id = Note.note_id where Note.note_id = 1;

-- Fetch the reminder details for a given reminder id.
select * from Reminder where reminder_id = 21;


-- Write a query to create a new Note for particular User (Use Note and UserNote tables - insert statement).
insert into Note values(89,"Exam","upcoming Exam","pending","2022-01-23");
insert into UserNote values(100389,1003,89);

-- Write a query to create a new Note for particular User to particular Category(Use Note and NoteCategory tables - insert statement)
insert into Note values(56,"Spring","spring notes","active","2021-04-06");
insert into NoteCategory values(566,56,6);

-- Write a query to set a reminder for a particular note (Use Reminder and NoteReminder tables - insert statement)
insert into Reminder values(77,'Exam remainder', 'reminder of upcoming Exam', 'urgent','2022-01-01','sanjib');
insert into NoteReminder values(8977,89,77);


-- Write a query to delete particular Note added by a User(Note and UserNote tables - delete statement)
delete from UserNote where user_id = 1004;
delete from Note where note_id = 87;


-- Write a query to delete particular Note from particular Category(Note and NoteCategory tables - delete statement)
delete from NoteCategory where category_id = 6;
delete from Note where note_id = 56;


-- Create a trigger to delete all matching records from UserNote, NoteReminder and NoteCategory table when :1. A particular note is deleted from Note table (all the matching records from UserNote, NoteReminder and NoteCategory should be removed automatically)
CREATE TRIGGER note_delete_trigger
before DELETE
ON Note FOR EACH ROW
delete from UserNote where Note.note_id = UserNote.note_id;
delete from NoteCategory where Note.note_id = NoteCategory.note_id;
delete from NoteReminder where Note.note_id = NoteReminder.note_id;



-- 2. A particular user is deleted from User table (all the matching notes should be removed automatically)

CREATE TRIGGER user_delete_trigger
before DELETE
ON User FOR EACH ROW
delete from UserNote where old.user_id = UserNote.user_id;
delete from Notes where UserNote.note_id = Notes.note_id;
