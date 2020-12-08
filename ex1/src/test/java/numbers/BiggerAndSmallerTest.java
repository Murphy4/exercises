package numbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BiggerAndSmallerTest {

    private BiggerAndSmaller sorter;
    private static final int[] myArray = {7, 9, 3, 10, 4, 5, 2};

    @Before
    public void setUp() throws Exception {
        sorter = new BiggerAndSmaller(myArray);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldReturnSmallestInteger() {

        //when
        int smallest = sorter.getSmallest();

        //then
        assertThat(smallest, equalTo(2));

    }

    @Test
    public void shouldReturnLargestInteger() {

        //when
        int largest = sorter.getLargest();

        //then
        assertThat(largest, equalTo(10));
    }

    @Test
    public void shouldReturnValueInArrayOfLength1() {
        //given
        sorter = new BiggerAndSmaller(new int[]{3});

        //when
        int smallest = sorter.getSmallest();
        int largest = sorter.getLargest();

        //then
        assertThat(largest, equalTo(smallest));
    }
}