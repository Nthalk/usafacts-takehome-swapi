create table swapi_starship
(
    starship_id            int,
    name                   varchar(255),
    model                  varchar(255),
    manufacturer           varchar(255),
    cost_in_credits        numeric,
    length                 numeric,
    max_atmosphering_speed varchar(255),
    crew                   varchar(255),
    passengers             varchar(255),
    cargo_capacity         numeric,
    consumables            varchar(255),
    hyperdrive_rating      varchar(255),
    MGLT                   varchar(255),
    starship_class         varchar(255),
    created                timestamp,
    edited                 timestamp,
    url                    varchar(255),
    first_seen_in_episode  integer,
    episode_span           integer,
    constraint swapi_starship_pk
        primary key (starship_id)
);

create table swapi_starship_film
(
    starship_id integer,
    film_id     integer,
    constraint swapi_starship_film_pk
        primary key (starship_id, film_id)
)
