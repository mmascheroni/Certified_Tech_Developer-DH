-- 16.	Generar un reporte de todos los videos, mostrando los que poseen reacciones 
-- y cuántas veces han sido reproducidos.

select video.titulo, video.cantidadReproducciones from video
inner join reaccion on reaccion.Video_idVideo = video.idVideo
group by video.titulo