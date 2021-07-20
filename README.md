# Train Ticket Booking App

# Project Features

# Feature 1- Viewing Train Details:-

CREATE SEQUENCE train_id
MINVALUE 1
START WITH 1
INCREMENT BY 1;

CREATE SEQUENCE train_number
MINVALUE 1
START WITH 21651
INCREMENT BY 1;


create table train_details (
train_id number NOT NULL,train_number int NOT NULL,train_name varchar2(50) NOT NULL,
train_source varchar2(40) NOT NULL,train_destination varchar2(40) NOT NULL,
source_time varchar2(50) NOT NULL,destination_time varchar2(50) NOT NULL,
station_one varchar2(50) NOT NULL,station_two varchar2(50),station_three varchar2(50),
fare int NOT NULL,available_Days varchar2(50),available_seats number NOT NULL,
unique(train_number),check(fare>0));

select * from train_details;					      

select station_one, station_two,station_three FROM train_details WHERE tr_id=2;

select station_one, station_two,station_three FROM train_details WHERE train_source='TRICHY' and train_destination='MADUARAI';

# Add Query:-

insert into train_details values (tr_id.nextval,train_number.nextval,'TEJASEXPRESS','TRICHY','MADUARAI','10:00','17:00','SRIRANGAM','PONMALAI','LALGUDI',1240,'DAILY',100);

insert into train_details values (tr_id.nextval,train_number.nextval,'VAIGAIEXPRESS','MADURAI','CHENNAI','05:00','11:30','TRICHY','PERAMBALUR','VILUPURAM',1000,'MONDAY,TUESDAY',150);

insert into train_details values (tr_id.nextval,train_number.nextval,'TRICHYEXPRESS','CHENNAI','TRICHY','08:00','15:00','VILUPURAM','PERAMBALUR','PONMALAI',750,'WEDNEDAY,SUNDAY',175);

# Displaying Train Details:
select * from train_details;

drop table train_details;

DELETE FROM train_details WHERE train_name='RAYAPURAMEXPRESS';

# Feature 2-Passenger Details:-

CREATE SEQUENCE passenger_id
MINVALUE 1
START WITH 1001
INCREMENT BY 1;


create table passenger_details (
passenger_id number,
passenger_name varchar2(100) not null,
gender varchar2(10) not null, 
mobile_number number not null, 
passenger_password varchar2(50),
constraint gender_ch check(gender in('male','female','others')), 
constraint passenger_id_pk primary key(passenger_id),unique(mobile_number));

select * from  passenger_details;

# Add Query:-

insert into passenger_details
values(passenger_id.nextval,'swetha','female',9937808765,'swetha@123');

insert into passenger_details
values(passenger_id.nextval,'mohamed','male',9435627890,'mohamed@123');

insert into passenger_details
values(passenger_id.nextval,'sikkandar','male',9698612143,'sikkandar@123');

drop table passenger_details;

# Feature- 3 Booking Details

CREATE SEQUENCE booking_id
MINVALUE 1
START WITH 101
INCREMENT BY 1;

create table booking_details(
booking_id  number,
passenger_id int NOT NULL,
tr_id int NOT NULL,
pnr_no int NOT NULL,
journey_date date NOT NULL,
booking_date timestamp NOT NULL,
no_of_tickets int NOT NULL,
passenger_name varchar2(50),
total_price int NOT NULL,
status varchar2(20),
UNIQUE(pnr_no),
CONSTRAINT tr_id_fk FOREIGN KEY (tr_id)REFERENCES train_details (tr_id),
CONSTRAINT passenger_id_fk FOREIGN KEY (passenger_id)REFERENCES passenger_details (passenger_id),
check(no_of_tickets>0),check(total_price>0));

# Displaying Booking Details:-
select * from booking_details;

# Add Query:-

insert into booking_details values(booking_id.nextval,1001,1,5861,'30/july/2021',to_timestamp('10-jun-2021 07:10:34','DD-Mon-YYYY HH24:MI:SS')
,2,'swetha,mohamed',2480,'BOOKED');

insert into booking_details values(booking_id.nextval,1002,2,5862,'28/july/2021',to_timestamp('20-jul-2021 17:10:34','DD-Mon-YYYY HH24:MI:SS')
,1,'sakil',1000,'UNBOOKED');

drop table booking_details;

# Feature -4 Viewing All Train Names:-

select train_name from train_details;

# Feature -5 Displaying The Female Passengers With Their Train Name:-

select p.passanger_name,t.train_name from passenger_details p ,train_details t where p.tr_id=t.tr_id and p.gender='female';

# Feature -6 Giving Name Of The Train We Can Able To See Where The Train Starts And Ends Displaying In Ascending Order

select train_name,train_source,train_destination from train_details order by train_name;

# Feature -7 Count of Trains Moving From Chennai

select count(train_source) from train_details where train_source='CHENNAI';

# Feature -8 Altering the Booking_table Column and Adding the Column to know the Status of Payment_status

alter table booking_details add payment_status varchar2(100);

update  booking_details set payment_status='paid' where train_id=1;

update  booking_details set payment_status='not_paid' where train_id=2;

update booking_details set payment_status='paid' where train_id=3;

select * from booking_details;
