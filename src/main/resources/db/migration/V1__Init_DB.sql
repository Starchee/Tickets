

create table cars (
    id  bigserial not null,
    car_number varchar(255),
    make varchar(255),
    model varchar(255),
    owner_id int8,
    primary key (id)
    );

create table catalog (
    id  bigserial not null,
    description varchar(255),
    price float4,
    type varchar(255),
    primary key (id)
    );

create table owners (
    id  bigserial not null,
    lastname varchar(255),
    primary key (id)
    );

create table tickets (
    id  bigserial not null,
    type varchar(255),
    car_id int8,
    catalog_id int8,
    primary key (id)
    );

alter table if exists cars add constraint cars_owner_pk
    foreign key (owner_id) references owners;

alter table if exists tickets add constraint tickets_cars_pk
    foreign key (car_id) references cars;

alter table if exists tickets add constraint tickets_catalog_pk
    foreign key (catalog_id) references catalog;