package thread.OddAndEvenNumbers;

class OddThread extends Thread
{
    int limit;

    sharedPrinter printer;

    public OddThread(int limit, sharedPrinter printer)
    {
        this.limit = limit;

        this.printer = printer;
    }

    @Override
    public void run()
    {
        int oddNumber = 1;        //First odd number is 1

        while (oddNumber <= limit)
        {
            printer.printOdd(oddNumber);       //Calling printOdd() method of SharedPrinter class

            oddNumber = oddNumber + 2;         //Incrementing to next odd number
        }
    }
}
