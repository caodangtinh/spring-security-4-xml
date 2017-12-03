insert into users(username, password, enable) values ("tinhcao", "tinhcao", true);
insert into users(username, password, enable) values ("kua", "kua", true);

insert into authorities(username, authority) values ("tinhcao", "ROLE_USER");
insert into authorities(username, authority) values ("kua", "ROLE_USER");
