-- 20.	 Listar todas las playlists que posean menos de 3 videos, mostrando 
-- el nombre de usuario y el avatar que posee.

select playlist.nombre, avatar.nombre, usuario.nombre, count(video.titulo) as cantCanciones from usuario
inner  join playlist on playlist.Usuario_idUsuario = usuario.idUsuario
inner join playlist_video on playlist_video.Playlist_idPlaylist = playlist.idPlaylist
inner join video on video.idVideo = playlist_video.Video_idVideo
inner join avatar on avatar.idAvatar = usuario.Avatar_idAvatar
group by playlist.nombre
having cantCanciones < 3