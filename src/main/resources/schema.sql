 CREATE TABLE IF NOT EXISTS teamtable
(
team_name_kr varchar(100) primary key,
team_name_en varchar(100) not null,
team_year varchar(6) not null,
team_win varchar(5) not null,
team_last_result varchar(5) not null,
team_loc varchar(25) not null
);

create table if not exists comment
(
comment_num int primary key auto_increment,
team_name_kr varchar(100) not null,
subject varchar(200) not null,
writer varchar(20) not null,
content varchar(300),
date timestamp default now()
);