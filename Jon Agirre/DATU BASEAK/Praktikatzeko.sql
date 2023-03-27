create database praktikatzeko;

use praktikatzeko;

CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL
);


INSERT INTO clientes (nombre, direccion, email) VALUES
('Juan Pérez', 'Calle Mayor 123', 'juan.perez@example.com'),
('María López', 'Plaza del Sol 456', 'maria.lopez@example.com'),
('Pedro Gómez', 'Avenida Libertad 789', 'pedro.gomez@example.com'),
('Luisa García', 'Calle del Pilar 1011', 'luisa.garcia@example.com');


CREATE TABLE pedidos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_cliente INT NOT NULL,
    fecha_pedido DATE NOT NULL,
    cantidad DECIMAL(10 , 2 ) NOT NULL,
    FOREIGN KEY (id_cliente)
        REFERENCES clientes (id)
);


INSERT INTO pedidos (id_cliente, fecha_pedido, cantidad) VALUES
(1, '2022-01-01', 1000.50),
(1, '2022-02-15', 2500.00),
(2, '2022-03-10', 1500.75),
(3, '2022-04-20', 500.00),
(4, '2022-05-05', 750.25),
(4, '2022-06-30', 1000.00);



UPDATE clientes 
SET 
    clientes.nombre = 'Ana Martinez',
    clientes.direccion = 'Calle del Carmen 789'
WHERE
    clientes.id = 2;


DELETE FROM pedidos 
WHERE
    pedidos.id_cliente = 4;


UPDATE pedidos 
SET 
    pedidos.fecha_pedido = '2022-01-15'
WHERE
    YEAR(pedidos.fecha_pedido) = 2022
        AND MONTH(pedidos.fecha_pedido) = 1;


DELETE FROM clientes 
WHERE
    id NOT IN (SELECT 
        pedidos.id_cliente
    FROM
        pedidos);


UPDATE pedidos 
SET 
    pedidos.cantidad = 3000
WHERE
    pedidos.id_cliente = 1
        AND pedidos.cantidad > 2000;


DELETE FROM pedidos 
WHERE
    MONTH(pedidos.fecha_pedido) < 4
    AND YEAR(pedidos.fecha_pedido) <= 2022;


UPDATE pedidos 
SET 
    pedidos.cantidad = pedidos.cantidad * 0.9;


DELETE FROM clientes 
WHERE
    clientes.pais != 'España';


UPDATE pedidos 
SET 
    pedidos.cantidad = pedidos.cantidad * 1.2
WHERE
    YEAR(pedidos.fecha_pedido) = 2022;


DELETE FROM pedidos 
WHERE
    pedidos.cantidad < 100
    AND pedidos.id_cliente NOT IN (SELECT 
        *
    FROM
        clientes
    
    WHERE
        clientes.pais != 'España'
        OR clientes.pais != 'Francia');


UPDATE pedidos 
SET 
    pedidos.fecha_pedido = CURDATE()
WHERE
    pedidos.id_cliente = 3;


UPDATE clientes 
SET 
    clientes.direccion = REPLACE(clientes.direccion,
        'Avenida',
        'Av.');

UPDATE pedidos 
SET 
    id = CONCAT(id, '0')
WHERE
    LENGTH(id) < 4;


DELETE FROM pedidos 
WHERE
    pedidos.fecha_pedido < '2022-01-01';

UPDATE clientes 
SET 
    clientes.nombre = CONCAT(UPPER(LEFT(clientes.nombre, 1)),
            MID(clientes.nombre,
                2,
                LOCATE(' ', clientes.nombre) - 1));


UPDATE pedidos 
SET 
    pedidos.fecha_pedido = DATE_FORMAT(pedidos.fecha_pedido, '%d/%m/%Y');


UPDATE clientes 
SET 
    clientes.nombre = CONCAT('sr. ', clientes.nombre);


UPDATE clientes 
SET 
    ciudad = REPLACE(ciudad, 'Bilbao', 'Bilbo');


DELETE FROM pedidos 
WHERE
    id_cliente = 5;

DELETE FROM pedidos 
WHERE
    id_cliente NOT IN (SELECT 
        id
    FROM
        clientes
    
    WHERE
        clientes.ciudad = 'Donosti');


DELETE FROM pedidos 
WHERE
    MONTH(pedidos.fecha_pedido) = 2;


DELETE FROM pedidos 
WHERE
    id_cliente NOT IN (SELECT 
        id_cliente
    FROM
        (SELECT 
            id_cliente
        FROM
            pedidos
        
        WHERE
            fecha_pedido >= DATE_SUB(CURRENT_DATE(), INTERVAL 6 MONTH)) AS taula);


