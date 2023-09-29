class animal
{
        void eating()
        {
                system.out.println("eating");
        }
}
class dog extends animal{
        void barking()
        {
                system.out.println("barking");
        }
}
class ani
{
        public static void main()
        {
                dog d = new dog();
                d.eating();
                d.barking();
        }
}
