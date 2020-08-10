package com.helloworld.helloworld;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.config.DriverConfigLoader;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

public class App {

    public static void main(String[] args) {
        DriverConfigLoader loader = DriverConfigLoader.fromClasspath("application.conf");

        try {

            CqlSession session = CqlSession.builder()
                                           .withConfigLoader(loader)
                                           .build();

            ResultSet rs = session.execute("select * from my_first_database.customer");
            //Row row = rs.one();
            //System.out.println("### TESTE -> " + row.getString("name"));

            for (Row row: rs.all()) {
                System.out.println("### TESTE -> Name: " + row.getString("name"));
            }

            //session.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
