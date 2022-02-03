public class Programa {
    public static void main(String[] args) {
        ListaDupla l = new ListaDupla();
        System.out.println(l);

        for (int i = 0; i < 6; i++){
            l.inserirInicio("" + (char) (i + 97));
            System.out.println(l);
        }

        l.inserirMeio(1 , "x");
        System.out.println(l);

        System.out.println("Retirado: " + l.removerMeio(4));
        System.out.println(l);
        while (l.removerInicio() != null){
            System.out.println(l);
        }
    }

}