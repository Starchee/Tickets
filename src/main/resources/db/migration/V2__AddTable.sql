insert into owners(lastname)
values ('Храмцов'), ('Пушкин'), ('Лермантов'), ('Пупкин'),('Киркоров');

insert into cars(car_number, make, model, owner_id)
values ('777RU','Subaru','Legacy',1), ('007RU','Subaru','Forester',1), ('123RU','Lada','2101',2), ('111RU','BMW','07',3)
     , ('222RU','Kia','Rio',4), ('333RU','Lada','Priora',4), ('222RU','Honda','NSX',5);

insert into catalog(description, price, type)
values ('Превышение скорости',2.2,'Speed'), ('Нарушение правил парковки',5.0,'Parking'),
       ('Слишком много причин',10,'Other'), ('Опасное вождение',3000,'DangerMove');

insert into tickets( type, car_id, catalog_id)
values ('Speed',1,1), ('Parking',2,2), ('Other',3,3), ('Speed',4,1),('DangerMove',5,4), ('DangerMove',6,4),
       ('Other',7,3);

insert into users (username, password, enabled) values ('admin','{noop}qwerty', true), ('user','{noop}qwerty', true);

insert into authorities (username , authority) values  ('admin', 'ROLE_ADMIN'), ('user', 'ROLE_USER');
