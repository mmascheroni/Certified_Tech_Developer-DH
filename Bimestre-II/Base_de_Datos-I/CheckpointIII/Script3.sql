-- 3.	Emitir un listado de todas las playlists públicas, informando el nombre del usuario que la creó,
--  el título de cada video que posee y el nombre y  año de creación de la playlist.

select p.idPlaylist, p.nombre, p.fechaCreacion ,u.nombre, v.titulo from playlist p
inner join usuario u on u.idUsuario = p.Usuario_idUsuario
inner join playlist_video on playlist_video.Playlist_idPlaylist = p.idPlaylist
inner join video v on v.idVideo = playlist_video.Video_idVideo
where p.privado = 0;
