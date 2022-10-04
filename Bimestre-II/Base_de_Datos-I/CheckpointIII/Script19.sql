-- Generar un reporte listando los usuarios, sus canales, playlists y los videos que integran esas playlists.

select usuario.nombre from usuario
inner join canal on canal.Usuario_idUsuario = usuario.idUsuario
inner join playlist on playlist.Usuario_idUsuario = usuario.idUsuario
inner join playlist_video on playlist_video.Playlist_idPlaylist = idPlaylist
inner join video on playlist_video.Video_idVideo = video.idVideo

