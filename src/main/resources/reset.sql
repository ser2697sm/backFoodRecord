DROP TABLE IF EXISTS alimentos;
CREATE TABLE alimentos (
    id_alimento INT AUTO_INCREMENT PRIMARY KEY,
    ingesta VARCHAR(50) NOT NULL,
    nombre_alimento VARCHAR(50) NOT NULL,
    fecha_de_toma DATE NOT NULL
);