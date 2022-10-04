-- 1.	Generar un reporte que indique la cantidad de usuarios por país, 
-- mostrando el nombre del país y su cantidad.

select count(*) as Cantidad, pais.nombre from usuario
inner join pais on pais.idPais = usuario.Pais_idPais
group by pais.nombre
order by pais.nombre;
