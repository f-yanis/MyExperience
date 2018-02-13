package ru.fyanis.lafore.chapter4;

/**
 * 4.5. Очереди часто используются для моделирования потока людей, машин,
 самолетов, банковских операций и т. д. Напишите программу, моделирующую
 очередь покупателей в кассы в магазине, на базе класса Queue из программы queue.
 java (см. листинг 4.4). Программа должна отображать содержимое сразу нескольких
 очередей; воспользуйтесь методом display() из п. 4.1. Новый покупатель помеща-
 ется в очередь нажатием клавиши. Вы должны самостоятельно определить, каким
 образом он будет выбирать очередь. Обслуживание каждого покупателя имеет
 случайную продолжительность (в зависимости от количества товаров в корзине).
 Обслуженные покупатели удаляются из очереди. Для простоты течение времени
 можно моделировать нажатиями клавиш — например, каждое нажатие клавиши
 соответствует одной минуте. (Конечно, в Java есть и более совершенные средства
 для работы со временем.)
 */

public class Market {
    private QueueC queue1;
    private QueueC queue2;
    private final int QSIZE = 10;

    public Market() {
        this.queue1 = new QueueC(QSIZE);
        this.queue2 = new QueueC(QSIZE);
    }

    public void getClient(Client client) {
        if (queue1.size() > queue2.size()) {
            queue2.insert(client);
        } else {
            queue1.insert(client);
        }
    }

    /**
     * todo: Обслуживание каждого покупателя имеет
             случайную продолжительность (в зависимости от количества товаров в корзине).
             Обслуженные покупатели удаляются из очереди. Для простоты течение времени
             можно моделировать нажатиями клавиш — например, каждое нажатие клавиши
             соответствует одной минуте.
     */
    public void servClient() {
        int buy1 = queue1.remove().getBuy();
        int buy2 = queue2.remove().getBuy();
    }
}

class QueueC {
    private int maxSize;
    private Client[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueC(int s) {
        maxSize = s;
        queArray = new Client[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(Client j) {
        if(rear == maxSize-1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public Client remove() {
        Client temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public Client peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public int size() {
        return nItems;
    }
}

class Client {
    private int buy;

    public Client(int buy) {
        this.buy = buy;
    }

    public int getBuy() {
        return buy;
    }
}

class CashBoxApp {
    public static void main(String[] args) {
        Market market = new Market();

        market.getClient(new Client(3));
        market.getClient(new Client(2));
        market.getClient(new Client(5));
        market.getClient(new Client(4));
        market.getClient(new Client(7));
        market.getClient(new Client(3));
        market.getClient(new Client(1));

        market.servClient();
    }
}
