class Cuadrado 
   {
      private double lado;
      Cuadrado()
      {
         setLado(0.0);
      }
      Cuadrado(double l)
      {
         setLado(l);
      }
      void setLado(double l)
      {
         if (l>0) lado=l;
         else System.out.println("Error. Numero inválido");
      }
      double getLado()
      {
         return lado;
      }
      public double getPerimetro()
      {
         return lado*4;
      }
      public double getArea()
      {
         return lado*lado;
      }
   }