-- 2. Crear tabla usuarios
CREATE TABLE IF NOT EXISTS usuarios (
    id BIGINT AUTO_INCREMENT, -- Aquí quité el PRIMARY KEY que sobraba
    login VARCHAR(100) NOT NULL UNIQUE,
    clave VARCHAR(300) NOT NULL,
    PRIMARY KEY (id)
);
