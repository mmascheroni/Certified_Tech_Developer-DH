-- 12.	Listar a todos los usuarios que no poseen ningún video.

select usuario.nombre from usuario
left join video on video.Usuario_idUsuario = usuario.idUsuario
where video.idVideo is null