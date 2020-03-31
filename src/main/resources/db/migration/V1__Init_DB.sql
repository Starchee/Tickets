create table cars (
    id  bigserial not null,
    car_number varchar(255),
    make varchar(255),
    model varchar(255),
    owner_car_number int8,
    primary key (id)
    );

create table catalog (
    id  bigserial not null,
    desription varchar(255),
    price float4,
    type varchar(255),
    primary key (id)
    );
create table owners (
    id  bigserial not null,
    car_nubmer varchar(255),
    middle_name varchar(255),
    name varchar(255),
    surname varchar(255),
    primary key (id)
    );
 create table tickets (
     id  bigserial not null,
     car_number varchar(255),
     type varchar(255),
     car_car_number int8,
     catalog_type int8,
     primary key (id)
    );
alter table if exists cars add constraint cars_owner_fk
    foreign key (owner_car_number) references owners;

alter table if exists tickets add constraint tickets_car_fk
    foreign key (car_car_number) references cars;

alter table if exists tickets add constraint tickets_catalog_fk
    foreign key (catalog_type) references catalog;