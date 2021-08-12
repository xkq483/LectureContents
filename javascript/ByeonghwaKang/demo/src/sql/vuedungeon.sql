create table vuedungeon(
    dungeon_no int not null auto_increment,
    name varchar(200) not null,
    description text null,
    monsterLevel int not null,
    exp int not null,
    dropMoney int not null,
    dropItem varchar(100) not null,
    reg_date timestamp not null default now(),
    primary key(dungeon_no)
);

insert into vuedungeon (name, description, monsterLevel, exp, dropMoney, dropItem) values
('몽환의 궁전', 'ㅈㄴ센 던전', 5, 15, 500', '강철검');

insert into vuedungeon (name, description, monsterLevel, exp, dropMoney, dropItem) values
('광구궁단장', 'ㅈㄴ센 던전', 15, 30, 1000, '광기의 대검');