CREATE SCHEMA IF NOT EXISTS sample_schema;

CREATE TABLE sample_schema.ankens (
    anken_number character varying(10) NOT NULL,
    anken_name character varying(256) NOT NULL,
    CONSTRAINT anken_pk PRIMARY KEY (anken_number),
    CONSTRAINT anken_name_unique UNIQUE (anken_name)
);

INSERT INTO sample_schema.ankens(anken_number, anken_name) VALUES ('999', 'TEST');
