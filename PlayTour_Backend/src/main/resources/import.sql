INSERT INTO `tipo_establecimiento` (`descripcion`, `nombre`) VALUES ('Restaurantes ubicados en el lugar', 'Restaurante');
INSERT INTO `tipo_establecimiento` (`descripcion`, `nombre`) VALUES ('Cualquier tipo de Hospedaje del lugar', 'Hotel');
INSERT INTO `tipo_establecimiento` (`descripcion`, `nombre`) VALUES ('Atractivos del Municipio', 'Atractivo');
INSERT INTO `paises` ( `foto`, `latitud`, `longitud`, `nombre`) VALUES ('colombia.jpg', '1', '1', 'Colombia');
INSERT INTO `departamentos` (`foto`, `latitud`, `longitud`, `nombre`, `pais`) VALUES ('santander.jpg', '1', '1', 'Santander', 1);
INSERT INTO `municipios` (`bandera`, `descripcion`, `escudo`, `foto`, `latitud`, `longitud`, `nombre`, `departamento`) VALUES('FlagBucaramanga.jpg', 'Capital del Departamento', 'EscudoBucaramanga.jpg', 'Bucaramanga.jpg', '1', '1', 'Bucaramanga', 1);
INSERT INTO `rutas` (`descripcion`, `foto`, `nombre`, `municipio`) VALUES ('ruta1', 'ruta1.jpg', 'Ruta 1', 1);
INSERT INTO `rutas` (`descripcion`, `foto`, `nombre`, `municipio`) VALUES ('ruta2', 'ruta2.jpg', 'Ruta 2', 1);
INSERT INTO `rutas` (`descripcion`, `foto`, `nombre`, `municipio`) VALUES ('ruta3', 'ruta3.jpg', 'Ruta 3', 1);
INSERT INTO `avatares` (`foto`, `nombre`, `ruta`) VALUES('avatar1.jpg', 'Avatar 1', 1);
INSERT INTO `avatares` (`foto`, `nombre`, `ruta`) VALUES('avatar2.jpg', 'Avatar 2', 2);
INSERT INTO `avatares` (`foto`, `nombre`, `ruta`) VALUES('avatar3.jpg', 'Avatar 3', 3);


