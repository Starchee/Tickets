create table cars (
    id  bigserial not null,
    carnumber varchar(255),
    make varchar(255),
    model varchar(255),
    primary key (id)
    );

create table catalog (
    id  bigserial not null,
    desription varchar(255),
    price float4,
    type varchar(255),
    primary key (type
    );

create table owners (
    id  bigserial not null,
    surname varchar(255),
    carnumber varchar(255),
    primary key (carnumber)
    );

 create table tickets (
     id  bigserial not null,
     carnumber varchar(255),
     type varchar(255),
     primary key (type)
    );
alter table if exists cars add constraint cars_owner_fk
    foreign key (carnumber) references owners;

alter table if exists tickets add constraint tickets_car_fk
    foreign key (carnumber) references cars;

alter table if exists tickets add constraint tickets_catalog_fk
    foreign key (type) references catalog;