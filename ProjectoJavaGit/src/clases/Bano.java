package clases;

public class Bano extends Estancia {
		private boolean bano;

		public Bano(String n,int m, int np,int nv,boolean bano) {
			super(n, m,  np, nv);
			this.bano = bano;
		}
		public String mostrarInfo() {
			String informacion= super.mostrarInfo()+"; Tiene baño: "+this.bano;
			return informacion;
		}
		
	}

