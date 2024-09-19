-- Crear tabla pacientes
CREATE TABLE pacientes (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    documento VARCHAR(14) NOT NULL UNIQUE,
    calle VARCHAR(100) NOT NULL,
    numero VARCHAR(100) NOT NULL,
    ciudad VARCHAR(100),
    provincia VARCHAR(20),
    pais VARCHAR(100) NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    activo BOOLEAN NOT NULL, -- H2 usa BOOLEAN en lugar de TINYINT
    PRIMARY KEY (id)
);