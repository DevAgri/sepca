{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 -- Database: devagri\
\
-- DROP DATABASE devagri;\
\
CREATE DATABASE devagri\
  WITH OWNER = postgres\
       ENCODING = 'UTF8'\
       TABLESPACE = pg_default\
       LC_COLLATE = 'en_US.UTF-8'\
       LC_CTYPE = 'en_US.UTF-8'\
       CONNECTION LIMIT = -1;\
\
\
-- Table: public.est_total\
\
-- DROP TABLE public.est_total;\
\
CREATE TABLE public.est_total\
(\
  id_estimativa smallint NOT NULL DEFAULT nextval('est_total_id_estimativa_seq'::regclass),\
  prcana real NOT NULL,\
  areatotal real NOT NULL,\
  CONSTRAINT est_total_pkey PRIMARY KEY (id_estimativa)\
)\
WITH (\
  OIDS=FALSE\
);\
ALTER TABLE public.est_total\
  OWNER TO postgres;\
\
-- Table: public.estimativa_ha\
\
-- DROP TABLE public.estimativa_ha;\
\
CREATE TABLE public.estimativa_ha\
(\
  id_estimativa smallint NOT NULL DEFAULT nextval('estimativa_ha_id_estimativa_seq'::regclass),\
  ppcana real NOT NULL,\
  ky real NOT NULL,\
  etrcana real NOT NULL,\
  etccana real NOT NULL,\
  CONSTRAINT estimativa_ha_pkey PRIMARY KEY (id_estimativa)\
)\
WITH (\
  OIDS=FALSE\
);\
ALTER TABLE public.estimativa_ha\
  OWNER TO postgres;\
-- Table: public.evapotranspiracao\
\
-- DROP TABLE public.evapotranspiracao;\
\
CREATE TABLE public.evapotranspiracao\
(\
  id_evapot smallint NOT NULL DEFAULT nextval('evapotranspiracao_id_evapot_seq'::regclass),\
  kc real NOT NULL,\
  evptr_ref real NOT NULL,\
  CONSTRAINT evapotranspiracao_pkey PRIMARY KEY (id_evapot)\
)\
WITH (\
  OIDS=FALSE\
);\
ALTER TABLE public.evapotranspiracao\
  OWNER TO postgres;\
-- Table: public.metodo_zae\
\
-- DROP TABLE public.metodo_zae;\
\
CREATE TABLE public.metodo_zae\
(\
  id_metodo_zae integer NOT NULL DEFAULT nextval('metodo_zae_id_metodo_zae_seq'::regclass),\
  ciaf real NOT NULL,\
  cr real NOT NULL,\
  ccol real NOT NULL,\
  cum real NOT NULL,\
  nd real NOT NULL,\
  f_ real NOT NULL,\
  a_ real NOT NULL,\
  b_ real NOT NULL,\
  ppbp real NOT NULL,\
  pbn real NOT NULL,\
  c_ real NOT NULL,\
  d_ real NOT NULL,\
  pbc real NOT NULL,\
  ano smallint NOT NULL,\
  produtor smallint NOT NULL,\
  setor smallint NOT NULL,\
  CONSTRAINT metodo_zae_pkey PRIMARY KEY (id_metodo_zae)\
)\
WITH (\
  OIDS=FALSE\
);\
ALTER TABLE public.metodo_zae\
  OWNER TO postgres;\
-- Table: public.usuario\
\
-- DROP TABLE public.usuario;\
\
CREATE TABLE public.usuario\
(\
  id_usuario integer NOT NULL DEFAULT nextval('usuario_id_usuario_seq'::regclass),\
  nome character(16) NOT NULL,\
  senha character(8) NOT NULL,\
  CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario)\
)\
WITH (\
  OIDS=FALSE\
);\
ALTER TABLE public.usuario\
  OWNER TO postgres;\
}