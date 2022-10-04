-- 11.	Generar un reporte con el nombre del usuario  y el título de videos del usuario que no pertenecen 
-- a ninguna playlist.

select usuario.nombre, video.titulo
from video
inner join usuario on usuario.idUsuario = video.Usuario_idUsuario
left join playlist_video on video.idVideo = playlist_video.Video_idVideo
where playlist_video.Playlist_idPlaylist is null;