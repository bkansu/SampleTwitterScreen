-- begin UNTITLED2_PRODUCT
create table UNTITLED2_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCTID integer,
    PRODUCT_COMPANY varchar(255),
    PRODUCTNAME varchar(255),
    --
    primary key (ID)
)^
-- end UNTITLED2_PRODUCT
