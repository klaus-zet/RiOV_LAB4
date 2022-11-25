import java.util.ArrayList;

public  class Box {
    //вес коробки
    float weight = 0;
    //Создаем список элементов
    ArrayList<Fruit> fruits = new ArrayList<Fruit>();
    public Box(){}
    int count = 0;
    public Box(Fruit... fruits) {
// К изначальному весу коробки добавляем вес фрукта * на длину списка
        this.weight += fruits[count].getWeight() * fruits.length;
        if (fruits.length != 0) {
            // Проходим по всему списку элементов и сравниваем их друг с другом
            for (Fruit fruit : fruits) {
                // getClass().getSimpleName() Позволяет получить имя класса
                //Сравниваем имена класса, если они не совпадают выкидываем исключение,
                // иначе добавляем элемент к списку и переходим на следующий
                if (fruits[0].getClass().getSimpleName() != fruits[count].getClass().getSimpleName()) {
                    throw new IllegalArgumentException("Не совпадают типы фруктов!");
                } else {
                    this.fruits.add(fruits[count]);
                    count += 1;
                }
            }
        }
    }

    // Получить вес коробки
    public float getWeight() {
        return this.weight;
    }

    //Сеттер для веса коробки, нужен для метода mix_box
    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Метод для сравнения веса коробок
    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void mix_box(Box box){
        //Устанавливаем вес новой общей коробки
        this.setWeight(box.getWeight() + this.getWeight());
        // Проверка на совпадение имен классов
        if (this.get().get(0).getClass().getSimpleName() != box.get().get(0).getClass().getSimpleName()) {
            throw new IllegalArgumentException("Не совпадают типы фруктов!");
        } else {
            //Создаем новый списко
            ArrayList<Fruit> new_fruits = new ArrayList<Fruit>();
            //Добавляем в новый список элементы из двух коробок
            for (Fruit fruit : fruits){
                new_fruits.add(fruit);
            }
            for (Fruit fruit: box.get()) {
                new_fruits.add(fruit);
            }
            //Удаляем список для коробки, из которой переложили фрукты
            box.deleteFruits();
            //Устанавливаем вес на 0
            box.setWeight(0);
            //Устанавливаем значение нового списка для новой общей корбки
            this.setFruits(new_fruits);
        }
    }

    // получить элемент списка
    public ArrayList<Fruit> get(){
        return this.fruits;
    }

    //Сеттер для списка fruits, нужен для метода mix_box
    public void setFruits(ArrayList<Fruit> fruits){
        this.fruits = fruits;
    }
    public void deleteFruits(){
        this.fruits = new ArrayList<Fruit>();
    }
}