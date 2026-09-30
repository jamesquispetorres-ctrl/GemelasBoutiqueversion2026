package com.example.demo.config;

import com.example.demo.models.Cliente;
import com.example.demo.models.Empleado;
import com.example.demo.models.Usuario;
import com.example.demo.models.Venta;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.repository.VentaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(
            ClienteRepository clienteRepository,
            EmpleadoRepository empleadoRepository,
            UsuarioRepository usuarioRepository,
            VentaRepository ventaRepository) {
        return args -> {
            if (clienteRepository.count() == 0) {
                // Clientes iniciales
                Cliente c1 = new Cliente(0, "VIP", "Camila Torres Mendoza", "73829104", "987654321");
                Cliente c2 = new Cliente(0, "Regular", "Valeria Quispe Salazar", "45902183", "912345678");
                Cliente c3 = new Cliente(0, "Mayorista", "Luciana Fernández Vega", "80123456", "998877665");
                clienteRepository.save(c1);
                clienteRepository.save(c2);
                clienteRepository.save(c3);

                // Empleados iniciales
                Empleado e1 = new Empleado(0, "Ana", "Gómez Ramos", "71234567", "ana.gomez@gemelasboutique.com");
                Empleado e2 = new Empleado(0, "Carlos", "Pérez Morales", "78901234", "carlos.perez@gemelasboutique.com");
                empleadoRepository.save(e1);
                empleadoRepository.save(e2);

                // Usuarios iniciales asociados
                Usuario u1 = new Usuario(0, "Ana", "Gómez Ramos", "71234567", "admin@gemelasboutique.com", e1);
                Usuario u2 = new Usuario(0, "Carlos", "Pérez Morales", "78901234", "carlos.user@gemelasboutique.com", e2);
                usuarioRepository.save(u1);
                usuarioRepository.save(u2);

                // Ventas iniciales
                Venta v1 = new Venta(0, LocalDateTime.now().minusDays(2), 249.90, c1, u1);
                Venta v2 = new Venta(0, LocalDateTime.now().minusHours(5), 185.00, c2, u1);
                Venta v3 = new Venta(0, LocalDateTime.now().minusHours(1), 520.50, c3, u2);
                ventaRepository.save(v1);
                ventaRepository.save(v2);
                ventaRepository.save(v3);
            }
        };
    }
}
