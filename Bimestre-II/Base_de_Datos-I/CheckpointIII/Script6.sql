-- 6.	Mostrar por usuario la cantidad de playlists que posee, pero solo para
--  aquellos que tengan más de 1 playlist  creada en el año 2021.

select u.nombre, count(p.idPlaylist) as cantidad, p.fechaCreacion from playlist p 
inner join usuario u on u.idUsuario = p.Usuario_idUsuario
where p.fechaCreacion between '2021-01-01' and '2021-12-31'
group by u.nombre
having cantidad > 1;

SELECT 
	u.idUsuario, u.nombre as NombreUsuario, COUNT(*) as cantidadPlayList
FROM usuario u 
INNER JOIN playlist p 
	ON p.Usuario_idUsuario = u.idUsuario
WHERE p.fechaCreacion BETWEEN '2021-01-01 00:00:00' AND '2021-12-31 23:59:59'
GROUP BY u.idUsuario, u.nombre
HAVING COUNT(*) >1;