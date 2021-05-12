package mercearia;

import mercearia.entities.Cliente;
import mercearia.entities.Endereco;
import mercearia.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    ClienteRepository clienteRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = sdf.parse("30/09/2020 10:32");
        Endereco endereco = new Endereco(null, "String", "String", "String", "String", 190, "String");
        Cliente cliente = new Cliente("Nata", date, "1231233", endereco);

        clienteRepository.save(cliente);


    }

}
