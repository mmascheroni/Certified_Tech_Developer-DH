-- 2.	Mostrar el Top 5 de avatars utilizados por los usuarios, 
-- listando el nombre del avatar y la cantidad de veces utilizado.

select avatar.idAvatar, avatar.nombre, count(usuario.idUsuario) CantUtilizado from avatar
inner join usuario on usuario.Avatar_idAvatar = avatar.idAvatar
group by avatar.idAvatar, avatar.nombre
order by CantUtilizado DESC limit 5;

