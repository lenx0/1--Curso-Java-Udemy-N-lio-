package entities;

public class Pokemon {
		private String nome, raridade, tipo1, tipo2, evolucao, pedraDeEvolucao, move1, move2, move3, move4, moveUltimate;
		private int str, agi, def;
		public Pokemon(String nome, String raridade, String tipo1, String tipo2, String evolucao,
				String pedraDeEvolucao, String move1, String move2, String move3, String move4, String moveUltimate,
				int str, int agi, int def) {
			super();
			this.nome = nome;
			this.raridade = raridade;
			this.tipo1 = tipo1;
			this.tipo2 = tipo2;
			this.evolucao = evolucao;
			this.pedraDeEvolucao = pedraDeEvolucao;
			this.move1 = move1;
			this.move2 = move2;
			this.move3 = move3;
			this.move4 = move4;
			this.moveUltimate = moveUltimate;
			this.str = str;
			this.agi = agi;
			this.def = def;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getRaridade() {
			return raridade;
		}
		public void setRaridade(String raridade) {
			this.raridade = raridade;
		}
		public String getTipo1() {
			return tipo1;
		}
		public void setTipo1(String tipo1) {
			this.tipo1 = tipo1;
		}
		public String getTipo2() {
			return tipo2;
		}
		public void setTipo2(String tipo2) {
			this.tipo2 = tipo2;
		}
		public String getEvolucao() {
			return evolucao;
		}
		public void setEvolucao(String evolucao) {
			this.evolucao = evolucao;
		}
		public String getPedraDeEvolucao() {
			return pedraDeEvolucao;
		}
		public void setPedraDeEvolucao(String pedraDeEvolucao) {
			this.pedraDeEvolucao = pedraDeEvolucao;
		}
		public String getMove1() {
			return move1;
		}
		public void setMove1(String move1) {
			this.move1 = move1;
		}
		public String getMove2() {
			return move2;
		}
		public void setMove2(String move2) {
			this.move2 = move2;
		}
		public String getMove3() {
			return move3;
		}
		public void setMove3(String move3) {
			this.move3 = move3;
		}
		public String getMove4() {
			return move4;
		}
		public void setMove4(String move4) {
			this.move4 = move4;
		}
		public String getMoveUltimate() {
			return moveUltimate;
		}
		public void setMoveUltimate(String moveUltimate) {
			this.moveUltimate = moveUltimate;
		}
		public int getStr() {
			return str;
		}
		public void setStr(int str) {
			this.str = str;
		}
		public int getAgi() {
			return agi;
		}
		public void setAgi(int agi) {
			this.agi = agi;
		}
		public int getDef() {
			return def;
		}
		public void setDef(int def) {
			this.def = def;
		}
		
		
		
}




