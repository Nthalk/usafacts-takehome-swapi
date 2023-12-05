create table custom_query
(
    query_id    INTEGER PRIMARY KEY AUTOINCREMENT,
    name        varchar(100)  not null,
    description varchar(1000) not null,
    query       varchar(1000) not null,
    table_name  varchar(100)  not null,
    created_at  timestamp default current_timestamp
);
