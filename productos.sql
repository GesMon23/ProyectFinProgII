DROP DATABASE IF EXISTS productos;
CREATE DATABASE IF NOT EXISTS productos;
USE productos;
CREATE TABLE inventario(
	Fech_in DATE NOT NULL,
    Fech_fin DATE NOT NULL,
    id INT AUTO_INCREMENT NOT NULL,
    PRIMARY KEY (codigo)
);SELECT*FROM productos;
CREATE TABLE productos(
	codigo INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(20) UNIQUE NOT NULL,
    StckInicial INT NOT NULL,
    Entradas INT NOT NULL,
    Salidas INT NOT NULL,
    Total INT NOT NULL,
    PRIMARY KEY (codigo)
    );
    INSERT INTO productos (codigo, nombre, StckInicial, Entradas, Salidas, Total ) VALUES(1, "Salsa", 1500, 3500, 1000, 2500),(2, "Fideos",3000, 2500, 1500, 1000);
    SELECT*FROM productos;
    SELECT*FROM inventario;