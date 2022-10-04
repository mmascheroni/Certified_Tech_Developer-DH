-- 1.	Listar los videos que tienen los usuarios cuyo nombre contiene la letra “a” y son del país Argentina

select video.titulo, usuario.nombre, pais.nombre from usuario
inner join video on usuario.idUsuario = video.Usuario_idUsuario
inner join pais on pais.idPais = usuario.Pais_idPais
where usuario.nombre like '%a%' AND pais.nombre = 'Argentina'