drop table if exists user_demo;
create table user_demo
(
    id          varchar(255) not null
        primary key,
    create_time datetime     null,
    name        varchar(255) null,
    upd_time    datetime     null
);
INSERT INTO user_demo (id, create_time, name, upd_time) VALUES (1, '2023-08-19 05:49:00', 'nihao', '2023-08-19 05:49:00');