DELIMiTER $$
create procedure SP_nombre_apellido_clientes()
begin
    select contacto from clientes
    order by contacto;
end $$

select * from clientes;

call SP_nombre_apellido_clientes();