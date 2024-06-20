dop table customer if exists

create table customer(
id int auto_increment primary key,
login varchar(100)not null unique,
password varchar(100)not null);

insert into customer values(null,'ayukawa','SweetfishRiver1');
insert into customer values(null,'samejima','SharkIsland2');
insert into customer values(null,'wanibuchih','SrocodileChasm3');
insert into customer values(null,'ebihara','SheimpField4');
insert into customer values(null,'kanie','CrubBay5');