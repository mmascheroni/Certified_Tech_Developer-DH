-- 9.	Generar un reporte con los nombres de los usuario que no poseen ninguna Playlist.

select u.nombre from usuario u 
left join playlist p on p.Usuario_idUsuario = u.idUsuario
where p.idPlaylist is null