import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class user_shop {
    // métodos que serán utilizados para comprobar si el dato del usuario es válido o si introduce algo que no sea nuemros
        public static Integer checkID(Scanner  input){
            try {
                int id = input.nextInt();
                return (id >= 111 && id <= 999) ? id : null;
            } catch (InputMismatchException e) {
                input.next();
                return null;
            }
        }
        public static Integer checkAge (Scanner input) {
            try {
                int age = input.nextInt();
                return (age >= 14 && age <= 120) ? age : null;
            } catch (InputMismatchException e) {
                input.next();
                return null;
            }
        }
        public static Integer checkKind (Scanner input) {
            try {
                int kind = input.nextInt();
                return (kind >= 0 && kind <= 3) ? kind : null ;
            } catch (InputMismatchException e) {
                input.next();
                return null;
            }
        }
        public static Integer checkTotal (Scanner input) {
            try {
                int total = input.nextInt();
                return (total >= 0 && total <= 1000) ? total : null ;
            } catch (InputMismatchException e) {
                input.next();
                return null;
            }
        }
        public static Integer checkPhone (Scanner input) {
            try {
                int phone = input.nextInt();
                return (phone >= 111111111 && phone <= 999999999) ? phone : null;
            } catch (InputMismatchException e) {
                input.next();
                return null;
            }
        }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer id, age, kind, total, phone;
        /*El array de valores string de la variable "tipo" tiene que garantizar inmutabilidad en su referencia y sus elementos*/
        List<String> kindsOfSell = List.of("libre","pensionista","carnet joven","socio");
        boolean errorRegister = false ;
        System.out.println("Bienvenido! Debes ingresar todos los datos solicitados");
        System.out.print("Ingresa tu ID del usuario: ");
        id = checkID(scanner);
        if(id == null){
            errorRegister = true ;
            System.out.println("Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 111 a 999 (incluidos).");
            throw new Exception("Programa finalizado");
        }else if(!errorRegister){
            System.out.print("Ingresa tu edad: ");
            age = checkAge(scanner);
            if(age == null){
                errorRegister = true ;
                System.out.println("Error! Entrada de dato inválida. Solo se aceptan numeros naturales de 14 a 120 (incluidos).");
                throw new Exception("Programa finalizado");
            }else if(!errorRegister){
                System.out.println("Ingresa el número correspondiente al tipo de venta: \n Venta libre (0) \n Pensionista (1) \n Carnet Jove (2) \n Socio (3)");
                kind = checkKind(scanner);
                if(kind == null){
                    errorRegister = true ;
                    System.out.println("Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 3 (incluidos).");
                    throw new Exception("Programa finalizado");
                }else if(!errorRegister){
                    System.out.print("Ingresa el importe de la compra: ");
                    total = checkTotal(scanner);
                    if(total == null){
                        errorRegister = true ;
                        System.out.println("Error! Entrada de dato inválida. Solo se aceptan números naturales de 0 a 1000 (incluidos).");
                        throw new Exception("Programa finalizado");
                    }else if(!errorRegister){
                        System.out.print("Ingresa tu teléfono sin el prefijo: ");
                        phone = checkPhone(scanner);
                        if(phone == null){
                            errorRegister = true ;
                            System.out.println("Error! Entrada de dato inválida. Solo se aceptan números naturales de 111111111 a 999999999 (incluidos).");
                            throw new Exception("Programa finalizado");
                        }else{
                            switch (kind){
                                case 0:
                                    System.out.println("Gracias por completar el registro");
                                    System.out.println("Tus datos son:");
                                    System.out.println("Id Edad Tipo Importe Teléfono");
                                    System.out.printf("%d %d %s %d %d\n",id,age,kindsOfSell.get(kind),total,phone);
                                    break;
                                case 1:
                                    System.out.println("Gracias por completar el registro");
                                    System.out.println("Tus datos son:");
                                    System.out.println("Id Edad Tipo Importe Teléfono");
                                    System.out.printf("%d %d %s %d %d\n",id,age,kindsOfSell.get(kind),total,phone);
                                    break;
                                case 2:
                                    System.out.println("Gracias por completar el registro");
                                    System.out.println("Tus datos son:");
                                    System.out.println("Id Edad Tipo Importe Teléfono");
                                    System.out.printf("%d %d %s %d %d\n",id,age,kindsOfSell.get(kind),total,phone);
                                    break;
                                case 3:
                                    System.out.println("Gracias por completar el registro");
                                    System.out.println("Tus datos son:");
                                    System.out.println("Id Edad Tipo Importe Teléfono");
                                    System.out.printf("%d, %d, %s, %d, %d\n",id,age,kindsOfSell.get(kind),total,phone);
                                    break;
                            }
                        }
                    }
                }
            }
        }
        /*
         */
    }
}
