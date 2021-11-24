-- begin BPMNTESTER_TRANSACTION
create table BPMNTESTER_TRANSACTION (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    STATUS varchar(255),
    DESCRIPTION varchar(255),
    CHECK_NO varchar(255),
    RECCOMENDATIONS varchar(255),
    --
    primary key (ID)
)^
-- end BPMNTESTER_TRANSACTION
-- begin BPMNTESTER_USER
create table BPMNTESTER_USER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PASSWORD varchar(255),
    USERNAME varchar(255),
    ROLE varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end BPMNTESTER_USER
