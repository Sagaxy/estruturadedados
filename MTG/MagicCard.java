package br.com.icev.estruturadedados.MTG;

import br.com.icev.estruturadedados.stack.StackGeneric;

public class MagicCard {

	StackGeneric<MagicCard> stackCards = new StackGeneric<>();

	/*
	 * type cards (terreno, criatura, encantamento, artefato, instantânea,
	 * feitiço,planeswalker, habilidade ativada, habilidade disparada
	 */
	String name;
	String type;
	int cost;
	String effect;

	// constructor method
	public MagicCard(String name, String type, int cost, String effect) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.effect = effect;
	}

	/*
	 * method that insert a card on the table but if the type is terreno, criatura,
	 * encatamento, artefato, planesWalker, feitiço, just can be used if the stack
	 * of cards is empty, else can use any
	 */
	public void useCard(MagicCard card) {

		if (card.type == "terreno" || card.type == "criatura" || card.type == "encantamento" || card.type == "artefato"
				|| card.type == "planeswalker" || card.type == "feitiço") {

			try {
				if (stackCards.isEmpty()) {
					stackCards.push(card);
					toString();
				}

			} catch (Exception e) {
				System.out.println("already have cards on top");
			}
		} else {
			stackCards.push(card);
			toString();
		}

	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	// toString method
	@Override
	public String toString() {
		return "MagicCard used [name=" + name + ", type=" + type + ", cost=" + cost + "mana pts" + ", effect=" + effect
				+ "]";
	}

}
