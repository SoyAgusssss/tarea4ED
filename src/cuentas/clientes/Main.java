package cuentas.clientes;

public class Main {
    
    // Este es un comendario de prueba del ejercicio 2 de GIT
    
    public static void main(String[] args) {
        operativa_cuenta(555f);
    }

    public static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;
        
        System.out.println("Bienvenido ");

        cuenta1 = new Cuenta("Paco Perez","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(1);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
