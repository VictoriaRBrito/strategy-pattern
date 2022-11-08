package br.vrb.busca.impl;

import br.vrb.busca.Busca;

public class BubbleSort implements Busca {
    @Override
    public int[] fazBusca(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }

        return arr;
    }
}
