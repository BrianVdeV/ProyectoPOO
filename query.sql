drop database if exists ProyectoPOO;
create database ProyectoPOO;
use ProyectoPOO;


CREATE TABLE usuarios (
  id_usu int auto_increment primary key,
  nombre varchar(25) not null,
  usuario VARCHAR(25) NOT NULL,
  contra VARCHAR(25) NOT NULL
);

CREATE TABLE proyectos (
  id_pro INT AUTO_INCREMENT PRIMARY KEY,
  nom_pro VARCHAR(125) NOT NULL,
  ubi_pro VARCHAR(125)
);

CREATE TABLE actividades (
  id_act INT AUTO_INCREMENT PRIMARY KEY,
  ini_act DATETIME NOT NULL,
  fin_act DATETIME,
  des_act VARCHAR(225) NOT NULL,
  id_pro INT,
  id_col INT,
  FOREIGN KEY (id_pro) REFERENCES proyectos(id_pro),
  FOREIGN KEY (id_col) REFERENCES usuarios(id_usu)
);

CREATE TABLE seguimientos (
  id_pro INT,
  num_seg INT NOT NULL,
  est_seg VARCHAR(25),
  pre_seg DATE,
  ven_seg DATE,
  FOREIGN KEY (id_pro) REFERENCES proyectos(id_pro)
);

CREATE TABLE clientes (
  id_cli INT,
  nom_cli VARCHAR(25),
  dni_cli INT,
  FOREIGN KEY (id_cli) REFERENCES proyectos(id_pro)
);

CREATE TABLE Boletas (
	id_bol int auto_increment primary key,
    bot_Tipo VARCHAR(255),
    bot_Detalles VARCHAR(255),
    bot_Cli VARCHAR(255),
    bot_ubi VARCHAR(255),
    dni_cli VARCHAR(255)
);
-------------------- Procedimientos Almacenados -------------------

DELIMITER //

CREATE PROCEDURE InsertarUsuario(
    IN p_nombre VARCHAR(25),
    IN p_usuario VARCHAR(25),
    IN p_contra VARCHAR(25)
)
BEGIN
    INSERT INTO usuarios (nombre, usuario, contra)
    VALUES (p_nombre, p_usuario, p_contra);
END //

DELIMITER ;

DELIMITER //
CREATE PROCEDURE InsertarActividad(IN idpro INT, IN desact VARCHAR(225))
BEGIN
    INSERT INTO actividades (ini_act, id_pro, des_act) VALUES (NOW(),idpro, desact);
END //

DELIMITER ;




DELIMITER //
CREATE PROCEDURE InsertarProyecto(IN nompro varchar(125), IN ubipro VARCHAR(125))
BEGIN
    INSERT INTO proyectos(nom_pro, ubi_pro) VALUES (nompro,ubipro);
END //
DELIMITER ;

DELIMITER //

CREATE PROCEDURE InsertarBoleta (
    IN tipo VARCHAR(255),
    IN detalles VARCHAR(255),
    IN cliente VARCHAR(255),
    IN ubicacion VARCHAR(255),
    IN dni_cliente VARCHAR(255)
)
BEGIN
    INSERT INTO Boletas (bot_Tipo, bot_Detalles, bot_Cli, bot_ubi, dni_cli)
    VALUES (tipo, detalles, cliente, ubicacion, dni_cliente);
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE InsertarSeguimiento (
    IN p_id_pro INT,
    IN p_num_seg INT,
    IN p_est_seg VARCHAR(25),
    IN p_pre_seg DATE,
    IN p_ven_seg DATE
)
BEGIN
    INSERT INTO seguimientos (id_pro, num_seg, est_seg, pre_seg, ven_seg)
    VALUES (p_id_pro, p_num_seg, p_est_seg, p_pre_seg, p_ven_seg);
END //

DELIMITER ;


-- Nombre, Usuario y Contraseña
CALL InsertarUsuario('Jorge', 'Jorge', 'jorge');
CALL InsertarUsuario('Victor', 'Victor', 'victor');
CALL InsertarUsuario('Jaimes', 'James', 'james');
CALL InsertarUsuario('Profe', 'Profe', 'utp123');

call InsertarProyecto('Plano de Obra','Surco');
call InsertarProyecto('Visacion','Villa El salvador');
call InsertarProyecto('Independización','Villa El salvador');
call InsertarProyecto('Busqueda Catastral','Villa El salvador');

CALL InsertarActividad(1,'Diseño de planos');

call InsertarBoleta('pequeño','Casa 2 pisos','Jorge','Cañete','4903380');
call InsertarBoleta('pequeño','Casa 2 pisos','Brian','Surco','3232323');
call InsertarBoleta('mediano','Casa 2 pisos','Fernanda','Rancagua','1357924');
call InsertarBoleta('pequeño','Apartamento','Diego','Punta Arenas','4681359');
call InsertarBoleta('mediano','Casa 1 piso','Laura','Arica','2468135');
call InsertarBoleta('grande','Casa 4 pisos','Andrés','Temuco','3579246');
call InsertarBoleta('pequeño','Apartamento','Carolina','Antofagasta','1357924');
call InsertarBoleta('grande','Casa 2 pisos','Roberto','Viña del Mar','5793146');
call InsertarBoleta('mediano','Departamento','Ana','La Serena','2468135');
call InsertarBoleta('pequeño','Casa 1 piso','Luisa','Concepción','9876543');
call InsertarBoleta('grande','Casa 3 pisos','Pedro','Valparaíso','7654321');
call InsertarBoleta('mediano','Apartamento','María','Santiago','1234567');


CALL InsertarSeguimiento(1, 1, 'Estado de seguimiento', '2023-01-01', '2023-01-31');
CALL InsertarSeguimiento(2, 3, 'Apelado', '2023-02-01', '2023-02-28');
CALL InsertarSeguimiento(4, 2, 'Ingresado', '2023-03-01', '2023-03-31');
CALL InsertarSeguimiento(1, 4, 'Liquidado', '2023-04-01', '2023-04-30');
CALL InsertarSeguimiento(3, 1, 'Observado', '2023-05-01', '2023-05-31');
CALL InsertarSeguimiento(2, 4, 'Apelado', '2023-06-01', '2023-06-30');
CALL InsertarSeguimiento(4, 3, 'Ingresado', '2023-07-01', '2023-07-31');
CALL InsertarSeguimiento(1, 2, 'Liquidado', '2023-08-01', '2023-08-31');
CALL InsertarSeguimiento(3, 4, 'Observado', '2023-09-01', '2023-09-30');
CALL InsertarSeguimiento(2, 1, 'Apelado', '2023-10-01', '2023-10-31');
CALL InsertarSeguimiento(4, 1, 'Ingresado', '2023-11-01', '2023-11-30');


select*from actividades;
select*from proyectos;
select*from boletas;