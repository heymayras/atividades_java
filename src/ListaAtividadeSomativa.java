public class Lista {
    private No primeiro;
    int tamanho;

    public Lista() {
        this.primeiro = null;
        this.tamanho = 0;
    }

    public void inserirPrimeiro(int info) {
        No no = new No();
        no.setDados(info);
        no.setProximo(primeiro);
        primeiro = no;
        tamanho++;
    }

    public void inserirDepois(int indice, int info) {
        if (indice <= 0) {
            this.inserirPrimeiro(info);
        } else if (indice >= tamanho) {
            this.inserirUltimo(info);
        } else {
            No local = primeiro;
            for (int i = 0; i < indice - 1; i++) {
                local = local.getProximo();
            }
            No no = new No();
            no.setDados(info);
            no.setProximo(local.getProximo());
            local.setProximo(no);
            tamanho++;
        }

    }

    public void inserirUltimo(int info) {
        if (vazia() == true) {
            this.inserirPrimeiro(info);
        } else {
            No local = primeiro;
            while (local != null && local.getProximo() != null) {
                local = local.getProximo();
            }
            if (local.getProximo() == null) {
                No no = new No();
                no.setDados(info);
                local.setProximo(no);
            }
        }
        tamanho++;
    }


    public Integer removerPrimeiro() {
        if (primeiro != null) {
            No noRemover = primeiro;
            primeiro = noRemover.getProximo();
            tamanho--;
            return noRemover.getDados();
        } else {
            return null;
        }
    }

    public Integer removerUltimo() {
        if (primeiro == null) {
            return null;
        }
        No local = primeiro;
        while (local.getProximo() != null) {
            No auxiliar = local;
            local = local.getProximo();
            if (local.getProximo() == null) {
                auxiliar.setProximo(null);
                tamanho--;
                return local.getDados();
            }
        }
        primeiro = null;
        tamanho--;
        return local.getDados();
    }


    public Integer removerNo(int indice) {
        if (indice < 0 || indice >= tamanho || primeiro == null) {
            return null;
        } else if (indice == 0) {
            return removerPrimeiro();
        } else if (indice == tamanho - 1) {
            return removerUltimo();
        }
        No local = primeiro;
        for (int i = 0; i < indice - 1; i++) {
            local = local.getProximo();
        }
        Object no = local.getProximo().getDados();
        local.setProximo(local.getProximo().getProximo());
        tamanho--;
        return local.getDados();

    }

    public void mostrar() {
        if (primeiro == null) {
            System.out.println("Lista vazia");
        }
        No no = primeiro;
        while (no != null) {
            System.out.print(no.getDados() + "-->");
            no = no.getProximo();
        }
        //System.out.println("\n" + "�ndice = " + tamanho);
    }


    public boolean vazia() {
        return primeiro == null;
    }