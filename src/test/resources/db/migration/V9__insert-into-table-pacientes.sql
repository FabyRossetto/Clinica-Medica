-- Eliminar datos de pacientes
DELETE FROM pacientes;

-- Insertar datos en pacientes
INSERT INTO pacientes (id, nombre, email, documento, calle, numero, ciudad,provincia, pais, telefono, activo)
VALUES
(1, 'amanda', 'xxx@mail.com', '1111111', 'Santos Dumont', '111','Godoy Cruz', 'Mendoza','Argentina', '2616862343', TRUE);
