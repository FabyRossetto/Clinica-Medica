DELETE FROM consultas;
DELETE FROM pacientes;
DELETE FROM medicos;

INSERT INTO pacientes (id, activo, calle, ciudad, numero, pais, provincia, documento, email, nombre, telefono)
VALUES 
(2, TRUE, 'Avenida', 'c', '123', 'a', 'B', '2222222', 'b@mail.com', 'bruna', '12334567'),
(3, TRUE, 'Avenida', 'c', '123', 'a', 'B', '4444444', 'd@mail.com', 'debora', '12334567'),
(4, TRUE, 'Avenida', 'c', '123', 'a', 'B', '3333333', 'c@mail.com', 'carla', '12334567');
