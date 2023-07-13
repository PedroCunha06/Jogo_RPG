public class CharacteristicsClasse {
    public float vida, ataque, defesa, experiencia, magia;
    public String tipo;
    public int number;

    public CharacteristicsClasse(String tipo, float vida, float ataque, float defesa, float experiencia, float magia) {
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.experiencia = experiencia;
        this.magia = magia;
    }

        public CharacteristicsClasse(String tipo, float vida, float ataque, float defesa, float magia, int number) {
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
        this.number = number;
    }

    public String getTipo() {
        return this.tipo;
    }

    public float getVida() {
        return this.vida;
    }

    public float getAtaque() {
        return this.ataque;
    }

    public float getDefesa() {
        return this.defesa;
    }

    public float getXP() {
        return this.experiencia;
    }

    public float getMagic() {
        return this.magia;
    }

    public int getNumber() {
        return this.number;
    }
}