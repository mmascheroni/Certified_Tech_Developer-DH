-- 7.	Generar un reporte de las reacciones generadas en el 2021, con el siguiente formato :

select tr.nombre as  'Nombre de Usuario', u.nombre as 'Nombre de Usuario', v.titulo as 'Titulo de Video',
r.fecha as 'Fecha' from reaccion r
inner join tiporeaccion tr on tr.idTipoReaccion = r.TipoReaccion_idTipoReaccion
inner join usuario u on u.idUsuario = r.Usuario_idUsuario
inner join video v on v.idVideo = r.Video_idVideo
where r.fecha between '2021-01-01' and '2021-12-31'
order by tr.nombre;

SELECT tr.nombre AS NombreReaccion, u.nombre AS NombreDeUsuario, v.titulo AS TituloDeVideo, r.fecha 
FROM reaccion r 
INNER JOIN tiporeaccion tr 
	ON r.TipoReaccion_idTipoReaccion = tr.idTipoReaccion 
INNER JOIN usuario u 
	ON r.Usuario_idUsuario = u.idUsuario 
INNER JOIN video v 
	ON r.Video_idVideo = v.idVideo
WHERE r.fecha BETWEEN '2021-01-01 00:00:0' AND '2021-12-31 23:59:59';