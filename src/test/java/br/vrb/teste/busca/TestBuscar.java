package br.vrb.teste.busca;

import br.vrb.busca.BuscaBubbleSort;
import br.vrb.busca.BuscaInsertionSort;
import br.vrb.busca.BuscaQuicksort;
import br.vrb.busca.Buscar;
import br.vrb.busca.impl.BubbleSort;
import br.vrb.busca.impl.InsertionSort;
import br.vrb.busca.impl.Quicksort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestBuscar {

    Buscar buscar;

    @Test
    public void testeBuscaQuicksort(){
        buscar = new BuscaQuicksort();
        assertTrue(buscar.getBusca() instanceof Quicksort);
    }

    @Test
    public void testeBuscaQuicksortResultado(){
        buscar = new BuscaQuicksort();

        int array_ord[] = {0,1,2,3,4,5};
        int array_nord [] = {1,3,0,5,4,2};

        int arr [] = buscar.fazBusca(array_nord);

        assertArrayEquals(array_ord, arr);
    }

    @Test
    public void testeBuscaInsertionSort(){
        buscar = new BuscaInsertionSort();
        assertTrue(buscar.getBusca() instanceof InsertionSort);
    }

    @Test
    public void testeBuscaInsertionSortResultado(){
        buscar = new BuscaInsertionSort();

        int array_ord[] = {0,1,2,3,4,5};
        int array_nord [] = {1,3,0,5,4,2};

        int arr [] = buscar.fazBusca(array_nord);

        assertArrayEquals(array_ord, arr);
    }

    @Test
    public void testeBuscaBubbleSort(){
        buscar = new BuscaBubbleSort();
        assertTrue(buscar.getBusca() instanceof BubbleSort);
    }

    @Test
    public void testeBuscaBubbleSortResultado(){
        buscar = new BuscaBubbleSort();

        int array_ord[] = {0,1,2,3,4,5};
        int array_nord [] = {1,3,0,5,4,2};

        int arr [] = buscar.fazBusca(array_nord);

        assertArrayEquals(array_ord, arr);
    }

}
