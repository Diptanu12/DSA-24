public class LinkedListS {
    public static void main(String[] args) {

        //single linkedlist

//        LL list =new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(18);
//        list.insertFirst(19);
//        list.insert(103,3);
//        System.out.println(list.deleteFirst());
//
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.deletePracticulIndex(2));
//        list.display();
//
//        System.out.println(list.find(2));

        //doubly linkedlist

//        DLL list=new DLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertLast(54);
//        list.insertInafterValue(3,65);
//
//        list.display();


        //circular linkedlist
        CLL list=new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.delete(2);
        list.display();
    }
}
