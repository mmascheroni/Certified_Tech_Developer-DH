-- 5.	Generar un reporte de las últimas 10 reacciones, listando la fecha, el nombre de la reacción, 
-- el id y nombre de usuario, y el título del video.

select r.idReaccion, tr.nombre, r.fecha, u.nombre, v.titulo from reaccion r
inner join tiporeaccion tr on tr.idTipoReaccion = r.TipoReaccion_idTipoReaccion
inner join video v on v.idVideo = r.Video_idVideo
inner join usuario u on u.idUsuario = r.Usuario_idUsuario
order by r.fecha desc
limit 10;