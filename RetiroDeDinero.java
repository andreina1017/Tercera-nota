public class RetiroDeDinero {
    public static void main(String[] args) {
        // Cantidad inicial de dinero en la cuenta
        double saldoInicial = 1000.0;

        // Monto que se retira cada semana
        double retiroSemanal = 200.0;

        int semanasEnUnMes = 4;

        double totalRetirado = retiroSemanal * semanasEnUnMes;

        double saldoRestante = saldoInicial - totalRetirado;

        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Total retirado durante el mes: $" + totalRetirado);
        System.out.println("Saldo restante al final del mes: $" + saldoRestante);
    }
}
