-- Listar el usuario brasilero con más reacciones durante el 2021.

select usuario.nombre, count(*) reacciones from usuario 
inner join pais on pais.idPais = usuario.Pais_idPais
inner join reaccion on reaccion.idReaccion = usuario.idUsuario
where pais.nombre = 'Brasil' AND year(fecha) = '2021'
group by usuario.nombre
order by reacciones desc
limit 1
