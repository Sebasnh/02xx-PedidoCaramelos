/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final int CANTIDAD;
        final int BOLSASCOMPLETAS;
        final int INDIVIDUAL;
        
        final double IMPORTEBOLSASCOMPLETAS;
        final double IMPORTEINDIVIDUAL;
        final double IMPORTEPREVIO;

        final double IVA;
        final double TOTAL;

       
        try {
            System.out.println("CARAMELOS PARA BAUTIZOS");
            System.out.println("=======================");

            System.out.print("Cantidad de caramelos ...: ");
            CANTIDAD = SCN.nextInt();

            BOLSASCOMPLETAS = CANTIDAD / 100;
            INDIVIDUAL = CANTIDAD - (BOLSASCOMPLETAS * 100);

            System.out.printf("Bolsas completas ........: %d%n", BOLSASCOMPLETAS);
            System.out.printf("Caramelos sueltos .......: %d%n", INDIVIDUAL);

            IMPORTEBOLSASCOMPLETAS = BOLSASCOMPLETAS * 5;
            IMPORTEINDIVIDUAL = INDIVIDUAL * 0.07;

            System.out.printf(Locale.ENGLISH, "Importe bolsas ..........: %.2f%n", IMPORTEBOLSASCOMPLETAS);
            System.out.printf(Locale.ENGLISH, "Importe suelto ..........: %.2f%n", IMPORTEINDIVIDUAL);

            IMPORTEPREVIO = IMPORTEBOLSASCOMPLETAS + IMPORTEINDIVIDUAL;
            System.out.printf(Locale.ENGLISH, "Importe previo ..........: %.2f%n", IMPORTEPREVIO);

            IVA = IMPORTEPREVIO * 21 / 100;
            System.out.printf(Locale.ENGLISH, "IVA (21%%) ...............: %.2f%n", IVA);

            TOTAL = IMPORTEPREVIO + IVA;
            System.out.printf(Locale.ENGLISH, "Importe PVP .............: %.2f%n", TOTAL);

        } catch (Exception e) {
            System.out.println(">>>> Error errónea");
        }

    }

}
