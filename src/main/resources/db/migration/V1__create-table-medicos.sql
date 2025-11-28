
-- Crear tabla medicos
CREATE TABLE medicos (
   id BIGINT AUTO_INCREMENT ,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    documento VARCHAR(6) NOT NULL UNIQUE,
    especialidad VARCHAR(100) NOT NULL,
    calle VARCHAR(100) NOT NULL,
    numero VARCHAR(100) NOT NULL,
    ciudad VARCHAR(100),
    provincia VARCHAR(20),
    pais VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    activo BOOLEAN NOT NULL, 
    PRIMARY KEY (id)
);
