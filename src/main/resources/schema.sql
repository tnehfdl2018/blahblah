 CREATE TABLE IF NOT EXISTS TEAM
(
  id int primary key
  ,name_ko varchar(255) not null
  ,name_en varchar(255) 
);

 CREATE TABLE IF NOT EXISTS COMMENT
(
  seq int primary key
  ,team_id int
  ,user_name varchar(255) not null
  ,content varchar(1024) not null
  ,wrtr_dttm timestamp default now()
  ,FOREIGN KEY (team_id) REFERENCES  team(id)
);